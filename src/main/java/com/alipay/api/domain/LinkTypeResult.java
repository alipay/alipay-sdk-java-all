package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 环节类型查询结果
 *
 * @author auto create
 * @since 1.0, 2022-03-29 16:18:30
 */
public class LinkTypeResult extends AlipayObject {

	private static final long serialVersionUID = 8668433436551495238L;

	/**
	 * 层级
	 */
	@ApiField("level")
	private String level;

	/**
	 * 环节code
	 */
	@ApiField("link_type_code")
	private String linkTypeCode;

	/**
	 * 环节名称
	 */
	@ApiField("link_type_name")
	private String linkTypeName;

	/**
	 * 父环节code，当是一级环节时该参数为空
	 */
	@ApiField("parent_code")
	private String parentCode;

	/**
	 * 状态
	 */
	@ApiField("state")
	private String state;

	/**
	 * 租户id
	 */
	@ApiField("tnt_inst_id")
	private String tntInstId;

	public String getLevel() {
		return this.level;
	}
	public void setLevel(String level) {
		this.level = level;
	}

	public String getLinkTypeCode() {
		return this.linkTypeCode;
	}
	public void setLinkTypeCode(String linkTypeCode) {
		this.linkTypeCode = linkTypeCode;
	}

	public String getLinkTypeName() {
		return this.linkTypeName;
	}
	public void setLinkTypeName(String linkTypeName) {
		this.linkTypeName = linkTypeName;
	}

	public String getParentCode() {
		return this.parentCode;
	}
	public void setParentCode(String parentCode) {
		this.parentCode = parentCode;
	}

	public String getState() {
		return this.state;
	}
	public void setState(String state) {
		this.state = state;
	}

	public String getTntInstId() {
		return this.tntInstId;
	}
	public void setTntInstId(String tntInstId) {
		this.tntInstId = tntInstId;
	}

}
