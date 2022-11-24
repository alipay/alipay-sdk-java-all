package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 可开票单据response
 *
 * @author auto create
 * @since 1.0, 2020-08-28 13:49:12
 */
public class ArInvoiceReceiptOpenApiResponse extends AlipayObject {

	private static final long serialVersionUID = 6865731445674146361L;

	/**
	 * 合约号
	 */
	@ApiField("arrangement_no")
	private String arrangementNo;

	/**
	 * 可开票单据主键ID
	 */
	@ApiField("id")
	private String id;

	/**
	 * 机构ID
	 */
	@ApiField("inst_id")
	private String instId;

	/**
	 * 开票时间 格式：yyyymm
	 */
	@ApiField("inv_dt")
	private String invDt;

	/**
	 * 开票模式
01：实收开票， 02：应收开票， 03：累计实收开票
	 */
	@ApiField("inv_mode")
	private String invMode;

	/**
	 * 可开票金额
	 */
	@ApiField("invoice_amt")
	private MultiCurrencyMoneyOpenApi invoiceAmt;

	/**
	 * 已开票金额
	 */
	@ApiField("invoiced_amt")
	private MultiCurrencyMoneyOpenApi invoicedAmt;

	/**
	 * 结算ip_id
	 */
	@ApiField("ip_id")
	private String ipId;

	/**
	 * 结算对象ip_role_id
	 */
	@ApiField("ip_role_id")
	private String ipRoleId;

	/**
	 * 最后修改人
	 */
	@ApiField("last_moder")
	private String lastModer;

	/**
	 * 已关联发票金额
	 */
	@ApiField("link_invoice_amt")
	private MultiCurrencyMoneyOpenApi linkInvoiceAmt;

	/**
	 * 外部单据号，对应开票记录的月账单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 可开票单据来源，01：主站，02：芝麻，03：金融云，04：微贷
	 */
	@ApiField("out_biz_type")
	private String outBizType;

	/**
	 * 付款方式，1：资金，5：走量
	 */
	@ApiField("pay_way")
	private String payWay;

	/**
	 * 产品码
	 */
	@ApiField("prod_code")
	private String prodCode;

	/**
	 * 结算类型 ，01：实时，02：预收，03：后收，04：周期性，05：按日汇总，09：延期结算
	 */
	@ApiField("settle_type")
	private String settleType;

	/**
	 * 开票金额消耗状态：01未开票，02部分开票，03：已开票
	 */
	@ApiField("status")
	private String status;

	/**
	 * 税率
	 */
	@ApiField("tax_rate")
	private Long taxRate;

	/**
	 * 税收类型01：增值税，02：营业税
	 */
	@ApiField("tax_type")
	private String taxType;

	/**
	 * 租户ID
	 */
	@ApiField("tnt_inst_id")
	private String tntInstId;

	/**
	 * 类型，1：应收，2：返点
	 */
	@ApiField("type")
	private String type;

	public String getArrangementNo() {
		return this.arrangementNo;
	}
	public void setArrangementNo(String arrangementNo) {
		this.arrangementNo = arrangementNo;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getInstId() {
		return this.instId;
	}
	public void setInstId(String instId) {
		this.instId = instId;
	}

	public String getInvDt() {
		return this.invDt;
	}
	public void setInvDt(String invDt) {
		this.invDt = invDt;
	}

	public String getInvMode() {
		return this.invMode;
	}
	public void setInvMode(String invMode) {
		this.invMode = invMode;
	}

	public MultiCurrencyMoneyOpenApi getInvoiceAmt() {
		return this.invoiceAmt;
	}
	public void setInvoiceAmt(MultiCurrencyMoneyOpenApi invoiceAmt) {
		this.invoiceAmt = invoiceAmt;
	}

	public MultiCurrencyMoneyOpenApi getInvoicedAmt() {
		return this.invoicedAmt;
	}
	public void setInvoicedAmt(MultiCurrencyMoneyOpenApi invoicedAmt) {
		this.invoicedAmt = invoicedAmt;
	}

	public String getIpId() {
		return this.ipId;
	}
	public void setIpId(String ipId) {
		this.ipId = ipId;
	}

	public String getIpRoleId() {
		return this.ipRoleId;
	}
	public void setIpRoleId(String ipRoleId) {
		this.ipRoleId = ipRoleId;
	}

	public String getLastModer() {
		return this.lastModer;
	}
	public void setLastModer(String lastModer) {
		this.lastModer = lastModer;
	}

	public MultiCurrencyMoneyOpenApi getLinkInvoiceAmt() {
		return this.linkInvoiceAmt;
	}
	public void setLinkInvoiceAmt(MultiCurrencyMoneyOpenApi linkInvoiceAmt) {
		this.linkInvoiceAmt = linkInvoiceAmt;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getOutBizType() {
		return this.outBizType;
	}
	public void setOutBizType(String outBizType) {
		this.outBizType = outBizType;
	}

	public String getPayWay() {
		return this.payWay;
	}
	public void setPayWay(String payWay) {
		this.payWay = payWay;
	}

	public String getProdCode() {
		return this.prodCode;
	}
	public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
	}

	public String getSettleType() {
		return this.settleType;
	}
	public void setSettleType(String settleType) {
		this.settleType = settleType;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public Long getTaxRate() {
		return this.taxRate;
	}
	public void setTaxRate(Long taxRate) {
		this.taxRate = taxRate;
	}

	public String getTaxType() {
		return this.taxType;
	}
	public void setTaxType(String taxType) {
		this.taxType = taxType;
	}

	public String getTntInstId() {
		return this.tntInstId;
	}
	public void setTntInstId(String tntInstId) {
		this.tntInstId = tntInstId;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
