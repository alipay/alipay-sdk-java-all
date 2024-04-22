package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 信用结算单信息
 *
 * @author auto create
 * @since 1.0, 2023-11-22 11:23:40
 */
public class CreditSettlementOrder extends AlipayObject {

	private static final long serialVersionUID = 7868417755556879284L;

	/**
	 * 信用服务订单号
	 */
	@ApiField("credit_biz_order_id")
	private String creditBizOrderId;

	/**
	 * 订单原价
	 */
	@ApiField("origin_amount")
	private String originAmount;

	/**
	 * 结算金额
	 */
	@ApiField("settle_amount")
	private String settleAmount;

	/**
	 * 是否目标订单：true/false
	 */
	@ApiField("target_order")
	private Boolean targetOrder;

	public String getCreditBizOrderId() {
		return this.creditBizOrderId;
	}
	public void setCreditBizOrderId(String creditBizOrderId) {
		this.creditBizOrderId = creditBizOrderId;
	}

	public String getOriginAmount() {
		return this.originAmount;
	}
	public void setOriginAmount(String originAmount) {
		this.originAmount = originAmount;
	}

	public String getSettleAmount() {
		return this.settleAmount;
	}
	public void setSettleAmount(String settleAmount) {
		this.settleAmount = settleAmount;
	}

	public Boolean getTargetOrder() {
		return this.targetOrder;
	}
	public void setTargetOrder(Boolean targetOrder) {
		this.targetOrder = targetOrder;
	}

}
