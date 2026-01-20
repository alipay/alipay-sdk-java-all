package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 账单查询接口
 *
 * @author auto create
 * @since 1.0, 2025-04-28 17:30:12
 */
public class AlipayCommerceRentRoyaltyBillQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2462553988532698678L;

	/**
	 * 分账完成起始日期
	 */
	@ApiField("begin_time")
	private Date beginTime;

	/**
	 * 平台订单号
	 */
	@ApiField("biz_order_id")
	private String bizOrderId;

	/**
	 * 分账完成截止日期
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 分页页码
	 */
	@ApiField("page_no")
	private Long pageNo;

	/**
	 * 分页大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	public Date getBeginTime() {
		return this.beginTime;
	}
	public void setBeginTime(Date beginTime) {
		this.beginTime = beginTime;
	}

	public String getBizOrderId() {
		return this.bizOrderId;
	}
	public void setBizOrderId(String bizOrderId) {
		this.bizOrderId = bizOrderId;
	}

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public Long getPageNo() {
		return this.pageNo;
	}
	public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

}
