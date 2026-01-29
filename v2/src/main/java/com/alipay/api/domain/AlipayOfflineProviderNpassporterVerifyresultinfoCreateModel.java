package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * N核身异常提示配置
 *
 * @author auto create
 * @since 1.0, 2026-01-19 16:42:43
 */
public class AlipayOfflineProviderNpassporterVerifyresultinfoCreateModel extends AlipayObject {

	private static final long serialVersionUID = 6499359911114661635L;

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

	/**
	 * null
	 */
	@ApiListField("verify_issue_config_list")
	@ApiField("verify_result_config")
	private List<VerifyResultConfig> verifyIssueConfigList;

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

	public List<VerifyResultConfig> getVerifyIssueConfigList() {
		return this.verifyIssueConfigList;
	}
	public void setVerifyIssueConfigList(List<VerifyResultConfig> verifyIssueConfigList) {
		this.verifyIssueConfigList = verifyIssueConfigList;
	}

}
