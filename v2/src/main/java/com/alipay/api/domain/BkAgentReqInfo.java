package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 间联交易下，由收单机构上送的信息
 *
 * @author auto create
 * @since 1.0, 2024-07-29 17:30:47
 */
public class BkAgentReqInfo extends AlipayObject {

	private static final long serialVersionUID = 1696557388659772536L;

	/**
	 * 收单机构在清算组织登记或分配的机构代码
	 */
	@ApiField("acq_code")
	private String acqCode;

	/**
	 * 终端设备类型，受理方可参考终端注册时的设备类型填写。
	 */
	@ApiField("device_type")
	private String deviceType;

	/**
	 * 终端设备实时经纬度信息，格式为纬度/经度，+表示北纬、东经，-表示南纬、西经。
	 */
	@ApiField("location")
	private String location;

	/**
	 * 收单机构在清算组织登记的商户编码
	 */
	@ApiField("merch_code")
	private String merchCode;

	/**
	 * 终端类型填写为 02、
03、04、05、06、08、09 或 10 时，必
须填写终端序列号。
	 */
	@ApiField("serial_num")
	private String serialNum;

	public String getAcqCode() {
		return this.acqCode;
	}
	public void setAcqCode(String acqCode) {
		this.acqCode = acqCode;
	}

	public String getDeviceType() {
		return this.deviceType;
	}
	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}

	public String getLocation() {
		return this.location;
	}
	public void setLocation(String location) {
		this.location = location;
	}

	public String getMerchCode() {
		return this.merchCode;
	}
	public void setMerchCode(String merchCode) {
		this.merchCode = merchCode;
	}

	public String getSerialNum() {
		return this.serialNum;
	}
	public void setSerialNum(String serialNum) {
		this.serialNum = serialNum;
	}

}
