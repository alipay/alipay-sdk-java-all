package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 运营商宽带验证码发送
 *
 * @author auto create
 * @since 1.0, 2025-10-10 16:48:39
 */
public class AlipayCommerceAcommunicationBroadbandVerifycodeSendModel extends AlipayObject {

	private static final long serialVersionUID = 2478374831581127522L;

	/**
	 * 宽带办理联系电话
	 */
	@ApiField("contact_phone_number")
	private String contactPhoneNumber;

	/**
	 * 区分具体分省运营商
	 */
	@ApiField("scene")
	private String scene;

	public String getContactPhoneNumber() {
		return this.contactPhoneNumber;
	}
	public void setContactPhoneNumber(String contactPhoneNumber) {
		this.contactPhoneNumber = contactPhoneNumber;
	}

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
	}

}
