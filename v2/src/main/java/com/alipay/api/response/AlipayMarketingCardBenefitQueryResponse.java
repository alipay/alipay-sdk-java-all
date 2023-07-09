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
 * @since 1.0, 2023-07-07 10:12:36
 */
public class AlipayMarketingCardBenefitQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4297571479468535699L;

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
