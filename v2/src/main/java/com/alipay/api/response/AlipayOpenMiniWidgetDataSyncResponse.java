package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.widget.data.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 05:06:43
 */
public class AlipayOpenMiniWidgetDataSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 4658992667377172838L;

	/** 
	 * 同步接口生成的唯一标识，用于查询提交数据的审核状态
	 */
	@ApiField("commit_id")
	private String commitId;

	public void setCommitId(String commitId) {
		this.commitId = commitId;
	}
	public String getCommitId( ) {
		return this.commitId;
	}

}
