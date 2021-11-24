package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询券可用门店
 *
 * @author auto create
 * @since 1.0, 2021-11-22 16:22:06
 */
public class AlipayMarketingActivityShopBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 8692257278424138188L;

	/**
	 * 活动id
	 */
	@ApiField("activity_id")
	private String activityId;

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
