package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 会员模板批量查询
 *
 * @author auto create
 * @since 1.0, 2018-11-30 15:37:16
 */
public class KoubeiMarketingCampaignMemberTemplateBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 1346713871849781426L;

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
