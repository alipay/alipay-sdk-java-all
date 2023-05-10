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
 * @since 1.0, 2023-05-04 18:10:24
 */
public class AlipayTradeBatchRefundQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4637663172123235582L;

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
