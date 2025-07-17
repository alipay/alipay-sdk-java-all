package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 金额卡分页查询使用记录
 *
 * @author auto create
 * @since 1.0, 2025-07-07 09:47:35
 */
public class AlipayCommerceMoneycardRecordBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 1789192643886541394L;

	/**
	 * 核销结束时间，格式 yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("end_time")
	private String endTime;

	/**
	 * 分页页码，单位页，最小为1，最大为10000
	 */
	@ApiField("page_number")
	private Long pageNumber;

	/**
	 * 分页查询中分页大小，单位条，最小为1，最大为100
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 核销开始时间，格式 yyyy-MM-dd HH:mm:ss，
核销开始时间必须小于核销结束时间；
开始时间和结束时间不能相差超过30天；
开始时间和结束时间只能同时存在或者同时不存在
	 */
	@ApiField("start_time")
	private String startTime;

	/**
	 * 交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/**
	 * 收单支付宝商户pid
	 */
	@ApiField("trade_pid")
	private String tradePid;

	public String getEndTime() {
		return this.endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public Long getPageNumber() {
		return this.pageNumber;
	}
	public void setPageNumber(Long pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public String getStartTime() {
		return this.startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

	public String getTradePid() {
		return this.tradePid;
	}
	public void setTradePid(String tradePid) {
		this.tradePid = tradePid;
	}

}
