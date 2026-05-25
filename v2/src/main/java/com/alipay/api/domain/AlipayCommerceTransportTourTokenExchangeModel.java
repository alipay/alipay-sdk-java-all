package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 一码通凭证交换接口
 *
 * @author auto create
 * @since 1.0, 2026-04-02 21:52:45
 */
public class AlipayCommerceTransportTourTokenExchangeModel extends AlipayObject {

	private static final long serialVersionUID = 5497523581872421728L;

	/**
	 * 一码通码值的codeToken
	 */
	@ApiField("code_token")
	private String codeToken;

	/**
	 * 需要换码用户的userId
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 支付宝行业库的景区ID，只有接入了一码付方案的景区才能通过该接口校验
	 */
	@ApiField("scenic_id")
	private String scenicId;

	/**
	 * 需要换码用户的userId
	 */
	@ApiField("user_id")
	private String userId;

	public String getCodeToken() {
		return this.codeToken;
	}
	public void setCodeToken(String codeToken) {
		this.codeToken = codeToken;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getScenicId() {
		return this.scenicId;
	}
	public void setScenicId(String scenicId) {
		this.scenicId = scenicId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
