package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 配送范围详细信息
 *
 * @author auto create
 * @since 1.0, 2025-06-19 19:03:02
 */
public class Delivery extends AlipayObject {

	private static final long serialVersionUID = 2129479472382326621L;

	/**
	 * App配送范围code
	 */
	@ApiField("app_delivery_code")
	private String appDeliveryCode;

	/**
	 * 配送范围坐标集合
	 */
	@ApiListField("delivery_point_list")
	@ApiField("delivery_point")
	private List<DeliveryPoint> deliveryPointList;

	/**
	 * 该配送区域的配送费，单位：元。
	 */
	@ApiField("delivery_price")
	private String deliveryPrice;

	/**
	 * 配送半径，单位：米
	 */
	@ApiField("delivery_radius")
	private Long deliveryRadius;

	/**
	 * 距离加价规则
	 */
	@ApiListField("distance_markup_rule_list")
	@ApiField("distance_markup_rule_d_t_o")
	private List<DistanceMarkupRuleDTO> distanceMarkupRuleList;

	/**
	 * 按距离加价规则启用状态（0-停用，1-启用）
	 */
	@ApiField("distance_markup_state")
	private Long distanceMarkupState;

	/**
	 * 该配送区域的配送费，单位：元。
	 */
	@ApiField("start_price")
	private String startPrice;

	/**
	 * 时段加价规则
	 */
	@ApiListField("time_markup_rule_list")
	@ApiField("time_markup_rule_d_t_o")
	private List<TimeMarkupRuleDTO> timeMarkupRuleList;

	/**
	 * 按时段加价规则启用状态（0-停用，1-启用）
	 */
	@ApiField("time_markup_state")
	private Long timeMarkupState;

	/**
	 * 时段名称
	 */
	@ApiField("times_name")
	private String timesName;

	public String getAppDeliveryCode() {
		return this.appDeliveryCode;
	}
	public void setAppDeliveryCode(String appDeliveryCode) {
		this.appDeliveryCode = appDeliveryCode;
	}

	public List<DeliveryPoint> getDeliveryPointList() {
		return this.deliveryPointList;
	}
	public void setDeliveryPointList(List<DeliveryPoint> deliveryPointList) {
		this.deliveryPointList = deliveryPointList;
	}

	public String getDeliveryPrice() {
		return this.deliveryPrice;
	}
	public void setDeliveryPrice(String deliveryPrice) {
		this.deliveryPrice = deliveryPrice;
	}

	public Long getDeliveryRadius() {
		return this.deliveryRadius;
	}
	public void setDeliveryRadius(Long deliveryRadius) {
		this.deliveryRadius = deliveryRadius;
	}

	public List<DistanceMarkupRuleDTO> getDistanceMarkupRuleList() {
		return this.distanceMarkupRuleList;
	}
	public void setDistanceMarkupRuleList(List<DistanceMarkupRuleDTO> distanceMarkupRuleList) {
		this.distanceMarkupRuleList = distanceMarkupRuleList;
	}

	public Long getDistanceMarkupState() {
		return this.distanceMarkupState;
	}
	public void setDistanceMarkupState(Long distanceMarkupState) {
		this.distanceMarkupState = distanceMarkupState;
	}

	public String getStartPrice() {
		return this.startPrice;
	}
	public void setStartPrice(String startPrice) {
		this.startPrice = startPrice;
	}

	public List<TimeMarkupRuleDTO> getTimeMarkupRuleList() {
		return this.timeMarkupRuleList;
	}
	public void setTimeMarkupRuleList(List<TimeMarkupRuleDTO> timeMarkupRuleList) {
		this.timeMarkupRuleList = timeMarkupRuleList;
	}

	public Long getTimeMarkupState() {
		return this.timeMarkupState;
	}
	public void setTimeMarkupState(Long timeMarkupState) {
		this.timeMarkupState = timeMarkupState;
	}

	public String getTimesName() {
		return this.timesName;
	}
	public void setTimesName(String timesName) {
		this.timesName = timesName;
	}

}
