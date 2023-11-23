package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单消费数据详情查询-客服专用
 *
 * @author auto create
 * @since 1.0, 2020-06-20 10:58:53
 */
public class AlipayMerchantOrderUnlimitedQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3382177393314578788L;

	/**
	 * 业务号（目前仅支持交易号）

注：order_id、biz_no两者必选其一，若用biz_no查询，必须传入buyer_id
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
	 * 支付宝订单号（优先传入）
order_id、biz_no，两者必选其一；
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
