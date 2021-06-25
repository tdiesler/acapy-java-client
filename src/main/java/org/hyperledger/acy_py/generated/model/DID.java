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

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

/**
 * DID
 */

@lombok.Data
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor
@lombok.Builder
public class DID {
    public static final String SERIALIZED_NAME_DID = "did";
    @SerializedName(SERIALIZED_NAME_DID)
    private String did;

    /**
     * Key type associated with the DID
     */
    @JsonAdapter(KeyTypeEnum.Adapter.class)
    public enum KeyTypeEnum {
        ED25519("ed25519"),

        BLS12381G2("bls12381g2");

        private String value;

        KeyTypeEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static KeyTypeEnum fromValue(String value) {
            for (KeyTypeEnum b : KeyTypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        public static class Adapter extends TypeAdapter<KeyTypeEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final KeyTypeEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public KeyTypeEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return KeyTypeEnum.fromValue(value);
            }
        }
    }

    public static final String SERIALIZED_NAME_KEY_TYPE = "key_type";
    @SerializedName(SERIALIZED_NAME_KEY_TYPE)
    private KeyTypeEnum keyType;

    /**
     * Did method associated with the DID
     */
    @JsonAdapter(MethodEnum.Adapter.class)
    public enum MethodEnum {
        SOV("sov"),

        KEY("key");

        private String value;

        MethodEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static MethodEnum fromValue(String value) {
            for (MethodEnum b : MethodEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        public static class Adapter extends TypeAdapter<MethodEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final MethodEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public MethodEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return MethodEnum.fromValue(value);
            }
        }
    }

    public static final String SERIALIZED_NAME_METHOD = "method";
    @SerializedName(SERIALIZED_NAME_METHOD)
    private MethodEnum method;

    /**
     * Whether DID is current public DID, posted to ledger but not current public DID, or local to the wallet
     */
    @JsonAdapter(PostureEnum.Adapter.class)
    public enum PostureEnum {
        PUBLIC("public"),

        POSTED("posted"),

        WALLET_ONLY("wallet_only");

        private String value;

        PostureEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static PostureEnum fromValue(String value) {
            for (PostureEnum b : PostureEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        public static class Adapter extends TypeAdapter<PostureEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final PostureEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public PostureEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return PostureEnum.fromValue(value);
            }
        }
    }

    public static final String SERIALIZED_NAME_POSTURE = "posture";
    @SerializedName(SERIALIZED_NAME_POSTURE)
    private PostureEnum posture;
    public static final String SERIALIZED_NAME_VERKEY = "verkey";
    @SerializedName(SERIALIZED_NAME_VERKEY)
    private String verkey;
}
