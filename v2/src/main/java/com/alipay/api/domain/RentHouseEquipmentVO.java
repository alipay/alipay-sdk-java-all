package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * C2C租房智能体合同房屋设备模型
 *
 * @author auto create
 * @since 1.0, 2024-10-23 19:47:50
 */
public class RentHouseEquipmentVO extends AlipayObject {

	private static final long serialVersionUID = 1382685431462521393L;

	/**
	 * 是否自定义
	 */
	@ApiField("customize")
	private Boolean customize;

	/**
	 * 房屋家具名称
	 */
	@ApiField("equipment")
	private String equipment;

	/**
	 * 数量（单位：个）
	 */
	@ApiField("size")
	private Long size;

	public Boolean getCustomize() {
		return this.customize;
	}
	public void setCustomize(Boolean customize) {
		this.customize = customize;
	}

	public String getEquipment() {
		return this.equipment;
	}
	public void setEquipment(String equipment) {
		this.equipment = equipment;
	}

	public Long getSize() {
		return this.size;
	}
	public void setSize(Long size) {
		this.size = size;
	}

}
