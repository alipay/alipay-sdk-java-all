package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 预咨询接口
 *
 * @author auto create
 * @since 1.0, 2021-08-03 10:43:28
 */
public class ZhimaCreditPeZmgoPreConsultModel extends AlipayObject {

	private static final long serialVersionUID = 6216193292322849593L;

	/**
	 * 用户id
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 商户ID
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 手机号
	 */
	@ApiField("phone")
	private String phone;

	/**
	 * 模板id
	 */
	@ApiField("template_id")
	private String templateId;

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

	public String getPartnerId() {
		return this.partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	public String getPhone() {
		return this.phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

}
