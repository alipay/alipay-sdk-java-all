package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 批量添加分组设备
 *
 * @author auto create
 * @since 1.0, 2020-08-19 20:10:48
 */
public class AlipayCommerceIotGroupMemberAddModel extends AlipayObject {

	private static final long serialVersionUID = 8281121926249738372L;

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
