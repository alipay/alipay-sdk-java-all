package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商家群查询群组下群列表
 *
 * @author auto create
 * @since 1.0, 2024-05-15 16:49:58
 */
public class AlipayMerchantGroupGroupinstanceinfoBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 3175962176338713877L;

	/**
	 * 群组id
	 */
	@ApiField("group_id")
	private String groupId;

	/**
	 * 分页页号
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 分页大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	public String getGroupId() {
		return this.groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public Long getPageNum() {
		return this.pageNum;
	}
	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

}
