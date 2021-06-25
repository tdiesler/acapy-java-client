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
 * InvitationRecord
 */

@lombok.Data
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor
@lombok.Builder
public class InvitationRecord {
    public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
    @SerializedName(SERIALIZED_NAME_CREATED_AT)
    private String createdAt;
    public static final String SERIALIZED_NAME_INVI_MSG_ID = "invi_msg_id";
    @SerializedName(SERIALIZED_NAME_INVI_MSG_ID)
    private String inviMsgId;
    public static final String SERIALIZED_NAME_INVITATION = "invitation";
    @SerializedName(SERIALIZED_NAME_INVITATION)
    private InvitationMessage invitation;
    public static final String SERIALIZED_NAME_INVITATION_ID = "invitation_id";
    @SerializedName(SERIALIZED_NAME_INVITATION_ID)
    private String invitationId;
    public static final String SERIALIZED_NAME_INVITATION_URL = "invitation_url";
    @SerializedName(SERIALIZED_NAME_INVITATION_URL)
    private String invitationUrl;
    public static final String SERIALIZED_NAME_STATE = "state";
    @SerializedName(SERIALIZED_NAME_STATE)
    private String state;
    public static final String SERIALIZED_NAME_TRACE = "trace";
    @SerializedName(SERIALIZED_NAME_TRACE)
    private Boolean trace;
    public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
    @SerializedName(SERIALIZED_NAME_UPDATED_AT)
    private String updatedAt;
}
