package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 兑换券详情
 *
 * @author auto create
 * @since 1.0, 2022-11-03 16:33:13
 */
public class ExchangeVoucherInfo extends AlipayObject {

	private static final long serialVersionUID = 4112314764784222587L;

	/**
	 * 券的价值
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 兑换券业务类型。 注意：兑换券通过大促活动权益报名能力推广至支付宝会场时，本参数必填。
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 优惠门槛金额，表示只有当订单金额大于等于门槛金额时券才能使用。该字段为空时表示无门槛。 门槛金额的校验由服务商(商户)核销时自行校验，支付宝侧只做展示使用。
	 */
	@ApiField("floor_amount")
	private String floorAmount;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getFloorAmount() {
		return this.floorAmount;
	}
	public void setFloorAmount(String floorAmount) {
		this.floorAmount = floorAmount;
	}

}
