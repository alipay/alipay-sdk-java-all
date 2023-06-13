package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.innerversion.devicegray.modify response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-29 21:16:51
 */
public class AlipayOpenMiniInnerversionDevicegrayModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6168859699595554317L;

	/** 
	 * 灰度code
	 */
	@ApiField("gray_code")
	private String grayCode;

	public void setGrayCode(String grayCode) {
		this.grayCode = grayCode;
	}
	public String getGrayCode( ) {
		return this.grayCode;
	}

}
