package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.data.authorization.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-03-09 11:15:19
 */
public class AlipayInsDataAuthorizationQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6719867332233471487L;

	/** 
	 * 授权文件URL
	 */
	@ApiField("auth_agreement_url")
	private String authAgreementUrl;

	/** 
	 * 与被保人关系，枚举定义：1-本人，2-配偶，3-子女，4-父母，5-法定监护人，99-其他
	 */
	@ApiField("relation_to_insured")
	private String relationToInsured;

	public void setAuthAgreementUrl(String authAgreementUrl) {
		this.authAgreementUrl = authAgreementUrl;
	}
	public String getAuthAgreementUrl( ) {
		return this.authAgreementUrl;
	}

	public void setRelationToInsured(String relationToInsured) {
		this.relationToInsured = relationToInsured;
	}
	public String getRelationToInsured( ) {
		return this.relationToInsured;
	}

}
