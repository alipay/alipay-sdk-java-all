package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.customer.creditinfo.commentdata.sync response.
 * 
 * @author auto create
 * @since 1.0, 2025-09-02 21:42:37
 */
public class ZhimaCustomerCreditinfoCommentdataSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 5235649274449957665L;

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
