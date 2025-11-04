package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.NfcFWJCommonResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.cityfacilitator.iotbsp.fwjnfc.sync response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-03 20:37:04
 */
public class AlipayCommerceCityfacilitatorIotbspFwjnfcSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 7697864112678595233L;

	/** 
	 * NFC烧录url
	 */
	@ApiField("data")
	private NfcFWJCommonResult data;

	/** 
	 * 返回NFC烧录链接
	 */
	@ApiField("result")
	private String result;

	public void setData(NfcFWJCommonResult data) {
		this.data = data;
	}
	public NfcFWJCommonResult getData( ) {
		return this.data;
	}

	public void setResult(String result) {
		this.result = result;
	}
	public String getResult( ) {
		return this.result;
	}

}
