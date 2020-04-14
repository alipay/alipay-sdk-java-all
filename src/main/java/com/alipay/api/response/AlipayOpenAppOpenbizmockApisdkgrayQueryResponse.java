package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.openbizmock.apisdkgray.query response.
 * 
 * @author auto create
 * @since 1.0, 2020-04-09 22:32:23
 */
public class AlipayOpenAppOpenbizmockApisdkgrayQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3211866666178534578L;

	/** 
	 * 测试接口参数随便配置
	 */
	@ApiField("output_param")
	private String outputParam;

	public void setOutputParam(String outputParam) {
		this.outputParam = outputParam;
	}
	public String getOutputParam( ) {
		return this.outputParam;
	}

}
