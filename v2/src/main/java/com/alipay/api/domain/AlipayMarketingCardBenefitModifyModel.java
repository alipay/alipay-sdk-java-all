package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 会员卡模板外部权益修改
 *
 * @author auto create
 * @since 1.0, 2020-05-15 15:50:44
 */
public class AlipayMarketingCardBenefitModifyModel extends AlipayObject {

	private static final long serialVersionUID = 5772886267376638575L;

	/**
	 * 权益ID，通过 <a  href="https://opendocs.alipay.com/apis/api_5/alipay.marketing.card.benefit.create">alipay.marketing.card.benefit.create</a>(会员卡模板外部权益创建)接口创建获取。
	 */
	@ApiField("benefit_id")
	private String benefitId;

	/**
	 * 会员卡模板外部权益
	 */
	@ApiField("mcard_template_benefit")
	private McardTemplateBenefit mcardTemplateBenefit;

	public String getBenefitId() {
		return this.benefitId;
	}
	public void setBenefitId(String benefitId) {
		this.benefitId = benefitId;
	}

	public McardTemplateBenefit getMcardTemplateBenefit() {
		return this.mcardTemplateBenefit;
	}
	public void setMcardTemplateBenefit(McardTemplateBenefit mcardTemplateBenefit) {
		this.mcardTemplateBenefit = mcardTemplateBenefit;
	}

}
