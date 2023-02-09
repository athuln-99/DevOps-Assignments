/*
 * Simple Inventory API
 * This is a simple API
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: you@your-company.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * GradeRecord
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-09T14:20:12.324757200+01:00[Europe/Berlin]")
public class GradeRecord {
  public static final String SERIALIZED_NAME_SUBJECT_NAME = "subject_name";
  @SerializedName(SERIALIZED_NAME_SUBJECT_NAME)
  private String subjectName;

  public static final String SERIALIZED_NAME_GRADE = "grade";
  @SerializedName(SERIALIZED_NAME_GRADE)
  private Float grade;


  public GradeRecord subjectName(String subjectName) {
    
    this.subjectName = subjectName;
    return this;
  }

   /**
   * Get subjectName
   * @return subjectName
  **/
  @ApiModelProperty(example = "Mathematics", required = true, value = "")

  public String getSubjectName() {
    return subjectName;
  }


  public void setSubjectName(String subjectName) {
    this.subjectName = subjectName;
  }


  public GradeRecord grade(Float grade) {
    
    this.grade = grade;
    return this;
  }

   /**
   * Get grade
   * minimum: 0
   * maximum: 10
   * @return grade
  **/
  @ApiModelProperty(example = "7", required = true, value = "")

  public Float getGrade() {
    return grade;
  }


  public void setGrade(Float grade) {
    this.grade = grade;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GradeRecord gradeRecord = (GradeRecord) o;
    return Objects.equals(this.subjectName, gradeRecord.subjectName) &&
        Objects.equals(this.grade, gradeRecord.grade);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subjectName, grade);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GradeRecord {\n");
    sb.append("    subjectName: ").append(toIndentedString(subjectName)).append("\n");
    sb.append("    grade: ").append(toIndentedString(grade)).append("\n");
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

