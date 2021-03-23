package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 分组设备列表查询
 *
 * @author auto create
 * @since 1.0, 2020-08-19 20:11:11
 */
public class AlipayCommerceIotGroupMemberBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 1381645668957743751L;

	/**
	 * 分组id
	 */
	@ApiField("group_id")
	private Long groupId;

	/**
	 * 每页数量
	 */
	@ApiField("limit")
	private String limit;

	/**
	 * 分页搜索偏移值
	 */
	@ApiField("offset")
	private Long offset;

	public Long getGroupId() {
		return this.groupId;
	}
	public void setGroupId(Long groupId) {
		this.groupId = groupId;
	}

	public String getLimit() {
		return this.limit;
	}
	public void setLimit(String limit) {
		this.limit = limit;
	}

	public Long getOffset() {
		return this.offset;
	}
	public void setOffset(Long offset) {
		this.offset = offset;
	}

}
