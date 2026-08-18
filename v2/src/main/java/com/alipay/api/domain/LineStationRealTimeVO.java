package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-07-31 21:17:51
 */
public class LineStationRealTimeVO extends AlipayObject {

	private static final long serialVersionUID = 2821731722361122584L;

	/**
	 * 线路主题色色值（十六进制色码）。
	 */
	@ApiField("color")
	private String color;

	/**
	 * null
	 */
	@ApiListField("directions")
	@ApiField("direction_v_o")
	private List<DirectionVO> directions;

	/**
	 * 线路图标资源地址。
	 */
	@ApiField("icon")
	private String icon;

	/**
	 * 1号线
	 */
	@ApiField("name")
	private String name;

	public String getColor() {
		return this.color;
	}
	public void setColor(String color) {
		this.color = color;
	}

	public List<DirectionVO> getDirections() {
		return this.directions;
	}
	public void setDirections(List<DirectionVO> directions) {
		this.directions = directions;
	}

	public String getIcon() {
		return this.icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
