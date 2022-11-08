package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.RsData;
import com.alipay.api.domain.Status;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: antfortune.quotation.nimitz.dim.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-06-30 11:26:50
 */
public class AntfortuneQuotationNimitzDimQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4857611281294852561L;

	/** 
	 * Nimitz 维度查询返回值，json形式
	 */
	@ApiField("result")
	private String result;

	/** 
	 * 已弃用，返回时不要填充此字段，填充了也不会处理。
	 */
	@ApiField("result_data")
	private RsData resultData;

	/** 
	 * 已弃用，返回时不要填充此字段，填充了也不会处理。
	 */
	@ApiField("result_status")
	private Status resultStatus;

	public void setResult(String result) {
		this.result = result;
	}
	public String getResult( ) {
		return this.result;
	}

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
