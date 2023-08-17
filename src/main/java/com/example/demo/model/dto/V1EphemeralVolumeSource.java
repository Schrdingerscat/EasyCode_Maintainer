/*
Copyright 2023 The Kubernetes Authors.
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package com.example.demo.model.dto;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.example.demo.model.dto.V1PersistentVolumeClaimTemplate;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Represents an ephemeral volume that is handled by a normal storage driver.
 */
@ApiModel(description = "Represents an ephemeral volume that is handled by a normal storage driver.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-18T15:05:57.863601Z[Etc/UTC]")
public class V1EphemeralVolumeSource {
  public static final String SERIALIZED_NAME_VOLUME_CLAIM_TEMPLATE = "volumeClaimTemplate";
  @SerializedName(SERIALIZED_NAME_VOLUME_CLAIM_TEMPLATE)
  private V1PersistentVolumeClaimTemplate volumeClaimTemplate;


  public V1EphemeralVolumeSource volumeClaimTemplate(V1PersistentVolumeClaimTemplate volumeClaimTemplate) {

    this.volumeClaimTemplate = volumeClaimTemplate;
    return this;
  }

   /**
   * Get volumeClaimTemplate
   * @return volumeClaimTemplate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1PersistentVolumeClaimTemplate getVolumeClaimTemplate() {
    return volumeClaimTemplate;
  }


  public void setVolumeClaimTemplate(V1PersistentVolumeClaimTemplate volumeClaimTemplate) {
    this.volumeClaimTemplate = volumeClaimTemplate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1EphemeralVolumeSource v1EphemeralVolumeSource = (V1EphemeralVolumeSource) o;
    return Objects.equals(this.volumeClaimTemplate, v1EphemeralVolumeSource.volumeClaimTemplate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(volumeClaimTemplate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1EphemeralVolumeSource {\n");
    sb.append("    volumeClaimTemplate: ").append(toIndentedString(volumeClaimTemplate)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
