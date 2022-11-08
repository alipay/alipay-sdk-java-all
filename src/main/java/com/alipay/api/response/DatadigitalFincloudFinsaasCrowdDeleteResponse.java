package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: datadigital.fincloud.finsaas.crowd.delete response.
 * 
 * @author auto create
 * @since 1.0, 2022-06-27 21:07:00
 */
public class DatadigitalFincloudFinsaasCrowdDeleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 7591779696115754222L;

	/** 
	 * 人群删除消息+不唯一+删除人群
	 */
	@ApiField("msg")
	private String msg;

	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getMsg( ) {
		return this.msg;
	}

}
