package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 描述: 数字车钥匙项目中,当车辆状态发生变化时(比如打开引擎,打开车锁)通过消息通知接口推送给支付宝车主生活-数字钥匙前端小程序,并展示给用户. 使得用户能够了解车辆的状态,作出对应的控车操作. 其中  VehicleMessageInfo 包含VehicleConditionInfo 车况信息(电频,电压,里程)和 VehicleModuleInfo车模组信息(引擎、车门、后备箱)
 *
 * @author auto create
 * @since 1.0, 2020-12-01 10:57:25
 */
public class VehicleMessageInfo extends AlipayObject {

	private static final long serialVersionUID = 1219388846932186547L;

	/**
	 * vehicle_cond_infos 是车况信息列表,包含VehicleConditionInfo子类型(比如电频,电压,里程等信息)
	 */
	@ApiListField("vehicle_cond_infos")
	@ApiField("vehicle_condition_info")
	private List<VehicleConditionInfo> vehicleCondInfos;

	/**
	 * vehicle_module_infos是车辆模组信息列表,包含VehicleModuleInfo子类型(比如引擎、车门、后备箱等信息)
	 */
	@ApiListField("vehicle_module_infos")
	@ApiField("vehicle_module_info")
	private List<VehicleModuleInfo> vehicleModuleInfos;

	public List<VehicleConditionInfo> getVehicleCondInfos() {
		return this.vehicleCondInfos;
	}
	public void setVehicleCondInfos(List<VehicleConditionInfo> vehicleCondInfos) {
		this.vehicleCondInfos = vehicleCondInfos;
	}

	public List<VehicleModuleInfo> getVehicleModuleInfos() {
		return this.vehicleModuleInfos;
	}
	public void setVehicleModuleInfos(List<VehicleModuleInfo> vehicleModuleInfos) {
		this.vehicleModuleInfos = vehicleModuleInfos;
	}

}
