# DefaultApi

All URIs are relative to *https://virtserver.SwaggerHub.com/tutorial/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addStudent**](DefaultApi.md#addStudent) | **POST** /student | Add a new student
[**deleteStudent**](DefaultApi.md#deleteStudent) | **DELETE** /student/{student_id} | deletes a student
[**getStudentById**](DefaultApi.md#getStudentById) | **GET** /student/{student_id} | gets student


<a name="addStudent"></a>
# **addStudent**
> BigDecimal addStudent(student)

Add a new student

Adds an item to the system

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://virtserver.SwaggerHub.com/tutorial/1.0.0");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    Student student = new Student(); // Student | Student item to add
    try {
      BigDecimal result = apiInstance.addStudent(student);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#addStudent");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **student** | [**Student**](Student.md)| Student item to add | [optional]

### Return type

[**BigDecimal**](BigDecimal.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | created |  -  |
**400** | invalid input, object invalid |  -  |
**409** | an existing already exists |  -  |

<a name="deleteStudent"></a>
# **deleteStudent**
> deleteStudent(studentId)

deletes a student

delete a single student 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://virtserver.SwaggerHub.com/tutorial/1.0.0");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    BigDecimal studentId = new BigDecimal(78); // BigDecimal | the uid
    try {
      apiInstance.deleteStudent(studentId);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#deleteStudent");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **studentId** | **BigDecimal**| the uid |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | invalid ID |  -  |
**404** | not found |  -  |

<a name="getStudentById"></a>
# **getStudentById**
> Student getStudentById(studentId)

gets student

Returns a single student 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://virtserver.SwaggerHub.com/tutorial/1.0.0");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    BigDecimal studentId = new BigDecimal(78); // BigDecimal | the uid
    try {
      Student result = apiInstance.getStudentById(studentId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getStudentById");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **studentId** | **BigDecimal**| the uid |

### Return type

[**Student**](Student.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | successful operation |  -  |
**400** | invalid ID |  -  |
**404** | not found |  -  |

