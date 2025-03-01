/*
 * Copyright (c) 2020-2021 - for information on the respective copyright owner
 * see the NOTICE file and/or the repository at
 * https://github.com/hyperledger-labs/acapy-java-client
 *
 * SPDX-License-Identifier: Apache-2.0
 */
package org.hyperledger.aries.api.present_proof;

public interface PresExStateTranslator {

    PresentationExchangeState getState();

    PresentationExchangeRole getRole();

    default boolean roleIsProver() {
        return PresentationExchangeRole.PROVER.equals(getRole());
    }

    default boolean roleIsVerifier() {
        return PresentationExchangeRole.VERIFIER.equals(getRole());
    }

    default boolean roleIsProverAndRequestReceived() {
        return roleIsProver() && stateIsRequestReceived();
    }

    default boolean roleIsProverAndPresentationSent() {
        return roleIsProver() && PresentationExchangeState.PRESENTATIONS_SENT.equals(getState());
    }

    default boolean roleIsProverAndProposalSent() {
        return roleIsProver() && stateIsProposalSent();
    }

    default boolean roleIsProverAndPresentationAcked() {
        return roleIsProver() && PresentationExchangeState.PRESENTATION_ACKED.equals(getState());
    }

    // v1 or v2
    default boolean roleIsProverAndStateIsPresentationAckedOrDone() {
        return roleIsProver() &&
                (PresentationExchangeState.PRESENTATION_ACKED.equals(getState())
                || PresentationExchangeState.DONE.equals(getState()));
    }

    default boolean roleIsVerifierAndRequestSent() {
        return roleIsVerifier() && PresentationExchangeState.REQUEST_SENT.equals(getState());
    }

    // v1 or v2
    default boolean roleIsVerifierAndStateIsVerifiedOrDone() {
        return roleIsVerifier() &&
                (PresentationExchangeState.VERIFIED.equals(getState())
                || PresentationExchangeState.DONE.equals(getState()));
    }

    default boolean roleIsVerifierAndVerified() {
        return roleIsVerifier() && PresentationExchangeState.VERIFIED.equals(getState());
    }

    default boolean roleIsVerifierAndDone() {
        return roleIsVerifier() && PresentationExchangeState.DONE.equals(getState());
    }

    default boolean stateIsProposalSent() {
        return PresentationExchangeState.PROPOSAL_SENT.equals(getState());
    }

    default boolean stateIsRequestReceived() {
        return PresentationExchangeState.REQUEST_RECEIVED.equals(getState());
    }
}
