package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 门店库存同步
 *
 * @author auto create
 * @since 1.0, 2025-12-03 10:27:42
 */
public class AlipayCommerceMerchantcardShopstockSyncModel extends AlipayObject {

	private static final long serialVersionUID = 5127728298113482921L;

	/**
	 * 门店id【必填】
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 库存状态（枚举）【必填】
active      可预约
inactive    不可预约(无原因)
full        不可预约(已约满)
	 */
	@ApiField("status")
	private String status;

	/**
	 * 库存日期【必填】
格式 yyyy-MM-dd
	 */
	@ApiField("stock_date")
	private String stockDate;

	/**
	 * 库存结束时间【必填】
	 */
	@ApiField("stock_end_time")
	private Date stockEndTime;

	/**
	 * 库存开始时间【必填】
	 */
	@ApiField("stock_start_time")
	private Date stockStartTime;

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getStockDate() {
		return this.stockDate;
	}
	public void setStockDate(String stockDate) {
		this.stockDate = stockDate;
	}

	public Date getStockEndTime() {
		return this.stockEndTime;
	}
	public void setStockEndTime(Date stockEndTime) {
		this.stockEndTime = stockEndTime;
	}

	public Date getStockStartTime() {
		return this.stockStartTime;
	}
	public void setStockStartTime(Date stockStartTime) {
		this.stockStartTime = stockStartTime;
	}

}
