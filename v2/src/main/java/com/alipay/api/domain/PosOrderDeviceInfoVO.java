package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * isv回流pos订单设备激活信息
 *
 * @author auto create
 * @since 1.0, 2018-03-08 10:35:41
 */
public class PosOrderDeviceInfoVO extends AlipayObject {

	private static final long serialVersionUID = 2155799284184138316L;

	/**
	 * 对应单个设备的金额，单位元，精确到小数点后两位
	 */
	@ApiField("device_amt")
	private String deviceAmt;

	/**
	 * pos机设备当前的状态值，枚举值为：已出厂(1)，已入仓(2)，已出售(3)，已报单(4)，已发货(5)，已收货(6)，已激活(7)、已绑定(8)、运行中(9)、设备失联(10)、已解绑(11)
	 */
	@ApiField("device_status")
	private String deviceStatus;

	/**
	 * pos机设备类型，枚举值为: 旗舰(FLAG_SHIP),高端(HIGH_END),标准(STANDARD),手持(IN_HAND)
	 */
	@ApiField("device_type")
	private String deviceType;

	/**
	 * pos机设备型号，如荣焱P10CC、商米D1、荣焱P10S、商米P1、荣焱HD01、商米V1、商米M1、荣焱P8K、商米T1、商米T2lite、荣焱P8G、商米T1、商米T2Lite等
	 */
	@ApiField("device_version")
	private String deviceVersion;

	/**
	 * pos机对应服务的实施状态，目前只对应安装服务,该字段只对带有安装服务的设备有效，枚举值包括：安装完成(FINISHED),未完成安装(UNFINISHED),
	 */
	@ApiField("implement_status")
	private String implementStatus;

	/**
	 * pos机对应的服务状态，目前只包括安装服务，枚举值为：购买了安装服务(INSTALL),没有购买安装服务(NO_INSTALL)
	 */
	@ApiField("service_status")
	private String serviceStatus;

	/**
	 * 口碑门店id，激活设备才有口碑门店id
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 设备id，唯一标识设备的ID,SN号
	 */
	@ApiField("sn_no")
	private String snNo;

	/**
	 * pos机对应仓id：出厂仓的id
	 */
	@ApiField("warehouse_id")
	private String warehouseId;

	/**
	 * 设备对应仓类型，枚举值为: isv仓(ISV),硬件仓(HARD_WARD)
	 */
	@ApiField("warehouse_type")
	private String warehouseType;

	public String getDeviceAmt() {
		return this.deviceAmt;
	}
	public void setDeviceAmt(String deviceAmt) {
		this.deviceAmt = deviceAmt;
	}

	public String getDeviceStatus() {
		return this.deviceStatus;
	}
	public void setDeviceStatus(String deviceStatus) {
		this.deviceStatus = deviceStatus;
	}

	public String getDeviceType() {
		return this.deviceType;
	}
	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}

	public String getDeviceVersion() {
		return this.deviceVersion;
	}
	public void setDeviceVersion(String deviceVersion) {
		this.deviceVersion = deviceVersion;
	}

	public String getImplementStatus() {
		return this.implementStatus;
	}
	public void setImplementStatus(String implementStatus) {
		this.implementStatus = implementStatus;
	}

	public String getServiceStatus() {
		return this.serviceStatus;
	}
	public void setServiceStatus(String serviceStatus) {
		this.serviceStatus = serviceStatus;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getSnNo() {
		return this.snNo;
	}
	public void setSnNo(String snNo) {
		this.snNo = snNo;
	}

	public String getWarehouseId() {
		return this.warehouseId;
	}
	public void setWarehouseId(String warehouseId) {
		this.warehouseId = warehouseId;
	}

	public String getWarehouseType() {
		return this.warehouseType;
	}
	public void setWarehouseType(String warehouseType) {
		this.warehouseType = warehouseType;
	}

}
