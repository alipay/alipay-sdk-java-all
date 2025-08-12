package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.DataSyncResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.merchantcard.order.sync response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-07 19:52:27
 */
public class AlipayCommerceMerchantcardOrderSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 3791294619234963263L;

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
