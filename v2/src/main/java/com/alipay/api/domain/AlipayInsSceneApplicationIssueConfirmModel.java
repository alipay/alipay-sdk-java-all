package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 投保订单出单确认
 *
 * @author auto create
 * @since 1.0, 2019-08-28 14:00:40
 */
public class AlipayInsSceneApplicationIssueConfirmModel extends AlipayObject {

	private static final long serialVersionUID = 6178161428952696859L;

	/**
	 * 投保订单号
	 */
	@ApiField("application_no")
	private String applicationNo;

	/**
	 * payToIssue:支付后出单 issue:直接出单
	 */
	@ApiField("issue_type")
	private String issueType;

	public String getApplicationNo() {
		return this.applicationNo;
	}
	public void setApplicationNo(String applicationNo) {
		this.applicationNo = applicationNo;
	}

	public String getIssueType() {
		return this.issueType;
	}
	public void setIssueType(String issueType) {
		this.issueType = issueType;
	}

}
