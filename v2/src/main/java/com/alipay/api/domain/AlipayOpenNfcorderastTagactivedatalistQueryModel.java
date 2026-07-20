package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 线圈活跃数据查询
 *
 * @author auto create
 * @since 1.0, 2026-04-27 16:20:23
 */
public class AlipayOpenNfcorderastTagactivedatalistQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8324226936899747347L;

	/**
	 * 查询此日期的数据，格式为：yyyyMMdd
	 */
	@ApiField("dt")
	private String dt;

	/**
	 * 订单id
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 不传默认为1
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 不传默认20
	 */
	@ApiField("page_size")
	private Long pageSize;

	public String getDt() {
		return this.dt;
	}
	public void setDt(String dt) {
		this.dt = dt;
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

}
