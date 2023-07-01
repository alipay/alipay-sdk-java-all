package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.iot.wifi.result.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-30 23:47:04
 */
public class AlipayCommerceIotWifiResultQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8894839627425496637L;

	/** 
	 * 配网状态：  
//-1.表示设备还没上报配网结果
//1.wifi连接成功
//2. 找不到该wifi
//3. wifi密码错误
	 */
	@ApiField("result_type")
	private Long resultType;

	/** 
	 * wifi名称
	 */
	@ApiField("ssid")
	private String ssid;

	public void setResultType(Long resultType) {
		this.resultType = resultType;
	}
	public Long getResultType( ) {
		return this.resultType;
	}

	public void setSsid(String ssid) {
		this.ssid = ssid;
	}
	public String getSsid( ) {
		return this.ssid;
	}

}
