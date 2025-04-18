/*
 * 支付宝开放平台API
 * 支付宝开放平台v3协议文档
 *
 * The version of the OpenAPI document: 2025-03-05
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.alipay.v3.model;

import java.util.Objects;
import java.util.Arrays;
import com.alipay.v3.model.AlipayEbppInvoiceApplyResultSyncErrorResponseModel;
import com.alipay.v3.model.CommonErrorType;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

import javax.ws.rs.core.GenericType;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.JsonPrimitive;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

import com.alipay.v3.JSON;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayEbppInvoiceApplyResultSyncDefaultResponse extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(AlipayEbppInvoiceApplyResultSyncDefaultResponse.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!AlipayEbppInvoiceApplyResultSyncDefaultResponse.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'AlipayEbppInvoiceApplyResultSyncDefaultResponse' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<AlipayEbppInvoiceApplyResultSyncErrorResponseModel> adapterAlipayEbppInvoiceApplyResultSyncErrorResponseModel = gson.getDelegateAdapter(this, TypeToken.get(AlipayEbppInvoiceApplyResultSyncErrorResponseModel.class));
            final TypeAdapter<CommonErrorType> adapterCommonErrorType = gson.getDelegateAdapter(this, TypeToken.get(CommonErrorType.class));

            return (TypeAdapter<T>) new TypeAdapter<AlipayEbppInvoiceApplyResultSyncDefaultResponse>() {
                @Override
                public void write(JsonWriter out, AlipayEbppInvoiceApplyResultSyncDefaultResponse value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `AlipayEbppInvoiceApplyResultSyncErrorResponseModel`
                    if (value.getActualInstance() instanceof AlipayEbppInvoiceApplyResultSyncErrorResponseModel) {
                        JsonObject obj = adapterAlipayEbppInvoiceApplyResultSyncErrorResponseModel.toJsonTree((AlipayEbppInvoiceApplyResultSyncErrorResponseModel)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `CommonErrorType`
                    if (value.getActualInstance() instanceof CommonErrorType) {
                        JsonObject obj = adapterCommonErrorType.toJsonTree((CommonErrorType)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    throw new IOException("Failed to serialize as the type doesn't match anyOf schemas: AlipayEbppInvoiceApplyResultSyncErrorResponseModel, CommonErrorType");
                }

                @Override
                public AlipayEbppInvoiceApplyResultSyncDefaultResponse read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonObject jsonObject = elementAdapter.read(in).getAsJsonObject();

                    // deserialize AlipayEbppInvoiceApplyResultSyncErrorResponseModel
                    try {
                        // validate the JSON object to see if any exception is thrown
                        AlipayEbppInvoiceApplyResultSyncErrorResponseModel.validateJsonObject(jsonObject);
                        log.log(Level.FINER, "Input data matches schema 'AlipayEbppInvoiceApplyResultSyncErrorResponseModel'");
                        AlipayEbppInvoiceApplyResultSyncDefaultResponse ret = new AlipayEbppInvoiceApplyResultSyncDefaultResponse();
                        ret.setActualInstance(adapterAlipayEbppInvoiceApplyResultSyncErrorResponseModel.fromJsonTree(jsonObject));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        log.log(Level.FINER, "Input data does not match schema 'AlipayEbppInvoiceApplyResultSyncErrorResponseModel'", e);
                    }

                    // deserialize CommonErrorType
                    try {
                        // validate the JSON object to see if any exception is thrown
                        CommonErrorType.validateJsonObject(jsonObject);
                        log.log(Level.FINER, "Input data matches schema 'CommonErrorType'");
                        AlipayEbppInvoiceApplyResultSyncDefaultResponse ret = new AlipayEbppInvoiceApplyResultSyncDefaultResponse();
                        ret.setActualInstance(adapterCommonErrorType.fromJsonTree(jsonObject));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        log.log(Level.FINER, "Input data does not match schema 'CommonErrorType'", e);
                    }


                    throw new IOException(String.format("Failed deserialization for AlipayEbppInvoiceApplyResultSyncDefaultResponse: no class matched. JSON: %s", jsonObject.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in anyOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public AlipayEbppInvoiceApplyResultSyncDefaultResponse() {
        super("anyOf", Boolean.FALSE);
    }

    public AlipayEbppInvoiceApplyResultSyncDefaultResponse(AlipayEbppInvoiceApplyResultSyncErrorResponseModel o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public AlipayEbppInvoiceApplyResultSyncDefaultResponse(CommonErrorType o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("AlipayEbppInvoiceApplyResultSyncErrorResponseModel", new GenericType<AlipayEbppInvoiceApplyResultSyncErrorResponseModel>() {
        });
        schemas.put("CommonErrorType", new GenericType<CommonErrorType>() {
        });
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return AlipayEbppInvoiceApplyResultSyncDefaultResponse.schemas;
    }

    /**
     * Set the instance that matches the anyOf child schema, check
     * the instance parameter is valid against the anyOf child schemas:
     * AlipayEbppInvoiceApplyResultSyncErrorResponseModel, CommonErrorType
     *
     * It could be an instance of the 'anyOf' schemas.
     * The anyOf child schemas may themselves be a composed schema (allOf, anyOf, anyOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof AlipayEbppInvoiceApplyResultSyncErrorResponseModel) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof CommonErrorType) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be AlipayEbppInvoiceApplyResultSyncErrorResponseModel, CommonErrorType");
    }

    /**
     * Get the actual instance, which can be the following:
     * AlipayEbppInvoiceApplyResultSyncErrorResponseModel, CommonErrorType
     *
     * @return The actual instance (AlipayEbppInvoiceApplyResultSyncErrorResponseModel, CommonErrorType)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `AlipayEbppInvoiceApplyResultSyncErrorResponseModel`. If the actual instance is not `AlipayEbppInvoiceApplyResultSyncErrorResponseModel`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `AlipayEbppInvoiceApplyResultSyncErrorResponseModel`
     * @throws ClassCastException if the instance is not `AlipayEbppInvoiceApplyResultSyncErrorResponseModel`
     */
    public AlipayEbppInvoiceApplyResultSyncErrorResponseModel getAlipayEbppInvoiceApplyResultSyncErrorResponseModel() throws ClassCastException {
        return (AlipayEbppInvoiceApplyResultSyncErrorResponseModel)super.getActualInstance();
    }

    /**
     * Get the actual instance of `CommonErrorType`. If the actual instance is not `CommonErrorType`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CommonErrorType`
     * @throws ClassCastException if the instance is not `CommonErrorType`
     */
    public CommonErrorType getCommonErrorType() throws ClassCastException {
        return (CommonErrorType)super.getActualInstance();
    }


 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayEbppInvoiceApplyResultSyncDefaultResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    // validate anyOf schemas one by one
    int validCount = 0;
    // validate the json string with AlipayEbppInvoiceApplyResultSyncErrorResponseModel
    try {
      AlipayEbppInvoiceApplyResultSyncErrorResponseModel.validateJsonObject(jsonObj);
      return; // return earlier as at least one schema is valid with respect to the Json object
      //validCount++;
    } catch (Exception e) {
      // continue to the next one
    }
    // validate the json string with CommonErrorType
    try {
      CommonErrorType.validateJsonObject(jsonObj);
      return; // return earlier as at least one schema is valid with respect to the Json object
      //validCount++;
    } catch (Exception e) {
      // continue to the next one
    }
    if (validCount == 0) {
      throw new IOException(String.format("The JSON string is invalid for AlipayEbppInvoiceApplyResultSyncDefaultResponse with anyOf schemas: AlipayEbppInvoiceApplyResultSyncErrorResponseModel, CommonErrorType. JSON: %s", jsonObj.toString()));
    }
  }

 /**
  * Create an instance of AlipayEbppInvoiceApplyResultSyncDefaultResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayEbppInvoiceApplyResultSyncDefaultResponse
  * @throws IOException if the JSON string is invalid with respect to AlipayEbppInvoiceApplyResultSyncDefaultResponse
  */
  public static AlipayEbppInvoiceApplyResultSyncDefaultResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayEbppInvoiceApplyResultSyncDefaultResponse.class);
  }

 /**
  * Convert an instance of AlipayEbppInvoiceApplyResultSyncDefaultResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

