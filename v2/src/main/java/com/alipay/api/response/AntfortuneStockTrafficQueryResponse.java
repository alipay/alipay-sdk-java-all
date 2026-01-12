package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.UnitTraffic;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: antfortune.stock.traffic.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-09-14 17:42:11
 */
public class AntfortuneStockTrafficQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5845223587881126226L;

	/** 
	 * 流量模式，当为空时表示是全量人群模式
	 */
	@ApiField("traffic_mode")
	private String trafficMode;

	/** 
	 * 单元流量配比
	 */
	@ApiListField("units")
	@ApiField("unit_traffic")
	private List<UnitTraffic> units;

	public void setTrafficMode(String trafficMode) {
		this.trafficMode = trafficMode;
	}
	public String getTrafficMode( ) {
		return this.trafficMode;
	}

	public void setUnits(List<UnitTraffic> units) {
		this.units = units;
	}
	public List<UnitTraffic> getUnits( ) {
		return this.units;
	}

}
