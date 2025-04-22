package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 资产放贷风控结果查询
 *
 * @author auto create
 * @since 1.0, 2025-04-10 15:12:29
 */
public class AlipayCommerceRentLoanQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1593912875855812473L;

	/**
	 * 买家支付宝用户id，小程序场景下获取用户ID请参考：用户授权; 其它场景下获取用户ID请参考：网页授权获取用户信息。
	 */
	@ApiField("buyer_id")
	private String buyerId;

	/**
	 * 买家支付宝用户唯一标识

	 */
	@ApiField("buyer_open_id")
	private String buyerOpenId;

	/**
	 * 交易组件id，通过交易组件创建的order_id
	 */
	@ApiField("order_id")
	private String orderId;

	public String getBuyerId() {
		return this.buyerId;
	}
	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}

	public String getBuyerOpenId() {
		return this.buyerOpenId;
	}
	public void setBuyerOpenId(String buyerOpenId) {
		this.buyerOpenId = buyerOpenId;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

}
