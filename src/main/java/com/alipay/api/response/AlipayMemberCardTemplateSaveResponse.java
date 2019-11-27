package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.member.card.template.save response.
 * 
 * @author auto create
 * @since 1.0, 2019-03-08 15:29:11
 */
public class AlipayMemberCardTemplateSaveResponse extends AlipayResponse {

	private static final long serialVersionUID = 8575256266278293432L;

	/** 
	 * 支付宝卡模板Id
请求失败时，不存在本参数；
请求成功时，本参数不为空。
	 */
	@ApiField("alipay_template_id")
	private String alipayTemplateId;

	/** 
	 * 请求成功时，不存在本参数；
请求失败时，本参数为错误代码
	 */
	@ApiField("error_code")
	private String errorCode;

	/** 
	 * 请求成功时，不存在本参数；
请求失败时，本参数返回具体的错误原因。
	 */
	@ApiField("error_msg")
	private String errorMsg;

	/** 
	 * 外部商户卡模板id
请求失败时，不存在本参数；
请求成功时，本参数不为空。
	 */
	@ApiField("out_template_id")
	private String outTemplateId;

	/** 
	 * 请求是否成功。
T代表成功
F代表失败
	 */
	@ApiField("success")
	private String success;

	public void setAlipayTemplateId(String alipayTemplateId) {
		this.alipayTemplateId = alipayTemplateId;
	}
	public String getAlipayTemplateId( ) {
		return this.alipayTemplateId;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorCode( ) {
		return this.errorCode;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	public String getErrorMsg( ) {
		return this.errorMsg;
	}

	public void setOutTemplateId(String outTemplateId) {
		this.outTemplateId = outTemplateId;
	}
	public String getOutTemplateId( ) {
		return this.outTemplateId;
	}

	public void setSuccess(String success) {
		this.success = success;
	}
	public String getSuccess( ) {
		return this.success;
	}

}
