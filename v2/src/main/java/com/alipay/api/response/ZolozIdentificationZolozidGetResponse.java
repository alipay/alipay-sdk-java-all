package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zoloz.identification.zolozid.get response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 01:07:35
 */
public class ZolozIdentificationZolozidGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 6623451183547446222L;

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
