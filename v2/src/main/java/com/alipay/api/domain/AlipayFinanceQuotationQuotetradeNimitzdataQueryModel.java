package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 行情nimitz查询服务
 *
 * @author auto create
 * @since 1.0, 2025-04-10 16:38:57
 */
public class AlipayFinanceQuotationQuotetradeNimitzdataQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5311118694891442659L;

	/**
	 * 行情数据集请求
	 */
	@ApiField("dataset_request")
	private DatasetRequest datasetRequest;

	/**
	 * 请求唯一id，用于排查问题
	 */
	@ApiField("request_id")
	private String requestId;

	public DatasetRequest getDatasetRequest() {
		return this.datasetRequest;
	}
	public void setDatasetRequest(DatasetRequest datasetRequest) {
		this.datasetRequest = datasetRequest;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

}
