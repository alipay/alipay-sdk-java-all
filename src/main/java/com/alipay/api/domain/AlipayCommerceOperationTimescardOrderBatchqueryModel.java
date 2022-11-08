package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 次卡订单批量查询
 *
 * @author auto create
 * @since 1.0, 2022-09-27 17:26:13
 */
public class AlipayCommerceOperationTimescardOrderBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 7597479885635774565L;

	/**
	 * 次卡商品id
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 订单查询时间范围-结束时间
	 */
	@ApiField("order_time_end")
	private String orderTimeEnd;

	/**
	 * 订单查询时间范围-开始时间
	 */
	@ApiField("order_time_start")
	private Date orderTimeStart;

	/**
	 * 分页页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 分页每页记录数
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 美发：HARDRESSING
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getOrderTimeEnd() {
		return this.orderTimeEnd;
	}
	public void setOrderTimeEnd(String orderTimeEnd) {
		this.orderTimeEnd = orderTimeEnd;
	}

	public Date getOrderTimeStart() {
		return this.orderTimeStart;
	}
	public void setOrderTimeStart(Date orderTimeStart) {
		this.orderTimeStart = orderTimeStart;
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

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
