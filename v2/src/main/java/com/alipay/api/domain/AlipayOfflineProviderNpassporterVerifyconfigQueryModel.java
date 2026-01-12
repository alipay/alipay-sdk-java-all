package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * N核审配置查询
 *
 * @author auto create
 * @since 1.0, 2025-12-31 17:50:56
 */
public class AlipayOfflineProviderNpassporterVerifyconfigQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5833196969273881464L;

	/**
	 * 活动code
	 */
	@ApiField("activity_code")
	private String activityCode;

	/**
	 * 活动解决方案code
	 */
	@ApiField("solution_code")
	private String solutionCode;

	/**
	 * 核身配置Id
	 */
	@ApiField("verify_config_id")
	private String verifyConfigId;

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

	public String getVerifyConfigId() {
		return this.verifyConfigId;
	}
	public void setVerifyConfigId(String verifyConfigId) {
		this.verifyConfigId = verifyConfigId;
	}

}
