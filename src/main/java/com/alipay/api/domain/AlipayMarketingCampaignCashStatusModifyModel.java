package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 更改现金活动状态
 *
 * @author auto create
 * @since 1.0, 2021-06-23 15:30:53
 */
public class AlipayMarketingCampaignCashStatusModifyModel extends AlipayObject {

	private static final long serialVersionUID = 5281114121364613347L;

	/**
	 * 金活动修改后的状态。支持修改为：
*PAUSE：活动暂停。
*READY：活动开始。
*CLOSED：活动结束。
	 */
	@ApiField("camp_status")
	private String campStatus;

	/**
	 * 现金活动号，通过<a href="https://opendocs.alipay.com/apis/api_5/alipay.marketing.campaign.cash.create">alipay.marketing.campaign.cash.create</a>(创建现金活动)接口创建现金活动获取。
	 */
	@ApiField("crowd_no")
	private String crowdNo;

	public String getCampStatus() {
		return this.campStatus;
	}
	public void setCampStatus(String campStatus) {
		this.campStatus = campStatus;
	}

	public String getCrowdNo() {
		return this.crowdNo;
	}
	public void setCrowdNo(String crowdNo) {
		this.crowdNo = crowdNo;
	}

}
