package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 招商方案详情查询
 *
 * @author auto create
 * @since 1.0, 2021-07-01 15:56:52
 */
public class AlipayMarketingRecruitEnrollCreateModel extends AlipayObject {

	private static final long serialVersionUID = 8484999493961517349L;

	/**
	 * 报名信息
	 */
	@ApiField("enroll_info")
	private RecruitEnrollInfo enrollInfo;

	/**
	 * 外部业务号
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
