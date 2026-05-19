package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 获取学历认证业务票据
 *
 * @author auto create
 * @since 1.0, 2026-05-18 10:52:45
 */
public class AlipayEbppIndustryEducertifyTokenCreateModel extends AlipayObject {

	private static final long serialVersionUID = 2649419353232826516L;

	/**
	 * 业务ID,一般为UUID字符串
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 支付宝用户的userId
	 */
	@ApiField("user_id")
	private String userId;

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
