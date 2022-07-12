package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 查询额度
 *
 * @author auto create
 * @since 1.0, 2022-06-22 20:53:43
 */
public class AlipayEbppInvoiceExpensecontrolQuotaQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1185589778282256418L;

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
	 * 余额所属者ID
owner_type为员工时为员工支付宝ID
	 */
	@ApiField("owner_id")
	private String ownerId;

	/**
	 * 余额所属者类型
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
	 * 余额ID
特殊说明：最多传入10个quota_id
	 */
	@ApiListField("quota_id_list")
	@ApiField("string")
	private List<String> quotaIdList;

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
RULE_GROUP_AGGREGATION（规则聚合维度）
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
