package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询入群有礼
 *
 * @author auto create
 * @since 1.0, 2024-07-30 14:28:50
 */
public class AlipayMerchantGroupGroupgiftQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4472513633651514966L;

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
