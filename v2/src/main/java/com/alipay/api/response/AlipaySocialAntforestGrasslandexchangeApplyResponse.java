package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.GrasslandCert;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.social.antforest.grasslandexchange.apply response.
 * 
 * @author auto create
 * @since 1.0, 2026-09-21 15:22:26
 */
public class AlipaySocialAntforestGrasslandexchangeApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 2827333472724151845L;

	/** 
	 * true幂等
false不幂等
	 */
	@ApiField("idempotent")
	private Boolean idempotent;

	/** 
	 * 当次兑换获得的证书信息
	 */
	@ApiField("user_grassland_certificate")
	private GrasslandCert userGrasslandCertificate;

	public void setIdempotent(Boolean idempotent) {
		this.idempotent = idempotent;
	}
	public Boolean getIdempotent( ) {
		return this.idempotent;
	}

	public void setUserGrasslandCertificate(GrasslandCert userGrasslandCertificate) {
		this.userGrasslandCertificate = userGrasslandCertificate;
	}
	public GrasslandCert getUserGrasslandCertificate( ) {
		return this.userGrasslandCertificate;
	}

}
