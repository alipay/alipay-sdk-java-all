package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * dosusign签署的签字人状态
 *
 * @author auto create
 * @since 1.0, 2023-10-08 11:38:01
 */
public class RecipientSignStatusResultVo extends AlipayObject {

	private static final long serialVersionUID = 2344747744393334511L;

	/**
	 * 创建理由
	 */
	@ApiField("creation_reason")
	private String creationReason;

	/**
	 * 驳回时间
	 */
	@ApiField("declined_date_time")
	private String declinedDateTime;

	/**
	 * 驳回原因
	 */
	@ApiField("declined_reason")
	private String declinedReason;

	/**
	 * 默认收件人
	 */
	@ApiField("default_recipient")
	private String defaultRecipient;

	/**
	 * 投递时间
	 */
	@ApiField("delivered_date_time")
	private String deliveredDateTime;

	/**
	 * 投递方式
	 */
	@ApiField("delivery_method")
	private String deliveryMethod;

	/**
	 * docusign 账户的姓名
	 */
	@ApiField("docu_name")
	private String docuName;

	/**
	 * 电子邮箱
	 */
	@ApiField("email")
	private String email;

	/**
	 * 名
	 */
	@ApiField("first_name")
	private String firstName;

	/**
	 * 全名
	 */
	@ApiField("full_name")
	private String fullName;

	/**
	 * 姓
	 */
	@ApiField("last_name")
	private String lastName;

	/**
	 * 姓名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 花名
	 */
	@ApiField("nick_name")
	private String nickName;

	/**
	 * 注释笔记
	 */
	@ApiField("note")
	private String note;

	/**
	 * 真名
	 */
	@ApiField("real_name")
	private String realName;

	/**
	 * 收件人recipientId
	 */
	@ApiField("recipient_id")
	private String recipientId;

	/**
	 * 签署人类型
	 */
	@ApiField("recipient_type")
	private String recipientType;

	/**
	 * 签署顺序
	 */
	@ApiField("routing_order")
	private String routingOrder;

	/**
	 * 发送时间
	 */
	@ApiField("sent_date_time")
	private String sentDateTime;

	/**
	 * docusign账号
	 */
	@ApiField("sign_account_no")
	private String signAccountNo;

	/**
	 * 签署时间
	 */
	@ApiField("signed_date_time")
	private String signedDateTime;

	/**
	 * 签署状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 状态编码
	 */
	@ApiField("status_code")
	private String statusCode;

	/**
	 * 工号
	 */
	@ApiField("work_no")
	private String workNo;

	public String getCreationReason() {
		return this.creationReason;
	}
	public void setCreationReason(String creationReason) {
		this.creationReason = creationReason;
	}

	public String getDeclinedDateTime() {
		return this.declinedDateTime;
	}
	public void setDeclinedDateTime(String declinedDateTime) {
		this.declinedDateTime = declinedDateTime;
	}

	public String getDeclinedReason() {
		return this.declinedReason;
	}
	public void setDeclinedReason(String declinedReason) {
		this.declinedReason = declinedReason;
	}

	public String getDefaultRecipient() {
		return this.defaultRecipient;
	}
	public void setDefaultRecipient(String defaultRecipient) {
		this.defaultRecipient = defaultRecipient;
	}

	public String getDeliveredDateTime() {
		return this.deliveredDateTime;
	}
	public void setDeliveredDateTime(String deliveredDateTime) {
		this.deliveredDateTime = deliveredDateTime;
	}

	public String getDeliveryMethod() {
		return this.deliveryMethod;
	}
	public void setDeliveryMethod(String deliveryMethod) {
		this.deliveryMethod = deliveryMethod;
	}

	public String getDocuName() {
		return this.docuName;
	}
	public void setDocuName(String docuName) {
		this.docuName = docuName;
	}

	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return this.firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getFullName() {
		return this.fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getLastName() {
		return this.lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getNickName() {
		return this.nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getNote() {
		return this.note;
	}
	public void setNote(String note) {
		this.note = note;
	}

	public String getRealName() {
		return this.realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getRecipientId() {
		return this.recipientId;
	}
	public void setRecipientId(String recipientId) {
		this.recipientId = recipientId;
	}

	public String getRecipientType() {
		return this.recipientType;
	}
	public void setRecipientType(String recipientType) {
		this.recipientType = recipientType;
	}

	public String getRoutingOrder() {
		return this.routingOrder;
	}
	public void setRoutingOrder(String routingOrder) {
		this.routingOrder = routingOrder;
	}

	public String getSentDateTime() {
		return this.sentDateTime;
	}
	public void setSentDateTime(String sentDateTime) {
		this.sentDateTime = sentDateTime;
	}

	public String getSignAccountNo() {
		return this.signAccountNo;
	}
	public void setSignAccountNo(String signAccountNo) {
		this.signAccountNo = signAccountNo;
	}

	public String getSignedDateTime() {
		return this.signedDateTime;
	}
	public void setSignedDateTime(String signedDateTime) {
		this.signedDateTime = signedDateTime;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getStatusCode() {
		return this.statusCode;
	}
	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public String getWorkNo() {
		return this.workNo;
	}
	public void setWorkNo(String workNo) {
		this.workNo = workNo;
	}

}
