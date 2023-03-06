package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 查询额度
 *
 * @author auto create
 * @since 1.0, 2023-02-16 16:53:40
 */
public class AlipayEbppInvoiceExpensecontrolQuotaQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3277165644666796141L;

	/**
	 * 企业共同账户ID
	 */
	@ApiField("account_id")
	private String accountId;

	/**
	 * 授权签约协议号
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 企业ID
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	/**
	 * 切换open_id前请使用：额度所属者ID
owner_type为EMPLOYEE时为员工支付宝ID
owner_type为PHONE时为员工手机号
owner_type为ENTERPRISE_PAY_UID时为员工企业码ID
	 */
	@ApiField("owner_id")
	private String ownerId;

	/**
	 * 切换open_id后请使用：额度所属者ID owner_type为EMPLOYEE时为员工open_id owner_type为PHONE时为员工手机号 owner_type为ENTERPRISE_PAY_UID时为员工企业码ID
	 */
	@ApiField("owner_open_id")
	private String ownerOpenId;

	/**
	 * 额度所属者类型
EMPLOYEE 员工
	 */
	@ApiField("owner_type")
	private String ownerType;

	/**
	 * 页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 每页条数，限制20
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 额度ID
特殊说明：最多传入10个quota_id
	 */
	@ApiListField("quota_id_list")
	@ApiField("string")
	private List<String> quotaIdList;

	/**
	 * 额度维度ID
当 target_type=EXPENSE_TYPE 时，值为
MEAL（工作餐）
当target_type=RULE_GROUP_AGGREGATION 时，值为费控规则聚合ID
当target_type=INSTITUTION 时，值为制度ID，target_type和target_id要正确对应，否则会导致查不到额度。
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

	public String getEnterpriseId() {
		return this.enterpriseId;
	}
	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
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

	public Long getPageNum() {
		return this.pageNum;
	}
	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public List<String> getQuotaIdList() {
		return this.quotaIdList;
	}
	public void setQuotaIdList(List<String> quotaIdList) {
		this.quotaIdList = quotaIdList;
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
