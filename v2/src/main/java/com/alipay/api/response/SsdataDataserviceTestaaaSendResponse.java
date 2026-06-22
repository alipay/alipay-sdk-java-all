package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.DumTestFFAA;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ssdata.dataservice.testaaa.send response.
 * 
 * @author auto create
 * @since 1.0, 2026-06-17 10:49:34
 */
public class SsdataDataserviceTestaaaSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 8315641435848914288L;

	/** 
	 * desc
	 */
	@ApiField("return_a")
	private DumTestFFAA returnA;

	public void setReturnA(DumTestFFAA returnA) {
		this.returnA = returnA;
	}
	public DumTestFFAA getReturnA( ) {
		return this.returnA;
	}

}
