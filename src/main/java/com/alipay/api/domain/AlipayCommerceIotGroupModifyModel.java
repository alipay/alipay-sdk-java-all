package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * IOT分组修改
 *
 * @author auto create
 * @since 1.0, 2019-11-29 10:50:29
 */
public class AlipayCommerceIotGroupModifyModel extends AlipayObject {

	private static final long serialVersionUID = 1144796373767645783L;

	/**
	 * 分组描述
	 */
	@ApiField("description")
	private String description;

	/**
	 * 分组的id
	 */
	@ApiField("group_id")
	private Long groupId;

	/**
	 * 修改的分组名
不填表示不修改
	 */
	@ApiField("group_name")
	private String groupName;

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public Long getGroupId() {
		return this.groupId;
	}
	public void setGroupId(Long groupId) {
		this.groupId = groupId;
	}

	public String getGroupName() {
		return this.groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

}
