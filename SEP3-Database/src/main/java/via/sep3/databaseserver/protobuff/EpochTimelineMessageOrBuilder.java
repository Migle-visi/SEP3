// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Rides.proto

package via.sep3.databaseserver.protobuff;

public interface EpochTimelineMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:EpochTimelineMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional int64 epochLowerBound = 1;</code>
   * @return Whether the epochLowerBound field is set.
   */
  boolean hasEpochLowerBound();
  /**
   * <code>optional int64 epochLowerBound = 1;</code>
   * @return The epochLowerBound.
   */
  long getEpochLowerBound();

  /**
   * <code>optional int64 epochUpperBound = 2;</code>
   * @return Whether the epochUpperBound field is set.
   */
  boolean hasEpochUpperBound();
  /**
   * <code>optional int64 epochUpperBound = 2;</code>
   * @return The epochUpperBound.
   */
  long getEpochUpperBound();

  /**
   * <code>int64 epochNow = 3;</code>
   * @return The epochNow.
   */
  long getEpochNow();

  /**
   * <code>int32 userId = 4;</code>
   * @return The userId.
   */
  int getUserId();
}