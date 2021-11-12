package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 更新可领取的集分宝余额
 *
 * @author auto create
 * @since 1.0, 2021-11-01 11:21:18
 */
public class AlipayEcoRebateBalanceSendModel extends AlipayObject {

	private static final long serialVersionUID = 8353185736835628738L;

	/**
	 * 用户订单明细
	 */
	@ApiListField("items")
	@ApiField("rebate_good")
	private List<RebateGood> items;

	/**
	 * 商户侧的用户订单id
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 用户支付宝唯一标识，2088开头。
	 */
	@ApiField("user_id")
	private String userId;

	public List<RebateGood> getItems() {
		return this.items;
	}
	public void setItems(List<RebateGood> items) {
		this.items = items;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
