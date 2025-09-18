package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.social.antiep.linkedmallenergy.consult response.
 * 
 * @author auto create
 * @since 1.0, 2025-09-17 15:12:40
 */
public class AlipaySocialAntiepLinkedmallenergyConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 4467972862444192635L;

	/** 
	 * 是否有下单资格，有资格：true；无资格：false
	 */
	@ApiField("allow")
	private Boolean allow;

	/** 
	 * 支付前置咨询的处理结果描述，这个文案展示给用户查看
	 */
	@ApiField("biz_desc")
	private String bizDesc;

	/** 
	 * 支付前置咨询的处理结果码
	 */
	@ApiField("biz_result_code")
	private String bizResultCode;

	/** 
	 * 业务的实际处理结果 biz_success=ture,代表成功；biz_success=false代表失败
	 */
	@ApiField("biz_success")
	private Boolean bizSuccess;

	public void setAllow(Boolean allow) {
		this.allow = allow;
	}
	public Boolean getAllow( ) {
		return this.allow;
	}

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
