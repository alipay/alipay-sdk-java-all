package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 发票
 *
 * @author auto create
 * @since 1.0, 2023-08-29 20:52:14
 */
public class InputInvoiceOpenApiDTO extends AlipayObject {

	private static final long serialVersionUID = 8646491619657654159L;

	/**
	 * 发票总金额，币种单位见currency字段
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 是否海外某些国家的发票使用
	 */
	@ApiField("authorized_dealer")
	private String authorizedDealer;

	/**
	 * 业务类型
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 勾选状态
	 */
	@ApiField("certify_status")
	private String certifyStatus;

	/**
	 * 勾选状态描述
	 */
	@ApiField("certify_status_memo")
	private String certifyStatusMemo;

	/**
	 * 勾选成功时间
	 */
	@ApiField("certify_time")
	private Date certifyTime;

	/**
	 * 勾选成功人
	 */
	@ApiField("certify_user")
	private String certifyUser;

	/**
	 * 验真状态: 未验真，验真中, 验真成功, 验真失败
	 */
	@ApiField("check_status")
	private String checkStatus;

	/**
	 * 验真状态描述
	 */
	@ApiField("check_status_memo")
	private String checkStatusMemo;

	/**
	 * 校验码
	 */
	@ApiField("check_sum")
	private String checkSum;

	/**
	 * 验真时间
	 */
	@ApiField("check_time")
	private Date checkTime;

	/**
	 * 密文
	 */
	@ApiField("cipher_text")
	private String cipherText;

	/**
	 * ou
	 */
	@ApiField("company_code")
	private String companyCode;

	/**
	 * 币种
	 */
	@ApiField("currency")
	private String currency;

	/**
	 * 作废时间
	 */
	@ApiField("discard_time")
	private Date discardTime;

	/**
	 * 分发状态: 未分发，分发中，已分发，撤回中，分发失败
	 */
	@ApiField("distribute_status")
	private String distributeStatus;

	/**
	 * 分发状态描述
	 */
	@ApiField("distribute_status_memo")
	private String distributeStatusMemo;

	/**
	 * 有效税额,币种单位见currency字段
	 */
	@ApiField("effective_tax_amount")
	private String effectiveTaxAmount;

	/**
	 * 是电子发票的情况下，电子发票类型: PDF/OFD/IMG
	 */
	@ApiField("electronic_type")
	private String electronicType;

	/**
	 * 不含税金额,币种单位见currency字段
	 */
	@ApiField("excluding_tax_amount")
	private String excludingTaxAmount;

	/**
	 * 发票id
	 */
	@ApiField("id")
	private Long id;

	/**
	 * 影像的原始文件名称
	 */
	@ApiField("image_file_name")
	private String imageFileName;

	/**
	 * 影像ID
	 */
	@ApiField("image_id")
	private String imageId;

	/**
	 * 影像url
	 */
	@ApiField("image_url")
	private String imageUrl;

	/**
	 * 发票代码
	 */
	@ApiField("invoice_code")
	private String invoiceCode;

	/**
	 * 开票日期,格式yyyyMMdd
	 */
	@ApiField("invoice_date")
	private String invoiceDate;

	/**
	 * 发票开具类型，RED红票；BLUE蓝票；
	 */
	@ApiField("invoice_issue_type")
	private String invoiceIssueType;

	/**
	 * 发票行
	 */
	@ApiListField("invoice_line")
	@ApiField("input_invoice_line_open_api_d_t_o")
	private List<InputInvoiceLineOpenApiDTO> invoiceLine;

	/**
	 * 发票介质：PAPER纸质票、ELECTRONIC电子票
	 */
	@ApiField("invoice_material")
	private String invoiceMaterial;

	/**
	 * 发票介质描述
	 */
	@ApiField("invoice_material_memo")
	private String invoiceMaterialMemo;

	/**
	 * 发票号码
	 */
	@ApiField("invoice_no")
	private String invoiceNo;

	/**
	 * 发票备注
	 */
	@ApiField("invoice_remark")
	private String invoiceRemark;

	/**
	 * 发票类型，VAT_SPE专票；VAT_COMM普票
	 */
	@ApiField("invoice_type")
	private String invoiceType;

	/**
	 * 发票类型描述
	 */
	@ApiField("invoice_type_memo")
	private String invoiceTypeMemo;

	/**
	 * 开票国家类型(MAINLAND:大陆，NON_MAINLAND:非大陆，ALL_OVER_WORLD:全世界)
	 */
	@ApiField("issue_country_type")
	private String issueCountryType;

	/**
	 * 代开销方名称
	 */
	@ApiField("issued_seller_name")
	private String issuedSellerName;

	/**
	 * 代开单位税号
	 */
	@ApiField("issued_tax_no")
	private String issuedTaxNo;

	/**
	 * 机器编码
	 */
	@ApiField("machine_code")
	private String machineCode;

	/**
	 * 购方开户行及账号
	 */
	@ApiField("purchaser_bank_info")
	private String purchaserBankInfo;

	/**
	 * 购方代码
	 */
	@ApiField("purchaser_code")
	private String purchaserCode;

	/**
	 * 购方地址及电话
	 */
	@ApiField("purchaser_contact_info")
	private String purchaserContactInfo;

	/**
	 * 购方国家编码
	 */
	@ApiField("purchaser_country_code")
	private String purchaserCountryCode;

	/**
	 * 购方名称
	 */
	@ApiField("purchaser_name")
	private String purchaserName;

	/**
	 * 购方地区编码
	 */
	@ApiField("purchaser_region_code")
	private String purchaserRegionCode;

	/**
	 * 购方税号
	 */
	@ApiField("purchaser_tax_no")
	private String purchaserTaxNo;

	/**
	 * 二维码密文
	 */
	@ApiField("qr_code_cipher_text")
	private String qrCodeCipherText;

	/**
	 * 二维码标志
	 */
	@ApiField("qr_code_flag")
	private String qrCodeFlag;

	/**
	 * 登记时，选业务身份，可空
	 */
	@ApiField("reg_biz_identity_code")
	private String regBizIdentityCode;

	/**
	 * 登记时，所选的OU
	 */
	@ApiField("reg_biz_identity_ou")
	private String regBizIdentityOu;

	/**
	 * 所属的平台
	 */
	@ApiField("reg_platform_code")
	private String regPlatformCode;

	/**
	 * 登记状态
	 */
	@ApiField("reg_status")
	private String regStatus;

	/**
	 * 登记状态描述
	 */
	@ApiField("reg_status_memo")
	private String regStatusMemo;

	/**
	 * 登记成功时间
	 */
	@ApiField("reg_time")
	private Date regTime;

	/**
	 * 登记人
	 */
	@ApiField("reg_user")
	private String regUser;

	/**
	 * 登记通道
	 */
	@ApiField("register_channel")
	private String registerChannel;

	/**
	 * 登记通道描述
	 */
	@ApiField("register_channel_memo")
	private String registerChannelMemo;

	/**
	 * 关联单据号
	 */
	@ApiField("related_order")
	private String relatedOrder;

	/**
	 * 业务来源,如智付、关联交易、报销、银泰AP、盒马AP、菜鸟AP等
	 */
	@ApiField("related_system")
	private String relatedSystem;

	/**
	 * 退票时间
	 */
	@ApiField("return_time")
	private Date returnTime;

	/**
	 * 退票人
	 */
	@ApiField("return_user")
	private String returnUser;

	/**
	 * 退票快递公司
	 */
	@ApiField("return_waybill_company")
	private String returnWaybillCompany;

	/**
	 * 退票快递单号
	 */
	@ApiField("return_waybill_no")
	private String returnWaybillNo;

	/**
	 * 扫描帐号
	 */
	@ApiField("scan_account")
	private String scanAccount;

	/**
	 * 销方开户行及账号
	 */
	@ApiField("seller_bank_info")
	private String sellerBankInfo;

	/**
	 * 销方代码
	 */
	@ApiField("seller_code")
	private String sellerCode;

	/**
	 * 销方地址及电话
	 */
	@ApiField("seller_contact_info")
	private String sellerContactInfo;

	/**
	 * 销方国家编码
	 */
	@ApiField("seller_country_code")
	private String sellerCountryCode;

	/**
	 * sellerName
	 */
	@ApiField("seller_name")
	private String sellerName;

	/**
	 * 销方地区编码
	 */
	@ApiField("seller_region_code")
	private String sellerRegionCode;

	/**
	 * 销方税号
	 */
	@ApiField("seller_tax_no")
	private String sellerTaxNo;

	/**
	 * 税额，币种单位见currency字段
	 */
	@ApiField("tax_amount")
	private String taxAmount;

	/**
	 * 认证所属期
	 */
	@ApiField("tax_period")
	private String taxPeriod;

	/**
	 * 税率
	 */
	@ApiField("tax_rate")
	private Long taxRate;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getAuthorizedDealer() {
		return this.authorizedDealer;
	}
	public void setAuthorizedDealer(String authorizedDealer) {
		this.authorizedDealer = authorizedDealer;
	}

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getCertifyStatus() {
		return this.certifyStatus;
	}
	public void setCertifyStatus(String certifyStatus) {
		this.certifyStatus = certifyStatus;
	}

	public String getCertifyStatusMemo() {
		return this.certifyStatusMemo;
	}
	public void setCertifyStatusMemo(String certifyStatusMemo) {
		this.certifyStatusMemo = certifyStatusMemo;
	}

	public Date getCertifyTime() {
		return this.certifyTime;
	}
	public void setCertifyTime(Date certifyTime) {
		this.certifyTime = certifyTime;
	}

	public String getCertifyUser() {
		return this.certifyUser;
	}
	public void setCertifyUser(String certifyUser) {
		this.certifyUser = certifyUser;
	}

	public String getCheckStatus() {
		return this.checkStatus;
	}
	public void setCheckStatus(String checkStatus) {
		this.checkStatus = checkStatus;
	}

	public String getCheckStatusMemo() {
		return this.checkStatusMemo;
	}
	public void setCheckStatusMemo(String checkStatusMemo) {
		this.checkStatusMemo = checkStatusMemo;
	}

	public String getCheckSum() {
		return this.checkSum;
	}
	public void setCheckSum(String checkSum) {
		this.checkSum = checkSum;
	}

	public Date getCheckTime() {
		return this.checkTime;
	}
	public void setCheckTime(Date checkTime) {
		this.checkTime = checkTime;
	}

	public String getCipherText() {
		return this.cipherText;
	}
	public void setCipherText(String cipherText) {
		this.cipherText = cipherText;
	}

	public String getCompanyCode() {
		return this.companyCode;
	}
	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}

	public String getCurrency() {
		return this.currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public Date getDiscardTime() {
		return this.discardTime;
	}
	public void setDiscardTime(Date discardTime) {
		this.discardTime = discardTime;
	}

	public String getDistributeStatus() {
		return this.distributeStatus;
	}
	public void setDistributeStatus(String distributeStatus) {
		this.distributeStatus = distributeStatus;
	}

	public String getDistributeStatusMemo() {
		return this.distributeStatusMemo;
	}
	public void setDistributeStatusMemo(String distributeStatusMemo) {
		this.distributeStatusMemo = distributeStatusMemo;
	}

	public String getEffectiveTaxAmount() {
		return this.effectiveTaxAmount;
	}
	public void setEffectiveTaxAmount(String effectiveTaxAmount) {
		this.effectiveTaxAmount = effectiveTaxAmount;
	}

	public String getElectronicType() {
		return this.electronicType;
	}
	public void setElectronicType(String electronicType) {
		this.electronicType = electronicType;
	}

	public String getExcludingTaxAmount() {
		return this.excludingTaxAmount;
	}
	public void setExcludingTaxAmount(String excludingTaxAmount) {
		this.excludingTaxAmount = excludingTaxAmount;
	}

	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getImageFileName() {
		return this.imageFileName;
	}
	public void setImageFileName(String imageFileName) {
		this.imageFileName = imageFileName;
	}

	public String getImageId() {
		return this.imageId;
	}
	public void setImageId(String imageId) {
		this.imageId = imageId;
	}

	public String getImageUrl() {
		return this.imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getInvoiceCode() {
		return this.invoiceCode;
	}
	public void setInvoiceCode(String invoiceCode) {
		this.invoiceCode = invoiceCode;
	}

	public String getInvoiceDate() {
		return this.invoiceDate;
	}
	public void setInvoiceDate(String invoiceDate) {
		this.invoiceDate = invoiceDate;
	}

	public String getInvoiceIssueType() {
		return this.invoiceIssueType;
	}
	public void setInvoiceIssueType(String invoiceIssueType) {
		this.invoiceIssueType = invoiceIssueType;
	}

	public List<InputInvoiceLineOpenApiDTO> getInvoiceLine() {
		return this.invoiceLine;
	}
	public void setInvoiceLine(List<InputInvoiceLineOpenApiDTO> invoiceLine) {
		this.invoiceLine = invoiceLine;
	}

	public String getInvoiceMaterial() {
		return this.invoiceMaterial;
	}
	public void setInvoiceMaterial(String invoiceMaterial) {
		this.invoiceMaterial = invoiceMaterial;
	}

	public String getInvoiceMaterialMemo() {
		return this.invoiceMaterialMemo;
	}
	public void setInvoiceMaterialMemo(String invoiceMaterialMemo) {
		this.invoiceMaterialMemo = invoiceMaterialMemo;
	}

	public String getInvoiceNo() {
		return this.invoiceNo;
	}
	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}

	public String getInvoiceRemark() {
		return this.invoiceRemark;
	}
	public void setInvoiceRemark(String invoiceRemark) {
		this.invoiceRemark = invoiceRemark;
	}

	public String getInvoiceType() {
		return this.invoiceType;
	}
	public void setInvoiceType(String invoiceType) {
		this.invoiceType = invoiceType;
	}

	public String getInvoiceTypeMemo() {
		return this.invoiceTypeMemo;
	}
	public void setInvoiceTypeMemo(String invoiceTypeMemo) {
		this.invoiceTypeMemo = invoiceTypeMemo;
	}

	public String getIssueCountryType() {
		return this.issueCountryType;
	}
	public void setIssueCountryType(String issueCountryType) {
		this.issueCountryType = issueCountryType;
	}

	public String getIssuedSellerName() {
		return this.issuedSellerName;
	}
	public void setIssuedSellerName(String issuedSellerName) {
		this.issuedSellerName = issuedSellerName;
	}

	public String getIssuedTaxNo() {
		return this.issuedTaxNo;
	}
	public void setIssuedTaxNo(String issuedTaxNo) {
		this.issuedTaxNo = issuedTaxNo;
	}

	public String getMachineCode() {
		return this.machineCode;
	}
	public void setMachineCode(String machineCode) {
		this.machineCode = machineCode;
	}

	public String getPurchaserBankInfo() {
		return this.purchaserBankInfo;
	}
	public void setPurchaserBankInfo(String purchaserBankInfo) {
		this.purchaserBankInfo = purchaserBankInfo;
	}

	public String getPurchaserCode() {
		return this.purchaserCode;
	}
	public void setPurchaserCode(String purchaserCode) {
		this.purchaserCode = purchaserCode;
	}

	public String getPurchaserContactInfo() {
		return this.purchaserContactInfo;
	}
	public void setPurchaserContactInfo(String purchaserContactInfo) {
		this.purchaserContactInfo = purchaserContactInfo;
	}

	public String getPurchaserCountryCode() {
		return this.purchaserCountryCode;
	}
	public void setPurchaserCountryCode(String purchaserCountryCode) {
		this.purchaserCountryCode = purchaserCountryCode;
	}

	public String getPurchaserName() {
		return this.purchaserName;
	}
	public void setPurchaserName(String purchaserName) {
		this.purchaserName = purchaserName;
	}

	public String getPurchaserRegionCode() {
		return this.purchaserRegionCode;
	}
	public void setPurchaserRegionCode(String purchaserRegionCode) {
		this.purchaserRegionCode = purchaserRegionCode;
	}

	public String getPurchaserTaxNo() {
		return this.purchaserTaxNo;
	}
	public void setPurchaserTaxNo(String purchaserTaxNo) {
		this.purchaserTaxNo = purchaserTaxNo;
	}

	public String getQrCodeCipherText() {
		return this.qrCodeCipherText;
	}
	public void setQrCodeCipherText(String qrCodeCipherText) {
		this.qrCodeCipherText = qrCodeCipherText;
	}

	public String getQrCodeFlag() {
		return this.qrCodeFlag;
	}
	public void setQrCodeFlag(String qrCodeFlag) {
		this.qrCodeFlag = qrCodeFlag;
	}

	public String getRegBizIdentityCode() {
		return this.regBizIdentityCode;
	}
	public void setRegBizIdentityCode(String regBizIdentityCode) {
		this.regBizIdentityCode = regBizIdentityCode;
	}

	public String getRegBizIdentityOu() {
		return this.regBizIdentityOu;
	}
	public void setRegBizIdentityOu(String regBizIdentityOu) {
		this.regBizIdentityOu = regBizIdentityOu;
	}

	public String getRegPlatformCode() {
		return this.regPlatformCode;
	}
	public void setRegPlatformCode(String regPlatformCode) {
		this.regPlatformCode = regPlatformCode;
	}

	public String getRegStatus() {
		return this.regStatus;
	}
	public void setRegStatus(String regStatus) {
		this.regStatus = regStatus;
	}

	public String getRegStatusMemo() {
		return this.regStatusMemo;
	}
	public void setRegStatusMemo(String regStatusMemo) {
		this.regStatusMemo = regStatusMemo;
	}

	public Date getRegTime() {
		return this.regTime;
	}
	public void setRegTime(Date regTime) {
		this.regTime = regTime;
	}

	public String getRegUser() {
		return this.regUser;
	}
	public void setRegUser(String regUser) {
		this.regUser = regUser;
	}

	public String getRegisterChannel() {
		return this.registerChannel;
	}
	public void setRegisterChannel(String registerChannel) {
		this.registerChannel = registerChannel;
	}

	public String getRegisterChannelMemo() {
		return this.registerChannelMemo;
	}
	public void setRegisterChannelMemo(String registerChannelMemo) {
		this.registerChannelMemo = registerChannelMemo;
	}

	public String getRelatedOrder() {
		return this.relatedOrder;
	}
	public void setRelatedOrder(String relatedOrder) {
		this.relatedOrder = relatedOrder;
	}

	public String getRelatedSystem() {
		return this.relatedSystem;
	}
	public void setRelatedSystem(String relatedSystem) {
		this.relatedSystem = relatedSystem;
	}

	public Date getReturnTime() {
		return this.returnTime;
	}
	public void setReturnTime(Date returnTime) {
		this.returnTime = returnTime;
	}

	public String getReturnUser() {
		return this.returnUser;
	}
	public void setReturnUser(String returnUser) {
		this.returnUser = returnUser;
	}

	public String getReturnWaybillCompany() {
		return this.returnWaybillCompany;
	}
	public void setReturnWaybillCompany(String returnWaybillCompany) {
		this.returnWaybillCompany = returnWaybillCompany;
	}

	public String getReturnWaybillNo() {
		return this.returnWaybillNo;
	}
	public void setReturnWaybillNo(String returnWaybillNo) {
		this.returnWaybillNo = returnWaybillNo;
	}

	public String getScanAccount() {
		return this.scanAccount;
	}
	public void setScanAccount(String scanAccount) {
		this.scanAccount = scanAccount;
	}

	public String getSellerBankInfo() {
		return this.sellerBankInfo;
	}
	public void setSellerBankInfo(String sellerBankInfo) {
		this.sellerBankInfo = sellerBankInfo;
	}

	public String getSellerCode() {
		return this.sellerCode;
	}
	public void setSellerCode(String sellerCode) {
		this.sellerCode = sellerCode;
	}

	public String getSellerContactInfo() {
		return this.sellerContactInfo;
	}
	public void setSellerContactInfo(String sellerContactInfo) {
		this.sellerContactInfo = sellerContactInfo;
	}

	public String getSellerCountryCode() {
		return this.sellerCountryCode;
	}
	public void setSellerCountryCode(String sellerCountryCode) {
		this.sellerCountryCode = sellerCountryCode;
	}

	public String getSellerName() {
		return this.sellerName;
	}
	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	public String getSellerRegionCode() {
		return this.sellerRegionCode;
	}
	public void setSellerRegionCode(String sellerRegionCode) {
		this.sellerRegionCode = sellerRegionCode;
	}

	public String getSellerTaxNo() {
		return this.sellerTaxNo;
	}
	public void setSellerTaxNo(String sellerTaxNo) {
		this.sellerTaxNo = sellerTaxNo;
	}

	public String getTaxAmount() {
		return this.taxAmount;
	}
	public void setTaxAmount(String taxAmount) {
		this.taxAmount = taxAmount;
	}

	public String getTaxPeriod() {
		return this.taxPeriod;
	}
	public void setTaxPeriod(String taxPeriod) {
		this.taxPeriod = taxPeriod;
	}

	public Long getTaxRate() {
		return this.taxRate;
	}
	public void setTaxRate(Long taxRate) {
		this.taxRate = taxRate;
	}

}
