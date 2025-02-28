package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 充电桩状态同步
 *
 * @author auto create
 * @since 1.0, 2024-06-03 14:14:27
 */
public class AlipayCommerceTransportChargerPrivatestatusSyncModel extends AlipayObject {

	private static final long serialVersionUID = 7742321933547387967L;

	/**
	 * 设备ID
	 */
	@ApiField("equip_id")
	private String equipId;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 商家用户ID
	 */
	@ApiField("operator_uid")
	private String operatorUid;

	/**
	 * 设备状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 同步时间戳
	 */
	@ApiField("sync_timestamp")
	private String syncTimestamp;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getEquipId() {
		return this.equipId;
	}
	public void setEquipId(String equipId) {
		this.equipId = equipId;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOperatorUid() {
		return this.operatorUid;
	}
	public void setOperatorUid(String operatorUid) {
		this.operatorUid = operatorUid;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getSyncTimestamp() {
		return this.syncTimestamp;
	}
	public void setSyncTimestamp(String syncTimestamp) {
		this.syncTimestamp = syncTimestamp;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
