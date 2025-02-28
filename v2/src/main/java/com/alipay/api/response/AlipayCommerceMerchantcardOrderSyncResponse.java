package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.DataSyncResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.merchantcard.order.sync response.
 * 
 * @author auto create
 * @since 1.0, 2025-02-06 21:37:22
 */
public class AlipayCommerceMerchantcardOrderSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 7558423672698566613L;

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
