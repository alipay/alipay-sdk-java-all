package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付成功通知
 *
 * @author auto create
 * @since 1.0, 2026-03-06 10:54:59
 */
public class AlipayCommerceMedicalRegisterPayfinishNotifyModel extends AlipayObject {

	private static final long serialVersionUID = 3267633222476534331L;

	/**
	 * 支付宝 id
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 支付宝平台给服务商分配的编码
	 */
	@ApiField("isv_code")
	private String isvCode;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 服务商内部系统订单id
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 支付宝给服务商分配的平台编码
	 */
	@ApiField("platform_code")
	private String platformCode;

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

	public String getIsvCode() {
		return this.isvCode;
	}
	public void setIsvCode(String isvCode) {
		this.isvCode = isvCode;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getPlatformCode() {
		return this.platformCode;
	}
	public void setPlatformCode(String platformCode) {
		this.platformCode = platformCode;
	}

}
