package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.customer.creditinfo.commentdata.sync response.
 * 
 * @author auto create
 * @since 1.0, 2026-01-08 10:47:42
 */
public class ZhimaCustomerCreditinfoCommentdataSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 4717664612562788633L;

	/** 
	 * 评价数据同步结果
	 */
	@ApiField("sync_info")
	private String syncInfo;

	public void setSyncInfo(String syncInfo) {
		this.syncInfo = syncInfo;
	}
	public String getSyncInfo( ) {
		return this.syncInfo;
	}

}
