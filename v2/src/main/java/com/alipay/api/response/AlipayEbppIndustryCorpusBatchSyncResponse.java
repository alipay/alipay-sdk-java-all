package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.corpus.batch.sync response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-01 19:12:34
 */
public class AlipayEbppIndustryCorpusBatchSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 6588856148332336987L;

	/** 
	 * 同步知识的批次id，用于反向查询同步知识的处理情况
	 */
	@ApiField("sync_batch_id")
	private String syncBatchId;

	public void setSyncBatchId(String syncBatchId) {
		this.syncBatchId = syncBatchId;
	}
	public String getSyncBatchId( ) {
		return this.syncBatchId;
	}

}
