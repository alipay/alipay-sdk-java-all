package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 已签约用户状态同步
 *
 * @author auto create
 * @since 1.0, 2024-09-19 17:49:27
 */
public class AlipayCommerceMedicalInsuranceProtocolSyncModel extends AlipayObject {

	private static final long serialVersionUID = 5148797611451641121L;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 操作状态，1--生效，2--失效
	 */
	@ApiField("opt_type")
	private Long optType;

	/**
	 * 请求来源，固定枚举值，有支付宝统一定义
	 */
	@ApiField("source")
	private String source;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public Long getOptType() {
		return this.optType;
	}
	public void setOptType(Long optType) {
		this.optType = optType;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
