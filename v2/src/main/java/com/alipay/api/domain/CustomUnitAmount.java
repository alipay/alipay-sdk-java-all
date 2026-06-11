package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * saas自定义单价，用于灵活定价业务场景
 *
 * @author auto create
 * @since 1.0, 2026-06-02 20:51:08
 */
public class CustomUnitAmount extends AlipayObject {

	private static final long serialVersionUID = 3599422917226528487L;

	/**
	 * 是否启用灵活定价，启用后可设置 preset、maximum、minimum 字段
	 */
	@ApiField("enable")
	private Boolean enable;

	/**
	 * 可自定义的最大金额（单位：分），灵活定价开启后可设置
	 */
	@ApiField("maximum")
	private Long maximum;

	/**
	 * 可自定义的最小金额（单位：分），灵活定价开启后可设置
	 */
	@ApiField("minimum")
	private Long minimum;

	/**
	 * 预设的自定义价格（单位：分），灵活定价开启后可设置
	 */
	@ApiField("preset")
	private Long preset;

	public Boolean getEnable() {
		return this.enable;
	}
	public void setEnable(Boolean enable) {
		this.enable = enable;
	}

	public Long getMaximum() {
		return this.maximum;
	}
	public void setMaximum(Long maximum) {
		this.maximum = maximum;
	}

	public Long getMinimum() {
		return this.minimum;
	}
	public void setMinimum(Long minimum) {
		this.minimum = minimum;
	}

	public Long getPreset() {
		return this.preset;
	}
	public void setPreset(Long preset) {
		this.preset = preset;
	}

}
