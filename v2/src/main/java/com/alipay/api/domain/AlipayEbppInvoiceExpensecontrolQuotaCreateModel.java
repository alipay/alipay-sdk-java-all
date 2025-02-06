package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 创建额度
 *
 * @author auto create
 * @since 1.0, 2024-12-24 20:07:18
 */
public class AlipayEbppInvoiceExpensecontrolQuotaCreateModel extends AlipayObject {

	private static final long serialVersionUID = 3549856239972439547L;

	/**
	 * 共同账号id（该字段将废弃，不建议使用，可用enterprise_id字段替换） 当前字段已废弃(该字段将废弃，不建议使用，可用enterprise_id字段替换)
	 */
	@ApiField("account_id")
	@Deprecated
	private String accountId;

	/**
	 * 授权签约协议号（该字段将废弃，不建议使用，可用enterprise_id字段替换） 当前字段已废弃(该字段将废弃，不建议使用，可用enterprise_id字段替换)
	 */
	@ApiField("agreement_no")
	@Deprecated
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
	 * 批量发放时，可填写该字段
	 */
	@ApiField("issue_desc")
	private String issueDesc;

	/**
	 * 批量发放时，可填写该字段作为发放名称，如果未填写取outer_source_id为默认值
	 */
	@ApiField("issue_name")
	private String issueName;

	/**
	 * 创建额度发放明细列表
	 */
	@ApiListField("issue_quota_target_list")
	@ApiField("issue_target_info_content")
	private List<IssueTargetInfoContent> issueQuotaTargetList;

	/**
	 * 外部操作幂等ID，标识创建额度的唯一性，防止重复创建
	 */
	@ApiField("outer_source_id")
	private String outerSourceId;

	/**
	 * 额度所属者ID（未切换open_id请使用此字段）： 当前字段已废弃(字段升级，请使用issue_target_info_list中owner_id字段)
	 */
	@ApiField("owner_id")
	@Deprecated
	private String ownerId;

	/**
	 * 额度所属者ID（切换open_id后请使用此字段）： 当前字段已废弃(字段升级，请使用issue_quota_target_list中owner_open_id)
	 */
	@ApiField("owner_open_id")
	@Deprecated
	private String ownerOpenId;

	/**
	 * 额度所属者类型 当前字段已废弃(字段升级，请使用issue_quota_target_list中owner_type字段)
	 */
	@ApiField("owner_type")
	@Deprecated
	private String ownerType;

	/**
	 * 外部平台编码（通常为接入方大写英文缩写） 当前字段已废弃(历史版本字段，不推荐使用)
	 */
	@ApiField("platform")
	@Deprecated
	private String platform;

	/**
	 * 创建额度类型
	 */
	@ApiField("quota_type")
	private String quotaType;

	/**
	 * 额度值，以（分）为单位 当前字段已废弃(字段升级，请使用issue_quota_target_list中issue_quota字段)
	 */
	@ApiField("quota_value")
	@Deprecated
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
INSTITUTION（制度维度），
EXPENSE_TYPE（费用类型维度）
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

	public String getIssueDesc() {
		return this.issueDesc;
	}
	public void setIssueDesc(String issueDesc) {
		this.issueDesc = issueDesc;
	}

	public String getIssueName() {
		return this.issueName;
	}
	public void setIssueName(String issueName) {
		this.issueName = issueName;
	}

	public List<IssueTargetInfoContent> getIssueQuotaTargetList() {
		return this.issueQuotaTargetList;
	}
	public void setIssueQuotaTargetList(List<IssueTargetInfoContent> issueQuotaTargetList) {
		this.issueQuotaTargetList = issueQuotaTargetList;
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
