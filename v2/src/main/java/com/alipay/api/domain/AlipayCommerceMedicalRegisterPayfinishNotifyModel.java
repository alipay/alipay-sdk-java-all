package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付成功通知
 *
 * @author auto create
 * @since 1.0, 2025-07-04 14:37:48
 */
public class AlipayCommerceMedicalRegisterPayfinishNotifyModel extends AlipayObject {

	private static final long serialVersionUID = 7293611627721573967L;

	/**
	 * 支付宝 id
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * isvCode
	 */
	@ApiField("isv_code")
	private String isvCode;

	/**
	 * 服务商内部系统订单id
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * platformCode
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
