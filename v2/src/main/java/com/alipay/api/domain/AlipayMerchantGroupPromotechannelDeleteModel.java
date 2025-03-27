package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商家群群组推广渠道删除
 *
 * @author auto create
 * @since 1.0, 2024-09-30 16:40:05
 */
public class AlipayMerchantGroupPromotechannelDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 6681464369883489449L;

	/**
	 * 群组id，表里唯一键，创建群组自动生成，编辑群组必填
	 */
	@ApiField("group_id")
	private String groupId;

	/**
	 * 删除的渠道id
	 */
	@ApiField("id")
	private Long id;

	public String getGroupId() {
		return this.groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}

}
