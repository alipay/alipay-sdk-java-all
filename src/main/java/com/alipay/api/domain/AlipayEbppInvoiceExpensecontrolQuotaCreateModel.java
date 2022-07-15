package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创建额度
 *
 * @author auto create
 * @since 1.0, 2022-06-22 20:52:53
 */
public class AlipayEbppInvoiceExpensecontrolQuotaCreateModel extends AlipayObject {

	private static final long serialVersionUID = 2315173426446154929L;

	/**
	 * 企业ID
	 */
	@ApiField("account_id")
	private String accountId;

	/**
	 * 授权签约协议号
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 余额失效时间（格式：yyyy-MM-dd HH:mm:ss）
	 */
	@ApiField("effective_end_date")
	private Date effectiveEndDate;

	/**
	 * 余额生效时间（格式：yyyy-MM-dd HH:mm:ss）
	 */
	@ApiField("effective_start_date")
	private Date effectiveStartDate;

	/**
	 * 外部操作幂等ID（接入方接口调用幂等控制ID）
	 */
	@ApiField("outer_source_id")
	private String outerSourceId;

	/**
	 * 余额所属者ID
owner_type为EMPLOYEE时为员工支付宝ID
	 */
	@ApiField("owner_id")
	private String ownerId;

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
	 * 余额，以（分）为单位
约束：余额不超过100000元
	 */
	@ApiField("quota_value")
	private String quotaValue;

	/**
	 * 余额维度ID
当 target_type=EXPENSE_TYPE 时，值为
MEAL（工作餐）
当target_type=RULE_GROUP_AGGREGATION 时，值为费控规则聚合ID
	 */
	@ApiField("target_id")
	private String targetId;

	/**
	 * 余额维度
枚举值：
EXPENSE_TYPE（费用类型维度），
RULE_GROUP_AGGREGATION（规则聚合维度
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
