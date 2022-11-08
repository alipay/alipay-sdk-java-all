package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 景区语音讲解点描述。
 *
 * @author auto create
 * @since 1.0, 2022-01-04 11:00:02
 */
public class ScenicExplanationPoint extends AlipayObject {

	private static final long serialVersionUID = 7245632292358353817L;

	/**
	 * 景点语音讲解的讲解时长，单位秒（s）。
	 */
	@ApiField("duration")
	private String duration;

	/**
	 * 该语音讲解的讲解人信息。
	 */
	@ApiField("explainer")
	private String explainer;

	/**
	 * 如该景点包含多个子讲解点（如博物馆某展馆下的多个藏品），传入自讲解点名称列表。
	 */
	@ApiListField("explainer_points")
	@ApiField("string")
	private List<String> explainerPoints;

	/**
	 * 景区内景点的详细经纬度信息。
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 景区内景点的详细经纬度信息。
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * 商户（或ISV）系统内的景点id。
	 */
	@ApiField("point_id")
	private String pointId;

	/**
	 * 景区内景点的详细名称。
	 */
	@ApiField("point_name")
	private String pointName;

	/**
	 * 该语音讲解售价，如免费则不传。
	 */
	@ApiField("price")
	private String price;

	/**
	 * 景点故事的文字描述。
	 */
	@ApiField("story")
	private String story;

	public String getDuration() {
		return this.duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getExplainer() {
		return this.explainer;
	}
	public void setExplainer(String explainer) {
		this.explainer = explainer;
	}

	public List<String> getExplainerPoints() {
		return this.explainerPoints;
	}
	public void setExplainerPoints(List<String> explainerPoints) {
		this.explainerPoints = explainerPoints;
	}

	public String getLatitude() {
		return this.latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return this.longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getPointId() {
		return this.pointId;
	}
	public void setPointId(String pointId) {
		this.pointId = pointId;
	}

	public String getPointName() {
		return this.pointName;
	}
	public void setPointName(String pointName) {
		this.pointName = pointName;
	}

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	public String getStory() {
		return this.story;
	}
	public void setStory(String story) {
		this.story = story;
	}

}
