package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 领取可领取积分
 *
 * @author auto create
 * @since 1.0, 2026-03-23 20:12:20
 */
public class AlipayUserMpointAlllpointReceiveModel extends AlipayObject {

	private static final long serialVersionUID = 2891686677628195512L;

	/**
	 * 用于标记调用方来源
	 */
	@ApiField("biz_source")
	private String bizSource;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getBizSource() {
		return this.bizSource;
	}
	public void setBizSource(String bizSource) {
		this.bizSource = bizSource;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
