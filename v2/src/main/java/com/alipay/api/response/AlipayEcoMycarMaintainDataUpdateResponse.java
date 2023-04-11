package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.mycar.maintain.data.update response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 02:43:28
 */
public class AlipayEcoMycarMaintainDataUpdateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2712294334243125426L;

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
