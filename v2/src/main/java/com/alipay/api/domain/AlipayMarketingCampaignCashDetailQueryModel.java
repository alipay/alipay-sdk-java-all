package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 现金活动详情查询
 *
 * @author auto create
 * @since 1.0, 2021-06-23 15:31:15
 */
public class AlipayMarketingCampaignCashDetailQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6243531875786162529L;

	/**
	 * 现金活动号，通过<a href="https://opendocs.alipay.com/apis/api_5/alipay.marketing.campaign.cash.create">alipay.marketing.campaign.cash.create</a>(创建现金活动)接口创建现金活动获取。
	 */
	@ApiField("crowd_no")
	private String crowdNo;

	public String getCrowdNo() {
		return this.crowdNo;
	}
	public void setCrowdNo(String crowdNo) {
		this.crowdNo = crowdNo;
	}

}
