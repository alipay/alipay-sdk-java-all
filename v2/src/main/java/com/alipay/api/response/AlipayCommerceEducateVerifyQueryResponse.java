package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.verify.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-04-18 12:22:45
 */
public class AlipayCommerceEducateVerifyQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1197662756927344337L;

	/** 
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/** 
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	/** 
	 * 用于标识一个完整请求，一个完整请求：查询链接-验证身份-完成验证
	 */
	@ApiField("verify_request_id")
	private String verifyRequestId;

	/** 
	 * 验证状态，通过、不通过、验证中
	 */
	@ApiField("verify_status")
	private String verifyStatus;

	/** 
	 * 验证的类型，学生/教职工
	 */
	@ApiField("verify_type")
	private String verifyType;

	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public String getOpenId( ) {
		return this.openId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId( ) {
		return this.userId;
	}

	public void setVerifyRequestId(String verifyRequestId) {
		this.verifyRequestId = verifyRequestId;
	}
	public String getVerifyRequestId( ) {
		return this.verifyRequestId;
	}

	public void setVerifyStatus(String verifyStatus) {
		this.verifyStatus = verifyStatus;
	}
	public String getVerifyStatus( ) {
		return this.verifyStatus;
	}

	public void setVerifyType(String verifyType) {
		this.verifyType = verifyType;
	}
	public String getVerifyType( ) {
		return this.verifyType;
	}

}
