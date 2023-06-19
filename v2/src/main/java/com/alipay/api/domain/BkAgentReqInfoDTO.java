package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 间联交易下，由收单机构上送的信息
 *
 * @author auto create
 * @since 1.0, 2023-03-06 17:54:02
 */
public class BkAgentReqInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 6694328711413157471L;

	/**
	 * 收单机构在清算组织登记或分配的机构代码
	 */
	@ApiField("acq_code")
	private String acqCode;

	/**
	 * 终端设备类型，受理方可参考终端
注册时的设备类型填写，取值如下:
01:自动柜员机(含 ATM 和 CDM)
和多媒体自助终端

02:传统 POS
03:mPOS
04:智能 POS
05:II 型固定电话
06:云闪付终端;
07:保留使用;
08:手机 POS;
09:刷脸付终端;
10:条码支付受理终端;
11:条码支付辅助受理终端;
12:行业终端(公交、地铁用于指
定行业的终端);
13:MIS 终端;
	 */
	@ApiField("device_type")
	private String deviceType;

	/**
	 * 终端类型填写为 02、
03、04、05、06、08、09 或 10 时，必
须填写终端序列号
	 */
	@ApiField("location")
	private String location;

	/**
	 * 收单机构在清算组织登记的商户编码
	 */
	@ApiField("merch_code")
	private String merchCode;

	/**
	 * 商户传入的交易税费。需要落地风控使用
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
