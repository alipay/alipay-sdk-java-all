package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.campaign.member.template.create response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class KoubeiMarketingCampaignMemberTemplateCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2248797975955139756L;

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
