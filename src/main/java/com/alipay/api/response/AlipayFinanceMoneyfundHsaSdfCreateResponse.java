package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.finance.moneyfund.hsa.sdf.create response.
 * 
 * @author auto create
 * @since 1.0, 2019-06-28 16:54:39
 */
public class AlipayFinanceMoneyfundHsaSdfCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6331791928371772619L;

	/** 
	 * sfteha
	 */
	@ApiField("fsafasd")
	private String fsafasd;

	public void setFsafasd(String fsafasd) {
		this.fsafasd = fsafasd;
	}
	public String getFsafasd( ) {
		return this.fsafasd;
	}

}
