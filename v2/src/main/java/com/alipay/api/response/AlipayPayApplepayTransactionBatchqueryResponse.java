package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.BaseOpenApiResponseHeaderDTO;
import com.alipay.api.domain.TransactionDetailDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pay.applepay.transaction.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2022-11-03 15:10:32
 */
public class AlipayPayApplepayTransactionBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3773964854357426396L;

	/** 
	 * 时间戳
	 */
	@ApiField("last_updated_tag")
	private String lastUpdatedTag;

	/** 
	 * 头部
	 */
	@ApiField("response_header")
	private BaseOpenApiResponseHeaderDTO responseHeader;

	/** 
	 * 支付记录列表
	 */
	@ApiListField("transaction_details")
	@ApiField("transaction_detail_d_t_o")
	private List<TransactionDetailDTO> transactionDetails;

	public void setLastUpdatedTag(String lastUpdatedTag) {
		this.lastUpdatedTag = lastUpdatedTag;
	}
	public String getLastUpdatedTag( ) {
		return this.lastUpdatedTag;
	}

	public void setResponseHeader(BaseOpenApiResponseHeaderDTO responseHeader) {
		this.responseHeader = responseHeader;
	}
	public BaseOpenApiResponseHeaderDTO getResponseHeader( ) {
		return this.responseHeader;
	}

	public void setTransactionDetails(List<TransactionDetailDTO> transactionDetails) {
		this.transactionDetails = transactionDetails;
	}
	public List<TransactionDetailDTO> getTransactionDetails( ) {
		return this.transactionDetails;
	}

}
