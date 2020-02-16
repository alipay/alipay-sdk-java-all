package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝社交修改群名称
 *
 * @author auto create
 * @since 1.0, 2018-03-15 14:16:05
 */
public class AlipaySocialBaseChatGnameModifyModel extends AlipayObject {

	private static final long serialVersionUID = 3651362385384561434L;

	/**
	 * 群id
	 */
	@ApiField("group_id")
	private String groupId;

	/**
	 * 群名称
	 */
	@ApiField("group_name")
	private String groupName;

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
