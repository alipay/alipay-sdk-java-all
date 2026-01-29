package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * N核身异常提示查询
 *
 * @author auto create
 * @since 1.0, 2026-01-19 16:42:43
 */
public class AlipayOfflineProviderNpassporterVerifyresultinfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8188914851995424621L;

	/**
	 * 活动code
	 */
	@ApiField("activity_code")
	private String activityCode;

	/**
	 * 解决方案code
	 */
	@ApiField("solution_code")
	private String solutionCode;

	public String getActivityCode() {
		return this.activityCode;
	}
	public void setActivityCode(String activityCode) {
		this.activityCode = activityCode;
	}

	public String getSolutionCode() {
		return this.solutionCode;
	}
	public void setSolutionCode(String solutionCode) {
		this.solutionCode = solutionCode;
	}

}
