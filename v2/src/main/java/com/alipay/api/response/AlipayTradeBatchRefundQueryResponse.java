package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.BatchRefundDetailResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.batch.refund.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 19:33:07
 */
public class AlipayTradeBatchRefundQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1221895886593835719L;

	/** 
	 * 退款明细信息
	 */
	@ApiListField("result_details")
	@ApiField("batch_refund_detail_result")
	private List<BatchRefundDetailResult> resultDetails;

	public void setResultDetails(List<BatchRefundDetailResult> resultDetails) {
		this.resultDetails = resultDetails;
	}
	public List<BatchRefundDetailResult> getResultDetails( ) {
		return this.resultDetails;
	}

}
