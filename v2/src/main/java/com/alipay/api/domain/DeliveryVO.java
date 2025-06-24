package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 配送范围查询返回对象
 *
 * @author auto create
 * @since 1.0, 2025-03-19 16:22:33
 */
public class DeliveryVO extends AlipayObject {

	private static final long serialVersionUID = 3763652744769243316L;

	/**
	 * App配送范围code
	 */
	@ApiField("app_delivery_code")
	private String appDeliveryCode;

	/**
	 * 配送范围坐标点
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
	private String deliveryRadius;

	/**
	 * 配送生效范围
	 */
	@ApiField("delivery_time")
	private EffectivePeriodDTO deliveryTime;

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
	 * 来源系统(OPENAPI-接口创建；SAAS-商家端)
	 */
	@ApiField("source_system")
	private String sourceSystem;

	/**
	 * 起送价，单位：元
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
	 * 时段加价规则启用状态
	 */
	@ApiField("time_markup_state")
	private Long timeMarkupState;

	/**
	 * 时段名称
	 */
	@ApiField("times_name")
	private String timesName;

	/**
	 * 1:常规时段，只能1个，默认00:00~24:00；2:特殊时段，可以多个，特殊时段间不能有重合
	 */
	@ApiField("times_type")
	private Long timesType;

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

	public String getDeliveryRadius() {
		return this.deliveryRadius;
	}
	public void setDeliveryRadius(String deliveryRadius) {
		this.deliveryRadius = deliveryRadius;
	}

	public EffectivePeriodDTO getDeliveryTime() {
		return this.deliveryTime;
	}
	public void setDeliveryTime(EffectivePeriodDTO deliveryTime) {
		this.deliveryTime = deliveryTime;
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

	public String getSourceSystem() {
		return this.sourceSystem;
	}
	public void setSourceSystem(String sourceSystem) {
		this.sourceSystem = sourceSystem;
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

	public Long getTimesType() {
		return this.timesType;
	}
	public void setTimesType(Long timesType) {
		this.timesType = timesType;
	}

}
