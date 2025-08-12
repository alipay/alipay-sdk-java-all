package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * etc设备命令下发
 *
 * @author auto create
 * @since 1.0, 2025-06-12 15:45:15
 */
public class AlipayCommerceTransportEtcCommandSendModel extends AlipayObject {

	private static final long serialVersionUID = 7858859568814285493L;

	/**
	 * 业务发生时间；对应etc_switch_status的不同状态，当etc_switch_status=OPEN，为设备开启时间，etc_switch_status=CLOSE为设备关闭时间
	 */
	@ApiField("biz_time")
	private String bizTime;

	/**
	 * 阐明本次指令下发原因
	 */
	@ApiField("command_reason")
	private String commandReason;

	/**
	 * 支付宝企业id
	 */
	@ApiField("corp_id")
	private String corpId;

	/**
	 * ETC设备开关状态
	 */
	@ApiField("etc_switch_status")
	private String etcSwitchStatus;

	/**
	 * 车牌颜色
	 */
	@ApiField("plate_color")
	private String plateColor;

	/**
	 * 车牌号码
	 */
	@ApiField("plate_no")
	private String plateNo;

	public String getBizTime() {
		return this.bizTime;
	}
	public void setBizTime(String bizTime) {
		this.bizTime = bizTime;
	}

	public String getCommandReason() {
		return this.commandReason;
	}
	public void setCommandReason(String commandReason) {
		this.commandReason = commandReason;
	}

	public String getCorpId() {
		return this.corpId;
	}
	public void setCorpId(String corpId) {
		this.corpId = corpId;
	}

	public String getEtcSwitchStatus() {
		return this.etcSwitchStatus;
	}
	public void setEtcSwitchStatus(String etcSwitchStatus) {
		this.etcSwitchStatus = etcSwitchStatus;
	}

	public String getPlateColor() {
		return this.plateColor;
	}
	public void setPlateColor(String plateColor) {
		this.plateColor = plateColor;
	}

	public String getPlateNo() {
		return this.plateNo;
	}
	public void setPlateNo(String plateNo) {
		this.plateNo = plateNo;
	}

}
