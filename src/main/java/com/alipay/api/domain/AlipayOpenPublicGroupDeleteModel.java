package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户分组删除接口
 *
 * @author auto create
 * @since 1.0, 2020-02-19 16:36:12
 */
public class AlipayOpenPublicGroupDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 5561524578929322596L;

	/**
	 * 需要删除的用户分组的id
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
