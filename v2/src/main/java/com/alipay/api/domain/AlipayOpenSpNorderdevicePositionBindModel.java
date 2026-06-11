package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 设备绑定点位信息
 *
 * @author auto create
 * @since 1.0, 2026-04-23 14:17:45
 */
public class AlipayOpenSpNorderdevicePositionBindModel extends AlipayObject {

	private static final long serialVersionUID = 8727429161541879828L;

	/**
	 * 设备SN号
	 */
	@ApiField("device_sn")
	private String deviceSn;

	/**
	 * 除物料编号外其他支持绑定的物料绑定参数，现支持碰一下链接绑定，都存在时已物料编号为绑定条件
	 */
	@ApiField("ext_param")
	private NOrderTagBindResp extParam;

	/**
	 * 操作类型
	 */
	@ApiField("operate")
	private String operate;

	/**
	 * 安装人员ID
	 */
	@ApiField("operator_id")
	private String operatorId;

	/**
	 * 安装人员姓名
	 */
	@ApiField("operator_name")
	private String operatorName;

	/**
	 * 安装人员手机号，用于身份核实
	 */
	@ApiField("operator_phone")
	private String operatorPhone;

	/**
	 * 安装时间，格式 yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("operator_time")
	private String operatorTime;

	/**
	 * 创建的点位ID
	 */
	@ApiField("position_id")
	private String positionId;

	/**
	 * 安装人员ID
	 */
	@ApiField("user_open_id")
	private String userOpenId;

	public String getDeviceSn() {
		return this.deviceSn;
	}
	public void setDeviceSn(String deviceSn) {
		this.deviceSn = deviceSn;
	}

	public NOrderTagBindResp getExtParam() {
		return this.extParam;
	}
	public void setExtParam(NOrderTagBindResp extParam) {
		this.extParam = extParam;
	}

	public String getOperate() {
		return this.operate;
	}
	public void setOperate(String operate) {
		this.operate = operate;
	}

	public String getOperatorId() {
		return this.operatorId;
	}
	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}

	public String getOperatorName() {
		return this.operatorName;
	}
	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
	}

	public String getOperatorPhone() {
		return this.operatorPhone;
	}
	public void setOperatorPhone(String operatorPhone) {
		this.operatorPhone = operatorPhone;
	}

	public String getOperatorTime() {
		return this.operatorTime;
	}
	public void setOperatorTime(String operatorTime) {
		this.operatorTime = operatorTime;
	}

	public String getPositionId() {
		return this.positionId;
	}
	public void setPositionId(String positionId) {
		this.positionId = positionId;
	}

	public String getUserOpenId() {
		return this.userOpenId;
	}
	public void setUserOpenId(String userOpenId) {
		this.userOpenId = userOpenId;
	}

}
