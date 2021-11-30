package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创建员工额度信息
 *
 * @author auto create
 * @since 1.0, 2021-10-13 16:45:07
 */
public class AlipayEbppInvoiceExpensecontrolEmployeequotaCreateModel extends AlipayObject {

	private static final long serialVersionUID = 5142439296396254636L;

	/**
	 * 企业签约企业合花ID-共同账号ID
	 */
	@ApiField("account_id")
	private String accountId;

	/**
	 * 授权签约协议号
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 额度失效时间（默认有效期100年）
	 */
	@ApiField("effective_end_date")
	private Date effectiveEndDate;

	/**
	 * 额度生效时间(默认当前时间)
	 */
	@ApiField("effective_start_date")
	private Date effectiveStartDate;

	/**
	 * 外部幂等ID
	 */
	@ApiField("outer_source_id")
	private String outerSourceId;

	/**
	 * 额度所属者ID
owner_type为员工时为员工支付宝ID
	 */
	@ApiField("owner_id")
	private String ownerId;

	/**
	 * 额度所属者类型
EMPLOYEE: 员工
	 */
	@ApiField("owner_type")
	private String ownerType;

	/**
	 * 外部平台编码
	 */
	@ApiField("platform")
	private String platform;

	/**
	 * 额度模式，默认 DEFAULT_STANDARD
	 */
	@ApiField("quota_model")
	private String quotaModel;

	/**
	 * 额度限制（单位分）
限额：100000元
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
