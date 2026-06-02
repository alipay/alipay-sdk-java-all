package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.LtSnapshotDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.finance.quotation.quotetradeopen.ltsnapshot.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2026-04-08 17:52:44
 */
public class AlipayFinanceQuotationQuotetradeopenLtsnapshotBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8284387195381467698L;

	/** 
	 * null
	 */
	@ApiListField("data")
	@ApiField("lt_snapshot_d_t_o")
	private List<LtSnapshotDTO> data;

	public void setData(List<LtSnapshotDTO> data) {
		this.data = data;
	}
	public List<LtSnapshotDTO> getData( ) {
		return this.data;
	}

}
