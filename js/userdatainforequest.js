// source: ei.proto
/**
 * @fileoverview
 * @enhanceable
 * @suppress {missingRequire} reports error on implicit type usages.
 * @suppress {messageConventions} JS Compiler reports an error if a variable or
 *     field starts with 'MSG_' and isn't a translatable message.
 * @public
 */
// GENERATED CODE -- DO NOT EDIT!
/* eslint-disable */
// @ts-nocheck

goog.provide('proto.ei.UserDataInfoRequest');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.ei.BasicRequestInfo');

/**
 * Generated by JsPbCodeGenerator.
 * @param {Array=} opt_data Optional initial data array, typically from a
 * server response, or constructed directly in Javascript. The array is used
 * in place and becomes part of the constructed object. It is not cloned.
 * If no data is provided, the constructed object will be empty, but still
 * valid.
 * @extends {jspb.Message}
 * @constructor
 */
proto.ei.UserDataInfoRequest = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.ei.UserDataInfoRequest, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.ei.UserDataInfoRequest.displayName = 'proto.ei.UserDataInfoRequest';
}



if (jspb.Message.GENERATE_TO_OBJECT) {
/**
 * Creates an object representation of this proto.
 * Field names that are reserved in JavaScript and will be renamed to pb_name.
 * Optional fields that are not set will be set to undefined.
 * To access a reserved field use, foo.pb_<name>, eg, foo.pb_default.
 * For the list of reserved names please see:
 *     net/proto2/compiler/js/internal/generator.cc#kKeyword.
 * @param {boolean=} opt_includeInstance Deprecated. whether to include the
 *     JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @return {!Object}
 */
proto.ei.UserDataInfoRequest.prototype.toObject = function(opt_includeInstance) {
  return proto.ei.UserDataInfoRequest.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.ei.UserDataInfoRequest} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.ei.UserDataInfoRequest.toObject = function(includeInstance, msg) {
  var f, obj = {
    rinfo: (f = msg.getRinfo()) && proto.ei.BasicRequestInfo.toObject(includeInstance, f),
    userId: (f = jspb.Message.getField(msg, 1)) == null ? undefined : f,
    deviceId: (f = jspb.Message.getField(msg, 2)) == null ? undefined : f,
    backupChecksum: (f = jspb.Message.getField(msg, 3)) == null ? undefined : f
  };

  if (includeInstance) {
    obj.$jspbMessageInstance = msg;
  }
  return obj;
};
}


/**
 * Deserializes binary data (in protobuf wire format).
 * @param {jspb.ByteSource} bytes The bytes to deserialize.
 * @return {!proto.ei.UserDataInfoRequest}
 */
proto.ei.UserDataInfoRequest.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.ei.UserDataInfoRequest;
  return proto.ei.UserDataInfoRequest.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.ei.UserDataInfoRequest} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.ei.UserDataInfoRequest}
 */
proto.ei.UserDataInfoRequest.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 4:
      var value = new proto.ei.BasicRequestInfo;
      reader.readMessage(value,proto.ei.BasicRequestInfo.deserializeBinaryFromReader);
      msg.setRinfo(value);
      break;
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setUserId(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setDeviceId(value);
      break;
    case 3:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setBackupChecksum(value);
      break;
    default:
      reader.skipField();
      break;
    }
  }
  return msg;
};


/**
 * Serializes the message to binary data (in protobuf wire format).
 * @return {!Uint8Array}
 */
proto.ei.UserDataInfoRequest.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.ei.UserDataInfoRequest.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.ei.UserDataInfoRequest} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.ei.UserDataInfoRequest.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getRinfo();
  if (f != null) {
    writer.writeMessage(
      4,
      f,
      proto.ei.BasicRequestInfo.serializeBinaryToWriter
    );
  }
  f = /** @type {string} */ (jspb.Message.getField(message, 1));
  if (f != null) {
    writer.writeString(
      1,
      f
    );
  }
  f = /** @type {string} */ (jspb.Message.getField(message, 2));
  if (f != null) {
    writer.writeString(
      2,
      f
    );
  }
  f = /** @type {number} */ (jspb.Message.getField(message, 3));
  if (f != null) {
    writer.writeUint64(
      3,
      f
    );
  }
};


/**
 * optional BasicRequestInfo rinfo = 4;
 * @return {?proto.ei.BasicRequestInfo}
 */
proto.ei.UserDataInfoRequest.prototype.getRinfo = function() {
  return /** @type{?proto.ei.BasicRequestInfo} */ (
    jspb.Message.getWrapperField(this, proto.ei.BasicRequestInfo, 4));
};


/**
 * @param {?proto.ei.BasicRequestInfo|undefined} value
 * @return {!proto.ei.UserDataInfoRequest} returns this
*/
proto.ei.UserDataInfoRequest.prototype.setRinfo = function(value) {
  return jspb.Message.setWrapperField(this, 4, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.ei.UserDataInfoRequest} returns this
 */
proto.ei.UserDataInfoRequest.prototype.clearRinfo = function() {
  return this.setRinfo(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.ei.UserDataInfoRequest.prototype.hasRinfo = function() {
  return jspb.Message.getField(this, 4) != null;
};


/**
 * optional string user_id = 1;
 * @return {string}
 */
proto.ei.UserDataInfoRequest.prototype.getUserId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.ei.UserDataInfoRequest} returns this
 */
proto.ei.UserDataInfoRequest.prototype.setUserId = function(value) {
  return jspb.Message.setField(this, 1, value);
};


/**
 * Clears the field making it undefined.
 * @return {!proto.ei.UserDataInfoRequest} returns this
 */
proto.ei.UserDataInfoRequest.prototype.clearUserId = function() {
  return jspb.Message.setField(this, 1, undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.ei.UserDataInfoRequest.prototype.hasUserId = function() {
  return jspb.Message.getField(this, 1) != null;
};


/**
 * optional string device_id = 2;
 * @return {string}
 */
proto.ei.UserDataInfoRequest.prototype.getDeviceId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.ei.UserDataInfoRequest} returns this
 */
proto.ei.UserDataInfoRequest.prototype.setDeviceId = function(value) {
  return jspb.Message.setField(this, 2, value);
};


/**
 * Clears the field making it undefined.
 * @return {!proto.ei.UserDataInfoRequest} returns this
 */
proto.ei.UserDataInfoRequest.prototype.clearDeviceId = function() {
  return jspb.Message.setField(this, 2, undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.ei.UserDataInfoRequest.prototype.hasDeviceId = function() {
  return jspb.Message.getField(this, 2) != null;
};


/**
 * optional uint64 backup_checksum = 3;
 * @return {number}
 */
proto.ei.UserDataInfoRequest.prototype.getBackupChecksum = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 3, 0));
};


/**
 * @param {number} value
 * @return {!proto.ei.UserDataInfoRequest} returns this
 */
proto.ei.UserDataInfoRequest.prototype.setBackupChecksum = function(value) {
  return jspb.Message.setField(this, 3, value);
};


/**
 * Clears the field making it undefined.
 * @return {!proto.ei.UserDataInfoRequest} returns this
 */
proto.ei.UserDataInfoRequest.prototype.clearBackupChecksum = function() {
  return jspb.Message.setField(this, 3, undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.ei.UserDataInfoRequest.prototype.hasBackupChecksum = function() {
  return jspb.Message.getField(this, 3) != null;
};

