package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.saas.ai.use response.
 * 
 * @author auto create
 * @since 1.0, 2024-06-19 14:07:03
 */
public class AlipayCloudCloudbaseSaasAiUseResponse extends AlipayResponse {

	private static final long serialVersionUID = 2763262158337658652L;

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
