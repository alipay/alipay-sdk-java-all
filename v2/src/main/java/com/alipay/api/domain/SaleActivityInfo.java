package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 售卖活动信息
 *
 * @author auto create
 * @since 1.0, 2021-08-27 13:10:05
 */
public class SaleActivityInfo extends AlipayObject {

	private static final long serialVersionUID = 2138251481761811786L;

	/**
	 * 商家券活动id。

在配券时，服务商配置的voucher_type 为 EXCHANGE_VOUCHER的活动。
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 商品单价

支付宝内部会进行金额一致性检查，每个单品的金额必须与配券时的售卖金额保持一致。

保障用户看到的单品金额与实际配券时的金额保持一致。
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 购买的数量

目前暂时只能支持。一次下单购买一个商品。

后续升级后，该功能放开。
	 */
	@ApiField("quantity")
	private Long quantity;

	public String getActivityId() {
		return this.activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public Long getQuantity() {
		return this.quantity;
	}
	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

}
