package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 活动单品信息(仅操作类型为MODIFY时存在)
 *
 * @author auto create
 * @since 1.0, 2022-07-13 14:18:36
 */
public class ActivityGoodsBenefit extends AlipayObject {

	private static final long serialVersionUID = 1399448396939994484L;

	/**
	 * 活动权益配置的券活动id
	 */
	@ApiField("benefit_id")
	private String benefitId;

	/**
	 * 活动变更后的初始化库存
	 */
	@ApiField("stock")
	private String stock;

	public String getBenefitId() {
		return this.benefitId;
	}
	public void setBenefitId(String benefitId) {
		this.benefitId = benefitId;
	}

	public String getStock() {
		return this.stock;
	}
	public void setStock(String stock) {
		this.stock = stock;
	}

}
