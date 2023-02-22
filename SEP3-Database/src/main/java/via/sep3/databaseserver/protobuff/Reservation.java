// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Reservation.proto

package via.sep3.databaseserver.protobuff;

public final class Reservation {
  private Reservation() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ChangeReservStatusMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ChangeReservStatusMessage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AcceptMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AcceptMessage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_BoolValue_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_BoolValue_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ReservationMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ReservationMessage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_IdMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_IdMessage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ReservationsToAcceptCollection_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ReservationsToAcceptCollection_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021Reservation.proto\"7\n\031ChangeReservStatu" +
      "sMessage\022\n\n\002id\030\001 \001(\005\022\016\n\006status\030\002 \001(\t\"9\n\r" +
      "AcceptMessage\022\025\n\rreservationId\030\001 \001(\005\022\021\n\t" +
      "didAccept\030\002 \001(\010\"\032\n\tBoolValue\022\r\n\005value\030\001 " +
      "\001(\010\"\217\001\n\022ReservationMessage\022\016\n\006rideId\030\001 \001" +
      "(\005\022\014\n\004name\030\002 \001(\t\022\r\n\005phone\030\003 \001(\t\022\"\n\tdidAc" +
      "cept\030\004 \001(\0132\n.BoolValueH\000\210\001\001\022\n\n\002id\030\005 \001(\005\022" +
      "\016\n\006status\030\006 \001(\tB\014\n\n_didAccept\"\027\n\tIdMessa" +
      "ge\022\n\n\002id\030\001 \001(\005\"R\n\036ReservationsToAcceptCo" +
      "llection\0220\n\023reservationMessages\030\001 \003(\0132\023." +
      "ReservationMessage2\357\002\n\014Reservations\0226\n\017a" +
      "cceptPassenger\022\016.AcceptMessage\032\023.Reserva" +
      "tionMessage\022I\n\032getAllReservationsToAccep" +
      "t\022\n.IdMessage\032\037.ReservationsToAcceptColl" +
      "ection\022N\n\037getAcceptedReservationsByRideI" +
      "d\022\n.IdMessage\032\037.ReservationsToAcceptColl" +
      "ection\022I\n\032getAllReservationsByUserId\022\n.I" +
      "dMessage\032\037.ReservationsToAcceptCollectio" +
      "n\022A\n\027changeReservationStatus\022\032.ChangeRes" +
      "ervStatusMessage\032\n.BoolValueB%\n!via.sep3" +
      ".databaseserver.protobuffP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ChangeReservStatusMessage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ChangeReservStatusMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ChangeReservStatusMessage_descriptor,
        new java.lang.String[] { "Id", "Status", });
    internal_static_AcceptMessage_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_AcceptMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AcceptMessage_descriptor,
        new java.lang.String[] { "ReservationId", "DidAccept", });
    internal_static_BoolValue_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_BoolValue_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_BoolValue_descriptor,
        new java.lang.String[] { "Value", });
    internal_static_ReservationMessage_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_ReservationMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ReservationMessage_descriptor,
        new java.lang.String[] { "RideId", "Name", "Phone", "DidAccept", "Id", "Status", "DidAccept", });
    internal_static_IdMessage_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_IdMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_IdMessage_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_ReservationsToAcceptCollection_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_ReservationsToAcceptCollection_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ReservationsToAcceptCollection_descriptor,
        new java.lang.String[] { "ReservationMessages", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
