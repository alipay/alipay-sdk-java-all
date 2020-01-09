package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 删除分组
 *
 * @author auto create
 * @since 1.0, 2019-11-29 10:50:38
 */
public class AlipayCommerceIotGroupDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 1586152718726548527L;

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
