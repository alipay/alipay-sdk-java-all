package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 获取指定企业税号的用户发票要素列表
 *
 * @author auto create
 * @since 1.0, 2023-02-20 21:28:49
 */
public class AlipayEbppInvoiceTaxnoBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 4454469177176584343L;

	/**
	 * 默认值为false。true为输出交易信息，false为不输出交易信息。
	 */
	@ApiField("enable_trade_out")
	private String enableTradeOut;

	/**
	 * 查询结束时间，精确到天（按开票日期查询）
start_invoice_date和end_invoice_date传值要求
1.同时为空时，返回最近半年200条数据
2.必须同时为空 或 同时不为空
3.结束日期不能大于当前日期
4.开始时间和结束时间跨度不能超过6个月
	 */
	@ApiField("end_invoice_date")
	private String endInvoiceDate;

	/**
	 * 查询票种列表。枚举值如下：
*PLAIN：增值税电子普通发票；
*SPECIAL：增值税专用发票；
*ALL_ELECTRONIC_GENERAL： "电子发票（普通发票）;
*ALL_ELECTRONIC_SPECIAL： "电子发票（专用发票）;
*PLAIN_INVOICE：增值税普通发票；
*PAPER_INVOICE：增值税普通发票（卷式）；
*SALSE_INVOICE：机动车销售统一发票。
	 */
	@ApiListField("invoice_kind_list")
	@ApiField("string")
	private List<String> invoiceKindList;

	/**
	 * 查询结果上限笔数，最大值20
	 */
	@ApiField("limit_size")
	private Long limitSize;

	/**
	 * 当前页码，为空时默认第一页
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 发票要素获取应用场景。<a href="https://opendocs.alipay.com/open/10691/bv8s88">"拉"模式报销</a> 固定为 INVOICE_EXPENSE 表示发票报销。
	 */
	@ApiField("scene")
	private String scene;

	/**
	 * 查询起始时间，精确到天（按开票日期查询）
start_invoice_date和end_invoice_date传值要求
1.同时为空时，返回最近半年200条数据
2.必须同时为空 或 同时不为空
3.结束日期不能大于当前日期
4.开始时间和结束时间跨度不能超过6个月
	 */
	@ApiField("start_invoice_date")
	private String startInvoiceDate;

	/**
	 * 企业税号
	 */
	@ApiField("tax_no")
	private String taxNo;

	public String getEnableTradeOut() {
		return this.enableTradeOut;
	}
	public void setEnableTradeOut(String enableTradeOut) {
		this.enableTradeOut = enableTradeOut;
	}

	public String getEndInvoiceDate() {
		return this.endInvoiceDate;
	}
	public void setEndInvoiceDate(String endInvoiceDate) {
		this.endInvoiceDate = endInvoiceDate;
	}

	public List<String> getInvoiceKindList() {
		return this.invoiceKindList;
	}
	public void setInvoiceKindList(List<String> invoiceKindList) {
		this.invoiceKindList = invoiceKindList;
	}

	public Long getLimitSize() {
		return this.limitSize;
	}
	public void setLimitSize(Long limitSize) {
		this.limitSize = limitSize;
	}

	public Long getPageNum() {
		return this.pageNum;
	}
	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
	}

	public String getStartInvoiceDate() {
		return this.startInvoiceDate;
	}
	public void setStartInvoiceDate(String startInvoiceDate) {
		this.startInvoiceDate = startInvoiceDate;
	}

	public String getTaxNo() {
		return this.taxNo;
	}
	public void setTaxNo(String taxNo) {
		this.taxNo = taxNo;
	}

}
