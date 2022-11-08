package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 标签值分布信息
 *
 * @author auto create
 * @since 1.0, 2022-05-18 15:35:30
 */
public class TagDistDTO extends AlipayObject {

	private static final long serialVersionUID = 5296547227632519455L;

	/**
	 * 时间格式+不唯一
	 */
	@ApiField("date_format")
	private String dateFormat;

	/**
	 * 展示名称+不唯一
	 */
	@ApiField("display_name")
	private String displayName;

	/**
	 * 最大值+不唯一
	 */
	@ApiField("max")
	private String max;

	/**
	 * 最小值+不唯一
	 */
	@ApiField("mix")
	private String mix;

	/**
	 * 展示值+不唯一
	 */
	@ApiField("value")
	private String value;

	public String getDateFormat() {
		return this.dateFormat;
	}
	public void setDateFormat(String dateFormat) {
		this.dateFormat = dateFormat;
	}

	public String getDisplayName() {
		return this.displayName;
	}
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public String getMax() {
		return this.max;
	}
	public void setMax(String max) {
		this.max = max;
	}

	public String getMix() {
		return this.mix;
	}
	public void setMix(String mix) {
		this.mix = mix;
	}

	public String getValue() {
		return this.value;
	}
	public void setValue(String value) {
		this.value = value;
	}

}
