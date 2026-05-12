package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.policy.url.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-04-22 16:22:46
 */
public class AlipayInsScenePolicyUrlQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4341286949365418335L;

	/** 
	 * 过期时间，格式:yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("expiration")
	private Date expiration;

	/** 
	 * 保单详情url
	 */
	@ApiField("policy_url")
	private String policyUrl;

	public void setExpiration(Date expiration) {
		this.expiration = expiration;
	}
	public Date getExpiration( ) {
		return this.expiration;
	}

	public void setPolicyUrl(String policyUrl) {
		this.policyUrl = policyUrl;
	}
	public String getPolicyUrl( ) {
		return this.policyUrl;
	}

}
