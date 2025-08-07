package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 返回值模型
 *
 * @author auto create
 * @since 1.0, 2023-10-31 17:12:41
 */
public class HoloInsightDataResultValue extends AlipayObject {

	private static final long serialVersionUID = 2645964626624282762L;

	/**
	 * 数据对应的时间戳
	 */
	@ApiField("period")
	private Long period;

	/**
	 * 指标值
	 */
	@ApiField("value")
	private String value;

	public Long getPeriod() {
		return this.period;
	}
	public void setPeriod(Long period) {
		this.period = period;
	}

	public String getValue() {
		return this.value;
	}
	public void setValue(String value) {
		this.value = value;
	}

}
