package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.benefit.record.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-08-23 20:51:17
 */
public class AntMerchantExpandBenefitRecordQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8824245619882151557L;

	/** 
	 * 业务扩展信息
	 */
	@ApiField("biz_ext")
	private String bizExt;

	/** 
	 * 返回的数据,JSON格式
	 */
	@ApiField("data")
	private String data;

	/** 
	 * 查询失败时，返回的错误信息
	 */
	@ApiField("detail_msg")
	private String detailMsg;

	/** 
	 * 查询失败的错误码
	 */
	@ApiField("error_code")
	private String errorCode;

	public void setBizExt(String bizExt) {
		this.bizExt = bizExt;
	}
	public String getBizExt( ) {
		return this.bizExt;
	}

	public void setData(String data) {
		this.data = data;
	}
	public String getData( ) {
		return this.data;
	}

	public void setDetailMsg(String detailMsg) {
		this.detailMsg = detailMsg;
	}
	public String getDetailMsg( ) {
		return this.detailMsg;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorCode( ) {
		return this.errorCode;
	}

}
