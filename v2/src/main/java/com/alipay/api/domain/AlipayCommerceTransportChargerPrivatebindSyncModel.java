package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 充电桩绑定信息同步
 *
 * @author auto create
 * @since 1.0, 2024-12-04 16:06:58
 */
public class AlipayCommerceTransportChargerPrivatebindSyncModel extends AlipayObject {

	private static final long serialVersionUID = 1218873889761458127L;

	/**
	 * true: 绑定，false：解绑
	 */
	@ApiField("bind_status")
	private Boolean bindStatus;

	/**
	 * 设备信息
	 */
	@ApiField("equipment_info")
	private PrivateChargingEquipment equipmentInfo;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 操作时间
	 */
	@ApiField("operate_time")
	private Date operateTime;

	/**
	 * 商家用户ID
	 */
	@ApiField("operator_uid")
	private String operatorUid;

	/**
	 * 用户手机号码，该绑定方式需联系业务配置，仅针对部分场景。
	 */
	@ApiField("phone_num")
	private String phoneNum;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public Boolean getBindStatus() {
		return this.bindStatus;
	}
	public void setBindStatus(Boolean bindStatus) {
		this.bindStatus = bindStatus;
	}

	public PrivateChargingEquipment getEquipmentInfo() {
		return this.equipmentInfo;
	}
	public void setEquipmentInfo(PrivateChargingEquipment equipmentInfo) {
		this.equipmentInfo = equipmentInfo;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public Date getOperateTime() {
		return this.operateTime;
	}
	public void setOperateTime(Date operateTime) {
		this.operateTime = operateTime;
	}

	public String getOperatorUid() {
		return this.operatorUid;
	}
	public void setOperatorUid(String operatorUid) {
		this.operatorUid = operatorUid;
	}

	public String getPhoneNum() {
		return this.phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
