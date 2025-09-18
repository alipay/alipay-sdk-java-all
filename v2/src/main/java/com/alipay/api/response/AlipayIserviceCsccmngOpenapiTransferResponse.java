package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.csccmng.openapi.transfer response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-19 14:41:45
 */
public class AlipayIserviceCsccmngOpenapiTransferResponse extends AlipayResponse {

	private static final long serialVersionUID = 4663183117464535454L;

	/** 
	 * 业务参数，业务执行是否成功和结果都从该参数中取
	 */
	@ApiField("result_content")
	private String resultContent;

	public void setResultContent(String resultContent) {
		this.resultContent = resultContent;
	}
	public String getResultContent( ) {
		return this.resultContent;
	}

}
