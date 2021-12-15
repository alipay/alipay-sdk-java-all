package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ActivityAppInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.activity.app.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2021-11-27 00:35:36
 */
public class AlipayMarketingActivityAppBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3547621549873355464L;

	/** 
	 * 活动id
	 */
	@ApiField("activity_id")
	private String activityId;

	/** 
	 * 可用小程序列表
	 */
	@ApiListField("app_infos")
	@ApiField("activity_app_info")
	private List<ActivityAppInfo> appInfos;

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
	 * 可用小程序总数量
	 */
	@ApiField("total_size")
	private Long totalSize;

	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}
	public String getActivityId( ) {
		return this.activityId;
	}

	public void setAppInfos(List<ActivityAppInfo> appInfos) {
		this.appInfos = appInfos;
	}
	public List<ActivityAppInfo> getAppInfos( ) {
		return this.appInfos;
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

	public void setTotalSize(Long totalSize) {
		this.totalSize = totalSize;
	}
	public Long getTotalSize( ) {
		return this.totalSize;
	}

}
