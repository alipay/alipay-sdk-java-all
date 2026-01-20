package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.VerifyResultInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.provider.npassporter.verifyresultinfo.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-01-19 16:42:43
 */
public class AlipayOfflineProviderNpassporterVerifyresultinfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2265873119826386454L;

	/** 
	 * null
	 */
	@ApiListField("default_verify_issue_info_list")
	@ApiField("verify_result_info")
	private List<VerifyResultInfo> defaultVerifyIssueInfoList;

	/** 
	 * null
	 */
	@ApiListField("recent_verify_issue_info_list")
	@ApiField("verify_result_info")
	private List<VerifyResultInfo> recentVerifyIssueInfoList;

	/** 
	 * null
	 */
	@ApiListField("verify_issue_info_list")
	@ApiField("verify_result_info")
	private List<VerifyResultInfo> verifyIssueInfoList;

	public void setDefaultVerifyIssueInfoList(List<VerifyResultInfo> defaultVerifyIssueInfoList) {
		this.defaultVerifyIssueInfoList = defaultVerifyIssueInfoList;
	}
	public List<VerifyResultInfo> getDefaultVerifyIssueInfoList( ) {
		return this.defaultVerifyIssueInfoList;
	}

	public void setRecentVerifyIssueInfoList(List<VerifyResultInfo> recentVerifyIssueInfoList) {
		this.recentVerifyIssueInfoList = recentVerifyIssueInfoList;
	}
	public List<VerifyResultInfo> getRecentVerifyIssueInfoList( ) {
		return this.recentVerifyIssueInfoList;
	}

	public void setVerifyIssueInfoList(List<VerifyResultInfo> verifyIssueInfoList) {
		this.verifyIssueInfoList = verifyIssueInfoList;
	}
	public List<VerifyResultInfo> getVerifyIssueInfoList( ) {
		return this.verifyIssueInfoList;
	}

}
