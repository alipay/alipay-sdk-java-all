package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询储值方案
 *
 * @author auto create
 * @since 1.0, 2021-04-19 15:07:59
 */
public class AlipayMerchantPayforprivilegePromotionplanQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6334594921565499378L;

	/**
	 * 充值方案ID
	 */
	@ApiField("promotion_plan_id")
	private String promotionPlanId;

	public String getPromotionPlanId() {
		return this.promotionPlanId;
	}
	public void setPromotionPlanId(String promotionPlanId) {
		this.promotionPlanId = promotionPlanId;
	}

}
