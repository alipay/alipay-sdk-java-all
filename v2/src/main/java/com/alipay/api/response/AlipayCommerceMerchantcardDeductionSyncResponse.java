package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.DataSyncResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.merchantcard.deduction.sync response.
 * 
 * @author auto create
 * @since 1.0, 2025-01-10 11:27:22
 */
public class AlipayCommerceMerchantcardDeductionSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 4215435263329792947L;

	/** 
	 * 数据同步响应模型，返回数据同步任务处理的结果
	 */
	@ApiField("data_sync_rep")
	private DataSyncResponse dataSyncRep;

	public void setDataSyncRep(DataSyncResponse dataSyncRep) {
		this.dataSyncRep = dataSyncRep;
	}
	public DataSyncResponse getDataSyncRep( ) {
		return this.dataSyncRep;
	}

}
