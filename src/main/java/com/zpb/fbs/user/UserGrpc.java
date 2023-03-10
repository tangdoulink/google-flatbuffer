//Generated by flatc compiler (version 2.0.5)
//If you make any local changes, they will be lost
//source: User.fbs

package com.zpb.fbs.user;

import com.google.flatbuffers.grpc.FlatbuffersUtils;

import java.nio.ByteBuffer;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * 定义rpc接口
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: User.fbs")
public final class UserGrpc {

  private UserGrpc() {}
  
  public static final String SERVICE_NAME = "com.zpb.fbs.user.User";
  
  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getSaveMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.zpb.fbs.user.User,
      com.zpb.fbs.user.UserResponse> METHOD_SAVE = getSaveMethod();
  
  private static volatile io.grpc.MethodDescriptor<com.zpb.fbs.user.User,
      com.zpb.fbs.user.UserResponse> getSaveMethod;
  
  private static volatile FlatbuffersUtils.FBExtactor<com.zpb.fbs.user.User> extractorOfUser;
  private static FlatbuffersUtils.FBExtactor<com.zpb.fbs.user.User> getExtractorOfUser() {
      if (extractorOfUser != null) return extractorOfUser;
      synchronized (UserGrpc.class) {
          if (extractorOfUser != null) return extractorOfUser;
          extractorOfUser = new FlatbuffersUtils.FBExtactor<com.zpb.fbs.user.User>() {
              public com.zpb.fbs.user.User extract (ByteBuffer buffer) {
                  return com.zpb.fbs.user.User.getRootAsUser(buffer);
              }
          };
          return extractorOfUser;
      }
  }
  
  private static volatile FlatbuffersUtils.FBExtactor<com.zpb.fbs.user.UserResponse> extractorOfUserResponse;
  private static FlatbuffersUtils.FBExtactor<com.zpb.fbs.user.UserResponse> getExtractorOfUserResponse() {
      if (extractorOfUserResponse != null) return extractorOfUserResponse;
      synchronized (UserGrpc.class) {
          if (extractorOfUserResponse != null) return extractorOfUserResponse;
          extractorOfUserResponse = new FlatbuffersUtils.FBExtactor<com.zpb.fbs.user.UserResponse>() {
              public com.zpb.fbs.user.UserResponse extract (ByteBuffer buffer) {
                  return com.zpb.fbs.user.UserResponse.getRootAsUserResponse(buffer);
              }
          };
          return extractorOfUserResponse;
      }
  }
  
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.zpb.fbs.user.User,
      com.zpb.fbs.user.UserResponse> getSaveMethod() {
    io.grpc.MethodDescriptor<com.zpb.fbs.user.User, com.zpb.fbs.user.UserResponse> getSaveMethod;
    if ((getSaveMethod = UserGrpc.getSaveMethod) == null) {
      synchronized (UserGrpc.class) {
        if ((getSaveMethod = UserGrpc.getSaveMethod) == null) {
          UserGrpc.getSaveMethod = getSaveMethod = 
              io.grpc.MethodDescriptor.<com.zpb.fbs.user.User, com.zpb.fbs.user.UserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.zpb.fbs.user.User", "save"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(FlatbuffersUtils.marshaller(
                  com.zpb.fbs.user.User.class, getExtractorOfUser()))
              .setResponseMarshaller(FlatbuffersUtils.marshaller(
                  com.zpb.fbs.user.UserResponse.class, getExtractorOfUserResponse()))
                  .setSchemaDescriptor(null)
                  .build();
          }
        }
     }
     return getSaveMethod;
  }
  
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getUpdateMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.zpb.fbs.user.User,
      com.zpb.fbs.user.UserResponse> METHOD_UPDATE = getUpdateMethod();
  
  private static volatile io.grpc.MethodDescriptor<com.zpb.fbs.user.User,
      com.zpb.fbs.user.UserResponse> getUpdateMethod;
  
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.zpb.fbs.user.User,
      com.zpb.fbs.user.UserResponse> getUpdateMethod() {
    io.grpc.MethodDescriptor<com.zpb.fbs.user.User, com.zpb.fbs.user.UserResponse> getUpdateMethod;
    if ((getUpdateMethod = UserGrpc.getUpdateMethod) == null) {
      synchronized (UserGrpc.class) {
        if ((getUpdateMethod = UserGrpc.getUpdateMethod) == null) {
          UserGrpc.getUpdateMethod = getUpdateMethod = 
              io.grpc.MethodDescriptor.<com.zpb.fbs.user.User, com.zpb.fbs.user.UserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.zpb.fbs.user.User", "update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(FlatbuffersUtils.marshaller(
                  com.zpb.fbs.user.User.class, getExtractorOfUser()))
              .setResponseMarshaller(FlatbuffersUtils.marshaller(
                  com.zpb.fbs.user.UserResponse.class, getExtractorOfUserResponse()))
                  .setSchemaDescriptor(null)
                  .build();
          }
        }
     }
     return getUpdateMethod;
  }
  
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getQueryMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.zpb.fbs.user.User,
      com.zpb.fbs.user.UserResponse> METHOD_QUERY = getQueryMethod();
  
  private static volatile io.grpc.MethodDescriptor<com.zpb.fbs.user.User,
      com.zpb.fbs.user.UserResponse> getQueryMethod;
  
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.zpb.fbs.user.User,
      com.zpb.fbs.user.UserResponse> getQueryMethod() {
    io.grpc.MethodDescriptor<com.zpb.fbs.user.User, com.zpb.fbs.user.UserResponse> getQueryMethod;
    if ((getQueryMethod = UserGrpc.getQueryMethod) == null) {
      synchronized (UserGrpc.class) {
        if ((getQueryMethod = UserGrpc.getQueryMethod) == null) {
          UserGrpc.getQueryMethod = getQueryMethod = 
              io.grpc.MethodDescriptor.<com.zpb.fbs.user.User, com.zpb.fbs.user.UserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.zpb.fbs.user.User", "query"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(FlatbuffersUtils.marshaller(
                  com.zpb.fbs.user.User.class, getExtractorOfUser()))
              .setResponseMarshaller(FlatbuffersUtils.marshaller(
                  com.zpb.fbs.user.UserResponse.class, getExtractorOfUserResponse()))
                  .setSchemaDescriptor(null)
                  .build();
          }
        }
     }
     return getQueryMethod;
  }
  
  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UserStub newStub(io.grpc.Channel channel) {
    return new UserStub(channel);
  }
  
  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UserBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new UserBlockingStub(channel);
  }
  
  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UserFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new UserFutureStub(channel);
  }
  
  /**
   * <pre>
   * 定义rpc接口
   * </pre>
   */
  public static abstract class UserImplBase implements io.grpc.BindableService {
    
    /**
     * <pre>
     * 保存
     * </pre>
     */
    public     void save(com.zpb.fbs.user.User request,
        io.grpc.stub.StreamObserver<com.zpb.fbs.user.UserResponse> responseObserver)     {
      asyncUnimplementedUnaryCall(getSaveMethod(), responseObserver);
    }
    
    /**
     * <pre>
     * 更新
     * </pre>
     */
    public     void update(com.zpb.fbs.user.User request,
        io.grpc.stub.StreamObserver<com.zpb.fbs.user.UserResponse> responseObserver)     {
      asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }
    
    /**
     * <pre>
     * 查询
     * </pre>
     */
    public     void query(com.zpb.fbs.user.User request,
        io.grpc.stub.StreamObserver<com.zpb.fbs.user.UserResponse> responseObserver)     {
      asyncUnimplementedUnaryCall(getQueryMethod(), responseObserver);
    }
    
    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSaveMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.zpb.fbs.user.User,
                com.zpb.fbs.user.UserResponse>(
                  this, METHODID_SAVE)))
          .addMethod(
            getUpdateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.zpb.fbs.user.User,
                com.zpb.fbs.user.UserResponse>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getQueryMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.zpb.fbs.user.User,
                com.zpb.fbs.user.UserResponse>(
                  this, METHODID_QUERY)))
          .build();
    }
  }
  
  /**
   * <pre>
   * 定义rpc接口
   * </pre>
   */
  public static final class UserStub extends io.grpc.stub.AbstractStub<UserStub> {
    private UserStub(io.grpc.Channel channel) {
      super(channel);
    }
    
    private UserStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }
    
    @java.lang.Override
    protected UserStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserStub(channel, callOptions);
    }
    
    /**
     * <pre>
     * 保存
     * </pre>
     */
    public     void save(com.zpb.fbs.user.User request,
        io.grpc.stub.StreamObserver<com.zpb.fbs.user.UserResponse> responseObserver)     {
      asyncUnaryCall(
          getChannel().newCall(getSaveMethod(), getCallOptions()), request, responseObserver);
    }
    
    /**
     * <pre>
     * 更新
     * </pre>
     */
    public     void update(com.zpb.fbs.user.User request,
        io.grpc.stub.StreamObserver<com.zpb.fbs.user.UserResponse> responseObserver)     {
      asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }
    
    /**
     * <pre>
     * 查询
     * </pre>
     */
    public     void query(com.zpb.fbs.user.User request,
        io.grpc.stub.StreamObserver<com.zpb.fbs.user.UserResponse> responseObserver)     {
      asyncUnaryCall(
          getChannel().newCall(getQueryMethod(), getCallOptions()), request, responseObserver);
    }
  }
  
  /**
   * <pre>
   * 定义rpc接口
   * </pre>
   */
  public static final class UserBlockingStub extends io.grpc.stub.AbstractStub<UserBlockingStub> {
    private UserBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }
    
    private UserBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }
    
    @java.lang.Override
    protected UserBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserBlockingStub(channel, callOptions);
    }
    
    /**
     * <pre>
     * 保存
     * </pre>
     */
    public     com.zpb.fbs.user.UserResponse save(com.zpb.fbs.user.User request)     {
      return blockingUnaryCall(
          getChannel(), getSaveMethod(), getCallOptions(), request);
    }
    
    /**
     * <pre>
     * 更新
     * </pre>
     */
    public     com.zpb.fbs.user.UserResponse update(com.zpb.fbs.user.User request)     {
      return blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }
    
    /**
     * <pre>
     * 查询
     * </pre>
     */
    public     com.zpb.fbs.user.UserResponse query(com.zpb.fbs.user.User request)     {
      return blockingUnaryCall(
          getChannel(), getQueryMethod(), getCallOptions(), request);
    }
  }
  
  /**
   * <pre>
   * 定义rpc接口
   * </pre>
   */
  public static final class UserFutureStub extends io.grpc.stub.AbstractStub<UserFutureStub> {
    private UserFutureStub(io.grpc.Channel channel) {
      super(channel);
    }
    
    private UserFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }
    
    @java.lang.Override
    protected UserFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserFutureStub(channel, callOptions);
    }
    
    /**
     * <pre>
     * 保存
     * </pre>
     */
    public     com.google.common.util.concurrent.ListenableFuture<com.zpb.fbs.user.UserResponse> save(
        com.zpb.fbs.user.User request)     {
      return futureUnaryCall(
          getChannel().newCall(getSaveMethod(), getCallOptions()), request);
    }
    
    /**
     * <pre>
     * 更新
     * </pre>
     */
    public     com.google.common.util.concurrent.ListenableFuture<com.zpb.fbs.user.UserResponse> update(
        com.zpb.fbs.user.User request)     {
      return futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }
    
    /**
     * <pre>
     * 查询
     * </pre>
     */
    public     com.google.common.util.concurrent.ListenableFuture<com.zpb.fbs.user.UserResponse> query(
        com.zpb.fbs.user.User request)     {
      return futureUnaryCall(
          getChannel().newCall(getQueryMethod(), getCallOptions()), request);
    }
  }
  
  private static final int METHODID_SAVE = 0;
  private static final int METHODID_UPDATE = 1;
  private static final int METHODID_QUERY = 2;
  
  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UserImplBase serviceImpl;
    private final int methodId;
  
    MethodHandlers(UserImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }
  
    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SAVE:
          serviceImpl.save((com.zpb.fbs.user.User) request,
              (io.grpc.stub.StreamObserver<com.zpb.fbs.user.UserResponse>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((com.zpb.fbs.user.User) request,
              (io.grpc.stub.StreamObserver<com.zpb.fbs.user.UserResponse>) responseObserver);
          break;
        case METHODID_QUERY:
          serviceImpl.query((com.zpb.fbs.user.User) request,
              (io.grpc.stub.StreamObserver<com.zpb.fbs.user.UserResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }
    
    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }
  
  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;
  
  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (UserGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)              
              .setSchemaDescriptor(null)              
              .addMethod(getSaveMethod())              
              .addMethod(getUpdateMethod())              
              .addMethod(getQueryMethod())              
              .build();
        }
      }
    }
    return result;
  }
}
