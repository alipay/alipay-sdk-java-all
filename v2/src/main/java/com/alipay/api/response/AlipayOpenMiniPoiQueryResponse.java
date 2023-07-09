package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.NearbyAddressInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.poi.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-29 19:26:44
 */
public class AlipayOpenMiniPoiQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1585727486657752655L;

	/** 
	 * 可添加地址的最大数量
	 */
	@ApiField("max_count")
	private Long maxCount;

	/** 
	 * POI信息列表
	 */
	@ApiListField("nearby_address_info_list")
	@ApiField("nearby_address_info")
	private List<NearbyAddressInfo> nearbyAddressInfoList;

	/** 
	 * 当前已添加地址数量
	 */
	@ApiField("total_count")
	private Long totalCount;

	public void setMaxCount(Long maxCount) {
		this.maxCount = maxCount;
	}
	public Long getMaxCount( ) {
		return this.maxCount;
	}

	public void setNearbyAddressInfoList(List<NearbyAddressInfo> nearbyAddressInfoList) {
		this.nearbyAddressInfoList = nearbyAddressInfoList;
	}
	public List<NearbyAddressInfo> getNearbyAddressInfoList( ) {
		return this.nearbyAddressInfoList;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public Long getTotalCount( ) {
		return this.totalCount;
	}

}
