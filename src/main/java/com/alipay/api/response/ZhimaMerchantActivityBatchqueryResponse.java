package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.Activity;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.merchant.activity.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class ZhimaMerchantActivityBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6289412434485151736L;

	/** 
	 * 芝麻承诺消费开放模式活动模型列表
	 */
	@ApiListField("activity_list")
	@ApiField("activity")
	private List<Activity> activityList;

	/** 
	 * 当前页
	 */
	@ApiField("page_no")
	private Long pageNo;

	/** 
	 * 每页条目数
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 本次查询总页数
	 */
	@ApiField("total_page")
	private Long totalPage;

	/** 
	 * 本次查询总条目数
	 */
	@ApiField("total_size")
	private Long totalSize;

	public void setActivityList(List<Activity> activityList) {
		this.activityList = activityList;
	}
	public List<Activity> getActivityList( ) {
		return this.activityList;
	}

	public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
	}
	public Long getPageNo( ) {
		return this.pageNo;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}
	public Long getPageSize( ) {
		return this.pageSize;
	}

	public void setTotalPage(Long totalPage) {
		this.totalPage = totalPage;
	}
	public Long getTotalPage( ) {
		return this.totalPage;
	}

	public void setTotalSize(Long totalSize) {
		this.totalSize = totalSize;
	}
	public Long getTotalSize( ) {
		return this.totalSize;
	}

}
