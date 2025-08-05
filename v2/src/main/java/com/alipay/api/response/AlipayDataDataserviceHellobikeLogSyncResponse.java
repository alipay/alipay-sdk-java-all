package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.hellobike.log.sync response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-27 13:25:52
 */
public class AlipayDataDataserviceHellobikeLogSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 8661388366418426312L;

	/** 
	 * 业务数据同步是否成功。Y表示接收到hellobike业务反馈，并打印日志成功，N表示失败。由于本接口为数据同步接口，接受到调用请求后，服务端处理逻辑为打印日志，无直接业务影响，因此单笔请求失败不影响业务，不需要特殊处理。
	 */
	@ApiField("biz_code")
	private String bizCode;

	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}
	public String getBizCode( ) {
		return this.bizCode;
	}

}
