package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.campaign.recruit.enroll.close response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-20 17:36:43
 */
public class AlipayMarketingCampaignRecruitEnrollCloseResponse extends AlipayResponse {

	private static final long serialVersionUID = 5774751621274923829L;

	/** 
	 * 本次下线操作的目标报名ID。
	 */
	@ApiField("enroll_id")
	private String enrollId;

	/** 
	 * 报名状态。
下线操作响应的状态枚举值只有三种情况：
CLOSE_AUDITING 下线审核中，下线结果请等待后续状态变更通知，或主动查询活动报名详情 ； 
CLOSED 已下线；
REJECTED 不通过，无需下线；
	 */
	@ApiField("status")
	private String status;

	public void setEnrollId(String enrollId) {
		this.enrollId = enrollId;
	}
	public String getEnrollId( ) {
		return this.enrollId;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
