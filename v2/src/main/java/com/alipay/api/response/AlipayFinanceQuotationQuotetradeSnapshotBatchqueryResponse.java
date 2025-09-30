package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.SnapshotDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.finance.quotation.quotetrade.snapshot.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2024-10-28 17:17:21
 */
public class AlipayFinanceQuotationQuotetradeSnapshotBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3678651576498978798L;

	/** 
	 * 快照对象
	 */
	@ApiListField("data")
	@ApiField("snapshot_d_t_o")
	private List<SnapshotDTO> data;

	public void setData(List<SnapshotDTO> data) {
		this.data = data;
	}
	public List<SnapshotDTO> getData( ) {
		return this.data;
	}

}
