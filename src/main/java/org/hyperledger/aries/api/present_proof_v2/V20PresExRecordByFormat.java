/*
 * Copyright (c) 2020-2021 - for information on the respective copyright owner
 * see the NOTICE file and/or the repository at
 * https://github.com/hyperledger-labs/acapy-java-client
 *
 * SPDX-License-Identifier: Apache-2.0
 */
package org.hyperledger.aries.api.present_proof_v2;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hyperledger.aries.api.present_proof.PresentProofRequest;
import org.hyperledger.aries.config.GsonConfig;

import java.util.Optional;

/**
 * V20PresExRecordByFormat
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class V20PresExRecordByFormat {
    private JsonObject pres;
    private JsonObject presProposal;
    private JsonObject presRequest;

    public Optional<PresentProofRequest.ProofRequest> resolveIndyPresentationRequest() {
        if (presRequest != null) {
            JsonElement indy = presRequest.get("indy");
            if (indy != null) {
                return Optional.ofNullable(GsonConfig.defaultConfig().fromJson(indy, PresentProofRequest.ProofRequest.class));
            }
        }
        return Optional.empty();
    }
}
