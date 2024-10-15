package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询企业可用商户信息
 *
 * @author auto create
 * @since 1.0, 2023-06-06 10:53:27
 */
public class AlipayEbppInvoiceExpensesceneMerchantQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5441273567388372839L;

	/**
	 * 共同账户ID
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
	 * 费用类型
MEAL - 工作餐
	 */
	@ApiField("expense_type")
	private String expenseType;

	/**
	 * 页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 每页行数（最大100）
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 商户ID
	 */
	@ApiField("pid")
	private String pid;

	/**
	 * 商户ID
	 */
	@ApiField("role_id")
	private String roleId;

	/**
	 * 门店ID
	 */
	@ApiField("shop_id")
	private String shopId;

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

	public String getExpenseType() {
		return this.expenseType;
	}
	public void setExpenseType(String expenseType) {
		this.expenseType = expenseType;
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

	public String getPid() {
		return this.pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getRoleId() {
		return this.roleId;
	}
	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

}
