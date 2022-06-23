package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 招商方案详情查询
 *
 * @author auto create
 * @since 1.0, 2022-05-10 15:15:24
 */
public class AlipayMarketingRecruitEnrollCreateModel extends AlipayObject {

	private static final long serialVersionUID = 1437992211221235254L;

	/**
	 * 报名信息
	 */
	@ApiField("enroll_info")
	private RecruitEnrollInfo enrollInfo;

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
