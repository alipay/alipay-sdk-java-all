package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.saas.max.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-01 11:06:52
 */
public class AlipayCloudCloudbaseSaasMaxQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7772499881896761666L;

	/** 
	 * 返回OCR结果数据，即返回图片中识别出来的文字内容，具体内容由上传图片决定
	 */
	@ApiField("result_str")
	private String resultStr;

	public void setResultStr(String resultStr) {
		this.resultStr = resultStr;
	}
	public String getResultStr( ) {
		return this.resultStr;
	}

}
