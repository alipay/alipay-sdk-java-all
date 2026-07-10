package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询原始订单关联的尾款单列表
 *
 * @author auto create
 * @since 1.0, 2026-06-05 17:32:56
 */
public class AlipayCommerceMerchantcardTailpaymentQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4437473822421217689L;

	/**
	 * 预约品必填； 非预约品，不用填
	 */
	@ApiField("main_booking_order_id")
	private String mainBookingOrderId;

	/**
	 * 原始订单id
	 */
	@ApiField("main_order_id")
	private String mainOrderId;

	/**
	 * 分页页码，不传默认为1
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 分页大小，不传默认为10，最大50
	 */
	@ApiField("page_size")
	private Long pageSize;

	public String getMainBookingOrderId() {
		return this.mainBookingOrderId;
	}
	public void setMainBookingOrderId(String mainBookingOrderId) {
		this.mainBookingOrderId = mainBookingOrderId;
	}

	public String getMainOrderId() {
		return this.mainOrderId;
	}
	public void setMainOrderId(String mainOrderId) {
		this.mainOrderId = mainOrderId;
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
