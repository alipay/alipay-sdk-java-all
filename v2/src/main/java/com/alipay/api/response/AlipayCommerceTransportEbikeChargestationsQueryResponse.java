package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.EbikeChargeStation;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.ebike.chargestations.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-05-19 10:52:49
 */
public class AlipayCommerceTransportEbikeChargestationsQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7815685828496231933L;

	/** 
	 * 所有品牌桩查看链接
	 */
	@ApiField("all_brand_chargestations_link")
	private String allBrandChargestationsLink;

	/** 
	 * 所有品牌桩数据总量
	 */
	@ApiField("all_brand_chargestations_total")
	private Long allBrandChargestationsTotal;

	/** 
	 * null
	 */
	@ApiListField("ebike_charge_station_list")
	@ApiField("ebike_charge_station")
	private List<EbikeChargeStation> ebikeChargeStationList;

	/** 
	 * 当前页码
	 */
	@ApiField("page_no")
	private Long pageNo;

	/** 
	 * 每页大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 充电桩数据总量,单位:个
	 */
	@ApiField("total")
	private Long total;

	public void setAllBrandChargestationsLink(String allBrandChargestationsLink) {
		this.allBrandChargestationsLink = allBrandChargestationsLink;
	}
	public String getAllBrandChargestationsLink( ) {
		return this.allBrandChargestationsLink;
	}

	public void setAllBrandChargestationsTotal(Long allBrandChargestationsTotal) {
		this.allBrandChargestationsTotal = allBrandChargestationsTotal;
	}
	public Long getAllBrandChargestationsTotal( ) {
		return this.allBrandChargestationsTotal;
	}

	public void setEbikeChargeStationList(List<EbikeChargeStation> ebikeChargeStationList) {
		this.ebikeChargeStationList = ebikeChargeStationList;
	}
	public List<EbikeChargeStation> getEbikeChargeStationList( ) {
		return this.ebikeChargeStationList;
	}

	public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
	}
	public Long getPageNo( ) {
		return this.pageNo;
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
