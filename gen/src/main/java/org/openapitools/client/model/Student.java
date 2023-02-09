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
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.GradeRecord;

/**
 * Student
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-09T15:18:15.500685300+01:00[Europe/Berlin]")
public class Student {
  public static final String SERIALIZED_NAME_STUDENT_ID = "student_id";
  @SerializedName(SERIALIZED_NAME_STUDENT_ID)
  private BigDecimal studentId;

  public static final String SERIALIZED_NAME_FIRST_NAME = "first_name";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_LAST_NAME = "last_name";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName;

  public static final String SERIALIZED_NAME_GRADE_RECORDS = "gradeRecords";
  @SerializedName(SERIALIZED_NAME_GRADE_RECORDS)
  private List<GradeRecord> gradeRecords = null;


  public Student studentId(BigDecimal studentId) {
    
    this.studentId = studentId;
    return this;
  }

   /**
   * Get studentId
   * @return studentId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1234", value = "")

  public BigDecimal getStudentId() {
    return studentId;
  }


  public void setStudentId(BigDecimal studentId) {
    this.studentId = studentId;
  }


  public Student firstName(String firstName) {
    
    this.firstName = firstName;
    return this;
  }

   /**
   * Get firstName
   * @return firstName
  **/
  @ApiModelProperty(example = "John", required = true, value = "")

  public String getFirstName() {
    return firstName;
  }


  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  public Student lastName(String lastName) {
    
    this.lastName = lastName;
    return this;
  }

   /**
   * Get lastName
   * @return lastName
  **/
  @ApiModelProperty(example = "Smith", required = true, value = "")

  public String getLastName() {
    return lastName;
  }


  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  public Student gradeRecords(List<GradeRecord> gradeRecords) {
    
    this.gradeRecords = gradeRecords;
    return this;
  }

  public Student addGradeRecordsItem(GradeRecord gradeRecordsItem) {
    if (this.gradeRecords == null) {
      this.gradeRecords = new ArrayList<GradeRecord>();
    }
    this.gradeRecords.add(gradeRecordsItem);
    return this;
  }

   /**
   * Get gradeRecords
   * @return gradeRecords
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[{\"subject_name\":\"English\",\"grade\":8},{\"subject_name\":\"French\",\"grade\":9}]", value = "")

  public List<GradeRecord> getGradeRecords() {
    return gradeRecords;
  }


  public void setGradeRecords(List<GradeRecord> gradeRecords) {
    this.gradeRecords = gradeRecords;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Student student = (Student) o;
    return Objects.equals(this.studentId, student.studentId) &&
        Objects.equals(this.firstName, student.firstName) &&
        Objects.equals(this.lastName, student.lastName) &&
        Objects.equals(this.gradeRecords, student.gradeRecords);
  }

  @Override
  public int hashCode() {
    return Objects.hash(studentId, firstName, lastName, gradeRecords);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Student {\n");
    sb.append("    studentId: ").append(toIndentedString(studentId)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    gradeRecords: ").append(toIndentedString(gradeRecords)).append("\n");
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
