package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询查询用户是否在群
 *
 * @author auto create
 * @since 1.0, 2016-07-25 14:24:50
 */
public class AlipaySocialBaseGroupmemberQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6156639628543831943L;

	/**
	 * 群id
	 */
	@ApiField("group_id")
	private String groupId;

	public String getGroupId() {
		return this.groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

}
