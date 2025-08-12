package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 寝室规则扩展
 *
 * @author auto create
 * @since 1.0, 2025-08-05 17:18:43
 */
public class DormitoryConfig extends AlipayObject {

	private static final long serialVersionUID = 4246318274659885414L;

	/**
	 * 允许重复签到开关，不传默认为关闭重复签到
	 */
	@ApiField("enable_multiple")
	private String enableMultiple;

	/**
	 * 最大重复签到次数，非必传，重复签到开关打开时，不传默认为50。重复签到开关关闭时，传最大重复签到次数不生效
	 */
	@ApiField("max_multiple")
	private Long maxMultiple;

	public String getEnableMultiple() {
		return this.enableMultiple;
	}
	public void setEnableMultiple(String enableMultiple) {
		this.enableMultiple = enableMultiple;
	}

	public Long getMaxMultiple() {
		return this.maxMultiple;
	}
	public void setMaxMultiple(Long maxMultiple) {
		this.maxMultiple = maxMultiple;
	}

}
