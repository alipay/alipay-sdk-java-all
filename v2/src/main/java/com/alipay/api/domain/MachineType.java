package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 视觉货柜机型信息
 *
 * @author auto create
 * @since 1.0, 2019-06-20 15:29:11
 */
public class MachineType extends AlipayObject {

	private static final long serialVersionUID = 5853547997259349696L;

	/**
	 * 柜内各层基础参数，json串
	 */
	@ApiField("attribute")
	private String attribute;

	/**
	 * 货柜层数
	 */
	@ApiField("floor_num")
	private Long floorNum;

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

	/**
	 * 类型(0:商品库机型, 1:摆放模板机型)
	 */
	@ApiField("type")
	private Long type;

	public String getAttribute() {
		return this.attribute;
	}
	public void setAttribute(String attribute) {
		this.attribute = attribute;
	}

	public Long getFloorNum() {
		return this.floorNum;
	}
	public void setFloorNum(Long floorNum) {
		this.floorNum = floorNum;
	}

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

	public Long getType() {
		return this.type;
	}
	public void setType(Long type) {
		this.type = type;
	}

}
