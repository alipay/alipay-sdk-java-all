package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 权益预算查询
 *
 * @author auto create
 * @since 1.0, 2022-11-17 18:06:56
 */
public class AlipayOverseasTravelBenefitbudgetQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5875718653546572674L;

	/**
	 * 权益预算id列表
	 */
	@ApiListField("benefit_ids")
	@ApiField("string")
	private List<String> benefitIds;

	public List<String> getBenefitIds() {
		return this.benefitIds;
	}
	public void setBenefitIds(List<String> benefitIds) {
		this.benefitIds = benefitIds;
	}

}
