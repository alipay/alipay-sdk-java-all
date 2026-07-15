package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.content.usereventcontent.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-07-06 17:31:59
 */
public class AlipayOpenContentUsereventcontentQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3548812876216454777L;

	/** 
	 * 业务码
	 */
	@ApiField("biz_code")
	private String bizCode;

	/** 
	 * 业务消息
	 */
	@ApiField("biz_message")
	private String bizMessage;

	/** 
	 * 触点供给内容列表
	 */
	@ApiField("point_supplies_data")
	private String pointSuppliesData;

	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}
	public String getBizCode( ) {
		return this.bizCode;
	}

	public void setBizMessage(String bizMessage) {
		this.bizMessage = bizMessage;
	}
	public String getBizMessage( ) {
		return this.bizMessage;
	}

	public void setPointSuppliesData(String pointSuppliesData) {
		this.pointSuppliesData = pointSuppliesData;
	}
	public String getPointSuppliesData( ) {
		return this.pointSuppliesData;
	}

}
