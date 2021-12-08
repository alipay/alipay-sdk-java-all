package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创建额度
 *
 * @author auto create
 * @since 1.0, 2021-09-24 16:47:33
 */
public class AlipayEbppInvoiceExpensecontrolQuotaCreateModel extends AlipayObject {

	private static final long serialVersionUID = 7565495921859844297L;

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
	 * 额度失效时间（格式：yyyy-MM-dd HH:mm:ss）
	 */
	@ApiField("effective_end_date")
	private Date effectiveEndDate;

	/**
	 * 额度生效时间（格式：yyyy-MM-dd HH:mm:ss）
	 */
	@ApiField("effective_start_date")
	private Date effectiveStartDate;

	/**
	 * 额度所属者ID
owner_type为EMPLOYEE时为员工支付宝ID
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
	 * 额度限制（分）
限额：100000元
	 */
	@ApiField("quota_value")
	private String quotaValue;

	/**
	 * 额度类型ID
当 target_type=EXPENSE_TYPE 时
MEAL: 工作餐；
当 target_type=RULE_GROUP_AGGREGATION 时
target_id: #规则聚合id#
	 */
	@ApiField("target_id")
	private String targetId;

	/**
	 * 额度生成维度
EXPENSE_TYPE: 费用类型维度
RULE_GROUP_AGGREGATION: 规则聚合维度
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
