package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 保存会展签到配置
 *
 * @author auto create
 * @since 1.0, 2025-11-10 10:20:53
 */
public class AlipayOfflineProviderExpoAttendconfigSaveModel extends AlipayObject {

	private static final long serialVersionUID = 2566783271523175452L;

	/**
	 * 活动id
	 */
	@ApiField("activity_code")
	private String activityCode;

	/**
	 * 线圈物料的编号
	 */
	@ApiField("coil_no")
	private String coilNo;

	/**
	 * 可用的logo URL
	 */
	@ApiField("logo")
	private String logo;

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

	public String getCoilNo() {
		return this.coilNo;
	}
	public void setCoilNo(String coilNo) {
		this.coilNo = coilNo;
	}

	public String getLogo() {
		return this.logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getSolutionCode() {
		return this.solutionCode;
	}
	public void setSolutionCode(String solutionCode) {
		this.solutionCode = solutionCode;
	}

}
