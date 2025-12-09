package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * tab4建联链接跳转支持
 *
 * @author auto create
 * @since 1.0, 2025-09-24 22:11:28
 */
public class AlipayCommerceMedicalJumpTabApplyModel extends AlipayObject {

	private static final long serialVersionUID = 3449622488776488262L;

	/**
	 * 请求来源的字符串
	 */
	@ApiField("from_source")
	private String fromSource;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getFromSource() {
		return this.fromSource;
	}
	public void setFromSource(String fromSource) {
		this.fromSource = fromSource;
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
