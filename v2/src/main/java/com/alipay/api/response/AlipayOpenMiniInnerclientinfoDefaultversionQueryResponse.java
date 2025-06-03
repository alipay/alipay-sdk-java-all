package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.MiniAppClientVersionInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.innerclientinfo.defaultversion.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 15:51:36
 */
public class AlipayOpenMiniInnerclientinfoDefaultversionQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1234525232782134987L;

	/** 
	 * Android客户端版本信息
	 */
	@ApiField("android_client_version_info")
	private MiniAppClientVersionInfo androidClientVersionInfo;

	/** 
	 * iOS客户单版本号信息
	 */
	@ApiField("ios_client_version_info")
	private MiniAppClientVersionInfo iosClientVersionInfo;

	public void setAndroidClientVersionInfo(MiniAppClientVersionInfo androidClientVersionInfo) {
		this.androidClientVersionInfo = androidClientVersionInfo;
	}
	public MiniAppClientVersionInfo getAndroidClientVersionInfo( ) {
		return this.androidClientVersionInfo;
	}

	public void setIosClientVersionInfo(MiniAppClientVersionInfo iosClientVersionInfo) {
		this.iosClientVersionInfo = iosClientVersionInfo;
	}
	public MiniAppClientVersionInfo getIosClientVersionInfo( ) {
		return this.iosClientVersionInfo;
	}

}
