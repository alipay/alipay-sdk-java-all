package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.iot.wifi.status.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 03:45:31
 */
public class AlipayCommerceIotWifiStatusQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5534856213976548612L;

	/** 
	 * 当前wifi名称
	 */
	@ApiField("cur_ssid")
	private String curSsid;

	/** 
	 * 设备扫码出来的ssid名称列表
	 */
	@ApiListField("ssid_list")
	@ApiField("string")
	private List<String> ssidList;

	/** 
	 * 当前设备的wifi状态
1.表示2G联网
2.表示wifi联网
	 */
	@ApiField("wifi_type")
	private Long wifiType;

	public void setCurSsid(String curSsid) {
		this.curSsid = curSsid;
	}
	public String getCurSsid( ) {
		return this.curSsid;
	}

	public void setSsidList(List<String> ssidList) {
		this.ssidList = ssidList;
	}
	public List<String> getSsidList( ) {
		return this.ssidList;
	}

	public void setWifiType(Long wifiType) {
		this.wifiType = wifiType;
	}
	public Long getWifiType( ) {
		return this.wifiType;
	}

}
