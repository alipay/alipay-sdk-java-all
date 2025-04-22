package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * NFC服务机上位机设备与NFC模块解除绑定
 *
 * @author auto create
 * @since 1.0, 2024-07-03 19:44:04
 */
public class AlipayCommerceCityfacilitatorIotbspFwjnfcUnbindModel extends AlipayObject {

	private static final long serialVersionUID = 1255415132165774514L;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 商户PID
	 */
	@ApiField("pid")
	private String pid;

	/**
	 * 上位机SN，具体取值为服务商设备唯一标识
	 */
	@ApiField("upper_sn")
	private String upperSn;

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getPid() {
		return this.pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getUpperSn() {
		return this.upperSn;
	}
	public void setUpperSn(String upperSn) {
		this.upperSn = upperSn;
	}

}
