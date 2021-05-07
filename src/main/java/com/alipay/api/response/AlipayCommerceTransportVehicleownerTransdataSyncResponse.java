package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.vehicleowner.transdata.sync response.
 * 
 * @author auto create
 * @since 1.0, 2020-05-27 19:58:12
 */
public class AlipayCommerceTransportVehicleownerTransdataSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 3246855944878435548L;

	/** 
	 * 数据执行行数
	 */
	@ApiField("excute_lines")
	private String excuteLines;

	/** 
	 * 执行结果
	 */
	@ApiField("result")
	private String result;

	public void setExcuteLines(String excuteLines) {
		this.excuteLines = excuteLines;
	}
	public String getExcuteLines( ) {
		return this.excuteLines;
	}

	public void setResult(String result) {
		this.result = result;
	}
	public String getResult( ) {
		return this.result;
	}

}
