package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.MerchantMemberTemplateModel;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.campaign.member.template.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class KoubeiMarketingCampaignMemberTemplateBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6529531811362364243L;

	/** 
	 * 会员模板模型
	 */
	@ApiListField("member_templates")
	@ApiField("merchant_member_template_model")
	private List<MerchantMemberTemplateModel> memberTemplates;

	public void setMemberTemplates(List<MerchantMemberTemplateModel> memberTemplates) {
		this.memberTemplates = memberTemplates;
	}
	public List<MerchantMemberTemplateModel> getMemberTemplates( ) {
		return this.memberTemplates;
	}

}
