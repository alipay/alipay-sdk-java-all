package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 开启带商户签约、创建应用事务
 *
 * @author auto create
 * @since 1.0, 2021-04-02 15:34:45
 */
public class AlipayOpenAgentCreateModel extends AlipayObject {

	private static final long serialVersionUID = 3849737862849821114L;

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
	 * 订单授权凭证，填写都则对应事务提交进入预授权模式
	 */
	@ApiField("order_ticket")
	private String orderTicket;

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

}
