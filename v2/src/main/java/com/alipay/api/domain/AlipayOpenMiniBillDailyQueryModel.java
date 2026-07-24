package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 每日结算明细账单查询
 *
 * @author auto create
 * @since 1.0, 2026-05-25 19:59:12
 */
public class AlipayOpenMiniBillDailyQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7311955827645399678L;

	/**
	 * 分页页码，从1开始
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 分页大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 结算日期，格式：yyyyMMdd。核销日期、结算日期2选1必传。如同时传入2个日期，则按核销日期查询返回账单明细。
	 */
	@ApiField("settle_date")
	private String settleDate;

	/**
	 * 核销日期，格式：yyyyMMdd。核销日期、结算日期2选1必传。如同时传入2个日期，则按核销日期查询返回账单明细。
	 */
	@ApiField("use_date")
	private String useDate;

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

	public String getSettleDate() {
		return this.settleDate;
	}
	public void setSettleDate(String settleDate) {
		this.settleDate = settleDate;
	}

	public String getUseDate() {
		return this.useDate;
	}
	public void setUseDate(String useDate) {
		this.useDate = useDate;
	}

}
