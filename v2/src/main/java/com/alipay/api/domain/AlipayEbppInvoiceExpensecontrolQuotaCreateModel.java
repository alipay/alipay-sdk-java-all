package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创建额度
 *
 * @author auto create
 * @since 1.0, 2023-05-08 19:36:16
 */
public class AlipayEbppInvoiceExpensecontrolQuotaCreateModel extends AlipayObject {

	private static final long serialVersionUID = 1854245239647964211L;

	/**
	 * 共同账号id
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
	 * 企业ID
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	/**
	 * 外部操作幂等ID（接入方接口调用幂等控制ID）
	 */
	@ApiField("outer_source_id")
	private String outerSourceId;

	/**
	 * 额度所属者ID（未切换open_id请使用此字段）：
	 */
	@ApiField("owner_id")
	private String ownerId;

	/**
	 * 额度所属者ID（切换open_id后请使用此字段）：
	 */
	@ApiField("owner_open_id")
	private String ownerOpenId;

	/**
	 * 额度所属者类型
	 */
	@ApiField("owner_type")
	private String ownerType;

	/**
	 * 外部平台编码（通常为接入方大写英文缩写）
	 */
	@ApiField("platform")
	private String platform;

	/**
	 * 创建额度类型
	 */
	@ApiField("quota_type")
	private String quotaType;

	/**
	 * 额度值，以（分）为单位
	 */
	@ApiField("quota_value")
	private String quotaValue;

	/**
	 * 0:不可转赠
1:可以转增
	 */
	@ApiField("share_mode")
	private String shareMode;

	/**
	 * 额度维度ID
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

	public String getShareMode() {
		return this.shareMode;
	}
	public void setShareMode(String shareMode) {
		this.shareMode = shareMode;
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
