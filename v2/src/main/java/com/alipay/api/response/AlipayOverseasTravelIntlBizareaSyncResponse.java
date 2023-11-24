package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ResultInfoDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.overseas.travel.intl.bizarea.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-11-02 17:06:49
 */
public class AlipayOverseasTravelIntlBizareaSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 4582566995654444448L;

	/** 
	 * 结果
	 */
	@ApiField("result")
	private ResultInfoDTO result;

	/** 
	 * Result code
	 */
	@ApiField("result_code")
	private String resultCode;

	/** 
	 * Result message
	 */
	@ApiField("result_message")
	private String resultMessage;

	public void setResult(ResultInfoDTO result) {
		this.result = result;
	}
	public ResultInfoDTO getResult( ) {
		return this.result;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultCode( ) {
		return this.resultCode;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}
	public String getResultMessage( ) {
		return this.resultMessage;
	}

}
