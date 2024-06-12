package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.McardTemplate;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.card.template.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2024-04-10 16:32:45
 */
public class AlipayMarketingCardTemplateBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7767743869428328149L;

	/** 
	 * 会员卡模板基本信息
	 */
	@ApiListField("mcard_template")
	@ApiField("mcard_template")
	private List<McardTemplate> mcardTemplate;

	/** 
	 * 会员卡模板总数
	 */
	@ApiField("template_total")
	private Long templateTotal;

	public void setMcardTemplate(List<McardTemplate> mcardTemplate) {
		this.mcardTemplate = mcardTemplate;
	}
	public List<McardTemplate> getMcardTemplate( ) {
		return this.mcardTemplate;
	}

	public void setTemplateTotal(Long templateTotal) {
		this.templateTotal = templateTotal;
	}
	public Long getTemplateTotal( ) {
		return this.templateTotal;
	}

}
