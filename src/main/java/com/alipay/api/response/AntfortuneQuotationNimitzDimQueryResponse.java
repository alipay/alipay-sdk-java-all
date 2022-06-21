package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.RsData;
import com.alipay.api.domain.Status;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: antfortune.quotation.nimitz.dim.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-06-14 10:31:44
 */
public class AntfortuneQuotationNimitzDimQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8132946296878621189L;

	/** 
	 * 数据
	 */
	@ApiField("result_data")
	private RsData resultData;

	/** 
	 * 状态信息
	 */
	@ApiField("result_status")
	private Status resultStatus;

	public void setResultData(RsData resultData) {
		this.resultData = resultData;
	}
	public RsData getResultData( ) {
		return this.resultData;
	}

	public void setResultStatus(Status resultStatus) {
		this.resultStatus = resultStatus;
	}
	public Status getResultStatus( ) {
		return this.resultStatus;
	}

}
