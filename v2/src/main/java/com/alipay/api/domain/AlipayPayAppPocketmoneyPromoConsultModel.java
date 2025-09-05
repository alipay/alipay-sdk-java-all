package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 儿童手表厂商触发
 *
 * @author auto create
 * @since 1.0, 2025-04-09 21:32:53
 */
public class AlipayPayAppPocketmoneyPromoConsultModel extends AlipayObject {

	private static final long serialVersionUID = 2328528234193219777L;

	/**
	 * 奖品流水单号，由外部厂商提供，查询时支付宝负责找到对应奖品
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 活动业务场景
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 运动步数（单位步）、跳绳数（单位次）等
	 */
	@ApiField("biz_value")
	private String bizValue;

	/**
	 * 设备号，openWatchId，rtos设备可不传
	 */
	@ApiField("device_id")
	private String deviceId;

	/**
	 * 兼容设备号，openId
	 */
	@ApiField("extra_device_id")
	private String extraDeviceId;

	/**
	 * 操作系统，android，rtos
	 */
	@ApiField("os_type")
	private String osType;

	/**
	 * true-可以发红包奖品，false-跳过红包奖品 (设备历史已发放)
	 */
	@ApiField("red_packet_flag")
	private Boolean redPacketFlag;

	/**
	 * 厂商名称
	 */
	@ApiField("solution_vendor")
	private String solutionVendor;

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getBizValue() {
		return this.bizValue;
	}
	public void setBizValue(String bizValue) {
		this.bizValue = bizValue;
	}

	public String getDeviceId() {
		return this.deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getExtraDeviceId() {
		return this.extraDeviceId;
	}
	public void setExtraDeviceId(String extraDeviceId) {
		this.extraDeviceId = extraDeviceId;
	}

	public String getOsType() {
		return this.osType;
	}
	public void setOsType(String osType) {
		this.osType = osType;
	}

	public Boolean getRedPacketFlag() {
		return this.redPacketFlag;
	}
	public void setRedPacketFlag(Boolean redPacketFlag) {
		this.redPacketFlag = redPacketFlag;
	}

	public String getSolutionVendor() {
		return this.solutionVendor;
	}
	public void setSolutionVendor(String solutionVendor) {
		this.solutionVendor = solutionVendor;
	}

}
