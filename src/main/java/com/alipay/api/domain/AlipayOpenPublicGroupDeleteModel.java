package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户分组删除接口
 *
 * @author auto create
 * @since 1.0, 2018-05-11 19:06:31
 */
public class AlipayOpenPublicGroupDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 1854134575389968257L;

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
