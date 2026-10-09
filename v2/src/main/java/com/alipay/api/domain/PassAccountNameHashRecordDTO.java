package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 带有hash的通行证账号
 *
 * @author auto create
 * @since 1.0, 2026-09-29 10:43:16
 */
public class PassAccountNameHashRecordDTO extends AlipayObject {

	private static final long serialVersionUID = 4834414898726158534L;

	/**
	 * account_name
	 */
	@ApiField("account_name")
	private String accountName;

	/**
	 * 邮箱
	 */
	@ApiField("account_type")
	private String accountType;

	/**
	 * 冲突类型
	 */
	@ApiField("conflict_type")
	private String conflictType;

	/**
	 * data_source
	 */
	@ApiField("data_source")
	private String dataSource;

	/**
	 * Unix毫秒
	 */
	@ApiField("modified_time")
	private String modifiedTime;

	/**
	 * name_hash_status
	 */
	@ApiField("name_hash_status")
	private String nameHashStatus;

	/**
	 * 账号记录ID
	 */
	@ApiField("pass_account_id")
	private String passAccountId;

	/**
	 * 通行证ID
	 */
	@ApiField("passport_id")
	private String passportId;

	/**
	 * 关联账号名称
	 */
	@ApiField("related_account_names")
	private String relatedAccountNames;

	/**
	 * 关联账号记录ID
	 */
	@ApiField("related_pass_account_ids")
	private String relatedPassAccountIds;

	/**
	 * 关联通行证ID
	 */
	@ApiField("related_passport_ids")
	private String relatedPassportIds;

	/**
	 * 账号状态
	 */
	@ApiField("status")
	private String status;

	public String getAccountName() {
		return this.accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getAccountType() {
		return this.accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getConflictType() {
		return this.conflictType;
	}
	public void setConflictType(String conflictType) {
		this.conflictType = conflictType;
	}

	public String getDataSource() {
		return this.dataSource;
	}
	public void setDataSource(String dataSource) {
		this.dataSource = dataSource;
	}

	public String getModifiedTime() {
		return this.modifiedTime;
	}
	public void setModifiedTime(String modifiedTime) {
		this.modifiedTime = modifiedTime;
	}

	public String getNameHashStatus() {
		return this.nameHashStatus;
	}
	public void setNameHashStatus(String nameHashStatus) {
		this.nameHashStatus = nameHashStatus;
	}

	public String getPassAccountId() {
		return this.passAccountId;
	}
	public void setPassAccountId(String passAccountId) {
		this.passAccountId = passAccountId;
	}

	public String getPassportId() {
		return this.passportId;
	}
	public void setPassportId(String passportId) {
		this.passportId = passportId;
	}

	public String getRelatedAccountNames() {
		return this.relatedAccountNames;
	}
	public void setRelatedAccountNames(String relatedAccountNames) {
		this.relatedAccountNames = relatedAccountNames;
	}

	public String getRelatedPassAccountIds() {
		return this.relatedPassAccountIds;
	}
	public void setRelatedPassAccountIds(String relatedPassAccountIds) {
		this.relatedPassAccountIds = relatedPassAccountIds;
	}

	public String getRelatedPassportIds() {
		return this.relatedPassportIds;
	}
	public void setRelatedPassportIds(String relatedPassportIds) {
		this.relatedPassportIds = relatedPassportIds;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
