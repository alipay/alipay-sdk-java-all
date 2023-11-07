package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AppItemInfo;
import com.alipay.api.domain.ActivityGoodsInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.activity.goods.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2023-11-07 15:11:49
 */
public class AlipayMarketingActivityGoodsBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6179224497752699552L;

	/** 
	 * 活动id
	 */
	@ApiField("activity_id")
	private String activityId;

	/** 
	 * 小程序商品信息
	 */
	@ApiListField("app_item_infos")
	@ApiField("app_item_info")
	private List<AppItemInfo> appItemInfos;

	/** 
	 * 商品编码列表
	 */
	@ApiListField("goods_infos")
	@ApiField("activity_goods_info")
	private List<ActivityGoodsInfo> goodsInfos;

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
	 * 商品编码总数量
	 */
	@ApiField("total_size")
	private Long totalSize;

	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}
	public String getActivityId( ) {
		return this.activityId;
	}

	public void setAppItemInfos(List<AppItemInfo> appItemInfos) {
		this.appItemInfos = appItemInfos;
	}
	public List<AppItemInfo> getAppItemInfos( ) {
		return this.appItemInfos;
	}

	public void setGoodsInfos(List<ActivityGoodsInfo> goodsInfos) {
		this.goodsInfos = goodsInfos;
	}
	public List<ActivityGoodsInfo> getGoodsInfos( ) {
		return this.goodsInfos;
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
