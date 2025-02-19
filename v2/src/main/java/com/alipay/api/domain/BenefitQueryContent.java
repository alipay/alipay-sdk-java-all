package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 权益召回内容
 *
 * @author auto create
 * @since 1.0, 2024-08-02 10:17:55
 */
public class BenefitQueryContent extends AlipayObject {

	private static final long serialVersionUID = 7343838117745143278L;

	/**
	 * 权益召回模板集合
	 */
	@ApiListField("luck_draw_templates")
	@ApiField("benefit_luck_draw_template")
	private List<BenefitLuckDrawTemplate> luckDrawTemplates;

	public List<BenefitLuckDrawTemplate> getLuckDrawTemplates() {
		return this.luckDrawTemplates;
	}
	public void setLuckDrawTemplates(List<BenefitLuckDrawTemplate> luckDrawTemplates) {
		this.luckDrawTemplates = luckDrawTemplates;
	}

}
