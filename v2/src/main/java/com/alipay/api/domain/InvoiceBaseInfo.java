package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 发票详情信息
 *
 * @author auto create
 * @since 1.0, 2024-01-24 11:14:34
 */
public class InvoiceBaseInfo extends AlipayObject {

	private static final long serialVersionUID = 2563834593117261519L;

	/**
	 * 发票校验码（返回后6位）
	 */
	@ApiField("check_code")
	private String checkCode;

	/**
	 * 价税合计金额（单位/元）
	 */
	@ApiField("invoice_amt")
	private String invoiceAmt;

	/**
	 * 发票类型：
ELEC_ADD_TAX_SIMPLE : 增值税普票-电子版
PAPER_ADD_TAX_SIMPLE：增值税普票-纸质版
PAPER_QUOTA：手撕定额发票
	 */
	@ApiField("invoice_category")
	private String invoiceCategory;

	/**
	 * 发票代码，全电票没有
	 */
	@ApiField("invoice_code")
	private String invoiceCode;

	/**
	 * 开票日期（yyyyMMdd）
	 */
	@ApiField("invoice_date")
	private String invoiceDate;

	/**
	 * 支付宝返回的已提交的发票唯一ID
	 */
	@ApiField("invoice_id")
	private String invoiceId;

	/**
	 * 发票影像文件存储地址
	 */
	@ApiField("invoice_image")
	private String invoiceImage;

	/**
	 * 发票号码（全电票的20位）
	 */
	@ApiField("invoice_no")
	private String invoiceNo;

	/**
	 * 发票外部索引号
	 */
	@ApiField("invoice_out_no")
	private String invoiceOutNo;

	/**
	 * 发票类型
	 */
	@ApiField("invoice_type")
	private String invoiceType;

	/**
	 * 开票主体，销方
	 */
	@ApiField("seller_company_name")
	private String sellerCompanyName;

	/**
	 * 税额
	 */
	@ApiField("tax_amt")
	private String taxAmt;

	/**
	 * 发票税局来源:
FULL_ELECTRONIC：全电发票,
TAX_CONTROLLED：税控发票
	 */
	@ApiField("tax_bureau_source")
	private String taxBureauSource;

	public String getCheckCode() {
		return this.checkCode;
	}
	public void setCheckCode(String checkCode) {
		this.checkCode = checkCode;
	}

	public String getInvoiceAmt() {
		return this.invoiceAmt;
	}
	public void setInvoiceAmt(String invoiceAmt) {
		this.invoiceAmt = invoiceAmt;
	}

	public String getInvoiceCategory() {
		return this.invoiceCategory;
	}
	public void setInvoiceCategory(String invoiceCategory) {
		this.invoiceCategory = invoiceCategory;
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

	public String getInvoiceId() {
		return this.invoiceId;
	}
	public void setInvoiceId(String invoiceId) {
		this.invoiceId = invoiceId;
	}

	public String getInvoiceImage() {
		return this.invoiceImage;
	}
	public void setInvoiceImage(String invoiceImage) {
		this.invoiceImage = invoiceImage;
	}

	public String getInvoiceNo() {
		return this.invoiceNo;
	}
	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}

	public String getInvoiceOutNo() {
		return this.invoiceOutNo;
	}
	public void setInvoiceOutNo(String invoiceOutNo) {
		this.invoiceOutNo = invoiceOutNo;
	}

	public String getInvoiceType() {
		return this.invoiceType;
	}
	public void setInvoiceType(String invoiceType) {
		this.invoiceType = invoiceType;
	}

	public String getSellerCompanyName() {
		return this.sellerCompanyName;
	}
	public void setSellerCompanyName(String sellerCompanyName) {
		this.sellerCompanyName = sellerCompanyName;
	}

	public String getTaxAmt() {
		return this.taxAmt;
	}
	public void setTaxAmt(String taxAmt) {
		this.taxAmt = taxAmt;
	}

	public String getTaxBureauSource() {
		return this.taxBureauSource;
	}
	public void setTaxBureauSource(String taxBureauSource) {
		this.taxBureauSource = taxBureauSource;
	}

}
