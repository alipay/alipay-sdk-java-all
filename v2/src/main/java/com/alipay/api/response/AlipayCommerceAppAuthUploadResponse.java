package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.CommerceAppUploadResponseData;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.app.auth.upload response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 07:57:00
 */
public class AlipayCommerceAppAuthUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 3263535431342853497L;

	/** 
	 * 业务处理结果码
	 */
	@ApiField("biz_code")
	private String bizCode;

	/** 
	 * 业务处理结果描述
	 */
	@ApiField("biz_msg")
	private String bizMsg;

	/** 
	 * 返回主体
	 */
	@ApiField("data")
	private CommerceAppUploadResponseData data;

	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}
	public String getBizCode( ) {
		return this.bizCode;
	}

	public void setBizMsg(String bizMsg) {
		this.bizMsg = bizMsg;
	}
	public String getBizMsg( ) {
		return this.bizMsg;
	}

	public void setData(CommerceAppUploadResponseData data) {
		this.data = data;
	}
	public CommerceAppUploadResponseData getData( ) {
		return this.data;
	}

}
