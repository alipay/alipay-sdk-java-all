package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 医疗会员获取用户授权访问令牌
 *
 * @author auto create
 * @since 1.0, 2025-09-26 20:33:20
 */
public class AlipayCommerceMedicalMemberTokenTakeModel extends AlipayObject {

	private static final long serialVersionUID = 2344422476296455731L;

	/**
	 * 周期 有效期 多少天
	 */
	@ApiField("duration")
	private Long duration;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 业务来源类型
	 */
	@ApiField("source")
	private String source;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public Long getDuration() {
		return this.duration;
	}
	public void setDuration(Long duration) {
		this.duration = duration;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
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
