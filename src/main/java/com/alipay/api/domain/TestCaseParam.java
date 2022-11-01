package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 提交用例相关信息
 *
 * @author auto create
 * @since 1.0, 2018-11-14 20:42:26
 */
public class TestCaseParam extends AlipayObject {

	private static final long serialVersionUID = 6377642961651784378L;

	/**
	 * 测试用例ID或者编码
	 */
	@ApiField("case_id")
	private String caseId;

	/**
	 * 测试用例类型
	 */
	@ApiField("case_type")
	private String caseType;

	/**
	 * 用例集ID
	 */
	@ApiField("test_suite_id")
	private String testSuiteId;

	/**
	 * 用例集名称
	 */
	@ApiField("test_suite_name")
	private String testSuiteName;

	public String getCaseId() {
		return this.caseId;
	}
	public void setCaseId(String caseId) {
		this.caseId = caseId;
	}

	public String getCaseType() {
		return this.caseType;
	}
	public void setCaseType(String caseType) {
		this.caseType = caseType;
	}

	public String getTestSuiteId() {
		return this.testSuiteId;
	}
	public void setTestSuiteId(String testSuiteId) {
		this.testSuiteId = testSuiteId;
	}

	public String getTestSuiteName() {
		return this.testSuiteName;
	}
	public void setTestSuiteName(String testSuiteName) {
		this.testSuiteName = testSuiteName;
	}

}
