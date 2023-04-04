package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 车辆仪表板识别结果
 *
 * @author auto create
 * @since 1.0, 2019-04-23 16:29:34
 */
public class VehicleDashboardResult extends AlipayObject {

	private static final long serialVersionUID = 4665347925935518155L;

	/**
	 * label每个元素对应的含义
	 */
	@ApiField("class_name")
	private String className;

	/**
	 * 识别的labels
	 */
	@ApiField("label")
	private Long label;

	/**
	 * label每个元素对应的概率
	 */
	@ApiField("score")
	private Long score;

	public String getClassName() {
		return this.className;
	}
	public void setClassName(String className) {
		this.className = className;
	}

	public Long getLabel() {
		return this.label;
	}
	public void setLabel(Long label) {
		this.label = label;
	}

	public Long getScore() {
		return this.score;
	}
	public void setScore(Long score) {
		this.score = score;
	}

}
