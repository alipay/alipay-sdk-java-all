package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询待开票金额数据
 *
 * @author auto create
 * @since 1.0, 2021-11-12 10:39:45
 */
public class AlipayBossFncArinvoiceRcptamountQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1218772474284333861L;

	/**
	 * 合约号
	 */
	@ApiField("ar_no")
	private String arNo;

	/**
	 * OU机构ID
	 */
	@ApiField("inst_id")
	private String instId;

	/**
	 * 发票开始月份 格式yyyyMM
	 */
	@ApiField("invoice_date_begin")
	private String invoiceDateBegin;

	/**
	 * 发票结束月份 格式yyyyMM
	 */
	@ApiField("invoice_date_end")
	private String invoiceDateEnd;

	/**
	 * PAID_INVOICE : "01" : "每月实收开票" RECEIVABLE_INVOICE : "02" : "应收开票" SUM_PAID_INVOICE : "03" : "累计实收开票"
	 */
	@ApiField("invoice_mode")
	private String invoiceMode;

	/**
	 * 商户MID
	 */
	@ApiField("ip_id")
	private String ipId;

	/**
	 * 商户PID
	 */
	@ApiField("ip_role_id")
	private String ipRoleId;

	/**
	 * 业务单据号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * SETTLE("06", "SETTLE", "统一结算", "统一结算")
	 */
	@ApiField("out_biz_type")
	private String outBizType;

	/**
	 * 产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * REVENUE("1", "应收"), DISCOUNT("2", "返点"), DEFER("4", "递延"), REVENUE_ACCRUAL("21","计提应收账单"), DISCOUNT_ACCRUAL("22","计提返点账单"), DEFER_ACCRUAL("23","递延摊销账单"), SETTLEMENT_BILL("99","结算单"),
	 */
	@ApiField("type")
	private String type;

	public String getArNo() {
		return this.arNo;
	}
	public void setArNo(String arNo) {
		this.arNo = arNo;
	}

	public String getInstId() {
		return this.instId;
	}
	public void setInstId(String instId) {
		this.instId = instId;
	}

	public String getInvoiceDateBegin() {
		return this.invoiceDateBegin;
	}
	public void setInvoiceDateBegin(String invoiceDateBegin) {
		this.invoiceDateBegin = invoiceDateBegin;
	}

	public String getInvoiceDateEnd() {
		return this.invoiceDateEnd;
	}
	public void setInvoiceDateEnd(String invoiceDateEnd) {
		this.invoiceDateEnd = invoiceDateEnd;
	}

	public String getInvoiceMode() {
		return this.invoiceMode;
	}
	public void setInvoiceMode(String invoiceMode) {
		this.invoiceMode = invoiceMode;
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

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
