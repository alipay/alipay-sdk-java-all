package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 菩提叶扣减接口
 *
 * @author auto create
 * @since 1.0, 2026-10-15 22:12:57
 */
public class AnttechNftBlessBodhileafSubmitModel extends AlipayObject {

	private static final long serialVersionUID = 7862239998829698876L;

	/**
	 * 通过 OAuth 授权流程获取，用于解析用户 openUserId
	 */
	@ApiField("access_token")
	private String accessToken;

	/**
	 * 租户内唯一
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 运营后台已配置且已上线
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
