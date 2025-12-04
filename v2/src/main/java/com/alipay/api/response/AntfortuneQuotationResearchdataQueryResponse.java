package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: antfortune.quotation.researchdata.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 19:33:14
 */
public class AntfortuneQuotationResearchdataQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5695833242112345473L;

	/** 
	 * 结果码
	 */
	@ApiField("result_code")
	private String resultCode;

	/** 
	 * 金融信息数据返回值，datatable的json形式。
	 */
	@ApiField("result_content")
	private String resultContent;

	/** 
	 * 结果的描述
	 */
	@ApiField("result_desc")
	private String resultDesc;

	/** 
	 * 是否本次请求成功
	 */
	@ApiField("result_success")
	private Boolean resultSuccess;

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultCode( ) {
		return this.resultCode;
	}

	public void setResultContent(String resultContent) {
		this.resultContent = resultContent;
	}
	public String getResultContent( ) {
		return this.resultContent;
	}

	public void setResultDesc(String resultDesc) {
		this.resultDesc = resultDesc;
	}
	public String getResultDesc( ) {
		return this.resultDesc;
	}

	public void setResultSuccess(Boolean resultSuccess) {
		this.resultSuccess = resultSuccess;
	}
	public Boolean getResultSuccess( ) {
		return this.resultSuccess;
	}

}
