package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 视觉货柜机型信息
 *
 * @author auto create
 * @since 1.0, 2019-01-04 11:55:03
 */
public class MachineType extends AlipayObject {

	private static final long serialVersionUID = 6333589827698532141L;

	/**
	 * 视觉货柜机型ID
	 */
	@ApiField("machine_type_id")
	private String machineTypeId;

	/**
	 * 机型信息备注说明
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * 机型状态 (1:生效，0:下线)
	 */
	@ApiField("status")
	private Long status;

	public String getMachineTypeId() {
		return this.machineTypeId;
	}
	public void setMachineTypeId(String machineTypeId) {
		this.machineTypeId = machineTypeId;
	}

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Long getStatus() {
		return this.status;
	}
	public void setStatus(Long status) {
		this.status = status;
	}

}
