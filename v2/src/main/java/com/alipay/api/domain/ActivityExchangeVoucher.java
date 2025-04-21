package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 私域营销开放兑换券详情
 *
 * @author auto create
 * @since 1.0, 2023-09-19 13:43:55
 */
public class ActivityExchangeVoucher extends AlipayObject {

	private static final long serialVersionUID = 8259478795479254934L;

	/**
	 * 券的价值。
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 门槛金额。说明：该字段可不填，认为无门槛;
	 */
	@ApiField("floor_amount")
	private String floorAmount;

	/**
	 * 是否支持优惠券过期后，自动退款给用户。 不填默认否，枚举值： true：是 false：否  自动退款功能需要服务商在优惠券过期时，主动调用alipay.marketing.activity.order.refund接口进行退款。  如果配置优惠券时选择了过期自动退款，但是实际券过期后，服务商没有进行退款，那么用户投诉后，需要服务商进行解决。
	 */
	@ApiField("overdue_refundable")
	private Boolean overdueRefundable;

	/**
	 * 购买的优惠券是否允许退款。 不填默认否，枚举值： true：是 false：否
	 */
	@ApiField("refundable")
	private Boolean refundable;

	/**
	 * 用户购买优惠券需要支付的金额。
	 */
	@ApiField("sale_amount")
	private String saleAmount;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getFloorAmount() {
		return this.floorAmount;
	}
	public void setFloorAmount(String floorAmount) {
		this.floorAmount = floorAmount;
	}

	public Boolean getOverdueRefundable() {
		return this.overdueRefundable;
	}
	public void setOverdueRefundable(Boolean overdueRefundable) {
		this.overdueRefundable = overdueRefundable;
	}

	public Boolean getRefundable() {
		return this.refundable;
	}
	public void setRefundable(Boolean refundable) {
		this.refundable = refundable;
	}

	public String getSaleAmount() {
		return this.saleAmount;
	}
	public void setSaleAmount(String saleAmount) {
		this.saleAmount = saleAmount;
	}

}
