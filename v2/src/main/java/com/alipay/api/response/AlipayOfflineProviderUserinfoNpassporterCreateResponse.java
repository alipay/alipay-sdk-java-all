package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.provider.userinfo.npassporter.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-03-12 14:47:28
 */
public class AlipayOfflineProviderUserinfoNpassporterCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3699329413186565468L;

	/** 
	 * 用户VID，是传入身份信息之后，和身份证一一对应的ID，服务商需要保存下来，用于后续核身时关联系统内部身份信息。多次入库返回的VID是相同的。
	 */
	@ApiField("vid")
	private String vid;

	public void setVid(String vid) {
		this.vid = vid;
	}
	public String getVid( ) {
		return this.vid;
	}

}
