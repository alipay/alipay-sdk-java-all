package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * NFC碰一下车辆状态数据同步
 *
 * @author auto create
 * @since 1.0, 2025-03-06 14:10:25
 */
public class AlipaySecurityProdNfcdkCarSyncModel extends AlipayObject {

	private static final long serialVersionUID = 3776267496898915694L;

	/**
	 * 车辆状态数据
	 */
	@ApiField("car_info")
	private String carInfo;

	/**
	 * 数据同步时间
	 */
	@ApiField("time_stamp")
	private String timeStamp;

	/**
	 * 中控设备唯一标识
	 */
	@ApiField("tuid")
	private String tuid;

	public String getCarInfo() {
		return this.carInfo;
	}
	public void setCarInfo(String carInfo) {
		this.carInfo = carInfo;
	}

	public String getTimeStamp() {
		return this.timeStamp;
	}
	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}

	public String getTuid() {
		return this.tuid;
	}
	public void setTuid(String tuid) {
		this.tuid = tuid;
	}

}
