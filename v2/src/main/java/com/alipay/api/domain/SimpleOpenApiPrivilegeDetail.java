package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝会员简版特权信息模型，仅含特权部分必要信息
 *
 * @author auto create
 * @since 1.0, 2026-03-23 20:12:10
 */
public class SimpleOpenApiPrivilegeDetail extends AlipayObject {

	private static final long serialVersionUID = 3751654775934248636L;

	/**
	 * 一般用于商品素材展示
	 */
	@ApiField("display_content")
	private String displayContent;

	/**
	 * 用于描述商品信息
	 */
	@ApiField("privilege_alias_name")
	private String privilegeAliasName;

	/**
	 * 特权核心商品id标识，不可为空
	 */
	@ApiField("privilege_id")
	private String privilegeId;

	/**
	 * 描述商品标题或名称
	 */
	@ApiField("privilege_name")
	private String privilegeName;

	public String getDisplayContent() {
		return this.displayContent;
	}
	public void setDisplayContent(String displayContent) {
		this.displayContent = displayContent;
	}

	public String getPrivilegeAliasName() {
		return this.privilegeAliasName;
	}
	public void setPrivilegeAliasName(String privilegeAliasName) {
		this.privilegeAliasName = privilegeAliasName;
	}

	public String getPrivilegeId() {
		return this.privilegeId;
	}
	public void setPrivilegeId(String privilegeId) {
		this.privilegeId = privilegeId;
	}

	public String getPrivilegeName() {
		return this.privilegeName;
	}
	public void setPrivilegeName(String privilegeName) {
		this.privilegeName = privilegeName;
	}

}
