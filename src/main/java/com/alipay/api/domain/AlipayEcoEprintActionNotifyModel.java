package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 易联云打印按键回调接口
 *
 * @author auto create
 * @since 1.0, 2019-09-06 17:57:30
 */
public class AlipayEcoEprintActionNotifyModel extends AlipayObject {

	private static final long serialVersionUID = 5743579534582893344L;

	/**
	 * 签名
	 */
	@ApiField("eprint_sign")
	private String eprintSign;

	/**
	 * 终端号
	 */
	@ApiField("machine_code")
	private String machineCode;

	/**
	 * 授权类型：0=自有应用授权、1=开放应用授权
	 */
	@ApiField("oauth_type")
	private Long oauthType;

	/**
	 * 云平台订单ID
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 回调时间
	 */
	@ApiField("push_time")
	private String pushTime;

	/**
	 * 按键行为 0=拒单 1=接单
	 */
	@ApiField("state")
	private Long state;

	public String getEprintSign() {
		return this.eprintSign;
	}
	public void setEprintSign(String eprintSign) {
		this.eprintSign = eprintSign;
	}

	public String getMachineCode() {
		return this.machineCode;
	}
	public void setMachineCode(String machineCode) {
		this.machineCode = machineCode;
	}

	public Long getOauthType() {
		return this.oauthType;
	}
	public void setOauthType(Long oauthType) {
		this.oauthType = oauthType;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getPushTime() {
		return this.pushTime;
	}
	public void setPushTime(String pushTime) {
		this.pushTime = pushTime;
	}

	public Long getState() {
		return this.state;
	}
	public void setState(Long state) {
		this.state = state;
	}

}
