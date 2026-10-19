package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 祈福善念值发放接口
 *
 * @author auto create
 * @since 1.0, 2026-10-15 22:12:57
 */
public class AnttechNftBlessGoodwillSubmitModel extends AlipayObject {

	private static final long serialVersionUID = 2661163334223127542L;

	/**
	 * 用户授权令牌
	 */
	@ApiField("access_token")
	private String accessToken;

	/**
	 * 三方唯一流水号（幂等号）
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 交易事件code
	 */
	@ApiField("event_code")
	private String eventCode;

	public String getAccessToken() {
		return this.accessToken;
	}
	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	public String getEventCode() {
		return this.eventCode;
	}
	public void setEventCode(String eventCode) {
		this.eventCode = eventCode;
	}

}
