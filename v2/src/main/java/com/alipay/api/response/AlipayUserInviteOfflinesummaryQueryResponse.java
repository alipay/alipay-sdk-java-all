package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.OfflineInviteNewerSummaryInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.invite.offlinesummary.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-09-21 18:07:14
 */
public class AlipayUserInviteOfflinesummaryQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6639157753427143348L;

	/** 
	 * 线下拉新结算汇总数据列表
	 */
	@ApiListField("offline_summary_info_list")
	@ApiField("offline_invite_newer_summary_info")
	private List<OfflineInviteNewerSummaryInfo> offlineSummaryInfoList;

	public void setOfflineSummaryInfoList(List<OfflineInviteNewerSummaryInfo> offlineSummaryInfoList) {
		this.offlineSummaryInfoList = offlineSummaryInfoList;
	}
	public List<OfflineInviteNewerSummaryInfo> getOfflineSummaryInfoList( ) {
		return this.offlineSummaryInfoList;
	}

}
