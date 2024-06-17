package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 线路信息
 *
 * @author auto create
 * @since 1.0, 2020-03-02 16:57:48
 */
public class InputScheduleLine extends AlipayObject {

	private static final long serialVersionUID = 4167761319743918339L;

	/**
	 * 方向，参考方向枚举
	 */
	@ApiField("direction")
	private String direction;

	/**
	 * 拓展参数
	 */
	@ApiField("ext_param")
	private String extParam;

	/**
	 * 线路id
	 */
	@ApiField("line_id")
	private String lineId;

	/**
	 * 聚合时间粒度，单位：分钟
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

	public Long getTimeSpan() {
		return this.timeSpan;
	}
	public void setTimeSpan(Long timeSpan) {
		this.timeSpan = timeSpan;
	}

}
