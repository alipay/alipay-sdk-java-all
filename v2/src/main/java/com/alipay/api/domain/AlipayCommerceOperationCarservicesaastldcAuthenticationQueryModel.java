package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 获取认证编号接口
 *
 * @author auto create
 * @since 1.0, 2025-11-21 17:27:41
 */
public class AlipayCommerceOperationCarservicesaastldcAuthenticationQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5572443467669996849L;

	/**
	 * STUDENT("03", "学生"), TEACHER("04", "教师"), DOCTOR_NURSE("05", "医护");
	 */
	@ApiField("auth_type")
	private String authType;

	/**
	 * 验证完成后的回调地址
	 */
	@ApiField("callback_url")
	private String callbackUrl;

	/**
	 * 用户的身份证号，如果最后一位是字母，需要大写。
	 */
	@ApiField("id_card")
	private String idCard;

	public String getAuthType() {
		return this.authType;
	}
	public void setAuthType(String authType) {
		this.authType = authType;
	}

	public String getCallbackUrl() {
		return this.callbackUrl;
	}
	public void setCallbackUrl(String callbackUrl) {
		this.callbackUrl = callbackUrl;
	}

	public String getIdCard() {
		return this.idCard;
	}
	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

}
