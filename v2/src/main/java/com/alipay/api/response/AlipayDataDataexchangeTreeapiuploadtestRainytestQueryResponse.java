package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.RainyPraviteTestForUploadComplexInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataexchange.treeapiuploadtest.rainytest.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-08-21 16:37:50
 */
public class AlipayDataDataexchangeTreeapiuploadtestRainytestQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5213738532386169837L;

	/** 
	 * 支付宝用户的1111。
	 */
	@ApiField("demo")
	private String demo;

	/** 
	 * 测试数据
	 */
	@ApiField("ref")
	private RainyPraviteTestForUploadComplexInfo ref;

	public void setDemo(String demo) {
		this.demo = demo;
	}
	public String getDemo( ) {
		return this.demo;
	}

	public void setRef(RainyPraviteTestForUploadComplexInfo ref) {
		this.ref = ref;
	}
	public RainyPraviteTestForUploadComplexInfo getRef( ) {
		return this.ref;
	}

}
