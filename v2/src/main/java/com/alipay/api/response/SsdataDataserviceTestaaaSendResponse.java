package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.DumTestFFAA;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ssdata.dataservice.testaaa.send response.
 * 
 * @author auto create
 * @since 1.0, 2024-04-19 18:17:00
 */
public class SsdataDataserviceTestaaaSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 8182256625282851462L;

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
