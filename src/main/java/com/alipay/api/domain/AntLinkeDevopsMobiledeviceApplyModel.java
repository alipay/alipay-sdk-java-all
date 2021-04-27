package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 云测平台虚拟设备租用接口
 *
 * @author auto create
 * @since 1.0, 2021-01-11 13:38:58
 */
public class AntLinkeDevopsMobiledeviceApplyModel extends AlipayObject {

	private static final long serialVersionUID = 1717453498962396951L;

	/**
	 * device_id+唯一+如果包含则用来校验设备对应的信息+之前调用返回结果
	 */
	@ApiField("device_id")
	private String deviceId;

	/**
	 * model+唯一+指定使用的产品类型+2c4g/4c8g+显示指定+需要使用的产品类型,如果不指定则随机返回,2c4g优先
	 */
	@ApiField("model")
	private String model;

	/**
	 * region+唯一+设备需要匹配的机房+参数
	 */
	@ApiField("region")
	private String region;

	/**
	 * take_time+唯一+指定租用时长+显示指定+非必选+默认值120分钟
	 */
	@ApiField("take_time")
	private Long takeTime;

	public String getDeviceId() {
		return this.deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getModel() {
		return this.model;
	}
	public void setModel(String model) {
		this.model = model;
	}

	public String getRegion() {
		return this.region;
	}
	public void setRegion(String region) {
		this.region = region;
	}

	public Long getTakeTime() {
		return this.takeTime;
	}
	public void setTakeTime(Long takeTime) {
		this.takeTime = takeTime;
	}

}
