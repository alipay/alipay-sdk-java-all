package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创建员工额度信息
 *
 * @author auto create
 * @since 1.0, 2024-01-30 21:03:52
 */
public class AlipayEbppInvoiceExpensecontrolEmployeequotaCreateModel extends AlipayObject {

	private static final long serialVersionUID = 1478999827867118252L;

	/**
	 * 共同账号ID
	 */
	@ApiField("account_id")
	private String accountId;

	/**
	 * 授权签约协议号
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 余额失效时间（默认有效期100年）
	 */
	@ApiField("effective_end_date")
	private Date effectiveEndDate;

	/**
	 * 余额生效时间(默认当前时间)
	 */
	@ApiField("effective_start_date")
	private Date effectiveStartDate;

	/**
	 * 外部操作幂等ID（接入方接口调用幂等控制ID）
	 */
	@ApiField("outer_source_id")
	private String outerSourceId;

	/**
	 * 切换open_id前请使用：余额所属者ID
owner_type为员工时为员工支付宝ID
	 */
	@ApiField("owner_id")
	private String ownerId;

	/**
	 * 切换open_id后请使用：余额所属者ID owner_type为员工时为员工open_id
	 */
	@ApiField("owner_open_id")
	private String ownerOpenId;

	/**
	 * 余额所属者类型
EMPLOYEE: 员工
	 */
	@ApiField("owner_type")
	private String ownerType;

	/**
	 * 外部平台编码（通常为接入方大写英文缩写）
	 */
	@ApiField("platform")
	private String platform;

	/**
	 * 余额同步模式，默认 DEFAULT_STANDARD
	 */
	@ApiField("quota_model")
	private String quotaModel;

	/**
	 * 余额，以（分）为单位
特殊说明：余额不超过100000元
	 */
	@ApiField("quota_value")
	private String quotaValue;

	public String getAccountId() {
		return this.accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getAgreementNo() {
		return this.agreementNo;
	}
	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}

	public Date getEffectiveEndDate() {
		return this.effectiveEndDate;
	}
	public void setEffectiveEndDate(Date effectiveEndDate) {
		this.effectiveEndDate = effectiveEndDate;
	}

	public Date getEffectiveStartDate() {
		return this.effectiveStartDate;
	}
	public void setEffectiveStartDate(Date effectiveStartDate) {
		this.effectiveStartDate = effectiveStartDate;
	}

	public String getOuterSourceId() {
		return this.outerSourceId;
	}
	public void setOuterSourceId(String outerSourceId) {
		this.outerSourceId = outerSourceId;
	}

	public String getOwnerId() {
		return this.ownerId;
	}
	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
	}

	public String getOwnerOpenId() {
		return this.ownerOpenId;
	}
	public void setOwnerOpenId(String ownerOpenId) {
		this.ownerOpenId = ownerOpenId;
	}

	public String getOwnerType() {
		return this.ownerType;
	}
	public void setOwnerType(String ownerType) {
		this.ownerType = ownerType;
	}

	public String getPlatform() {
		return this.platform;
	}
	public void setPlatform(String platform) {
		this.platform = platform;
	}

	public String getQuotaModel() {
		return this.quotaModel;
	}
	public void setQuotaModel(String quotaModel) {
		this.quotaModel = quotaModel;
	}

	public String getQuotaValue() {
		return this.quotaValue;
	}
	public void setQuotaValue(String quotaValue) {
		this.quotaValue = quotaValue;
	}

}
