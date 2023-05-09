package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zoloz.identification.user.web.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-04 14:15:51
 */
public class ZolozIdentificationUserWebQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5867662484748729922L;

	/** 
	 * 扩展结果
	 */
	@ApiField("extern_info")
	private String externInfo;

	public void setExternInfo(String externInfo) {
		this.externInfo = externInfo;
	}
	public String getExternInfo( ) {
		return this.externInfo;
	}

}
