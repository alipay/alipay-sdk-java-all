package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 会员信息和权益配置全量查询接口（需要用户授权）
 *
 * @author auto create
 * @since 1.0, 2016-08-12 10:49:42
 */
public class AlipayUserBenefitinfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4741643391913451551L;

	/**
	 * JSON数组的格式表示当前商户需要查询的权益配置的ID列表
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
