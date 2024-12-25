package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 应收发票综合查询
 *
 * @author auto create
 * @since 1.0, 2024-01-22 09:39:36
 */
public class AlipayBossFncInvoiceBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 2855423598317267835L;

	/**
	 * 开票申请ID，唯一标识开票申请表的ID
	 */
	@ApiField("apply_order_id")
	private String applyOrderId;

	/**
	 * 买方发票抬头，用于打印在发票上
	 */
	@ApiField("buyer_invoice_title")
	private String buyerInvoiceTitle;

	/**
	 * 对应发票商户的ipId，在主站标示mid，在其他环境标示ip_id。
	 */
	@ApiField("buyer_ipid")
	private String buyerIpid;

	/**
	 * 购方商户ID集合
	 */
	@ApiListField("buyer_ipids")
	@ApiField("string")
	private List<String> buyerIpids;

	/**
	 * 商户结算的ipRoleId，表示商户的结算对象，在主站表示pid。
	 */
	@ApiField("buyer_iprole_id")
	private String buyerIproleId;

	/**
	 * 购方PID集合
	 */
	@ApiListField("buyer_iprole_ids")
	@ApiField("string")
	private List<String> buyerIproleIds;

	/**
	 * 对应发票所在OU的id，用于标示该发票所述的OU。
	 */
	@ApiField("inst_id")
	private String instId;

	/**
	 * 开票渠道 01 线上;02 线下
	 */
	@ApiField("invoice_channel")
	private String invoiceChannel;

	/**
	 * 发票代码，税务部门给予发票的编码
	 */
	@ApiField("invoice_code")
	private String invoiceCode;

	/**
	 * 发票创建日期【起始日期，格式yyyyMMdd】
	 */
	@ApiField("invoice_create_date_begin")
	private String invoiceCreateDateBegin;

	/**
	 * 发票创建日期【结束日期，格式yyyyMMdd】
	 */
	@ApiField("invoice_create_date_end")
	private String invoiceCreateDateEnd;

	/**
	 * 发票ID集合，发票ID，唯一标示一张发票的ID
	 */
	@ApiListField("invoice_ids")
	@ApiField("string")
	private List<String> invoiceIds;

	/**
	 * 开票介质 01电子 02纸质
	 */
	@ApiField("invoice_material")
	private String invoiceMaterial;

	/**
	 * 发票号码，税务部门给予发票的编码
	 */
	@ApiField("invoice_no")
	private String invoiceNo;

	/**
	 * 发票开票日期【起始日期，格式yyyyMMdd】
	 */
	@ApiField("invoice_open_date_begin")
	private String invoiceOpenDateBegin;

	/**
	 * 发票开票日期【结束日期，格式yyyyMMdd】
	 */
	@ApiField("invoice_open_date_end")
	private String invoiceOpenDateEnd;

	/**
	 * 发票状态：用于标示发票当前的状态，状态类型以及相关含义：01 待开票;02 开票中;03 已开票;04 作废中;05 已作废;06 红冲中;07 已红冲;08 部分红冲;09 无效
	 */
	@ApiListField("invoice_status")
	@ApiField("string")
	private List<String> invoiceStatus;

	/**
	 * 发票类型,01专票 02普票 03营业税发票 04国际形式发票 05其它发票
	 */
	@ApiListField("invoice_types")
	@ApiField("string")
	private List<String> invoiceTypes;

	/**
	 * 是否能在线开票 Y能 N不能
	 */
	@ApiField("is_online")
	private String isOnline;

	/**
	 * 是否红字 Y红字 N蓝字
	 */
	@ApiField("is_red")
	private String isRed;

	/**
	 * 邮寄状态 01 待邮寄;02 已邮寄;03 退回中;04 已退回
	 */
	@ApiListField("mail_status")
	@ApiField("string")
	private List<String> mailStatus;

	/**
	 * 月账单号
	 */
	@ApiField("monthly_bill_no")
	private String monthlyBillNo;

	/**
	 * 起始页，分页时必须提供
	 */
	@ApiField("page_no")
	private Long pageNo;

	/**
	 * 每页显示数，分页时必须提供
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 快递单号
	 */
	@ApiField("tracking_no")
	private String trackingNo;

	public String getApplyOrderId() {
		return this.applyOrderId;
	}
	public void setApplyOrderId(String applyOrderId) {
		this.applyOrderId = applyOrderId;
	}

	public String getBuyerInvoiceTitle() {
		return this.buyerInvoiceTitle;
	}
	public void setBuyerInvoiceTitle(String buyerInvoiceTitle) {
		this.buyerInvoiceTitle = buyerInvoiceTitle;
	}

	public String getBuyerIpid() {
		return this.buyerIpid;
	}
	public void setBuyerIpid(String buyerIpid) {
		this.buyerIpid = buyerIpid;
	}

	public List<String> getBuyerIpids() {
		return this.buyerIpids;
	}
	public void setBuyerIpids(List<String> buyerIpids) {
		this.buyerIpids = buyerIpids;
	}

	public String getBuyerIproleId() {
		return this.buyerIproleId;
	}
	public void setBuyerIproleId(String buyerIproleId) {
		this.buyerIproleId = buyerIproleId;
	}

	public List<String> getBuyerIproleIds() {
		return this.buyerIproleIds;
	}
	public void setBuyerIproleIds(List<String> buyerIproleIds) {
		this.buyerIproleIds = buyerIproleIds;
	}

	public String getInstId() {
		return this.instId;
	}
	public void setInstId(String instId) {
		this.instId = instId;
	}

	public String getInvoiceChannel() {
		return this.invoiceChannel;
	}
	public void setInvoiceChannel(String invoiceChannel) {
		this.invoiceChannel = invoiceChannel;
	}

	public String getInvoiceCode() {
		return this.invoiceCode;
	}
	public void setInvoiceCode(String invoiceCode) {
		this.invoiceCode = invoiceCode;
	}

	public String getInvoiceCreateDateBegin() {
		return this.invoiceCreateDateBegin;
	}
	public void setInvoiceCreateDateBegin(String invoiceCreateDateBegin) {
		this.invoiceCreateDateBegin = invoiceCreateDateBegin;
	}

	public String getInvoiceCreateDateEnd() {
		return this.invoiceCreateDateEnd;
	}
	public void setInvoiceCreateDateEnd(String invoiceCreateDateEnd) {
		this.invoiceCreateDateEnd = invoiceCreateDateEnd;
	}

	public List<String> getInvoiceIds() {
		return this.invoiceIds;
	}
	public void setInvoiceIds(List<String> invoiceIds) {
		this.invoiceIds = invoiceIds;
	}

	public String getInvoiceMaterial() {
		return this.invoiceMaterial;
	}
	public void setInvoiceMaterial(String invoiceMaterial) {
		this.invoiceMaterial = invoiceMaterial;
	}

	public String getInvoiceNo() {
		return this.invoiceNo;
	}
	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}

	public String getInvoiceOpenDateBegin() {
		return this.invoiceOpenDateBegin;
	}
	public void setInvoiceOpenDateBegin(String invoiceOpenDateBegin) {
		this.invoiceOpenDateBegin = invoiceOpenDateBegin;
	}

	public String getInvoiceOpenDateEnd() {
		return this.invoiceOpenDateEnd;
	}
	public void setInvoiceOpenDateEnd(String invoiceOpenDateEnd) {
		this.invoiceOpenDateEnd = invoiceOpenDateEnd;
	}

	public List<String> getInvoiceStatus() {
		return this.invoiceStatus;
	}
	public void setInvoiceStatus(List<String> invoiceStatus) {
		this.invoiceStatus = invoiceStatus;
	}

	public List<String> getInvoiceTypes() {
		return this.invoiceTypes;
	}
	public void setInvoiceTypes(List<String> invoiceTypes) {
		this.invoiceTypes = invoiceTypes;
	}

	public String getIsOnline() {
		return this.isOnline;
	}
	public void setIsOnline(String isOnline) {
		this.isOnline = isOnline;
	}

	public String getIsRed() {
		return this.isRed;
	}
	public void setIsRed(String isRed) {
		this.isRed = isRed;
	}

	public List<String> getMailStatus() {
		return this.mailStatus;
	}
	public void setMailStatus(List<String> mailStatus) {
		this.mailStatus = mailStatus;
	}

	public String getMonthlyBillNo() {
		return this.monthlyBillNo;
	}
	public void setMonthlyBillNo(String monthlyBillNo) {
		this.monthlyBillNo = monthlyBillNo;
	}

	public Long getPageNo() {
		return this.pageNo;
	}
	public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public String getTrackingNo() {
		return this.trackingNo;
	}
	public void setTrackingNo(String trackingNo) {
		this.trackingNo = trackingNo;
	}

}
