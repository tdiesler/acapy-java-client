/*
 * aca-py client
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v0.7.0-pre3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.hyperledger.acy_py.generated.model;

import com.google.gson.annotations.SerializedName;

/**
 * SignResponse
 */

@lombok.Data
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor
@lombok.Builder
public class SignResponse {
    public static final String SERIALIZED_NAME_ERROR = "error";
    @SerializedName(SERIALIZED_NAME_ERROR)
    private String error;
    public static final String SERIALIZED_NAME_SIGNED_DOC = "signed_doc";
    @SerializedName(SERIALIZED_NAME_SIGNED_DOC)
    private Object signedDoc;
}
