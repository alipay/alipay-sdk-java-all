package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 健身记录周统计数据
 *
 * @author auto create
 * @since 1.0, 2019-01-03 14:15:15
 */
public class ExerciseWeeklyStatisticOpenModel extends AlipayObject {

	private static final long serialVersionUID = 6315259345433575436L;

	/**
	 * 统计数据类型：DURATION(累计运动时长),WIN(打败本店用户百分比)
	 */
	@ApiField("type")
	private String type;

	/**
	 * 统计数据值：累计运动时长（单位：秒）
	 */
	@ApiField("value")
	private String value;

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getValue() {
		return this.value;
	}
	public void setValue(String value) {
		this.value = value;
	}

}
