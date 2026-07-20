package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * WiFi查询
 *
 * @author auto create
 * @since 1.0, 2026-06-22 10:32:55
 */
public class AlipayCommerceCityfacilitatorWifiQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7735222731922298354L;

	/**
	 * 当前页
	 */
	@ApiField("page_number")
	private Long pageNumber;

	/**
	 * 每页大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 门店ID
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * WIFI名称
	 */
	@ApiField("wifi_name")
	private String wifiName;

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

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getWifiName() {
		return this.wifiName;
	}
	public void setWifiName(String wifiName) {
		this.wifiName = wifiName;
	}

}
