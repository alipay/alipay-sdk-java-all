package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.aigc.diyitem.consult response.
 * 
 * @author auto create
 * @since 1.0, 2023-12-15 20:26:54
 */
public class AlipayUserAigcDiyitemConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 1781185554736246566L;

	/** 
	 * 咨询是否通过
	 */
	@ApiField("pass")
	private Boolean pass;

	/** 
	 * 咨询未通过原因
	 */
	@ApiField("unpass_reason")
	private String unpassReason;

	public void setPass(Boolean pass) {
		this.pass = pass;
	}
	public Boolean getPass( ) {
		return this.pass;
	}

	public void setUnpassReason(String unpassReason) {
		this.unpassReason = unpassReason;
	}
	public String getUnpassReason( ) {
		return this.unpassReason;
	}

}
