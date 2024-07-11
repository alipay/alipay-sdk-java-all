package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.hire.apply.sync response.
 * 
 * @author auto create
 * @since 1.0, 2024-04-08 14:36:59
 */
public class AlipayEbppIndustryHireApplySyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 3719583495248994957L;

	/** 
	 * 应聘状态同步结果：成功=true，失败=false
	 */
	@ApiField("sync_result")
	private Boolean syncResult;

	public void setSyncResult(Boolean syncResult) {
		this.syncResult = syncResult;
	}
	public Boolean getSyncResult( ) {
		return this.syncResult;
	}

}
