package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.McardTemplateBenefitQuery;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.card.benefit.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-06 16:00:31
 */
public class AlipayMarketingCardBenefitQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5799583147114758966L;

	/** 
	 * 会员卡模板外部权益列表
	 */
	@ApiListField("mcard_template_benefit_query")
	@ApiField("mcard_template_benefit_query")
	private List<McardTemplateBenefitQuery> mcardTemplateBenefitQuery;

	public void setMcardTemplateBenefitQuery(List<McardTemplateBenefitQuery> mcardTemplateBenefitQuery) {
		this.mcardTemplateBenefitQuery = mcardTemplateBenefitQuery;
	}
	public List<McardTemplateBenefitQuery> getMcardTemplateBenefitQuery( ) {
		return this.mcardTemplateBenefitQuery;
	}

}
