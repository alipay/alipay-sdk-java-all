package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * ar发票退换票申请查询
 *
 * @author auto create
 * @since 1.0, 2021-09-07 19:51:49
 */
public class AlipayBossFncInvoiceReturnorderBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 3691328213892466121L;

	/**
	 * 发票申请日期【起始日期，格式yyyyMMdd】
	 */
	@ApiField("apply_date_begin")
	private String applyDateBegin;

	/**
	 * 发票申请日期【结束日期，格式yyyyMMdd】
	 */
	@ApiField("apply_date_end")
	private String applyDateEnd;

	/**
	 * 机构(OU)
	 */
	@ApiField("inst_id")
	private String instId;

	/**
	 * 发票代码
	 */
	@ApiField("invoice_code")
	private String invoiceCode;

	/**
	 * 发票号码
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
	 * 发票类型,01专票 02普票 04国际形式发票 05其它发票
	 */
	@ApiListField("invoice_types")
	@ApiField("string")
	private List<String> invoiceTypes;

	/**
	 * 结算对象ipid，和主站mid一致
	 */
	@ApiField("ip_id")
	private String ipId;

	/**
	 * 结算对象角色ID，和主站pid一致
	 */
	@ApiField("ip_role_id")
	private String ipRoleId;

	/**
	 * 申请编号列表
	 */
	@ApiListField("order_nos")
	@ApiField("string")
	private List<String> orderNos;

	/**
	 * 申请状态,01:待审核 02:已撤销 03:审核通过处理中 04:等待资料补全中 05:审核驳回 06:退票已完成 07:重新开票中 08:已重新开票
	 */
	@ApiListField("order_status")
	@ApiField("string")
	private List<String> orderStatus;

	/**
	 * 退换票类型,01:退票 02:换票
	 */
	@ApiField("order_type")
	private String orderType;

	/**
	 * 查询第几页
	 */
	@ApiField("page_no")
	private Long pageNo;

	/**
	 * 查询一页的条数
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 退换票原因类型
	 */
	@ApiListField("return_reason_types")
	@ApiField("string")
	private List<String> returnReasonTypes;

	/**
	 * 查询来源,建议系统名加模块名
	 */
	@ApiField("source")
	private String source;

	/**
	 * 快递单号
	 */
	@ApiField("tracking_no")
	private String trackingNo;

	public String getApplyDateBegin() {
		return this.applyDateBegin;
	}
	public void setApplyDateBegin(String applyDateBegin) {
		this.applyDateBegin = applyDateBegin;
	}

	public String getApplyDateEnd() {
		return this.applyDateEnd;
	}
	public void setApplyDateEnd(String applyDateEnd) {
		this.applyDateEnd = applyDateEnd;
	}

	public String getInstId() {
		return this.instId;
	}
	public void setInstId(String instId) {
		this.instId = instId;
	}

	public String getInvoiceCode() {
		return this.invoiceCode;
	}
	public void setInvoiceCode(String invoiceCode) {
		this.invoiceCode = invoiceCode;
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

	public List<String> getInvoiceTypes() {
		return this.invoiceTypes;
	}
	public void setInvoiceTypes(List<String> invoiceTypes) {
		this.invoiceTypes = invoiceTypes;
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

	public List<String> getOrderNos() {
		return this.orderNos;
	}
	public void setOrderNos(List<String> orderNos) {
		this.orderNos = orderNos;
	}

	public List<String> getOrderStatus() {
		return this.orderStatus;
	}
	public void setOrderStatus(List<String> orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getOrderType() {
		return this.orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
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

	public List<String> getReturnReasonTypes() {
		return this.returnReasonTypes;
	}
	public void setReturnReasonTypes(List<String> returnReasonTypes) {
		this.returnReasonTypes = returnReasonTypes;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public String getTrackingNo() {
		return this.trackingNo;
	}
	public void setTrackingNo(String trackingNo) {
		this.trackingNo = trackingNo;
	}

}
