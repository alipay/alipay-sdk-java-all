package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ActivityMerchantInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.activity.merchant.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2021-11-22 16:41:04
 */
public class AlipayMarketingActivityMerchantBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5648314416454481812L;

	/** 
	 * 活动id
	 */
	@ApiField("activity_id")
	private String activityId;

	/** 
	 * 可用商户列表
	 */
	@ApiListField("merchant_infos")
	@ApiField("activity_merchant_info")
	private List<ActivityMerchantInfo> merchantInfos;

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
	 * 可用商户总数量
	 */
	@ApiField("total_size")
	private Long totalSize;

	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}
	public String getActivityId( ) {
		return this.activityId;
	}

	public void setMerchantInfos(List<ActivityMerchantInfo> merchantInfos) {
		this.merchantInfos = merchantInfos;
	}
	public List<ActivityMerchantInfo> getMerchantInfos( ) {
		return this.merchantInfos;
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
