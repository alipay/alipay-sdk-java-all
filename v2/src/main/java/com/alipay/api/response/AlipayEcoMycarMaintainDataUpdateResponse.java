package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.mycar.maintain.data.update response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 02:54:25
 */
public class AlipayEcoMycarMaintainDataUpdateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6621661859412237523L;

	/** 
	 * 具体返回的处理结果
	 */
	@ApiField("info")
	private String info;

	public void setInfo(String info) {
		this.info = info;
	}
	public String getInfo( ) {
		return this.info;
	}

}
