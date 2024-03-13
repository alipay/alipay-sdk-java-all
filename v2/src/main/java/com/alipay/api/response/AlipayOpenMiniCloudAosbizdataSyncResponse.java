package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.cloud.aosbizdata.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-13 10:31:43
 */
public class AlipayOpenMiniCloudAosbizdataSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 2796852463662935584L;

	/** 
	 * 同步是否成功
	 */
	@ApiField("data")
	private Boolean data;

	public void setData(Boolean data) {
		this.data = data;
	}
	public Boolean getData( ) {
		return this.data;
	}

}
