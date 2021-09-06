package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 删除分组成员
 *
 * @author auto create
 * @since 1.0, 2020-08-19 20:09:44
 */
public class AlipayCommerceIotGroupMemberDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 4225774751294397627L;

	/**
	 * 分组id
	 */
	@ApiField("group_id")
	private String groupId;

	/**
	 * sn列表
	 */
	@ApiListField("sn_list")
	@ApiField("string")
	private List<String> snList;

	public String getGroupId() {
		return this.groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public List<String> getSnList() {
		return this.snList;
	}
	public void setSnList(List<String> snList) {
		this.snList = snList;
	}

}
