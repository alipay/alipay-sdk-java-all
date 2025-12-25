package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 出租车司机认证结果查询
 *
 * @author auto create
 * @since 1.0, 2025-09-22 11:03:28
 */
public class AlipayCommerceTransportTaxiDrivercertQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1359936759848378136L;

	/**
	 * 认证类型
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getCertType() {
		return this.certType;
	}
	public void setCertType(String certType) {
		this.certType = certType;
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
