package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 车辆模块信息
 *
 * @author auto create
 * @since 1.0, 2020-11-03 17:03:25
 */
public class VehicleModuleInfo extends AlipayObject {

	private static final long serialVersionUID = 1675713639944187948L;

	/**
	 * 车辆状态信息描述
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 车辆控制模块
	 */
	@ApiField("function")
	private String function;

	/**
	 * 车辆模块状态
	 */
	@ApiField("status")
	private String status;

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getFunction() {
		return this.function;
	}
	public void setFunction(String function) {
		this.function = function;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
