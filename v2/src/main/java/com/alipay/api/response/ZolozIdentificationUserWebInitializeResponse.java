package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zoloz.identification.user.web.initialize response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 20:06:59
 */
public class ZolozIdentificationUserWebInitializeResponse extends AlipayResponse {

	private static final long serialVersionUID = 3544385865855391142L;

	/** 
	 * 扩展结果
	 */
	@ApiField("extern_info")
	private String externInfo;

	/** 
	 * 刷脸认证的唯一标识
	 */
	@ApiField("zim_id")
	private String zimId;

	public void setExternInfo(String externInfo) {
		this.externInfo = externInfo;
	}
	public String getExternInfo( ) {
		return this.externInfo;
	}

	public void setZimId(String zimId) {
		this.zimId = zimId;
	}
	public String getZimId( ) {
		return this.zimId;
	}

}
