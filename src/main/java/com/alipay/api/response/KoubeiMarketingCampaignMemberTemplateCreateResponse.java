package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.campaign.member.template.create response.
 * 
 * @author auto create
 * @since 1.0, 2022-07-05 17:42:17
 */
public class KoubeiMarketingCampaignMemberTemplateCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4525742364642743836L;

	/** 
	 * 会员模板id
	 */
	@ApiField("member_template_id")
	private String memberTemplateId;

	public void setMemberTemplateId(String memberTemplateId) {
		this.memberTemplateId = memberTemplateId;
	}
	public String getMemberTemplateId( ) {
		return this.memberTemplateId;
	}

}
