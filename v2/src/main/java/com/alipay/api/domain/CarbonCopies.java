package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 发起docusign签署时的抄送人信息
 *
 * @author auto create
 * @since 1.0, 2024-12-27 10:25:16
 */
public class CarbonCopies extends AlipayObject {

	private static final long serialVersionUID = 5782967532352865773L;

	/**
	 * 签署邮件抄送邮箱
	 */
	@ApiField("email")
	private String email;

	/**
	 * 抄送人的姓名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 人员唯一id，每人邮箱分配一个，不重复即可
	 */
	@ApiField("recipient_id")
	private String recipientId;

	/**
	 * 发送顺序 1~10 不同的人请保持不一致
	 */
	@ApiField("routing_order")
	private Long routingOrder;

	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getRecipientId() {
		return this.recipientId;
	}
	public void setRecipientId(String recipientId) {
		this.recipientId = recipientId;
	}

	public Long getRoutingOrder() {
		return this.routingOrder;
	}
	public void setRoutingOrder(Long routingOrder) {
		this.routingOrder = routingOrder;
	}

}
