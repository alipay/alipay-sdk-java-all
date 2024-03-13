package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 支付记录具体数据模型
 *
 * @author auto create
 * @since 1.0, 2020-04-03 15:05:13
 */
public class TransactionDetailDTO extends AlipayObject {

	private static final long serialVersionUID = 1727965426618857921L;

	/**
	 * 订单金额
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 非实付金额列表
	 */
	@ApiListField("amount_modifiers")
	@ApiField("transaction_amount_modifier_d_t_o")
	private List<TransactionAmountModifierDTO> amountModifiers;

	/**
	 * 支付中断推进方式
	 */
	@ApiField("authentication_details")
	private TransactionAuthenticationDetailDTO authenticationDetails;

	/**
	 * 条码id
	 */
	@ApiField("barcode_identifier")
	private String barcodeIdentifier;

	/**
	 * 币种
	 */
	@ApiField("currency_code")
	private String currencyCode;

	/**
	 * 卡id
	 */
	@ApiField("dpan_identifier")
	private String dpanIdentifier;

	/**
	 * tradeNo
	 */
	@ApiField("identifier")
	private String identifier;

	/**
	 * xxx
	 */
	@ApiField("merchant_name")
	private String merchantName;

	/**
	 * 实付金额
	 */
	@ApiField("nominal_amount")
	private String nominalAmount;

	/**
	 * 支付主渠道
	 */
	@ApiField("primary_funding_source_description")
	private String primaryFundingSourceDescription;

	/**
	 * pId
	 */
	@ApiField("raw_merchant_name")
	private String rawMerchantName;

	/**
	 * iso8601格式时间
	 */
	@ApiField("transaction_date")
	private String transactionDate;

	/**
	 * 交易标识
	 */
	@ApiField("transaction_identifier")
	private String transactionIdentifier;

	/**
	 * 交易状态
	 */
	@ApiField("transaction_status")
	private String transactionStatus;

	/**
	 * 交易类型
	 */
	@ApiField("transaction_type")
	private String transactionType;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public List<TransactionAmountModifierDTO> getAmountModifiers() {
		return this.amountModifiers;
	}
	public void setAmountModifiers(List<TransactionAmountModifierDTO> amountModifiers) {
		this.amountModifiers = amountModifiers;
	}

	public TransactionAuthenticationDetailDTO getAuthenticationDetails() {
		return this.authenticationDetails;
	}
	public void setAuthenticationDetails(TransactionAuthenticationDetailDTO authenticationDetails) {
		this.authenticationDetails = authenticationDetails;
	}

	public String getBarcodeIdentifier() {
		return this.barcodeIdentifier;
	}
	public void setBarcodeIdentifier(String barcodeIdentifier) {
		this.barcodeIdentifier = barcodeIdentifier;
	}

	public String getCurrencyCode() {
		return this.currencyCode;
	}
	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	public String getDpanIdentifier() {
		return this.dpanIdentifier;
	}
	public void setDpanIdentifier(String dpanIdentifier) {
		this.dpanIdentifier = dpanIdentifier;
	}

	public String getIdentifier() {
		return this.identifier;
	}
	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	public String getMerchantName() {
		return this.merchantName;
	}
	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}

	public String getNominalAmount() {
		return this.nominalAmount;
	}
	public void setNominalAmount(String nominalAmount) {
		this.nominalAmount = nominalAmount;
	}

	public String getPrimaryFundingSourceDescription() {
		return this.primaryFundingSourceDescription;
	}
	public void setPrimaryFundingSourceDescription(String primaryFundingSourceDescription) {
		this.primaryFundingSourceDescription = primaryFundingSourceDescription;
	}

	public String getRawMerchantName() {
		return this.rawMerchantName;
	}
	public void setRawMerchantName(String rawMerchantName) {
		this.rawMerchantName = rawMerchantName;
	}

	public String getTransactionDate() {
		return this.transactionDate;
	}
	public void setTransactionDate(String transactionDate) {
		this.transactionDate = transactionDate;
	}

	public String getTransactionIdentifier() {
		return this.transactionIdentifier;
	}
	public void setTransactionIdentifier(String transactionIdentifier) {
		this.transactionIdentifier = transactionIdentifier;
	}

	public String getTransactionStatus() {
		return this.transactionStatus;
	}
	public void setTransactionStatus(String transactionStatus) {
		this.transactionStatus = transactionStatus;
	}

	public String getTransactionType() {
		return this.transactionType;
	}
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

}
