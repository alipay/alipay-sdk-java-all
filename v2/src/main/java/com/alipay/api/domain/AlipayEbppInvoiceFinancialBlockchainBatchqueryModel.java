package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 分页查询区块链票据列表
 *
 * @author auto create
 * @since 1.0, 2020-05-20 15:49:03
 */
public class AlipayEbppInvoiceFinancialBlockchainBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 1169477525923175356L;

	/**
	 * 证件号码的hash值，使用MD5算法获取的hash
	 */
	@ApiField("cert_no_hash")
	private String certNoHash;

	/**
	 * 证件类型
可选值（身份证：IDENTITY_CARD）
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 当前页码，起始号码是1
	 */
	@ApiField("current_page")
	private Long currentPage;

	/**
	 * 票据种类
可选值（财政电子票据：FINANCIAL_ELECTRONIC_BILL）
	 */
	@ApiField("invoice_kind")
	private String invoiceKind;

	/**
	 * 分页大小，最大值为50
	 */
	@ApiField("page_size")
	private Long pageSize;

	public String getCertNoHash() {
		return this.certNoHash;
	}
	public void setCertNoHash(String certNoHash) {
		this.certNoHash = certNoHash;
	}

	public String getCertType() {
		return this.certType;
	}
	public void setCertType(String certType) {
		this.certType = certType;
	}

	public Long getCurrentPage() {
		return this.currentPage;
	}
	public void setCurrentPage(Long currentPage) {
		this.currentPage = currentPage;
	}

	public String getInvoiceKind() {
		return this.invoiceKind;
	}
	public void setInvoiceKind(String invoiceKind) {
		this.invoiceKind = invoiceKind;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

}
