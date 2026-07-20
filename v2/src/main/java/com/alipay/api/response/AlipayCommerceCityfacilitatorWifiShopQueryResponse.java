package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.SolWifiShopInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.cityfacilitator.wifi.shop.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-06-22 10:30:27
 */
public class AlipayCommerceCityfacilitatorWifiShopQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8751483717261327578L;

	/** 
	 * null
	 */
	@ApiListField("data")
	@ApiField("sol_wifi_shop_info")
	private List<SolWifiShopInfo> data;

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
	 * 总数
	 */
	@ApiField("total")
	private Long total;

	public void setData(List<SolWifiShopInfo> data) {
		this.data = data;
	}
	public List<SolWifiShopInfo> getData( ) {
		return this.data;
	}

	public void setPageNumber(Long pageNumber) {
		this.pageNumber = pageNumber;
	}
	public Long getPageNumber( ) {
		return this.pageNumber;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}
	public Long getPageSize( ) {
		return this.pageSize;
	}

	public void setTotal(Long total) {
		this.total = total;
	}
	public Long getTotal( ) {
		return this.total;
	}

}
