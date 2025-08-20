package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商家群群组详情查询
 *
 * @author auto create
 * @since 1.0, 2025-04-15 16:33:58
 */
public class AlipayMerchantGroupGroupinfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5182211514111319445L;

	/**
	 * 群组id，表里唯一键，创建群组自动生成，编辑群组必填
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
