package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zoloz.identification.user.web.initialize response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-14 11:17:37
 */
public class ZolozIdentificationUserWebInitializeResponse extends AlipayResponse {

	private static final long serialVersionUID = 7773325259694884625L;

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
