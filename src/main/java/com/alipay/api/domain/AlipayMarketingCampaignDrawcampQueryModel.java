package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 营销抽奖活动查询
 *
 * @author auto create
 * @since 1.0, 2020-08-20 14:00:04
 */
public class AlipayMarketingCampaignDrawcampQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8474923871918815589L;

	/**
	 * 抽奖活动id，通过alipay.marketing.campaign.drawcamp.create接口返回
	 */
	@ApiField("camp_id")
	private String campId;

	public String getCampId() {
		return this.campId;
	}
	public void setCampId(String campId) {
		this.campId = campId;
	}

}
