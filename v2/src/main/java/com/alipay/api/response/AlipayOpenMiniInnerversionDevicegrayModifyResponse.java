package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.innerversion.devicegray.modify response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 17:41:22
 */
public class AlipayOpenMiniInnerversionDevicegrayModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5218646894998997385L;

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
