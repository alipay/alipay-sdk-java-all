package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.mycar.maintain.data.update response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-08 14:49:27
 */
public class AlipayEcoMycarMaintainDataUpdateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4761626862915794867L;

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
