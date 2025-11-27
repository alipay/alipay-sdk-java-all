package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商家群群组推广渠道查询
 *
 * @author auto create
 * @since 1.0, 2025-04-28 11:38:20
 */
public class AlipayMerchantGroupPromotechannelBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 1893348854191788458L;

	/**
	 * 群组id，表里唯一键，创建群组自动生成，编辑群组必填
	 */
	@ApiField("group_id")
	private String groupId;

	/**
	 * 分页查询的页码值
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 分页查询页大小参数
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 父渠道节点id，如果是查询一级渠道，不需要传父节点id
	 */
	@ApiField("parent_id")
	private Long parentId;

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

	public Long getParentId() {
		return this.parentId;
	}
	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

}
