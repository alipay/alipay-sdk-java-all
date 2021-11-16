package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 查询额度
 *
 * @author auto create
 * @since 1.0, 2021-09-24 16:51:47
 */
public class AlipayEbppInvoiceExpensecontrolQuotaQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3241441948387847392L;

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
	 * 额度所属者ID
owner_type为员工时为员工支付宝ID
	 */
	@ApiField("owner_id")
	private String ownerId;

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
最大长度：10
	 */
	@ApiListField("quota_id_list")
	@ApiField("string")
	private List<String> quotaIdList;

	/**
	 * 额度类型ID
MEAL: 工作餐
	 */
	@ApiField("target_id")
	private String targetId;

	/**
	 * 额度类型
EXPENSE_TYPE: 场景盖帽额度
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
