package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.social.antiep.linkedmallenergy.sync response.
 * 
 * @author auto create
 * @since 1.0, 2025-09-17 14:52:40
 */
public class AlipaySocialAntiepLinkedmallenergySyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 5878459127688628385L;

	/** 
	 * 订单同步的处理结果描述
	 */
	@ApiField("biz_desc")
	private String bizDesc;

	/** 
	 * 订单同步的处理结果码
	 */
	@ApiField("biz_result_code")
	private String bizResultCode;

	/** 
	 * 业务的实际处理结果 biz_success=ture,代表成功；biz_success=false代表失败
	 */
	@ApiField("biz_success")
	private Boolean bizSuccess;

	public void setBizDesc(String bizDesc) {
		this.bizDesc = bizDesc;
	}
	public String getBizDesc( ) {
		return this.bizDesc;
	}

	public void setBizResultCode(String bizResultCode) {
		this.bizResultCode = bizResultCode;
	}
	public String getBizResultCode( ) {
		return this.bizResultCode;
	}

	public void setBizSuccess(Boolean bizSuccess) {
		this.bizSuccess = bizSuccess;
	}
	public Boolean getBizSuccess( ) {
		return this.bizSuccess;
	}

}
