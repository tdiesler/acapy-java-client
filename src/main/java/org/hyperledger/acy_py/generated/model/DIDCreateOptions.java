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
 * DIDCreateOptions
 */

@lombok.Data
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor
@lombok.Builder
public class DIDCreateOptions {
    /**
     * Gets or Sets keyType
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
}
