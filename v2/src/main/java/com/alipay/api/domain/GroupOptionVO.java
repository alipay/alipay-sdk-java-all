package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 群组选项
 *
 * @author auto create
 * @since 1.0, 2024-08-13 16:36:24
 */
public class GroupOptionVO extends AlipayObject {

	private static final long serialVersionUID = 6797923643199295126L;

	/**
	 * 是否被禁用。true：被禁用；false：未被禁用。
	 */
	@ApiField("forbidden")
	private Boolean forbidden;

	/**
	 * 群组id，表里唯一键
	 */
	@ApiField("group_id")
	private String groupId;

	/**
	 * 定义群组分类，便于后台管理运营识别
	 */
	@ApiField("group_name")
	private String groupName;

	public Boolean getForbidden() {
		return this.forbidden;
	}
	public void setForbidden(Boolean forbidden) {
		this.forbidden = forbidden;
	}

	public String getGroupId() {
		return this.groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public String getGroupName() {
		return this.groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

}
