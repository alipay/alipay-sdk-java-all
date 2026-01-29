package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 易联云打印机状态回调对外接口服务
 *
 * @author auto create
 * @since 1.0, 2019-09-06 17:57:59
 */
public class AlipayEcoPrinterStatusNotifyModel extends AlipayObject {

	private static final long serialVersionUID = 4156868769957956195L;

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
	 * 授权类型：0=自有应用授权；1=开放应用授权
	 */
	@ApiField("oauth_type")
	private Long oauthType;

	/**
	 * 打印机终端状态 1=在线 2=缺纸 0=离线
	 */
	@ApiField("online")
	private Long online;

	/**
	 * 回调时间
	 */
	@ApiField("push_time")
	private String pushTime;

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

	public Long getOnline() {
		return this.online;
	}
	public void setOnline(Long online) {
		this.online = online;
	}

	public String getPushTime() {
		return this.pushTime;
	}
	public void setPushTime(String pushTime) {
		this.pushTime = pushTime;
	}

}
