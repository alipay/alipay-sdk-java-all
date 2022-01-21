package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 私域营销开放兑换券详情
 *
 * @author auto create
 * @since 1.0, 2021-11-15 17:06:11
 */
public class ActivityExchangeVoucher extends AlipayObject {

	private static final long serialVersionUID = 4693312694897199516L;

	/**
	 * 券的价值 限制： 币种为人民币，单位为元。小数点以后最多保留两位。 取值范围:0.1<=x<=3000
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 优惠门槛金额，表示只有当订单金额大于等于门槛金额时券才能使用。该字段为空时表示无门槛。 门槛金额的校验由服务商(商户)核销时自行校验，支付宝侧只做展示使用。 币种为人民币，单位为元。小数点以后最多保留两位。 设置门槛：取值范围:0.1<=x<= 50000。 如果设置了门槛金额，则必须大于等于0.1，不可以等于0
	 */
	@ApiField("floor_amount")
	private String floorAmount;

	/**
	 * 是否支持优惠券过期后，自动退款给用户。 不填默认否，枚举值： true：是 false：否 自动退款功能需要服务商在优惠券过期时，主动调用alipay.marketing.activity.order.refund接口进行退款。 如果配置优惠券时选择了过期自动退款，但是实际券过期后，服务商没有进行退款，那么用户投诉后，需要服务商进行解决。
	 */
	@ApiField("overdue_refundable")
	private Boolean overdueRefundable;

	/**
	 * 购买的优惠券是否允许退款。 不填默认否，枚举值： true：是 false：否
	 */
	@ApiField("refundable")
	private Boolean refundable;

	/**
	 * 用户购买优惠券需要支付的金额 限制： 币种为人民币，单位为元。小数点以后最多保留两位。 取值范围:0.1<=x<=3000
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
