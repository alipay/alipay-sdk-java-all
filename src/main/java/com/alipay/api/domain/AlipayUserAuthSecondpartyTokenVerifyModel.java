package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 二方登录token校验
 *
 * @author auto create
 * @since 1.0, 2019-07-16 19:52:31
 */
public class AlipayUserAuthSecondpartyTokenVerifyModel extends AlipayObject {

	private static final long serialVersionUID = 2535733998869476985L;

	/**
	 * 二方登录token
	 */
	@ApiField("second_party_token")
	private String secondPartyToken;

	/**
	 * 渠道来源
	 */
	@ApiField("source")
	private String source;

	public String getSecondPartyToken() {
		return this.secondPartyToken;
	}
	public void setSecondPartyToken(String secondPartyToken) {
		this.secondPartyToken = secondPartyToken;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

}
