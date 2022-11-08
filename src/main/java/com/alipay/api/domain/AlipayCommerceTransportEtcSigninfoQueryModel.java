package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ETC订单签约信息查询
 *
 * @author auto create
 * @since 1.0, 2022-06-23 10:37:16
 */
public class AlipayCommerceTransportEtcSigninfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8174839229681896183L;

	/**
	 * 支付宝ETC订单号
	 */
	@ApiField("alipay_order_id")
	private String alipayOrderId;

	/**
	 * 商户ETC订单号
	 */
	@ApiField("out_order_id")
	private String outOrderId;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getAlipayOrderId() {
		return this.alipayOrderId;
	}
	public void setAlipayOrderId(String alipayOrderId) {
		this.alipayOrderId = alipayOrderId;
	}

	public String getOutOrderId() {
		return this.outOrderId;
	}
	public void setOutOrderId(String outOrderId) {
		this.outOrderId = outOrderId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
