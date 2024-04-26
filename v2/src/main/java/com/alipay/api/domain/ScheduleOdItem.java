package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 排班调度客流结果详细
 *
 * @author auto create
 * @since 1.0, 2020-03-02 16:20:07
 */
public class ScheduleOdItem extends AlipayObject {

	private static final long serialVersionUID = 6178362793512283863L;

	/**
	 * 客流聚类结果分段（通常为1~6）
	 */
	@ApiField("cluster_class")
	private String clusterClass;

	/**
	 * 线路方向枚举   0：上行  1 下行
	 */
	@ApiField("direction")
	private String direction;

	/**
	 * 日均下车人数
	 */
	@ApiField("end_load")
	private String endLoad;

	/**
	 * 下车人数比例
	 */
	@ApiField("end_load_percent")
	private String endLoadPercent;

	/**
	 * 下车站点名称
	 */
	@ApiField("end_name")
	private String endName;

	/**
	 * 下车站点序号
	 */
	@ApiField("end_num")
	private Long endNum;

	/**
	 * 线路id
	 */
	@ApiField("line_id")
	private String lineId;

	/**
	 * 日均上车人数
	 */
	@ApiField("start_load")
	private String startLoad;

	/**
	 * 杭州东
	 */
	@ApiField("start_name")
	private String startName;

	/**
	 * 上车站点序号
	 */
	@ApiField("start_num")
	private Long startNum;

	/**
	 * 发车时段，若time_span为30，则06:00:00表示06:00:00-06:30:00的时段
	 */
	@ApiField("time_period")
	private String timePeriod;

	public String getClusterClass() {
		return this.clusterClass;
	}
	public void setClusterClass(String clusterClass) {
		this.clusterClass = clusterClass;
	}

	public String getDirection() {
		return this.direction;
	}
	public void setDirection(String direction) {
		this.direction = direction;
	}

	public String getEndLoad() {
		return this.endLoad;
	}
	public void setEndLoad(String endLoad) {
		this.endLoad = endLoad;
	}

	public String getEndLoadPercent() {
		return this.endLoadPercent;
	}
	public void setEndLoadPercent(String endLoadPercent) {
		this.endLoadPercent = endLoadPercent;
	}

	public String getEndName() {
		return this.endName;
	}
	public void setEndName(String endName) {
		this.endName = endName;
	}

	public Long getEndNum() {
		return this.endNum;
	}
	public void setEndNum(Long endNum) {
		this.endNum = endNum;
	}

	public String getLineId() {
		return this.lineId;
	}
	public void setLineId(String lineId) {
		this.lineId = lineId;
	}

	public String getStartLoad() {
		return this.startLoad;
	}
	public void setStartLoad(String startLoad) {
		this.startLoad = startLoad;
	}

	public String getStartName() {
		return this.startName;
	}
	public void setStartName(String startName) {
		this.startName = startName;
	}

	public Long getStartNum() {
		return this.startNum;
	}
	public void setStartNum(Long startNum) {
		this.startNum = startNum;
	}

	public String getTimePeriod() {
		return this.timePeriod;
	}
	public void setTimePeriod(String timePeriod) {
		this.timePeriod = timePeriod;
	}

}
