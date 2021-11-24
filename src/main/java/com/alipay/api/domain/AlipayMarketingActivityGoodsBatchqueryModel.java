package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询券可用单品
 *
 * @author auto create
 * @since 1.0, 2021-11-22 16:22:17
 */
public class AlipayMarketingActivityGoodsBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 3815562638314939772L;

	/**
	 * 活动id
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 活动单品类型。
枚举值:
AVAILABLE 可用商品
UNAVAILABLE 不可用商品
	 */
	@ApiField("goods_use_type")
	private String goodsUseType;

	/**
	 * 分页查询页码。
限制:
必须为大于0的整数
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 分页查询单页数据条数。
限制:
1.必须为大于0的整数
2.每页最大值为20
	 */
	@ApiField("page_size")
	private Long pageSize;

	public String getActivityId() {
		return this.activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public String getGoodsUseType() {
		return this.goodsUseType;
	}
	public void setGoodsUseType(String goodsUseType) {
		this.goodsUseType = goodsUseType;
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
