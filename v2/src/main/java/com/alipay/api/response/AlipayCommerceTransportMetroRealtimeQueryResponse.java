package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.LbsVO;
import com.alipay.api.domain.LineStationRealTimeVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.metro.realtime.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-07-31 21:17:51
 */
public class AlipayCommerceTransportMetroRealtimeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5112875299211277477L;

	/** 
	 * 经纬度信息
	 */
	@ApiField("lbs")
	private LbsVO lbs;

	/** 
	 * null
	 */
	@ApiListField("lines")
	@ApiField("line_station_real_time_v_o")
	private List<LineStationRealTimeVO> lines;

	/** 
	 * 乘车码链接
	 */
	@ApiField("link")
	private String link;

	/** 
	 * 站点编码
	 */
	@ApiField("station_code")
	private String stationCode;

	/** 
	 * 站点名称
	 */
	@ApiField("station_name")
	private String stationName;

	public void setLbs(LbsVO lbs) {
		this.lbs = lbs;
	}
	public LbsVO getLbs( ) {
		return this.lbs;
	}

	public void setLines(List<LineStationRealTimeVO> lines) {
		this.lines = lines;
	}
	public List<LineStationRealTimeVO> getLines( ) {
		return this.lines;
	}

	public void setLink(String link) {
		this.link = link;
	}
	public String getLink( ) {
		return this.link;
	}

	public void setStationCode(String stationCode) {
		this.stationCode = stationCode;
	}
	public String getStationCode( ) {
		return this.stationCode;
	}

	public void setStationName(String stationName) {
		this.stationName = stationName;
	}
	public String getStationName( ) {
		return this.stationName;
	}

}
