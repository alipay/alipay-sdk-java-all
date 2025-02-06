package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ActivityLiteInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.activity.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2024-12-24 15:38:40
 */
public class AlipayMarketingActivityBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2715168732184718683L;

	/** 
	 * 活动摘要信息
	 */
	@ApiListField("activity_lite_infos")
	@ApiField("activity_lite_info")
	private List<ActivityLiteInfo> activityLiteInfos;

	/** 
	 * 分页查询页码。
	 */
	@ApiField("page_num")
	private Long pageNum;

	/** 
	 * 分页查询单页数据条数。
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 经过条件筛选，查询到的活动总数量
	 */
	@ApiField("total_size")
	private String totalSize;

	public void setActivityLiteInfos(List<ActivityLiteInfo> activityLiteInfos) {
		this.activityLiteInfos = activityLiteInfos;
	}
	public List<ActivityLiteInfo> getActivityLiteInfos( ) {
		return this.activityLiteInfos;
	}

	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}
	public Long getPageNum( ) {
		return this.pageNum;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}
	public Long getPageSize( ) {
		return this.pageSize;
	}

	public void setTotalSize(String totalSize) {
		this.totalSize = totalSize;
	}
	public String getTotalSize( ) {
		return this.totalSize;
	}

}
