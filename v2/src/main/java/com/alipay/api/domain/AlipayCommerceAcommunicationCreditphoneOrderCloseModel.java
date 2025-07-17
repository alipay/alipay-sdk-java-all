package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 运营商行业信用购主单关闭
 *
 * @author auto create
 * @since 1.0, 2024-08-28 09:58:40
 */
public class AlipayCommerceAcommunicationCreditphoneOrderCloseModel extends AlipayObject {

	private static final long serialVersionUID = 2412347916597454686L;

	/**
	 * 支付宝用户id
	 */
	@ApiField("alipay_open_id")
	private String alipayOpenId;

	/**
	 * 支付宝主单号
	 */
	@ApiField("alipay_order_no")
	private String alipayOrderNo;

	/**
	 * 支付宝用户id
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	public String getAlipayOpenId() {
		return this.alipayOpenId;
	}
	public void setAlipayOpenId(String alipayOpenId) {
		this.alipayOpenId = alipayOpenId;
	}

	public String getAlipayOrderNo() {
		return this.alipayOrderNo;
	}
	public void setAlipayOrderNo(String alipayOrderNo) {
		this.alipayOrderNo = alipayOrderNo;
	}

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

}
