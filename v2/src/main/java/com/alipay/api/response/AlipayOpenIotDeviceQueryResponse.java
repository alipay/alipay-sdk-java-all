package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.iot.device.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:29:15
 */
public class AlipayOpenIotDeviceQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8861199472324938159L;

	/** 
	 * 返回设备-商户绑定关系相关数据。注意事项：1）设备绑定接口传入的merchantId字段，间连场景返回smid字段，直连场景返回pid字段；2）如果没有查询到相关绑定信息，则返回为空。
	 */
	@ApiField("data")
	private String data;

	public void setData(String data) {
		this.data = data;
	}
	public String getData( ) {
		return this.data;
	}

}
