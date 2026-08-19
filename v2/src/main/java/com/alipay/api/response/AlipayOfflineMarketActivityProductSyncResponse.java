package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.market.activity.product.sync response.
 * 
 * @author auto create
 * @since 1.0, 2026-08-18 15:27:48
 */
public class AlipayOfflineMarketActivityProductSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 2734981524782988396L;

	/** 
	 * null
	 */
	@ApiListField("failed_activity_batch_ids")
	@ApiField("string")
	private List<String> failedActivityBatchIds;

	public void setFailedActivityBatchIds(List<String> failedActivityBatchIds) {
		this.failedActivityBatchIds = failedActivityBatchIds;
	}
	public List<String> getFailedActivityBatchIds( ) {
		return this.failedActivityBatchIds;
	}

}
