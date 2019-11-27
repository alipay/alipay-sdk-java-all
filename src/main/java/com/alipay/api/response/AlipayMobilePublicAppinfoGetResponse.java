package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.AppInfoSetting;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.mobile.public.appinfo.get response.
 * 
 * @author auto create
 * @since 1.0, 2019-03-08 15:29:11
 */
public class AlipayMobilePublicAppinfoGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 1776317794646292476L;

	/** 
	 * 结果编码
	 */
	@ApiField("code")
	private String code;

	/** 
	 * 结果描述
	 */
	@ApiField("msg")
	private String msg;

	/** 
	 * 服务窗基本信息
	 */
	@ApiField("service_window_info")
	private AppInfoSetting serviceWindowInfo;

	public void setCode(String code) {
		this.code = code;
	}
	public String getCode( ) {
		return this.code;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getMsg( ) {
		return this.msg;
	}

	public void setServiceWindowInfo(AppInfoSetting serviceWindowInfo) {
		this.serviceWindowInfo = serviceWindowInfo;
	}
	public AppInfoSetting getServiceWindowInfo( ) {
		return this.serviceWindowInfo;
	}

}
