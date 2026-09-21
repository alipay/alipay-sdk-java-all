package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 售后单分页查询
 *
 * @author auto create
 * @since 1.0, 2026-09-16 15:12:54
 */
public class AlipayOpenMiniOrderAftersalepageQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5244114883849354118L;

	/**
	 * 买家支付宝用户id
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 交易组件订单号
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 页数，大于等于1
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 每页大小，最大50
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 买家支付宝用户id
	 */
	@ApiField("user_id")
	private String userId;

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
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

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
