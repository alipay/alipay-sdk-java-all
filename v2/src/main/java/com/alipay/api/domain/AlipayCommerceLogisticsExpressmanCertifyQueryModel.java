package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 快递员身份认证查询
 *
 * @author auto create
 * @since 1.0, 2025-05-30 09:47:27
 */
public class AlipayCommerceLogisticsExpressmanCertifyQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2187154699564952419L;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("expressman_open_id")
	private String expressmanOpenId;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("expressman_user_id")
	private String expressmanUserId;

	/**
	 * 由支付宝分配
	 */
	@ApiField("logistics_code")
	private String logisticsCode;

	public String getExpressmanOpenId() {
		return this.expressmanOpenId;
	}
	public void setExpressmanOpenId(String expressmanOpenId) {
		this.expressmanOpenId = expressmanOpenId;
	}

	public String getExpressmanUserId() {
		return this.expressmanUserId;
	}
	public void setExpressmanUserId(String expressmanUserId) {
		this.expressmanUserId = expressmanUserId;
	}

	public String getLogisticsCode() {
		return this.logisticsCode;
	}
	public void setLogisticsCode(String logisticsCode) {
		this.logisticsCode = logisticsCode;
	}

}
