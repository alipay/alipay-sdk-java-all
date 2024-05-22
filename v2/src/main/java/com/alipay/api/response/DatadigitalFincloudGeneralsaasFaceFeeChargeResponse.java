package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: datadigital.fincloud.generalsaas.face.fee.charge response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-04 01:05:10
 */
public class DatadigitalFincloudGeneralsaasFaceFeeChargeResponse extends AlipayResponse {

	private static final long serialVersionUID = 3857616684482475433L;

	/** 
	 * 成功时返回success，失败时接口会报错
	 */
	@ApiField("result")
	private String result;

	public void setResult(String result) {
		this.result = result;
	}
	public String getResult( ) {
		return this.result;
	}

}
