package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 会员卡模板外部权益查询
 *
 * @author auto create
 * @since 1.0, 2020-05-15 15:50:52
 */
public class AlipayMarketingCardBenefitQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6117653157958379817L;

	/**
	 * 权益ID，通过 <a  href="https://opendocs.alipay.com/apis/api_5/alipay.marketing.card.benefit.create">alipay.marketing.card.benefit.create</a>(会员卡模板外部权益创建)接口创建获取。
	 */
	@ApiField("benefit_id")
	private String benefitId;

	/**
	 * 会员卡模板ID，通过 <a  href="https://opendocs.alipay.com/apis/api_5/alipay.marketing.card.template.create">alipay.marketing.card.template.create</a>（会员卡模板创建)接口创建会员卡模板获取。
	 */
	@ApiField("template_id")
	private String templateId;

	public String getBenefitId() {
		return this.benefitId;
	}
	public void setBenefitId(String benefitId) {
		this.benefitId = benefitId;
	}

	public String getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

}
