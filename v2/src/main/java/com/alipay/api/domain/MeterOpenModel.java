package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 计量信息模型
 *
 * @author auto create
 * @since 1.0, 2019-01-03 10:33:00
 */
public class MeterOpenModel extends AlipayObject {

	private static final long serialVersionUID = 4723865428498933732L;

	/**
	 * 平均速度，数字字符串，保留1位小数。type=AVG_SPEED_KM_PER_HOUR时必填
	 */
	@ApiField("avg_speed")
	private String avgSpeed;

	/**
	 * 项目消耗的卡路里，单位：kcal 。type=CALORIE时必填
	 */
	@ApiField("calorie")
	private Long calorie;

	/**
	 * 距离，单位：米。type=DISTANCE时必填
	 */
	@ApiField("distance")
	private Long distance;

	/**
	 * 时长，单位秒。type=DURATION时必填
	 */
	@ApiField("duration")
	private Long duration;

	/**
	 * 每组次数。type=COUNT时必填
	 */
	@ApiField("rep")
	private Long rep;

	/**
	 * 组数。type=COUNT时必填
	 */
	@ApiField("set")
	private Long set;

	/**
	 * 计量单位类型.枚举：数量(COUNT),时长(DURATION),距离(DISTANCE),平均速度_千米每小时(AVG_SPEED_KM_PER_HOUR)
	 */
	@ApiField("type")
	private String type;

	public String getAvgSpeed() {
		return this.avgSpeed;
	}
	public void setAvgSpeed(String avgSpeed) {
		this.avgSpeed = avgSpeed;
	}

	public Long getCalorie() {
		return this.calorie;
	}
	public void setCalorie(Long calorie) {
		this.calorie = calorie;
	}

	public Long getDistance() {
		return this.distance;
	}
	public void setDistance(Long distance) {
		this.distance = distance;
	}

	public Long getDuration() {
		return this.duration;
	}
	public void setDuration(Long duration) {
		this.duration = duration;
	}

	public Long getRep() {
		return this.rep;
	}
	public void setRep(Long rep) {
		this.rep = rep;
	}

	public Long getSet() {
		return this.set;
	}
	public void setSet(Long set) {
		this.set = set;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
