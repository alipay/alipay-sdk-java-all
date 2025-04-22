package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 群组删除
 *
 * @author auto create
 * @since 1.0, 2024-09-30 17:55:52
 */
public class AlipayMerchantGroupGroupinfoDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 4551829893324369639L;

	/**
	 * 群组id，表里唯一键，创建群组自动生成
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
