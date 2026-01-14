package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品操作上下文
 *
 * @author auto create
 * @since 1.0, 2017-04-20 15:17:50
 */
public class AlipayItemOperationContext extends AlipayObject {

	private static final long serialVersionUID = 3412867662665495954L;

	/**
	 * 商品创建者，商户授权模式此值不需要填写。
	 */
	@ApiField("creator")
	private String creator;

	/**
	 * 操作角色类型，授权授权模式下此值不需要填写。
	 */
	@ApiField("op_role")
	private String opRole;

	/**
	 * 商户ID，如果商户传入此值，将以此商户ID作为业务主体，商户授权模式此值不需要填写。
	 */
	@ApiField("partner_id")
	private String partnerId;

	public String getCreator() {
		return this.creator;
	}
	public void setCreator(String creator) {
		this.creator = creator;
	}

	public String getOpRole() {
		return this.opRole;
	}
	public void setOpRole(String opRole) {
		this.opRole = opRole;
	}

	public String getPartnerId() {
		return this.partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

}
