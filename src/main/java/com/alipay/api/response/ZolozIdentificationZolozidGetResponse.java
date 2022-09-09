package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zoloz.identification.zolozid.get response.
 * 
 * @author auto create
 * @since 1.0, 2021-11-09 11:17:30
 */
public class ZolozIdentificationZolozidGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 1126895198827848844L;

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
