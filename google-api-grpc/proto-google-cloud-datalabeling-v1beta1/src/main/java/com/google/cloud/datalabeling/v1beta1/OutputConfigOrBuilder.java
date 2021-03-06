// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datalabeling/v1beta1/dataset.proto

package com.google.cloud.datalabeling.v1beta1;

public interface OutputConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datalabeling.v1beta1.OutputConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output to a GCS file. Should be used for labeling output other than Audio
   * transcription.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.GcsDestination gcs_destination = 1;</code>
   */
  boolean hasGcsDestination();
  /**
   *
   *
   * <pre>
   * Output to a GCS file. Should be used for labeling output other than Audio
   * transcription.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.GcsDestination gcs_destination = 1;</code>
   */
  com.google.cloud.datalabeling.v1beta1.GcsDestination getGcsDestination();
  /**
   *
   *
   * <pre>
   * Output to a GCS file. Should be used for labeling output other than Audio
   * transcription.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.GcsDestination gcs_destination = 1;</code>
   */
  com.google.cloud.datalabeling.v1beta1.GcsDestinationOrBuilder getGcsDestinationOrBuilder();

  /**
   *
   *
   * <pre>
   * Output to a GCS folder. Should be used for Audio transcription
   * labeling output.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.GcsFolderDestination gcs_folder_destination = 2;
   * </code>
   */
  boolean hasGcsFolderDestination();
  /**
   *
   *
   * <pre>
   * Output to a GCS folder. Should be used for Audio transcription
   * labeling output.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.GcsFolderDestination gcs_folder_destination = 2;
   * </code>
   */
  com.google.cloud.datalabeling.v1beta1.GcsFolderDestination getGcsFolderDestination();
  /**
   *
   *
   * <pre>
   * Output to a GCS folder. Should be used for Audio transcription
   * labeling output.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.GcsFolderDestination gcs_folder_destination = 2;
   * </code>
   */
  com.google.cloud.datalabeling.v1beta1.GcsFolderDestinationOrBuilder
      getGcsFolderDestinationOrBuilder();

  public com.google.cloud.datalabeling.v1beta1.OutputConfig.DestinationCase getDestinationCase();
}
