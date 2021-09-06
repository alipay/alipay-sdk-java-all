package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.content.sync response.
 * 
 * @author auto create
 * @since 1.0, 2021-08-12 18:51:04
 */
public class AlipayOpenMiniContentSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 1326764269964842725L;

	/** 
	 * 结果数据，json格式，可参考具体内容接入文档中的详细说明。详见https://opendocs.alipay.com/mini/00ntj5。
	 */
	@ApiField("result_data")
	private String resultData;

	public void setResultData(String resultData) {
		this.resultData = resultData;
	}
	public String getResultData( ) {
		return this.resultData;
	}

}
