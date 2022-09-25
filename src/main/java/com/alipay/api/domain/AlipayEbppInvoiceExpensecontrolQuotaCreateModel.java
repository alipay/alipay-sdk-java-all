package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创建额度
 *
 * @author auto create
 * @since 1.0, 2022-08-18 15:33:06
 */
public class AlipayEbppInvoiceExpensecontrolQuotaCreateModel extends AlipayObject {

	private static final long serialVersionUID = 8758263187818437729L;

	/**
	 * 企业共同账户id
	 */
	@ApiField("account_id")
	private String accountId;

	/**
	 * 授权签约协议号
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 额度失效时间（格式：yyyy-MM-dd HH:mm:ss），额度类型为点券时必填，额度类型为余额时有默认值，无需填写
	 */
	@ApiField("effective_end_date")
	private Date effectiveEndDate;

	/**
	 * 额度生效时间（格式：yyyy-MM-dd HH:mm:ss），额度类型为点券时必填，额度类型为余额时有默认值，无需填写
	 */
	@ApiField("effective_start_date")
	private Date effectiveStartDate;

	/**
	 * 企业ID
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	/**
	 * 外部操作幂等ID（接入方接口调用幂等控制ID），创建额度类型为点券时必填
	 */
	@ApiField("outer_source_id")
	private String outerSourceId;

	/**
	 * 额度所属者ID：
owner_type为EMPLOYEE时填写员工支付宝ID；
owner_type为ENTERPRISE_PAY_UID时填写员工企业码ID；
owner_type为PHONE时填写员工手机号；
owner_type为ENTERPRISE时填写企业ID。
	 */
	@ApiField("owner_id")
	private String ownerId;

	/**
	 * 额度所属者类型，可通过设置该字段来指定操作的owner_id类型，如果设置企业额度则设置为ENTERPRISE
	 */
	@ApiField("owner_type")
	private String ownerType;

	/**
	 * 外部平台编码（通常为接入方大写英文缩写）
	 */
	@ApiField("platform")
	private String platform;

	/**
	 * 创建额度类型，支持点券和余额，不填写则默认为余额类型
	 */
	@ApiField("quota_type")
	private String quotaType;

	/**
	 * 额度值，以（分）为单位
约束：不超过100000元
	 */
	@ApiField("quota_value")
	private String quotaValue;

	/**
	 * 额度维度ID
当 target_type=EXPENSE_TYPE 时，值为
MEAL（工作餐）
当target_type=RULE_GROUP_AGGREGATION 时，值为费控规则聚合ID
当target_type=INSTITUTION 时，值为制度ID
	 */
	@ApiField("target_id")
	private String targetId;

	/**
	 * 额度维度
枚举值：
EXPENSE_TYPE（费用类型维度），
RULE_GROUP_AGGREGATION（规则聚合维度），
INSTITUTION（制度维度）
	 */
	@ApiField("target_type")
	private String targetType;

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

	public String getEnterpriseId() {
		return this.enterpriseId;
	}
	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
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

	public String getQuotaType() {
		return this.quotaType;
	}
	public void setQuotaType(String quotaType) {
		this.quotaType = quotaType;
	}

	public String getQuotaValue() {
		return this.quotaValue;
	}
	public void setQuotaValue(String quotaValue) {
		this.quotaValue = quotaValue;
	}

	public String getTargetId() {
		return this.targetId;
	}
	public void setTargetId(String targetId) {
		this.targetId = targetId;
	}

	public String getTargetType() {
		return this.targetType;
	}
	public void setTargetType(String targetType) {
		this.targetType = targetType;
	}

}
