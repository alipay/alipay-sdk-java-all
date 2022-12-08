package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zoloz.identification.zolozid.get response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-08 05:12:18
 */
public class ZolozIdentificationZolozidGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 5379389895337952918L;

	/** 
	 * zcif结果
	 */
	@ApiField("result_info")
	private String resultInfo;

	public void setResultInfo(String resultInfo) {
		this.resultInfo = resultInfo;
	}
	public String getResultInfo( ) {
		return this.resultInfo;
	}

}
