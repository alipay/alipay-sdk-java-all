package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 批量查询入群有礼
 *
 * @author auto create
 * @since 1.0, 2024-07-19 14:46:12
 */
public class AlipayMerchantGroupGroupgiftBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 6197277775494731954L;

	/**
	 * 群组id，表里唯一键，创建群组自动生成，编辑群组必填
	 */
	@ApiField("group_id")
	private String groupId;

	/**
	 * 当前页,表示查询的第几页。取值单位是"页"。
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 分页查询每页最大条数，支持每页最大50条。取值单位是"条"。
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
