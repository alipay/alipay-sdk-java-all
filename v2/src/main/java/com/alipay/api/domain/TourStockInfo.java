package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-09-18 10:07:55
 */
public class TourStockInfo extends AlipayObject {

	private static final long serialVersionUID = 4234929992793631853L;

	/**
	 * 库存日期，格式为YYYY-MM-DD
	 */
	@ApiField("stock_date")
	private String stockDate;

	/**
	 * 库存状态，值为EMPTY时，表示要清空指定日期的库存状态
	 */
	@ApiField("stock_status")
	private String stockStatus;

	public String getStockDate() {
		return this.stockDate;
	}
	public void setStockDate(String stockDate) {
		this.stockDate = stockDate;
	}

	public String getStockStatus() {
		return this.stockStatus;
	}
	public void setStockStatus(String stockStatus) {
		this.stockStatus = stockStatus;
	}

}
