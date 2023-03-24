package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询待开票金额数据2.0
 *
 * @author auto create
 * @since 1.0, 2021-10-12 11:25:47
 */
public class AlipayBossFncOutputinvoiceRcptamountQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3278312497464253274L;

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
	 * Y：需开票  N：无需开票  空串：不按此条件过滤
	 */
	@ApiField("need_invoice")
	private String needInvoice;

	/**
	 * 业务单据号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 01 主站,02 芝麻,03 金融云,04 微贷,05 金融云_主站,06 统一结算,07 统一结算2.0
	 */
	@ApiField("out_biz_type")
	private String outBizType;

	/**
	 * 产品码
	 */
	@ApiField("product_code")
	private String productCode;

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

	public String getNeedInvoice() {
		return this.needInvoice;
	}
	public void setNeedInvoice(String needInvoice) {
		this.needInvoice = needInvoice;
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

}
