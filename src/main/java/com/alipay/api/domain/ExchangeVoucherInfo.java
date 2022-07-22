package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 兑换券详情
 *
 * @author auto create
 * @since 1.0, 2022-07-20 18:09:22
 */
public class ExchangeVoucherInfo extends AlipayObject {

	private static final long serialVersionUID = 7227831648996499785L;

	/**
	 * 券的价值 限制： 币种为人民币，单位为元。小数点以后最多保留两位。 取值范围:0.1<=x<=3000
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 兑换券业务类型。 枚举值 团购券：GROUP_BUY_EXCHANGE_VOUCHER 代金券：FIX_EXCHANGE_VOUCHER 注意：兑换券通过大促活动权益报名能力推广至支付宝会场时，本参数必填。
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 优惠门槛金额，表示只有当订单金额大于等于门槛金额时券才能使用。该字段为空时表示无门槛。 门槛金额的校验由服务商(商户)核销时自行校验，支付宝侧只做展示使用。 币种为人民币，单位为元。小数点以后最多保留两位。 设置门槛：取值范围:0.1<=x<= 50000。 如果设置了门槛金额，则必须大于等于0.1，不可以等于0
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
