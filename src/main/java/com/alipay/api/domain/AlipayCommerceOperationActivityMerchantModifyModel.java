package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户签约信息修改
 *
 * @author auto create
 * @since 1.0, 2022-10-27 17:37:44
 */
public class AlipayCommerceOperationActivityMerchantModifyModel extends AlipayObject {

	private static final long serialVersionUID = 4872286516628284243L;

	/**
	 * 消费门槛，单位分
	 */
	@ApiField("consumption_threshold")
	private Long consumptionThreshold;

	/**
	 * 优惠金额，单位分
	 */
	@ApiField("discount_amount")
	private Long discountAmount;

	/**
	 * NORMAL 常规类型，不限制, RESTRICTED 限制报名条件
	 */
	@ApiField("type")
	private String type;

	public Long getConsumptionThreshold() {
		return this.consumptionThreshold;
	}
	public void setConsumptionThreshold(Long consumptionThreshold) {
		this.consumptionThreshold = consumptionThreshold;
	}

	public Long getDiscountAmount() {
		return this.discountAmount;
	}
	public void setDiscountAmount(Long discountAmount) {
		this.discountAmount = discountAmount;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
