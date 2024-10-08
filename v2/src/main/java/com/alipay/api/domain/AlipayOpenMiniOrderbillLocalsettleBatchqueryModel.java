package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询小程序本地生活订单结算账单列表
 *
 * @author auto create
 * @since 1.0, 2024-07-30 16:25:17
 */
public class AlipayOpenMiniOrderbillLocalsettleBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 2655218597446358722L;

	/**
	 * 页大小，最大值为10，单位：条目数。
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 分页标识，第一页不传，第二页开始传入上一页返回的page_token
	 */
	@ApiField("page_token")
	private String pageToken;

	/**
	 * 小程序订单结算日期，格式为"yyyy-MM-dd"，如"2023-03-22"
	 */
	@ApiField("settlement_date")
	private String settlementDate;

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public String getPageToken() {
		return this.pageToken;
	}
	public void setPageToken(String pageToken) {
		this.pageToken = pageToken;
	}

	public String getSettlementDate() {
		return this.settlementDate;
	}
	public void setSettlementDate(String settlementDate) {
		this.settlementDate = settlementDate;
	}

}
