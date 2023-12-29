package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 采购订单信息，对外输出的对象
 *
 * @author auto create
 * @since 1.0, 2023-09-15 09:58:58
 */
public class PurchaseOrderOutDTO extends AlipayObject {

	private static final long serialVersionUID = 4358466997297778931L;

	/**
	 * 是否对供应商金额可见
	 */
	@ApiField("amount_visible")
	private Boolean amountVisible;

	/**
	 * 支付宝账号
	 */
	@ApiField("antgroup_account")
	private String antgroupAccount;

	/**
	 * 银行账户
	 */
	@ApiField("bank_account")
	private String bankAccount;

	/**
	 * 开户行
	 */
	@ApiField("bank_branch_name")
	private String bankBranchName;

	/**
	 * 业务类型
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 采购员员工编码
	 */
	@ApiField("buyer")
	private String buyer;

	/**
	 * 采购员部门
	 */
	@ApiField("buyer_dept_code")
	private String buyerDeptCode;

	/**
	 * 采购经理员工编码
	 */
	@ApiField("buyer_manager")
	private String buyerManager;

	/**
	 * 采购员采购组织
	 */
	@ApiField("buyer_purchase_org_id")
	private Long buyerPurchaseOrgId;

	/**
	 * 业务公司
	 */
	@ApiField("company_code")
	private String companyCode;

	/**
	 * 公司名称
	 */
	@ApiField("company_name")
	private String companyName;

	/**
	 * 字段配置信息
	 */
	@ApiField("config_out_dto")
	private ConfigOutDTO configOutDto;

	/**
	 * 被供应商确认：
-- null 无需确认（默认）；
-- y 已确认；
-- n 待确认；
	 */
	@ApiField("confirmed")
	private String confirmed;

	/**
	 * 合同编号
	 */
	@ApiField("contract_number")
	private String contractNumber;

	/**
	 * ContractOrderSendLogDTO
	 */
	@ApiListField("contract_order_send_log_dto_list")
	@ApiField("contract_order_send_log_d_t_o")
	private List<ContractOrderSendLogDTO> contractOrderSendLogDtoList;

	/**
	 * 合同类型
	 */
	@ApiField("contract_type")
	private String contractType;

	/**
	 * 创建者
	 */
	@ApiField("creator")
	private String creator;

	/**
	 * 币种
	 */
	@ApiField("currency")
	private String currency;

	/**
	 * 数据来源
	 */
	@ApiField("data_source")
	private String dataSource;

	/**
	 * 需求方采购组织
	 */
	@ApiField("demander_purchase_org_id")
	private Long demanderPurchaseOrgId;

	/**
	 * 订单描述
	 */
	@ApiField("description")
	private String description;

	/**
	 * 订单有效期区间
	 */
	@ApiField("effect_date_range")
	private DateRangeDTO effectDateRange;

	/**
	 * 订单有效期区间end
	 */
	@ApiField("effect_date_range_end")
	private Date effectDateRangeEnd;

	/**
	 * 订单有效期区间_start
	 */
	@ApiField("effect_date_range_start")
	private Date effectDateRangeStart;

	/**
	 * 订单生效时间
	 */
	@ApiField("effect_time")
	private Date effectTime;

	/**
	 * 邮件发送状态
	 */
	@ApiField("email_status")
	private String emailStatus;

	/**
	 * 汇率
	 */
	@ApiField("exchange_rate")
	private String exchangeRate;

	/**
	 * 外部订单编号
	 */
	@ApiField("external_po_number")
	private String externalPoNumber;

	/**
	 * 文件
	 */
	@ApiListField("file_list")
	@ApiField("aecp_file_d_t_o")
	private List<AecpFileDTO> fileList;

	/**
	 * 附件
	 */
	@ApiField("files")
	private String files;

	/**
	 * 创建时间
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/**
	 * 修改时间
	 */
	@ApiField("gmt_modified")
	private Date gmtModified;

	/**
	 * 是否已有电子章
	 */
	@ApiField("has_electronic_sign")
	private Boolean hasElectronicSign;

	/**
	 * 订单ID
	 */
	@ApiField("id")
	private String id;

	/**
	 * 已开票总金额
	 */
	@ApiField("invoiced_amount")
	private String invoicedAmount;

	/**
	 * 是否支付宝
	 */
	@ApiField("is_ant_group")
	private Boolean isAntGroup;

	/**
	 * 是否现金支付
	 */
	@ApiField("is_cash_pay")
	private Boolean isCashPay;

	/**
	 * 是否支票支付
	 */
	@ApiField("is_cheque_pay")
	private Boolean isChequePay;

	/**
	 * 是否按明细发货
	 */
	@ApiField("is_delivery_detail")
	private Boolean isDeliveryDetail;

	/**
	 * 是否到期提醒
	 */
	@ApiField("is_expire_remind")
	private Boolean isExpireRemind;

	/**
	 * 订单明细
	 */
	@ApiListField("item_list")
	@ApiField("purchase_order_item_out_d_t_o")
	private List<PurchaseOrderItemOutDTO> itemList;

	/**
	 * 修改者
	 */
	@ApiField("modifier")
	private String modifier;

	/**
	 * 无合同理由
	 */
	@ApiField("no_contract_reason")
	private String noContractReason;

	/**
	 * 下单途径
	 */
	@ApiField("order_channel")
	private String orderChannel;

	/**
	 * 原始币种
	 */
	@ApiField("origin_currency")
	private String originCurrency;

	/**
	 * 阿里租户特有：财务公司代码
	 */
	@ApiField("ou_code")
	private String ouCode;

	/**
	 * 已付总金额
	 */
	@ApiField("paid_amount")
	private String paidAmount;

	/**
	 * 收款方户名
	 */
	@ApiField("payee_account_name")
	private String payeeAccountName;

	/**
	 * 收款方账户id
	 */
	@ApiField("payee_bank_id")
	private String payeeBankId;

	/**
	 * 收款方ID
	 */
	@ApiField("payee_id")
	private String payeeId;

	/**
	 * 收款方名称
	 */
	@ApiField("payee_name")
	private String payeeName;

	/**
	 * 付款计划
	 */
	@ApiField("payment_plan_dto")
	private PaymentPlanDTO paymentPlanDto;

	/**
	 * 开票信息
	 */
	@ApiField("po_billable_info_dto")
	private PoBillableInfoDto poBillableInfoDto;

	/**
	 * 订单编号
	 */
	@ApiField("po_number")
	private String poNumber;

	/**
	 * 报价审批通过时间
	 */
	@ApiField("quotation_approved_time")
	private Date quotationApprovedTime;

	/**
	 * 报价单号
	 */
	@ApiField("quotation_number")
	private String quotationNumber;

	/**
	 * 复用共框合同编码
	 */
	@ApiField("reusable_contract_code")
	private String reusableContractCode;

	/**
	 * 来源系统类型
	 */
	@ApiField("source_type")
	private String sourceType;

	/**
	 * 订单状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 结构化明细业务场景
	 */
	@ApiField("structured_detail_biz_scene")
	private String structuredDetailBizScene;

	/**
	 * 供应商ID
	 */
	@ApiField("supplier_id")
	private String supplierId;

	/**
	 * 供应商链接
	 */
	@ApiField("supplier_link")
	private LinkDTO supplierLink;

	/**
	 * 租户ID
	 */
	@ApiField("tenant_id")
	private Long tenantId;

	/**
	 * 已满足付款条件
	 */
	@ApiField("to_paid_amount")
	private String toPaidAmount;

	/**
	 * 订单总金额
	 */
	@ApiField("total_amount")
	private String totalAmount;

	public Boolean getAmountVisible() {
		return this.amountVisible;
	}
	public void setAmountVisible(Boolean amountVisible) {
		this.amountVisible = amountVisible;
	}

	public String getAntgroupAccount() {
		return this.antgroupAccount;
	}
	public void setAntgroupAccount(String antgroupAccount) {
		this.antgroupAccount = antgroupAccount;
	}

	public String getBankAccount() {
		return this.bankAccount;
	}
	public void setBankAccount(String bankAccount) {
		this.bankAccount = bankAccount;
	}

	public String getBankBranchName() {
		return this.bankBranchName;
	}
	public void setBankBranchName(String bankBranchName) {
		this.bankBranchName = bankBranchName;
	}

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getBuyer() {
		return this.buyer;
	}
	public void setBuyer(String buyer) {
		this.buyer = buyer;
	}

	public String getBuyerDeptCode() {
		return this.buyerDeptCode;
	}
	public void setBuyerDeptCode(String buyerDeptCode) {
		this.buyerDeptCode = buyerDeptCode;
	}

	public String getBuyerManager() {
		return this.buyerManager;
	}
	public void setBuyerManager(String buyerManager) {
		this.buyerManager = buyerManager;
	}

	public Long getBuyerPurchaseOrgId() {
		return this.buyerPurchaseOrgId;
	}
	public void setBuyerPurchaseOrgId(Long buyerPurchaseOrgId) {
		this.buyerPurchaseOrgId = buyerPurchaseOrgId;
	}

	public String getCompanyCode() {
		return this.companyCode;
	}
	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}

	public String getCompanyName() {
		return this.companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public ConfigOutDTO getConfigOutDto() {
		return this.configOutDto;
	}
	public void setConfigOutDto(ConfigOutDTO configOutDto) {
		this.configOutDto = configOutDto;
	}

	public String getConfirmed() {
		return this.confirmed;
	}
	public void setConfirmed(String confirmed) {
		this.confirmed = confirmed;
	}

	public String getContractNumber() {
		return this.contractNumber;
	}
	public void setContractNumber(String contractNumber) {
		this.contractNumber = contractNumber;
	}

	public List<ContractOrderSendLogDTO> getContractOrderSendLogDtoList() {
		return this.contractOrderSendLogDtoList;
	}
	public void setContractOrderSendLogDtoList(List<ContractOrderSendLogDTO> contractOrderSendLogDtoList) {
		this.contractOrderSendLogDtoList = contractOrderSendLogDtoList;
	}

	public String getContractType() {
		return this.contractType;
	}
	public void setContractType(String contractType) {
		this.contractType = contractType;
	}

	public String getCreator() {
		return this.creator;
	}
	public void setCreator(String creator) {
		this.creator = creator;
	}

	public String getCurrency() {
		return this.currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getDataSource() {
		return this.dataSource;
	}
	public void setDataSource(String dataSource) {
		this.dataSource = dataSource;
	}

	public Long getDemanderPurchaseOrgId() {
		return this.demanderPurchaseOrgId;
	}
	public void setDemanderPurchaseOrgId(Long demanderPurchaseOrgId) {
		this.demanderPurchaseOrgId = demanderPurchaseOrgId;
	}

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public DateRangeDTO getEffectDateRange() {
		return this.effectDateRange;
	}
	public void setEffectDateRange(DateRangeDTO effectDateRange) {
		this.effectDateRange = effectDateRange;
	}

	public Date getEffectDateRangeEnd() {
		return this.effectDateRangeEnd;
	}
	public void setEffectDateRangeEnd(Date effectDateRangeEnd) {
		this.effectDateRangeEnd = effectDateRangeEnd;
	}

	public Date getEffectDateRangeStart() {
		return this.effectDateRangeStart;
	}
	public void setEffectDateRangeStart(Date effectDateRangeStart) {
		this.effectDateRangeStart = effectDateRangeStart;
	}

	public Date getEffectTime() {
		return this.effectTime;
	}
	public void setEffectTime(Date effectTime) {
		this.effectTime = effectTime;
	}

	public String getEmailStatus() {
		return this.emailStatus;
	}
	public void setEmailStatus(String emailStatus) {
		this.emailStatus = emailStatus;
	}

	public String getExchangeRate() {
		return this.exchangeRate;
	}
	public void setExchangeRate(String exchangeRate) {
		this.exchangeRate = exchangeRate;
	}

	public String getExternalPoNumber() {
		return this.externalPoNumber;
	}
	public void setExternalPoNumber(String externalPoNumber) {
		this.externalPoNumber = externalPoNumber;
	}

	public List<AecpFileDTO> getFileList() {
		return this.fileList;
	}
	public void setFileList(List<AecpFileDTO> fileList) {
		this.fileList = fileList;
	}

	public String getFiles() {
		return this.files;
	}
	public void setFiles(String files) {
		this.files = files;
	}

	public Date getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public Date getGmtModified() {
		return this.gmtModified;
	}
	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}

	public Boolean getHasElectronicSign() {
		return this.hasElectronicSign;
	}
	public void setHasElectronicSign(Boolean hasElectronicSign) {
		this.hasElectronicSign = hasElectronicSign;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getInvoicedAmount() {
		return this.invoicedAmount;
	}
	public void setInvoicedAmount(String invoicedAmount) {
		this.invoicedAmount = invoicedAmount;
	}

	public Boolean getIsAntGroup() {
		return this.isAntGroup;
	}
	public void setIsAntGroup(Boolean isAntGroup) {
		this.isAntGroup = isAntGroup;
	}

	public Boolean getIsCashPay() {
		return this.isCashPay;
	}
	public void setIsCashPay(Boolean isCashPay) {
		this.isCashPay = isCashPay;
	}

	public Boolean getIsChequePay() {
		return this.isChequePay;
	}
	public void setIsChequePay(Boolean isChequePay) {
		this.isChequePay = isChequePay;
	}

	public Boolean getIsDeliveryDetail() {
		return this.isDeliveryDetail;
	}
	public void setIsDeliveryDetail(Boolean isDeliveryDetail) {
		this.isDeliveryDetail = isDeliveryDetail;
	}

	public Boolean getIsExpireRemind() {
		return this.isExpireRemind;
	}
	public void setIsExpireRemind(Boolean isExpireRemind) {
		this.isExpireRemind = isExpireRemind;
	}

	public List<PurchaseOrderItemOutDTO> getItemList() {
		return this.itemList;
	}
	public void setItemList(List<PurchaseOrderItemOutDTO> itemList) {
		this.itemList = itemList;
	}

	public String getModifier() {
		return this.modifier;
	}
	public void setModifier(String modifier) {
		this.modifier = modifier;
	}

	public String getNoContractReason() {
		return this.noContractReason;
	}
	public void setNoContractReason(String noContractReason) {
		this.noContractReason = noContractReason;
	}

	public String getOrderChannel() {
		return this.orderChannel;
	}
	public void setOrderChannel(String orderChannel) {
		this.orderChannel = orderChannel;
	}

	public String getOriginCurrency() {
		return this.originCurrency;
	}
	public void setOriginCurrency(String originCurrency) {
		this.originCurrency = originCurrency;
	}

	public String getOuCode() {
		return this.ouCode;
	}
	public void setOuCode(String ouCode) {
		this.ouCode = ouCode;
	}

	public String getPaidAmount() {
		return this.paidAmount;
	}
	public void setPaidAmount(String paidAmount) {
		this.paidAmount = paidAmount;
	}

	public String getPayeeAccountName() {
		return this.payeeAccountName;
	}
	public void setPayeeAccountName(String payeeAccountName) {
		this.payeeAccountName = payeeAccountName;
	}

	public String getPayeeBankId() {
		return this.payeeBankId;
	}
	public void setPayeeBankId(String payeeBankId) {
		this.payeeBankId = payeeBankId;
	}

	public String getPayeeId() {
		return this.payeeId;
	}
	public void setPayeeId(String payeeId) {
		this.payeeId = payeeId;
	}

	public String getPayeeName() {
		return this.payeeName;
	}
	public void setPayeeName(String payeeName) {
		this.payeeName = payeeName;
	}

	public PaymentPlanDTO getPaymentPlanDto() {
		return this.paymentPlanDto;
	}
	public void setPaymentPlanDto(PaymentPlanDTO paymentPlanDto) {
		this.paymentPlanDto = paymentPlanDto;
	}

	public PoBillableInfoDto getPoBillableInfoDto() {
		return this.poBillableInfoDto;
	}
	public void setPoBillableInfoDto(PoBillableInfoDto poBillableInfoDto) {
		this.poBillableInfoDto = poBillableInfoDto;
	}

	public String getPoNumber() {
		return this.poNumber;
	}
	public void setPoNumber(String poNumber) {
		this.poNumber = poNumber;
	}

	public Date getQuotationApprovedTime() {
		return this.quotationApprovedTime;
	}
	public void setQuotationApprovedTime(Date quotationApprovedTime) {
		this.quotationApprovedTime = quotationApprovedTime;
	}

	public String getQuotationNumber() {
		return this.quotationNumber;
	}
	public void setQuotationNumber(String quotationNumber) {
		this.quotationNumber = quotationNumber;
	}

	public String getReusableContractCode() {
		return this.reusableContractCode;
	}
	public void setReusableContractCode(String reusableContractCode) {
		this.reusableContractCode = reusableContractCode;
	}

	public String getSourceType() {
		return this.sourceType;
	}
	public void setSourceType(String sourceType) {
		this.sourceType = sourceType;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getStructuredDetailBizScene() {
		return this.structuredDetailBizScene;
	}
	public void setStructuredDetailBizScene(String structuredDetailBizScene) {
		this.structuredDetailBizScene = structuredDetailBizScene;
	}

	public String getSupplierId() {
		return this.supplierId;
	}
	public void setSupplierId(String supplierId) {
		this.supplierId = supplierId;
	}

	public LinkDTO getSupplierLink() {
		return this.supplierLink;
	}
	public void setSupplierLink(LinkDTO supplierLink) {
		this.supplierLink = supplierLink;
	}

	public Long getTenantId() {
		return this.tenantId;
	}
	public void setTenantId(Long tenantId) {
		this.tenantId = tenantId;
	}

	public String getToPaidAmount() {
		return this.toPaidAmount;
	}
	public void setToPaidAmount(String toPaidAmount) {
		this.toPaidAmount = toPaidAmount;
	}

	public String getTotalAmount() {
		return this.totalAmount;
	}
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

}
