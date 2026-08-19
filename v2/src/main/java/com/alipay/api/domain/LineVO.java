package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-07-31 21:12:25
 */
public class LineVO extends AlipayObject {

	private static final long serialVersionUID = 8563797694618349472L;

	/**
	 * 线路主题色色值（十六进制色码）。
	 */
	@ApiField("color")
	private String color;

	/**
	 * 线路图标资源地址。
	 */
	@ApiField("icon")
	private String icon;

	/**
	 * 线路编码，用于实时查询的 lineCode 入参。
	 */
	@ApiField("line_code")
	private String lineCode;

	/**
	 * 线路中文名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * null
	 */
	@ApiListField("next_stations")
	@ApiField("station_v_o")
	private List<StationVO> nextStations;

	public String getColor() {
		return this.color;
	}
	public void setColor(String color) {
		this.color = color;
	}

	public String getIcon() {
		return this.icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getLineCode() {
		return this.lineCode;
	}
	public void setLineCode(String lineCode) {
		this.lineCode = lineCode;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public List<StationVO> getNextStations() {
		return this.nextStations;
	}
	public void setNextStations(List<StationVO> nextStations) {
		this.nextStations = nextStations;
	}

}
