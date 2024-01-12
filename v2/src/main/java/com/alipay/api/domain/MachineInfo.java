package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 租赁设备信息
 *
 * @author auto create
 * @since 1.0, 2018-03-16 13:48:06
 */
public class MachineInfo extends AlipayObject {

	private static final long serialVersionUID = 1519548271978319135L;

	/**
	 * 设备数量
	 */
	@ApiField("machine_count")
	private Long machineCount;

	/**
	 * 设备型号
	 */
	@ApiField("machine_model")
	private String machineModel;

	/**
	 * 设备类型，由商户定义
	 */
	@ApiField("machine_type")
	private String machineType;

	public Long getMachineCount() {
		return this.machineCount;
	}
	public void setMachineCount(Long machineCount) {
		this.machineCount = machineCount;
	}

	public String getMachineModel() {
		return this.machineModel;
	}
	public void setMachineModel(String machineModel) {
		this.machineModel = machineModel;
	}

	public String getMachineType() {
		return this.machineType;
	}
	public void setMachineType(String machineType) {
		this.machineType = machineType;
	}

}
