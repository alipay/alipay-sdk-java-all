package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 区块链金融业务的标准应收账款信息
 *
 * @author auto create
 * @since 1.0, 2020-04-02 21:23:01
 */
public class FinanceReceivableInfo extends AlipayObject {

	private static final long serialVersionUID = 5465395983341656655L;

	/**
	 * 账款金额，以元为单位，精确到小数点后2位
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 核心企业信息
	 */
	@ApiField("core_business_info")
	private FinanceMemberInfo coreBusinessInfo;

	/**
	 * 向核心企业授信的配置id(已弃用)，请参考credit_idxs
	 */
	@ApiListField("credit_ids")
	@ApiField("string")
	private List<String> creditIds;

	/**
	 * 授信列表
	 */
	@ApiListField("credit_idxs")
	@ApiField("finance_credit_item")
	private List<FinanceCreditItem> creditIdxs;

	/**
	 * 币种
	 */
	@ApiField("currency")
	private String currency;

	/**
	 * UTC标准格式
	 */
	@ApiField("expire_date")
	private String expireDate;

	/**
	 * 发票信息列表
	 */
	@ApiListField("invoice_list")
	@ApiField("finance_invoice_info")
	private List<FinanceInvoiceInfo> invoiceList;

	/**
	 * 备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 核心企业角度的应收账款编号
	 */
	@ApiField("out_asset_id")
	private String outAssetId;

	/**
	 * 采购内容信息
	 */
	@ApiField("purchase")
	private FinancePurchaseInfo purchase;

	/**
	 * 供应商信息
	 */
	@ApiField("supplier_info")
	private FinanceMemberInfo supplierInfo;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public FinanceMemberInfo getCoreBusinessInfo() {
		return this.coreBusinessInfo;
	}
	public void setCoreBusinessInfo(FinanceMemberInfo coreBusinessInfo) {
		this.coreBusinessInfo = coreBusinessInfo;
	}

	public List<String> getCreditIds() {
		return this.creditIds;
	}
	public void setCreditIds(List<String> creditIds) {
		this.creditIds = creditIds;
	}

	public List<FinanceCreditItem> getCreditIdxs() {
		return this.creditIdxs;
	}
	public void setCreditIdxs(List<FinanceCreditItem> creditIdxs) {
		this.creditIdxs = creditIdxs;
	}

	public String getCurrency() {
		return this.currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getExpireDate() {
		return this.expireDate;
	}
	public void setExpireDate(String expireDate) {
		this.expireDate = expireDate;
	}

	public List<FinanceInvoiceInfo> getInvoiceList() {
		return this.invoiceList;
	}
	public void setInvoiceList(List<FinanceInvoiceInfo> invoiceList) {
		this.invoiceList = invoiceList;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getOutAssetId() {
		return this.outAssetId;
	}
	public void setOutAssetId(String outAssetId) {
		this.outAssetId = outAssetId;
	}

	public FinancePurchaseInfo getPurchase() {
		return this.purchase;
	}
	public void setPurchase(FinancePurchaseInfo purchase) {
		this.purchase = purchase;
	}

	public FinanceMemberInfo getSupplierInfo() {
		return this.supplierInfo;
	}
	public void setSupplierInfo(FinanceMemberInfo supplierInfo) {
		this.supplierInfo = supplierInfo;
	}

}
