package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: datadigital.fincloud.finsaas.crowd.delete response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-04 19:16:45
 */
public class DatadigitalFincloudFinsaasCrowdDeleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 4346884673989488983L;

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
