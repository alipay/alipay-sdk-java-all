package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.auth.userauth.relationship.certify response.
 * 
 * @author auto create
 * @since 1.0, 2020-12-14 14:24:50
 */
public class AlipayOpenAuthUserauthRelationshipCertifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6885124112633349647L;

	/** 
	 * 授权关系有效性校验，true:有效，false:无效
	 */
	@ApiField("effective")
	private Boolean effective;

	public void setEffective(Boolean effective) {
		this.effective = effective;
	}
	public Boolean getEffective( ) {
		return this.effective;
	}

}
