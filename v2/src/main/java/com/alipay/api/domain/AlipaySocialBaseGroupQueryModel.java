package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询群基本信息
 *
 * @author auto create
 * @since 1.0, 2016-08-25 10:46:49
 */
public class AlipaySocialBaseGroupQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1271517283342971735L;

	/**
	 * 群的id
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
