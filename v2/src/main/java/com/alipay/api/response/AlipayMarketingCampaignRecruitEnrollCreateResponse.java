package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.campaign.recruit.enroll.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 02:11:42
 */
public class AlipayMarketingCampaignRecruitEnrollCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6646455769699717514L;

	/** 
	 * 活动报名ID。
	 */
	@ApiField("enroll_id")
	private String enrollId;

	/** 
	 * 幂等ID。
由商家/ISV 自定义，创建报名时传入的 out_biz_no。
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	public void setEnrollId(String enrollId) {
		this.enrollId = enrollId;
	}
	public String getEnrollId( ) {
		return this.enrollId;
	}

	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	public String getOutBizNo( ) {
		return this.outBizNo;
	}

}
