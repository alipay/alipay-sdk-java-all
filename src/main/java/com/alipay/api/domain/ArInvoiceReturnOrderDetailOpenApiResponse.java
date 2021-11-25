package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 退换票详情VO
 *
 * @author auto create
 * @since 1.0, 2021-09-03 15:24:18
 */
public class ArInvoiceReturnOrderDetailOpenApiResponse extends AlipayObject {

	private static final long serialVersionUID = 5879627947297267688L;

	/**
	 * 附件地址
	 */
	@ApiListField("attach_urls")
	@ApiField("string")
	private List<String> attachUrls;

	/**
	 * 是否通过税务认证 true 通过, false 不通过
	 */
	@ApiField("auth")
	private Boolean auth;

	/**
	 * 申请人，标识是谁创建的这条记录
	 */
	@ApiField("creator")
	private String creator;

	/**
	 * 申请创建时间
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/**
	 * 申请最后一次的修改时间
	 */
	@ApiField("gmt_modified")
	private Date gmtModified;

	/**
	 * 票面金额
	 */
	@ApiField("invoice_amt")
	private MultiCurrencyMoneyOpenApi invoiceAmt;

	/**
	 * 发票代码
	 */
	@ApiField("invoice_code")
	private String invoiceCode;

	/**
	 * 开票日期 格式(yyyyMMdd)
	 */
	@ApiField("invoice_date")
	private String invoiceDate;

	/**
	 * 发票id
	 */
	@ApiField("invoice_id")
	private String invoiceId;

	/**
	 * 发票号码
	 */
	@ApiField("invoice_no")
	private String invoiceNo;

	/**
	 * 发票状态;
01:待开票；
02:开票中;
03:已开票;
04:作废中;
05:已作废;
06:红冲中;
07:已红冲;
08:部分红冲;
09:无效;
	 */
	@ApiField("invoice_status")
	private String invoiceStatus;

	/**
	 * 发票种类 01 专票;02 普票;03 营业税发票;04 国际形式发票;05 其它发票
	 */
	@ApiField("invoice_type")
	private String invoiceType;

	/**
	 * 最后修改人，标识最后操作这条数据的人
	 */
	@ApiField("last_moder")
	private String lastModer;

	/**
	 * 申请编号
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 重开发票代码
	 */
	@ApiField("re_invoice_code")
	private String reInvoiceCode;

	/**
	 * 重开发票ID
	 */
	@ApiField("re_invoice_id")
	private String reInvoiceId;

	/**
	 * 重开发票号码
	 */
	@ApiField("re_invoice_no")
	private String reInvoiceNo;

	/**
	 * 红冲税务通知单号
	 */
	@ApiField("red_notice_no")
	private String redNoticeNo;

	/**
	 * 退换票申请明细ID
	 */
	@ApiField("return_order_detail_id")
	private String returnOrderDetailId;

	public List<String> getAttachUrls() {
		return this.attachUrls;
	}
	public void setAttachUrls(List<String> attachUrls) {
		this.attachUrls = attachUrls;
	}

	public Boolean getAuth() {
		return this.auth;
	}
	public void setAuth(Boolean auth) {
		this.auth = auth;
	}

	public String getCreator() {
		return this.creator;
	}
	public void setCreator(String creator) {
		this.creator = creator;
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

	public MultiCurrencyMoneyOpenApi getInvoiceAmt() {
		return this.invoiceAmt;
	}
	public void setInvoiceAmt(MultiCurrencyMoneyOpenApi invoiceAmt) {
		this.invoiceAmt = invoiceAmt;
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

	public String getInvoiceNo() {
		return this.invoiceNo;
	}
	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}

	public String getInvoiceStatus() {
		return this.invoiceStatus;
	}
	public void setInvoiceStatus(String invoiceStatus) {
		this.invoiceStatus = invoiceStatus;
	}

	public String getInvoiceType() {
		return this.invoiceType;
	}
	public void setInvoiceType(String invoiceType) {
		this.invoiceType = invoiceType;
	}

	public String getLastModer() {
		return this.lastModer;
	}
	public void setLastModer(String lastModer) {
		this.lastModer = lastModer;
	}

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getReInvoiceCode() {
		return this.reInvoiceCode;
	}
	public void setReInvoiceCode(String reInvoiceCode) {
		this.reInvoiceCode = reInvoiceCode;
	}

	public String getReInvoiceId() {
		return this.reInvoiceId;
	}
	public void setReInvoiceId(String reInvoiceId) {
		this.reInvoiceId = reInvoiceId;
	}

	public String getReInvoiceNo() {
		return this.reInvoiceNo;
	}
	public void setReInvoiceNo(String reInvoiceNo) {
		this.reInvoiceNo = reInvoiceNo;
	}

	public String getRedNoticeNo() {
		return this.redNoticeNo;
	}
	public void setRedNoticeNo(String redNoticeNo) {
		this.redNoticeNo = redNoticeNo;
	}

	public String getReturnOrderDetailId() {
		return this.returnOrderDetailId;
	}
	public void setReturnOrderDetailId(String returnOrderDetailId) {
		this.returnOrderDetailId = returnOrderDetailId;
	}

}
