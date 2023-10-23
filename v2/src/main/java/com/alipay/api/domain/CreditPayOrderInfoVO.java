package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 信用支付咨询订单信息
 *
 * @author auto create
 * @since 1.0, 2019-07-12 14:25:22
 */
public class CreditPayOrderInfoVO extends AlipayObject {

	private static final long serialVersionUID = 1317166286435376374L;

	/**
	 * 外部平台订单号，如果传给支付宝收单时带着前缀，此处也需要
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 卖家支付宝账户ID
	 */
	@ApiField("seller_user_id")
	private String sellerUserId;

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public String getSellerUserId() {
		return this.sellerUserId;
	}
	public void setSellerUserId(String sellerUserId) {
		this.sellerUserId = sellerUserId;
	}

}
