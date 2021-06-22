package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 报销账单信息
 *
 * @author auto create
 * @since 1.0, 2021-06-08 17:56:07
 */
public class ExpenseConsumeInfo extends AlipayObject {

	private static final long serialVersionUID = 7245684775981639343L;

	/**
	 * 公司账号ID
	 */
	@ApiField("account_id")
	private String accountId;

	/**
	 * 支付流水号
	 */
	@ApiField("bill_no")
	private String billNo;

	/**
	 * 账单类型（支付、退款、转账）
	 */
	@ApiField("bill_type")
	private String billType;

	/**
	 * 账单分类
	 */
	@ApiField("category_name")
	private String categoryName;

	/**
	 * 账单金额
	 */
	@ApiField("consume_amount")
	private String consumeAmount;

	/**
	 * 交易日期
	 */
	@ApiField("consume_date")
	private String consumeDate;

	/**
	 * 账单展示标题
	 */
	@ApiField("consume_title")
	private String consumeTitle;

	/**
	 * 所属员工支付宝uid
	 */
	@ApiField("employee_id")
	private String employeeId;

	/**
	 * 外部流水号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 企业代付金额
	 */
	@ApiField("p_pay_amount")
	private String pPayAmount;

	/**
	 * 商家名称
	 */
	@ApiField("payee_name")
	private String payeeName;

	/**
	 * 支付使用的项目号（成本中心）
	 */
	@ApiField("projiect_id")
	private String projiectId;

	/**
	 * 凭证id
	 */
	@ApiField("voucher_id")
	private String voucherId;

	public String getAccountId() {
		return this.accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getBillNo() {
		return this.billNo;
	}
	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}

	public String getBillType() {
		return this.billType;
	}
	public void setBillType(String billType) {
		this.billType = billType;
	}

	public String getCategoryName() {
		return this.categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getConsumeAmount() {
		return this.consumeAmount;
	}
	public void setConsumeAmount(String consumeAmount) {
		this.consumeAmount = consumeAmount;
	}

	public String getConsumeDate() {
		return this.consumeDate;
	}
	public void setConsumeDate(String consumeDate) {
		this.consumeDate = consumeDate;
	}

	public String getConsumeTitle() {
		return this.consumeTitle;
	}
	public void setConsumeTitle(String consumeTitle) {
		this.consumeTitle = consumeTitle;
	}

	public String getEmployeeId() {
		return this.employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getpPayAmount() {
		return this.pPayAmount;
	}
	public void setpPayAmount(String pPayAmount) {
		this.pPayAmount = pPayAmount;
	}

	public String getPayeeName() {
		return this.payeeName;
	}
	public void setPayeeName(String payeeName) {
		this.payeeName = payeeName;
	}

	public String getProjiectId() {
		return this.projiectId;
	}
	public void setProjiectId(String projiectId) {
		this.projiectId = projiectId;
	}

	public String getVoucherId() {
		return this.voucherId;
	}
	public void setVoucherId(String voucherId) {
		this.voucherId = voucherId;
	}

}
