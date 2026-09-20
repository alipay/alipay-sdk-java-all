package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 随访就医tab角标
 *
 * @author auto create
 * @since 1.0, 2026-09-08 16:37:54
 */
public class AlipayCommerceMedicalMedfollowupBadgeNotifyModel extends AlipayObject {

	private static final long serialVersionUID = 3225233182116518537L;

	/**
	 * 动作
	 */
	@ApiField("action")
	private String action;

	/**
	 * aq目标id
	 */
	@ApiField("aq_pid")
	private String aqPid;

	/**
	 * 随访信息
	 */
	@ApiField("issue_biz_info")
	private String issueBizInfo;

	/**
	 * 随访载荷
	 */
	@ApiField("issue_body")
	private String issueBody;

	/**
	 * 外部业务ID
	 */
	@ApiField("out_biz_id")
	private String outBizId;

	public String getAction() {
		return this.action;
	}
	public void setAction(String action) {
		this.action = action;
	}

	public String getAqPid() {
		return this.aqPid;
	}
	public void setAqPid(String aqPid) {
		this.aqPid = aqPid;
	}

	public String getIssueBizInfo() {
		return this.issueBizInfo;
	}
	public void setIssueBizInfo(String issueBizInfo) {
		this.issueBizInfo = issueBizInfo;
	}

	public String getIssueBody() {
		return this.issueBody;
	}
	public void setIssueBody(String issueBody) {
		this.issueBody = issueBody;
	}

	public String getOutBizId() {
		return this.outBizId;
	}
	public void setOutBizId(String outBizId) {
		this.outBizId = outBizId;
	}

}
