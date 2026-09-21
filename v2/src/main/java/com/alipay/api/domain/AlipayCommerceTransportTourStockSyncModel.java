package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 一码通库存同步接口
 *
 * @author auto create
 * @since 1.0, 2026-09-18 10:07:55
 */
public class AlipayCommerceTransportTourStockSyncModel extends AlipayObject {

	private static final long serialVersionUID = 8755628734699538763L;

	/**
	 * 景点Id
	 */
	@ApiField("scenic_id")
	private String scenicId;

	/**
	 * null
	 */
	@ApiListField("stock_info_list")
	@ApiField("tour_stock_info")
	private List<TourStockInfo> stockInfoList;

	public String getScenicId() {
		return this.scenicId;
	}
	public void setScenicId(String scenicId) {
		this.scenicId = scenicId;
	}

	public List<TourStockInfo> getStockInfoList() {
		return this.stockInfoList;
	}
	public void setStockInfoList(List<TourStockInfo> stockInfoList) {
		this.stockInfoList = stockInfoList;
	}

}
