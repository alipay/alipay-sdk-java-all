package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ETC订单签约信息查询
 *
 * @author auto create
 * @since 1.0, 2023-02-01 11:19:20
 */
public class AlipayCommerceTransportEtcSigninfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4641273285749192496L;

	/**
	 * 支付宝ETC订单号
	 */
	@ApiField("alipay_order_id")
	private String alipayOrderId;

	/**
	 * 蚂蚁会员统一ID
	 */
	@ApiField("open_id")
	private String openId;

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

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
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
