package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 设备信息参数
 *
 * @author auto create
 * @since 1.0, 2018-07-02 16:17:46
 */
public class DeviceParams extends AlipayObject {

	private static final long serialVersionUID = 4877618771561413359L;

	/**
	 * 设备Id
	 */
	@ApiField("device_id")
	private String deviceId;

	/**
	 * 设备名称
	 */
	@ApiField("device_name")
	private String deviceName;

	/**
	 * 设备类型，目前有四种值：
VR一体机：VR_MACHINE、电视：TV、身份证：ID_CARD、工牌：WORK_CARD
	 */
	@ApiField("device_type")
	private String deviceType;

	/**
	 * 机具中商品的最高价值（单位元，RMB），商户选填字段，目前仅作为数据采集
	 */
	@ApiField("equipment_goods_value")
	private String equipmentGoodsValue;

	/**
	 * 外部设备标识，用户商户端唯一标识设备
	 */
	@ApiField("out_device_id")
	private String outDeviceId;

	public String getDeviceId() {
		return this.deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getDeviceName() {
		return this.deviceName;
	}
	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	public String getDeviceType() {
		return this.deviceType;
	}
	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}

	public String getEquipmentGoodsValue() {
		return this.equipmentGoodsValue;
	}
	public void setEquipmentGoodsValue(String equipmentGoodsValue) {
		this.equipmentGoodsValue = equipmentGoodsValue;
	}

	public String getOutDeviceId() {
		return this.outDeviceId;
	}
	public void setOutDeviceId(String outDeviceId) {
		this.outDeviceId = outDeviceId;
	}

}
