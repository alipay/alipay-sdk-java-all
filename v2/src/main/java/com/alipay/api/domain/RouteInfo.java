package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 伴游路线信息
 *
 * @author auto create
 * @since 1.0, 2024-09-20 16:31:31
 */
public class RouteInfo extends AlipayObject {

	private static final long serialVersionUID = 6552969864985711819L;

	/**
	 * 伴游路线景点个数
	 */
	@ApiField("attractions_count")
	private String attractionsCount;

	/**
	 * 伴游路线距离，包含单位信息
	 */
	@ApiField("distance")
	private String distance;

	/**
	 * 伴游路线耗时，包含单位信息
	 */
	@ApiField("duration")
	private String duration;

	/**
	 * 伴游路线唯一id
	 */
	@ApiField("route_id")
	private String routeId;

	/**
	 * 伴游路线类别
	 */
	@ApiField("route_type")
	private String routeType;

	/**
	 * 伴游路线标题
	 */
	@ApiField("title")
	private String title;

	/**
	 * 伴游路线景点名称列表
	 */
	@ApiListField("view_point")
	@ApiField("string")
	private List<String> viewPoint;

	/**
	 * 伴游路线图片
	 */
	@ApiField("view_point_image")
	private String viewPointImage;

	public String getAttractionsCount() {
		return this.attractionsCount;
	}
	public void setAttractionsCount(String attractionsCount) {
		this.attractionsCount = attractionsCount;
	}

	public String getDistance() {
		return this.distance;
	}
	public void setDistance(String distance) {
		this.distance = distance;
	}

	public String getDuration() {
		return this.duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getRouteId() {
		return this.routeId;
	}
	public void setRouteId(String routeId) {
		this.routeId = routeId;
	}

	public String getRouteType() {
		return this.routeType;
	}
	public void setRouteType(String routeType) {
		this.routeType = routeType;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public List<String> getViewPoint() {
		return this.viewPoint;
	}
	public void setViewPoint(List<String> viewPoint) {
		this.viewPoint = viewPoint;
	}

	public String getViewPointImage() {
		return this.viewPointImage;
	}
	public void setViewPointImage(String viewPointImage) {
		this.viewPointImage = viewPointImage;
	}

}
