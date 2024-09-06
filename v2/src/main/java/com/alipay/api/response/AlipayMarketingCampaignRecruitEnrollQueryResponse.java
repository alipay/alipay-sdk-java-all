package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.RecruitEnrollBaseInfo;
import com.alipay.api.domain.RecruitEnrollContent;
import com.alipay.api.domain.RecruitEnrollMaterial;
import com.alipay.api.domain.RecruitServingTarget;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.campaign.recruit.enroll.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 17:41:16
 */
public class AlipayMarketingCampaignRecruitEnrollQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2496559313947449938L;

	/** 
	 * 活动报名基本信息。
	 */
	@ApiField("enroll_base_info")
	private RecruitEnrollBaseInfo enrollBaseInfo;

	/** 
	 * 活动报名内容。
	 */
	@ApiField("enroll_content")
	private RecruitEnrollContent enrollContent;

	/** 
	 * 活动报名素材。
	 */
	@ApiField("enroll_material")
	private RecruitEnrollMaterial enrollMaterial;

	/** 
	 * 幂等ID。
创建报名时传入的 out_biz_no。
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/** 
	 * 定向信息。
	 */
	@ApiField("serving_target")
	private RecruitServingTarget servingTarget;

	public void setEnrollBaseInfo(RecruitEnrollBaseInfo enrollBaseInfo) {
		this.enrollBaseInfo = enrollBaseInfo;
	}
	public RecruitEnrollBaseInfo getEnrollBaseInfo( ) {
		return this.enrollBaseInfo;
	}

	public void setEnrollContent(RecruitEnrollContent enrollContent) {
		this.enrollContent = enrollContent;
	}
	public RecruitEnrollContent getEnrollContent( ) {
		return this.enrollContent;
	}

	public void setEnrollMaterial(RecruitEnrollMaterial enrollMaterial) {
		this.enrollMaterial = enrollMaterial;
	}
	public RecruitEnrollMaterial getEnrollMaterial( ) {
		return this.enrollMaterial;
	}

	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	public String getOutBizNo( ) {
		return this.outBizNo;
	}

	public void setServingTarget(RecruitServingTarget servingTarget) {
		this.servingTarget = servingTarget;
	}
	public RecruitServingTarget getServingTarget( ) {
		return this.servingTarget;
	}

}
