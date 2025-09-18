package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 积分商城活动查询
 *
 * @author auto create
 * @since 1.0, 2025-04-22 21:56:32
 */
public class AlipayCommerceRetailActivitypointsQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4776795524753571539L;

	/**
	 * 活动ID
	 */
	@ApiListField("activity_id_list")
	@ApiField("string")
	private List<String> activityIdList;

	/**
	 * 页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 每页数量
	 */
	@ApiField("page_size")
	private Long pageSize;

	public List<String> getActivityIdList() {
		return this.activityIdList;
	}
	public void setActivityIdList(List<String> activityIdList) {
		this.activityIdList = activityIdList;
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
