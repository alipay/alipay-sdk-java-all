package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单详情查询
 *
 * @author auto create
 * @since 1.0, 2020-06-20 10:59:29
 */
public class AlipayMerchantOrderConsumerQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8847389315814782252L;

	/**
	 * 业务号（目前仅支持交易号）

注：
1. order_id、biz_no、两者必选其一，若用biz_no查询，必须传入buyer_id
2.若都传，优先级order_id>biz_no，忽略优先级低的字段
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 买家支付宝用户id

注：若用biz_no查询，必须传入buyer_id
	 */
	@ApiField("buyer_id")
	private String buyerId;

	/**
	 * 支付宝订单号

注：
1. order_id、biz_no、两者必选其一，若用biz_no查询，必须传入buyer_id
2.若都传，优先级order_id>biz_no，忽略优先级低的字段
	 */
	@ApiField("order_id")
	private String orderId;

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	public String getBuyerId() {
		return this.buyerId;
	}
	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

}
