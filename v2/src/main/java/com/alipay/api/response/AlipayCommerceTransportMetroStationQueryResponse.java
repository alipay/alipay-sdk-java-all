package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.LbsVO;
import com.alipay.api.domain.LineVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.metro.station.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-07-31 21:12:25
 */
public class AlipayCommerceTransportMetroStationQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2452238589361749911L;

	/** 
	 * 经纬度信息
	 */
	@ApiField("lbs")
	private LbsVO lbs;

	/** 
	 * null
	 */
	@ApiListField("lines")
	@ApiField("line_v_o")
	private List<LineVO> lines;

	/** 
	 * 乘车码链接
	 */
	@ApiField("link")
	private String link;

	/** 
	 * 站点code
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

	public void setLines(List<LineVO> lines) {
		this.lines = lines;
	}
	public List<LineVO> getLines( ) {
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
