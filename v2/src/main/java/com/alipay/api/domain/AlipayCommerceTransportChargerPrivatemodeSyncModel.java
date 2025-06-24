package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 充电桩模式同步
 *
 * @author auto create
 * @since 1.0, 2024-06-19 16:31:52
 */
public class AlipayCommerceTransportChargerPrivatemodeSyncModel extends AlipayObject {

	private static final long serialVersionUID = 8871296712615432818L;

	/**
	 * 设备编号
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
	 * 模式设置
	 */
	@ApiField("setting")
	private PrivateChargingSetting setting;

	/**
	 * 同步时间戳
	 */
	@ApiField("sync_timestamp")
	private Date syncTimestamp;

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

	public PrivateChargingSetting getSetting() {
		return this.setting;
	}
	public void setSetting(PrivateChargingSetting setting) {
		this.setting = setting;
	}

	public Date getSyncTimestamp() {
		return this.syncTimestamp;
	}
	public void setSyncTimestamp(Date syncTimestamp) {
		this.syncTimestamp = syncTimestamp;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
