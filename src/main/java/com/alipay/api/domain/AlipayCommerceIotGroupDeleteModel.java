package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 删除分组
 *
 * @author auto create
 * @since 1.0, 2020-08-19 20:11:34
 */
public class AlipayCommerceIotGroupDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 2174482634851647945L;

	/**
	 * 需要删除的分组id
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
