package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.StationDetailInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.cityfacilitator.station.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-11 17:18:54
 */
public class AlipayCommerceCityfacilitatorStationQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3124374517965269166L;

	/** 
	 * 支持设为起点的站点列表
	 */
	@ApiListField("support_starts")
	@ApiField("station_detail_info")
	private List<StationDetailInfo> supportStarts;

	public void setSupportStarts(List<StationDetailInfo> supportStarts) {
		this.supportStarts = supportStarts;
	}
	public List<StationDetailInfo> getSupportStarts( ) {
		return this.supportStarts;
	}

}
