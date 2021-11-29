package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.antest.taskstatus.query response.
 * 
 * @author auto create
 * @since 1.0, 2020-04-21 15:47:24
 */
public class AlipayCommerceAntestTaskstatusQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2338538347114536598L;

	/** 
	 * 任务状态： INIT 已创建，EXECUTING 执行中，FINISH 已完成，CANCEL 已取消
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
