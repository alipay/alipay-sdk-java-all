package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 行情nimitz查询服务
 *
 * @author auto create
 * @since 1.0, 2022-09-19 21:16:46
 */
public class AlipayFinanceQuotationQuotetradeNimitzdataQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3171395846896969799L;

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
