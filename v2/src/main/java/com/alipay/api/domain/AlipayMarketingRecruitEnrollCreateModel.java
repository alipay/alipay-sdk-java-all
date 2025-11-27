package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 招商方案详情查询
 *
 * @author auto create
 * @since 1.0, 2023-10-08 09:57:14
 */
public class AlipayMarketingRecruitEnrollCreateModel extends AlipayObject {

	private static final long serialVersionUID = 6814696537276437696L;

	/**
	 * 报名信息
	 */
	@ApiField("enroll_info")
	private RecruitEnrollInfo enrollInfo;

	/**
	 * 活动报名场景配置。
枚举值：
VOUCHER：券报名场景的报名；
MINI_APP：小程序报名场景的报名；
	 */
	@ApiField("enroll_scene_type")
	private String enrollSceneType;

	/**
	 * 外部操作流水号。由商家/ISV 自定义，仅支持字母、数字、下划线且需保证每次操作唯一。
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 要报名的招商方案ID
	 */
	@ApiField("plan_id")
	private String planId;

	public RecruitEnrollInfo getEnrollInfo() {
		return this.enrollInfo;
	}
	public void setEnrollInfo(RecruitEnrollInfo enrollInfo) {
		this.enrollInfo = enrollInfo;
	}

	public String getEnrollSceneType() {
		return this.enrollSceneType;
	}
	public void setEnrollSceneType(String enrollSceneType) {
		this.enrollSceneType = enrollSceneType;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getPlanId() {
		return this.planId;
	}
	public void setPlanId(String planId) {
		this.planId = planId;
	}

}
