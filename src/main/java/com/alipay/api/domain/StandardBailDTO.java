package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商城保证金DTO
 *
 * @author auto create
 * @since 1.0, 2022-05-07 11:30:41
 */
public class StandardBailDTO extends AlipayObject {

	private static final long serialVersionUID = 1556557487545746441L;

	/**
	 * 保证金剩余可用余额
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 保证金状态。NORMAL——正常，MIGRATED——已迁移
	 */
	@ApiField("bail_status")
	private String bailStatus;

	/**
	 * 保证金主单创建时间，格式YYYY-MM-DD HH:MM:SS
	 */
	@ApiField("gmt_create")
	private String gmtCreate;

	/**
	 * 保证金主单最后修改时间，格式YYYY-MM-DD HH:MM:SS
	 */
	@ApiField("gmt_modified")
	private String gmtModified;

	/**
	 * 迁移信息，仅已迁移的保证金携带。
格式：迁移后的保证金预授权号|流水号
	 */
	@ApiField("migrate_to")
	private String migrateTo;

	/**
	 * 平台uid
	 */
	@ApiField("partner_user_id")
	private String partnerUserId;

	/**
	 * 场景码描述（可能存在多个，用逗号分隔）
	 */
	@ApiField("scene_desc")
	private String sceneDesc;

	/**
	 * 保证金typecode
	 */
	@ApiField("type_code")
	private String typeCode;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getBailStatus() {
		return this.bailStatus;
	}
	public void setBailStatus(String bailStatus) {
		this.bailStatus = bailStatus;
	}

	public String getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(String gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public String getGmtModified() {
		return this.gmtModified;
	}
	public void setGmtModified(String gmtModified) {
		this.gmtModified = gmtModified;
	}

	public String getMigrateTo() {
		return this.migrateTo;
	}
	public void setMigrateTo(String migrateTo) {
		this.migrateTo = migrateTo;
	}

	public String getPartnerUserId() {
		return this.partnerUserId;
	}
	public void setPartnerUserId(String partnerUserId) {
		this.partnerUserId = partnerUserId;
	}

	public String getSceneDesc() {
		return this.sceneDesc;
	}
	public void setSceneDesc(String sceneDesc) {
		this.sceneDesc = sceneDesc;
	}

	public String getTypeCode() {
		return this.typeCode;
	}
	public void setTypeCode(String typeCode) {
		this.typeCode = typeCode;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
