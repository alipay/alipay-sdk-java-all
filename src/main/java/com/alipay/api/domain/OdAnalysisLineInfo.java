package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 大出行智能平台-客流分析任务-线路信息
 *
 * @author auto create
 * @since 1.0, 2020-09-04 15:20:02
 */
public class OdAnalysisLineInfo extends AlipayObject {

	private static final long serialVersionUID = 8285393216919724329L;

	/**
	 * 线路方向（UP-上行，DOWN-下行）
	 */
	@ApiField("direction")
	private String direction;

	/**
	 * 扩展参数，json格式，由双方约定取值
	 */
	@ApiField("ext_param")
	private String extParam;

	/**
	 * 线路ID，同一条线路的不同方向该值不同
	 */
	@ApiField("line_id")
	private String lineId;

	/**
	 * 线路Key，同一条线路的不同方向该值相同
	 */
	@ApiField("line_key")
	private String lineKey;

	/**
	 * 聚合时间粒度，单位：分钟，只支持30/60
	 */
	@ApiField("time_span")
	private Long timeSpan;

	public String getDirection() {
		return this.direction;
	}
	public void setDirection(String direction) {
		this.direction = direction;
	}

	public String getExtParam() {
		return this.extParam;
	}
	public void setExtParam(String extParam) {
		this.extParam = extParam;
	}

	public String getLineId() {
		return this.lineId;
	}
	public void setLineId(String lineId) {
		this.lineId = lineId;
	}

	public String getLineKey() {
		return this.lineKey;
	}
	public void setLineKey(String lineKey) {
		this.lineKey = lineKey;
	}

	public Long getTimeSpan() {
		return this.timeSpan;
	}
	public void setTimeSpan(Long timeSpan) {
		this.timeSpan = timeSpan;
	}

}
