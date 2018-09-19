package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑商户人群组详情查询接口
 *
 * @author auto create
 * @since 1.0, 2018-07-26 14:05:09
 */
public class KoubeiMarketingCampaignCrowdDetailQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3654355614834132623L;

	/**
	 * 人群组ID，人群组创建成功时返回的ID
	 */
	@ApiField("crowd_group_id")
	private String crowdGroupId;

	public String getCrowdGroupId() {
		return this.crowdGroupId;
	}
	public void setCrowdGroupId(String crowdGroupId) {
		this.crowdGroupId = crowdGroupId;
	}

}
