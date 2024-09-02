package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创建招商报名接口
 *
 * @author auto create
 * @since 1.0, 2023-10-09 16:05:26
 */
public class AlipayMarketingCampaignRecruitEnrollCreateModel extends AlipayObject {

	private static final long serialVersionUID = 7875411647617788671L;

	/**
	 * 活动报名基本信息。
	 */
	@ApiField("enroll_base_info")
	private RecruitEnrollBaseInfo enrollBaseInfo;

	/**
	 * 活动报名内容。
包含报名提交的核心内容信息。
	 */
	@ApiField("enroll_content")
	private RecruitEnrollContent enrollContent;

	/**
	 * 活动报名素材。
	 */
	@ApiField("enroll_material")
	private RecruitEnrollMaterial enrollMaterial;

	/**
	 * 外部操作流水号。由商家/ISV 自定义，仅支持字母、数字、下划线且需保证每次操作唯一。
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 定向信息。
	 */
	@ApiField("serving_target")
	private RecruitServingTarget servingTarget;

	public RecruitEnrollBaseInfo getEnrollBaseInfo() {
		return this.enrollBaseInfo;
	}
	public void setEnrollBaseInfo(RecruitEnrollBaseInfo enrollBaseInfo) {
		this.enrollBaseInfo = enrollBaseInfo;
	}

	public RecruitEnrollContent getEnrollContent() {
		return this.enrollContent;
	}
	public void setEnrollContent(RecruitEnrollContent enrollContent) {
		this.enrollContent = enrollContent;
	}

	public RecruitEnrollMaterial getEnrollMaterial() {
		return this.enrollMaterial;
	}
	public void setEnrollMaterial(RecruitEnrollMaterial enrollMaterial) {
		this.enrollMaterial = enrollMaterial;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public RecruitServingTarget getServingTarget() {
		return this.servingTarget;
	}
	public void setServingTarget(RecruitServingTarget servingTarget) {
		this.servingTarget = servingTarget;
	}

}
