package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 开启带商户签约、创建应用事务
 *
 * @author auto create
 * @since 1.0, 2024-01-17 17:14:21
 */
public class AlipayOpenAgentCreateModel extends AlipayObject {

	private static final long serialVersionUID = 2194194333214682253L;

	/**
	 * isv代操作的商户账号，可以是支付宝账号，也可以是pid（2088开头）
	 */
	@ApiField("account")
	private String account;

	/**
	 * 商户联系人信息，包含联系人名称、手机、邮箱信息。联系人信息将用于接受签约后的重要通知，如确认协议、到期提醒等。
	 */
	@ApiField("contact_info")
	private ContactModel contactInfo;

	/**
	 * 订单授权凭证。若传入本参数，则对应事务提交后进入预授权模式。
	 */
	@ApiField("order_ticket")
	private String orderTicket;

	/**
	 * 签约模式：目前只支持批量签约并不通知商户确认 使用场景：批量签约并授权场景，先调用签约接口进行签约，然后调用授权接口授权，在批量模式下，一次性签约多个产品，要么都成功要么都失败，同时在授权接口传入orderNo，会一起发送签约确认和授权确认，商户只需要确认一次；如果不是批量签约并授权场景，不要传此参数，否则商户无法收到确认签约通知；
	 */
	@ApiField("sign_mode")
	private String signMode;

	public String getAccount() {
		return this.account;
	}
	public void setAccount(String account) {
		this.account = account;
	}

	public ContactModel getContactInfo() {
		return this.contactInfo;
	}
	public void setContactInfo(ContactModel contactInfo) {
		this.contactInfo = contactInfo;
	}

	public String getOrderTicket() {
		return this.orderTicket;
	}
	public void setOrderTicket(String orderTicket) {
		this.orderTicket = orderTicket;
	}

	public String getSignMode() {
		return this.signMode;
	}
	public void setSignMode(String signMode) {
		this.signMode = signMode;
	}

}
