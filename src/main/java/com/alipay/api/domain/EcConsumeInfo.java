package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业码账单开放模型
 *
 * @author auto create
 * @since 1.0, 2022-11-04 16:25:20
 */
public class EcConsumeInfo extends AlipayObject {

	private static final long serialVersionUID = 4176697186188885115L;

	/**
	 * 共同账户ID
	 */
	@ApiField("account_id")
	private String accountId;

	/**
	 * 协议出资支付宝账号
	 */
	@ApiField("agreement_peer_payer_id")
	private String agreementPeerPayerId;

	/**
	 * 外部交易流水号
	 */
	@ApiField("biz_out_no")
	private String bizOutNo;

	/**
	 * 账单分类名称，比如：餐饮美食，交通出行，酒店旅游等
	 */
	@ApiField("category_name")
	private String categoryName;

	/**
	 * 账单金额，单位：元，不包含营销资产
	 */
	@ApiField("consume_amount")
	private String consumeAmount;

	/**
	 * 员工消费记账分类
	 */
	@ApiField("consume_category")
	private String consumeCategory;

	/**
	 * 员工消费记账备注
	 */
	@ApiField("consume_memo")
	private String consumeMemo;

	/**
	 * 账单类型
-消费账单：CONSUME
-退款账单：REFUND
-转账账单：TRANSFER
	 */
	@ApiField("consume_type")
	private String consumeType;

	/**
	 * 员工账号ID
	 */
	@ApiField("employee_id")
	private String employeeId;

	/**
	 * 企业ID
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	/**
	 * 使用规则ID
	 */
	@ApiField("expense_rule_group_id")
	private String expenseRuleGroupId;

	/**
	 * 费用场景
	 */
	@ApiField("expense_scene_code")
	private String expenseSceneCode;

	/**
	 * 费用类型
	 */
	@ApiField("expense_type")
	private String expenseType;

	/**
	 * 费用类型子类目
	 */
	@ApiField("expense_type_sub_category")
	private String expenseTypeSubCategory;

	/**
	 * 账单扩展信息，Json格式
汇总信息
	 */
	@ApiField("ext_infos")
	private String extInfos;

	/**
	 * 出资模式
个人出资：PERSONAL
企业出资：ENTERPRISE
三方垫资合作伙伴出资：TP
记账：ACCOUNTING
	 */
	@ApiField("fund_biz_type")
	private String fundBizType;

	/**
	 * 账单创建时间，格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("gmt_biz_create")
	private String gmtBizCreate;

	/**
	 * 账单支付时间，格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("gmt_receive_pay")
	private String gmtReceivePay;

	/**
	 * 开票模式
企业汇总开：ENTERPRISE_AUTO_BATCH
	 */
	@ApiField("invoice_open_mode")
	private String invoiceOpenMode;

	/**
	 * 商户ID
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/**
	 * 商户名称
	 */
	@ApiField("merchant_name")
	private String merchantName;

	/**
	 * 订单完结标识
0：未完结
1：已完结
	 */
	@ApiField("order_complete_label")
	private String orderCompleteLabel;

	/**
	 * 2022-01-01 01:01:02	订单完结时间
	 */
	@ApiField("order_complete_time")
	private String orderCompleteTime;

	/**
	 * 交易流水号
	 */
	@ApiField("pay_no")
	private String payNo;

	/**
	 * 企业代付金额，单位：元
	 */
	@ApiField("peer_pay_amount")
	private String peerPayAmount;

	/**
	 * 实际出资支付宝账号
	 */
	@ApiField("peer_payer_card_no")
	private String peerPayerCardNo;

	/**
	 * 消费账单企业代付部分退款金额，单位：元。退款账单该值无意义，值为0。
	 */
	@ApiField("peer_refund_amount")
	private String peerRefundAmount;

	/**
	 * 消费账单企业代付部分退款状态，默认为INIT。当消费账单有退款，该值会变为REFUND_PART或REFUND_FULL；退款账单该值无意义，为初始值INIT。
未退款：INIT，
部分退款：REFUND_PART，
全额退款：REFUND_FULL
	 */
	@ApiField("peer_refund_status")
	private String peerRefundStatus;

	/**
	 * 退款账单关联的消费账单交易流水号，退款账单才有值
	 */
	@ApiField("related_pay_no")
	private String relatedPayNo;

	/**
	 * 账单场景
TAKE_AWAY：外卖
METRO：地铁
OTHER：其他
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 卖家ID
	 */
	@ApiField("seller_id")
	private String sellerId;

	/**
	 * 门店ID
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 外部门店ID
	 */
	@ApiField("store_id")
	private String storeId;

	/**
	 * 汇总批次ID
	 */
	@ApiField("summary_apply_id")
	private String summaryApplyId;

	/**
	 * 员工支付宝UID
	 */
	@ApiField("user_id")
	private String userId;

	public String getAccountId() {
		return this.accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getAgreementPeerPayerId() {
		return this.agreementPeerPayerId;
	}
	public void setAgreementPeerPayerId(String agreementPeerPayerId) {
		this.agreementPeerPayerId = agreementPeerPayerId;
	}

	public String getBizOutNo() {
		return this.bizOutNo;
	}
	public void setBizOutNo(String bizOutNo) {
		this.bizOutNo = bizOutNo;
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

	public String getConsumeCategory() {
		return this.consumeCategory;
	}
	public void setConsumeCategory(String consumeCategory) {
		this.consumeCategory = consumeCategory;
	}

	public String getConsumeMemo() {
		return this.consumeMemo;
	}
	public void setConsumeMemo(String consumeMemo) {
		this.consumeMemo = consumeMemo;
	}

	public String getConsumeType() {
		return this.consumeType;
	}
	public void setConsumeType(String consumeType) {
		this.consumeType = consumeType;
	}

	public String getEmployeeId() {
		return this.employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getEnterpriseId() {
		return this.enterpriseId;
	}
	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

	public String getExpenseRuleGroupId() {
		return this.expenseRuleGroupId;
	}
	public void setExpenseRuleGroupId(String expenseRuleGroupId) {
		this.expenseRuleGroupId = expenseRuleGroupId;
	}

	public String getExpenseSceneCode() {
		return this.expenseSceneCode;
	}
	public void setExpenseSceneCode(String expenseSceneCode) {
		this.expenseSceneCode = expenseSceneCode;
	}

	public String getExpenseType() {
		return this.expenseType;
	}
	public void setExpenseType(String expenseType) {
		this.expenseType = expenseType;
	}

	public String getExpenseTypeSubCategory() {
		return this.expenseTypeSubCategory;
	}
	public void setExpenseTypeSubCategory(String expenseTypeSubCategory) {
		this.expenseTypeSubCategory = expenseTypeSubCategory;
	}

	public String getExtInfos() {
		return this.extInfos;
	}
	public void setExtInfos(String extInfos) {
		this.extInfos = extInfos;
	}

	public String getFundBizType() {
		return this.fundBizType;
	}
	public void setFundBizType(String fundBizType) {
		this.fundBizType = fundBizType;
	}

	public String getGmtBizCreate() {
		return this.gmtBizCreate;
	}
	public void setGmtBizCreate(String gmtBizCreate) {
		this.gmtBizCreate = gmtBizCreate;
	}

	public String getGmtReceivePay() {
		return this.gmtReceivePay;
	}
	public void setGmtReceivePay(String gmtReceivePay) {
		this.gmtReceivePay = gmtReceivePay;
	}

	public String getInvoiceOpenMode() {
		return this.invoiceOpenMode;
	}
	public void setInvoiceOpenMode(String invoiceOpenMode) {
		this.invoiceOpenMode = invoiceOpenMode;
	}

	public String getMerchantId() {
		return this.merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public String getMerchantName() {
		return this.merchantName;
	}
	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}

	public String getOrderCompleteLabel() {
		return this.orderCompleteLabel;
	}
	public void setOrderCompleteLabel(String orderCompleteLabel) {
		this.orderCompleteLabel = orderCompleteLabel;
	}

	public String getOrderCompleteTime() {
		return this.orderCompleteTime;
	}
	public void setOrderCompleteTime(String orderCompleteTime) {
		this.orderCompleteTime = orderCompleteTime;
	}

	public String getPayNo() {
		return this.payNo;
	}
	public void setPayNo(String payNo) {
		this.payNo = payNo;
	}

	public String getPeerPayAmount() {
		return this.peerPayAmount;
	}
	public void setPeerPayAmount(String peerPayAmount) {
		this.peerPayAmount = peerPayAmount;
	}

	public String getPeerPayerCardNo() {
		return this.peerPayerCardNo;
	}
	public void setPeerPayerCardNo(String peerPayerCardNo) {
		this.peerPayerCardNo = peerPayerCardNo;
	}

	public String getPeerRefundAmount() {
		return this.peerRefundAmount;
	}
	public void setPeerRefundAmount(String peerRefundAmount) {
		this.peerRefundAmount = peerRefundAmount;
	}

	public String getPeerRefundStatus() {
		return this.peerRefundStatus;
	}
	public void setPeerRefundStatus(String peerRefundStatus) {
		this.peerRefundStatus = peerRefundStatus;
	}

	public String getRelatedPayNo() {
		return this.relatedPayNo;
	}
	public void setRelatedPayNo(String relatedPayNo) {
		this.relatedPayNo = relatedPayNo;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

	public String getSellerId() {
		return this.sellerId;
	}
	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getStoreId() {
		return this.storeId;
	}
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

	public String getSummaryApplyId() {
		return this.summaryApplyId;
	}
	public void setSummaryApplyId(String summaryApplyId) {
		this.summaryApplyId = summaryApplyId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
