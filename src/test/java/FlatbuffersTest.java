import com.google.flatbuffers.FlatBufferBuilder;
import com.zpb.fbs.user.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.nio.ByteBuffer;

/**
 * @author       pengbo.zhao
 * @description  flatbuffers-test
 * @createDate   2021/12/23 11:40
 * @updateDate   2021/12/23 11:40
 * @version      1.0
 */
@DisplayName("flatbuffers-test")
public class FlatbuffersTest {

    @Test
    @DisplayName("flat-buffers")
    public void testFlatBuffers(){

        // 对于基于类型，可以直接将类型添加到buffer中，对于 string 类型，需要单独添加
        // 1.创建缓冲器
        FlatBufferBuilder flatBufferBuilder = new FlatBufferBuilder(1024);

        // 2.设置偏移量
        // 2.1 id-long类型偏移量
        long idOffset = System.currentTimeMillis();

        // 2.2 name-string类型偏移量
        int offsetName = flatBufferBuilder.createString("张三");

        // 2.2 age-long类型偏移量
        long ageOffset = 10;

        // 2.3 salary-double类型偏移量
        double salaryOffset = 2000.0d;

        // 2.4 创建时间-long类型偏移量
        long createTimeOffset = System.currentTimeMillis();

        // 2.5 更新时间-long类型偏移量
        long updateTimeOffset = System.currentTimeMillis();

        // 2.6 级别-枚举类型偏移量
        byte seniorOffset = Level.SENIOR;

        // 2.7 address(地址)-引用类型-对象类型-偏移量 注意：这个类型为table时，可以使用下列方式
        int countryOffset = flatBufferBuilder.createString("中国");
        int provinceOffset = flatBufferBuilder.createString("河南省");
        int cityOffset = flatBufferBuilder.createString("郑州市");
        int regionOffset = flatBufferBuilder.createString("二七区");
        int streetOffset = flatBufferBuilder.createString("二七街道");
        long noOffset = 450000;
        int addressOffset = Address.createAddress(flatBufferBuilder, countryOffset, provinceOffset, cityOffset, regionOffset, streetOffset, noOffset);

        // 引用类型-基本类型-偏移量，注意：这个类型为 struct 时，需在添加属性时使用，不能分开写，否则会报异常
        //  否则会报异常：java.lang.AssertionError: FlatBuffers: struct must be serialized inline.

        // 添加-用户
        User.startUser(flatBufferBuilder);

        // 添加基本类型-偏移量
        User.addAge(flatBufferBuilder,idOffset);
        User.addName(flatBufferBuilder,offsetName);
        User.addAge(flatBufferBuilder,ageOffset);
        User.addSalary(flatBufferBuilder,salaryOffset);
        User.addCreateTime(flatBufferBuilder,createTimeOffset);
        User.addUpdateTime(flatBufferBuilder,updateTimeOffset);

        // 添加-枚举类型-偏移量
        User.addLevel(flatBufferBuilder,seniorOffset);

        // 添加-引用类型-table-偏移量
        User.addAddress(flatBufferBuilder,addressOffset);

        // 添加-引用类型-struct-偏移量
        // User.addPhone(flatBufferBuilder,phoneOffset);
        User.addPhone(flatBufferBuilder,Phone.createPhone(flatBufferBuilder, 1312345678));

        // 设置-unions-偏移量
        User.addAbility(flatBufferBuilder,Ability.Reading);

        // 结束添加
        int endUserOffset = User.endUser(flatBufferBuilder);

        // 完成
        User.finishUserBuffer(flatBufferBuilder,endUserOffset);

        // 生成二进制文件 - 完成序列化
        byte[] bytes = flatBufferBuilder.sizedByteArray();

        System.err.println("序列化大小是:"+bytes.length);

        // =============== 反序列化
        ByteBuffer wrap = ByteBuffer.wrap(bytes);

        //根据该二进制数据列生成 User 对象
        User rootAsUser = User.getRootAsUser(wrap);
        System.err.println("反序列化后的数据是："+rootAsUser);

        System.err.println("id:"+rootAsUser.id());
        System.err.println("name:"+rootAsUser.name());
        System.err.println("age:"+rootAsUser.age());
        System.err.println("salary:"+rootAsUser.salary());
        System.err.println("createTime:"+rootAsUser.createTime());
        System.err.println("updateTime:"+rootAsUser.updateTime());
        System.err.println("level:"+rootAsUser.level());
        System.err.println("address-country:"+rootAsUser.address().coutry());
        System.err.println("address-province:"+rootAsUser.address().province());
        System.err.println("address-city:"+rootAsUser.address().city());
        System.err.println("address-region:"+rootAsUser.address().region());
        System.err.println("address-street:"+rootAsUser.address().street());
        System.err.println("address-no:"+rootAsUser.address().no());
        System.err.println("phone:"+rootAsUser.phone().number());
        System.err.println("ability:"+rootAsUser.abilityType());




    }

}
