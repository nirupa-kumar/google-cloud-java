// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2/entity_type.proto

package com.google.cloud.dialogflow.v2;

public interface EntityTypeOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2.EntityType)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The unique identifier of the entity type.
   * Required for [EntityTypes.UpdateEntityType][google.cloud.dialogflow.v2.EntityTypes.UpdateEntityType] and
   * [EntityTypes.BatchUpdateEntityTypes][google.cloud.dialogflow.v2.EntityTypes.BatchUpdateEntityTypes] methods.
   * Format: `projects/&lt;Project ID&gt;/agent/entityTypes/&lt;Entity Type ID&gt;`.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * The unique identifier of the entity type.
   * Required for [EntityTypes.UpdateEntityType][google.cloud.dialogflow.v2.EntityTypes.UpdateEntityType] and
   * [EntityTypes.BatchUpdateEntityTypes][google.cloud.dialogflow.v2.EntityTypes.BatchUpdateEntityTypes] methods.
   * Format: `projects/&lt;Project ID&gt;/agent/entityTypes/&lt;Entity Type ID&gt;`.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Required. The name of the entity type.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * Required. The name of the entity type.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * Required. Indicates the kind of entity type.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.EntityType.Kind kind = 3;</code>
   */
  int getKindValue();
  /**
   *
   *
   * <pre>
   * Required. Indicates the kind of entity type.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.EntityType.Kind kind = 3;</code>
   */
  com.google.cloud.dialogflow.v2.EntityType.Kind getKind();

  /**
   *
   *
   * <pre>
   * Optional. Indicates whether the entity type can be automatically
   * expanded.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.EntityType.AutoExpansionMode auto_expansion_mode = 4;</code>
   */
  int getAutoExpansionModeValue();
  /**
   *
   *
   * <pre>
   * Optional. Indicates whether the entity type can be automatically
   * expanded.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.EntityType.AutoExpansionMode auto_expansion_mode = 4;</code>
   */
  com.google.cloud.dialogflow.v2.EntityType.AutoExpansionMode getAutoExpansionMode();

  /**
   *
   *
   * <pre>
   * Optional. The collection of entity entries associated with the entity type.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2.EntityType.Entity entities = 6;</code>
   */
  java.util.List<com.google.cloud.dialogflow.v2.EntityType.Entity> getEntitiesList();
  /**
   *
   *
   * <pre>
   * Optional. The collection of entity entries associated with the entity type.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2.EntityType.Entity entities = 6;</code>
   */
  com.google.cloud.dialogflow.v2.EntityType.Entity getEntities(int index);
  /**
   *
   *
   * <pre>
   * Optional. The collection of entity entries associated with the entity type.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2.EntityType.Entity entities = 6;</code>
   */
  int getEntitiesCount();
  /**
   *
   *
   * <pre>
   * Optional. The collection of entity entries associated with the entity type.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2.EntityType.Entity entities = 6;</code>
   */
  java.util.List<? extends com.google.cloud.dialogflow.v2.EntityType.EntityOrBuilder>
      getEntitiesOrBuilderList();
  /**
   *
   *
   * <pre>
   * Optional. The collection of entity entries associated with the entity type.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2.EntityType.Entity entities = 6;</code>
   */
  com.google.cloud.dialogflow.v2.EntityType.EntityOrBuilder getEntitiesOrBuilder(int index);
}
