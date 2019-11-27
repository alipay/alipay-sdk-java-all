package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询群概要信息
 *
 * @author auto create
 * @since 1.0, 2019-09-16 21:05:46
 */
public class AlipaySocialBaseChatGbriefQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5552169268599629484L;

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
