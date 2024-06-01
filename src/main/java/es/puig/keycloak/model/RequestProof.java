package es.puig.keycloak.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.fiware.keycloak.oidcvc.model.ProofTypeVO;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RequestProof {

	@JsonProperty("proof_type")
	private ProofTypeVO proofType;
	@JsonProperty("jwt")
	private String jwt;
}
