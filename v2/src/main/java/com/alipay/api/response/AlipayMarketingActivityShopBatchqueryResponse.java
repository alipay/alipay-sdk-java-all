package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ActivityShopInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.activity.shop.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:27:34
 */
public class AlipayMarketingActivityShopBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5899968794389117795L;

	/** 
	 * 活动id
	 */
	@ApiField("activity_id")
	private String activityId;

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
	 * 可用门店列表
	 */
	@ApiListField("shop_infos")
	@ApiField("activity_shop_info")
	private List<ActivityShopInfo> shopInfos;

	/** 
	 * 可用门店总数量
	 */
	@ApiField("total_size")
	private Long totalSize;

	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}
	public String getActivityId( ) {
		return this.activityId;
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

	public void setShopInfos(List<ActivityShopInfo> shopInfos) {
		this.shopInfos = shopInfos;
	}
	public List<ActivityShopInfo> getShopInfos( ) {
		return this.shopInfos;
	}

	public void setTotalSize(Long totalSize) {
		this.totalSize = totalSize;
	}
	public Long getTotalSize( ) {
		return this.totalSize;
	}

}
