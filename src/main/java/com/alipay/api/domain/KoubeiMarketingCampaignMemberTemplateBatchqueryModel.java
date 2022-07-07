package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 会员模板批量查询
 *
 * @author auto create
 * @since 1.0, 2022-07-05 17:42:48
 */
public class KoubeiMarketingCampaignMemberTemplateBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 2382624246328441279L;

	/**
	 * 会员模板id
	 */
	@ApiListField("member_template_ids")
	@ApiField("string")
	private List<String> memberTemplateIds;

	public List<String> getMemberTemplateIds() {
		return this.memberTemplateIds;
	}
	public void setMemberTemplateIds(List<String> memberTemplateIds) {
		this.memberTemplateIds = memberTemplateIds;
	}

}
