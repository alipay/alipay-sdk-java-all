package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 报销账单信息
 *
 * @author auto create
 * @since 1.0, 2023-06-25 10:00:37
 */
public class ExpenseConsumeInfo extends AlipayObject {

	private static final long serialVersionUID = 1393114818967112878L;

	/**
	 * 企业ID
	 */
	@ApiField("account_id")
	private String accountId;

	/**
	 * 实际出资企业支付宝账号
	 */
	@ApiField("actual_account_number")
	private String actualAccountNumber;

	/**
	 * 汇总批次ID(废弃)
	 */
	@ApiField("batch_id")
	private String batchId;

	/**
	 * 支付流水号
	 */
	@ApiField("bill_no")
	private String billNo;

	/**
	 * 账单类型（CONSUME-消费账单、REFUND-退款、TRANSFER-转账）
	 */
	@ApiField("bill_type")
	private String billType;

	/**
	 * 账单行业分类（交通出行，餐饮美食，商业服务，日用百货等等）
	 */
	@ApiField("category_name")
	private String categoryName;

	/**
	 * 账单金额（单位：元）
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
	 * 所属员工支付宝uid
	 */
	@ApiField("employee_open_id")
	private String employeeOpenId;

	/**
	 * 商户id
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/**
	 * 门店id
	 */
	@ApiField("mshop_id")
	private String mshopId;

	/**
	 * 开票模式（汇总开：ENTERPRISE_AUTO_BATCH）
	 */
	@ApiField("open_model")
	private String openModel;

	/**
	 * 退款交易关联正交易单号(对应正交易的bill_no)
	 */
	@ApiField("original_voucher_id")
	private String originalVoucherId;

	/**
	 * 外部流水号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 企业支付金额（单位：元）
	 */
	@ApiField("p_pay_amount")
	private String pPayAmount;

	/**
	 * 商家名称
	 */
	@ApiField("payee_name")
	private String payeeName;

	/**
	 * 费控规则中的项目ID
	 */
	@ApiField("project_id")
	private String projectId;

	/**
	 * 支付使用的项目号（成本中心）此字段废弃
	 */
	@ApiField("projiect_id")
	private String projiectId;

	/**
	 * 消费账单的退款金额（元）
	 */
	@ApiField("refund_amount")
	private String refundAmount;

	/**
	 * 消费账单的退款状态
	 */
	@ApiField("refund_status")
	private String refundStatus;

	/**
	 * 费控规则ID
	 */
	@ApiField("standard_id")
	private String standardId;

	/**
	 * 外部门店id
	 */
	@ApiField("store_id")
	private String storeId;

	/**
	 * 批次id
	 */
	@ApiField("summary_id")
	private String summaryId;

	/**
	 * 出资类型：
PERSONAL:个人垫付
ENTERPRISE:企业垫资
TP:三方合作伙伴垫资
ACCOUNTING:记账
	 */
	@ApiField("tp_sign")
	private String tpSign;

	/**
	 * 凭证ID
	 */
	@ApiField("voucher_id")
	private String voucherId;

	public String getAccountId() {
		return this.accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getActualAccountNumber() {
		return this.actualAccountNumber;
	}
	public void setActualAccountNumber(String actualAccountNumber) {
		this.actualAccountNumber = actualAccountNumber;
	}

	public String getBatchId() {
		return this.batchId;
	}
	public void setBatchId(String batchId) {
		this.batchId = batchId;
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

	public String getEmployeeOpenId() {
		return this.employeeOpenId;
	}
	public void setEmployeeOpenId(String employeeOpenId) {
		this.employeeOpenId = employeeOpenId;
	}

	public String getMerchantId() {
		return this.merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public String getMshopId() {
		return this.mshopId;
	}
	public void setMshopId(String mshopId) {
		this.mshopId = mshopId;
	}

	public String getOpenModel() {
		return this.openModel;
	}
	public void setOpenModel(String openModel) {
		this.openModel = openModel;
	}

	public String getOriginalVoucherId() {
		return this.originalVoucherId;
	}
	public void setOriginalVoucherId(String originalVoucherId) {
		this.originalVoucherId = originalVoucherId;
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

	public String getProjectId() {
		return this.projectId;
	}
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public String getProjiectId() {
		return this.projiectId;
	}
	public void setProjiectId(String projiectId) {
		this.projiectId = projiectId;
	}

	public String getRefundAmount() {
		return this.refundAmount;
	}
	public void setRefundAmount(String refundAmount) {
		this.refundAmount = refundAmount;
	}

	public String getRefundStatus() {
		return this.refundStatus;
	}
	public void setRefundStatus(String refundStatus) {
		this.refundStatus = refundStatus;
	}

	public String getStandardId() {
		return this.standardId;
	}
	public void setStandardId(String standardId) {
		this.standardId = standardId;
	}

	public String getStoreId() {
		return this.storeId;
	}
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

	public String getSummaryId() {
		return this.summaryId;
	}
	public void setSummaryId(String summaryId) {
		this.summaryId = summaryId;
	}

	public String getTpSign() {
		return this.tpSign;
	}
	public void setTpSign(String tpSign) {
		this.tpSign = tpSign;
	}

	public String getVoucherId() {
		return this.voucherId;
	}
	public void setVoucherId(String voucherId) {
		this.voucherId = voucherId;
	}

}
