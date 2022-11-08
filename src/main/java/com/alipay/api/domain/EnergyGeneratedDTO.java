package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 能量信息详细
 *
 * @author auto create
 * @since 1.0, 2022-01-07 15:36:27
 */
public class EnergyGeneratedDTO extends AlipayObject {

	private static final long serialVersionUID = 4834859723992763165L;

	/**
	 * 能量g数
	 */
	@ApiField("energy")
	private Long energy;

	/**
	 * 环保类型
	 */
	@ApiField("key")
	private String key;

	public Long getEnergy() {
		return this.energy;
	}
	public void setEnergy(Long energy) {
		this.energy = energy;
	}

	public String getKey() {
		return this.key;
	}
	public void setKey(String key) {
		this.key = key;
	}

}
