package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝代运营商业关系异动门店批量查询
 *
 * @author auto create
 * @since 1.0, 2022-01-21 14:27:01
 */
public class AlipayBusinessRelationChangeshopBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 7146594419141213118L;

	/**
	 * 商业关系组织id/业务id，由组织信息创建接口返回或bd分配
	 */
	@ApiField("group_id")
	private String groupId;

	/**
	 * 商业关系组织子类型 定向参数 需找对应BD申请
	 */
	@ApiField("group_sub_type")
	private String groupSubType;

	/**
	 * 商业关系组织类型 定向参数 需找对应BD申请
	 */
	@ApiField("group_type")
	private String groupType;

	/**
	 * 第几页，默认1（从1开始计数）
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 每页记录条数，默认20
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 商业关系异动门店状态，已处理/未处理，PROCESSED/UNPROCESSED
	 */
	@ApiField("process_status")
	private String processStatus;

	public String getGroupId() {
		return this.groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public String getGroupSubType() {
		return this.groupSubType;
	}
	public void setGroupSubType(String groupSubType) {
		this.groupSubType = groupSubType;
	}

	public String getGroupType() {
		return this.groupType;
	}
	public void setGroupType(String groupType) {
		this.groupType = groupType;
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

	public String getProcessStatus() {
		return this.processStatus;
	}
	public void setProcessStatus(String processStatus) {
		this.processStatus = processStatus;
	}

}
