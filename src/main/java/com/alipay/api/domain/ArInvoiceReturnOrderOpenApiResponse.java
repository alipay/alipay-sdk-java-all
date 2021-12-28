package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 退换票申请出参
 *
 * @author auto create
 * @since 1.0, 2021-09-03 15:33:01
 */
public class ArInvoiceReturnOrderOpenApiResponse extends AlipayObject {

	private static final long serialVersionUID = 1354828522975473324L;

	/**
	 * 退换票详情信息
	 */
	@ApiListField("ar_invoice_return_order_details")
	@ApiField("ar_invoice_return_order_detail_open_api_response")
	private List<ArInvoiceReturnOrderDetailOpenApiResponse> arInvoiceReturnOrderDetails;

	/**
	 * 申请人,标识是谁申请的,客户的pid或者小二的花名或者工号
	 */
	@ApiField("creator")
	private String creator;

	/**
	 * 申请时间
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/**
	 * 修改时间
	 */
	@ApiField("gmt_modified")
	private String gmtModified;

	/**
	 * 机构id
	 */
	@ApiField("inst_id")
	private String instId;

	/**
	 * 结算对象ipid-主站为mid
	 */
	@ApiField("ip_id")
	private String ipId;

	/**
	 * 结算对象角色id-主站为pid
	 */
	@ApiField("ip_role_id")
	private String ipRoleId;

	/**
	 * 最近修改人,标识是谁修改的,客户的pid或者小二的花名或者工号
	 */
	@ApiField("last_moder")
	private String lastModer;

	/**
	 * 备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 修改项
	 */
	@ApiField("modified_item")
	private String modifiedItem;

	/**
	 * 申请渠道,01:商户 02:小二
	 */
	@ApiField("order_channel")
	private String orderChannel;

	/**
	 * 申请编号
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 申请状态,01:待审核 02:已撤销 03:审核通过处理中 04:等待资料补全中 05:审核驳回 06:退票已完成 07:重新开票中 08:已重新开票
	 */
	@ApiField("order_status")
	private String orderStatus;

	/**
	 * 退换票类型,01:退票 02:换票
	 */
	@ApiField("order_type")
	private String orderType;

	/**
	 * 审批工单号
	 */
	@ApiField("process_instance_id")
	private String processInstanceId;

	/**
	 * 换票时，是否需要重开发票 true 需要, false 不需要,退票时，null
	 */
	@ApiField("re_invoice")
	private Boolean reInvoice;

	/**
	 * 驳回原因
	 */
	@ApiField("reject_reason")
	private String rejectReason;

	/**
	 * 退换票原因类型;
01:发票介质修改;
02发票类型修改;
03:发票信息修改;
05:其他;
06:不需要发票;
	 */
	@ApiField("return_reason_type")
	private String returnReasonType;

	/**
	 * 快递单号
	 */
	@ApiField("tracking_no")
	private String trackingNo;

	public List<ArInvoiceReturnOrderDetailOpenApiResponse> getArInvoiceReturnOrderDetails() {
		return this.arInvoiceReturnOrderDetails;
	}
	public void setArInvoiceReturnOrderDetails(List<ArInvoiceReturnOrderDetailOpenApiResponse> arInvoiceReturnOrderDetails) {
		this.arInvoiceReturnOrderDetails = arInvoiceReturnOrderDetails;
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

	public String getGmtModified() {
		return this.gmtModified;
	}
	public void setGmtModified(String gmtModified) {
		this.gmtModified = gmtModified;
	}

	public String getInstId() {
		return this.instId;
	}
	public void setInstId(String instId) {
		this.instId = instId;
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

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getModifiedItem() {
		return this.modifiedItem;
	}
	public void setModifiedItem(String modifiedItem) {
		this.modifiedItem = modifiedItem;
	}

	public String getOrderChannel() {
		return this.orderChannel;
	}
	public void setOrderChannel(String orderChannel) {
		this.orderChannel = orderChannel;
	}

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getOrderStatus() {
		return this.orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getOrderType() {
		return this.orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public String getProcessInstanceId() {
		return this.processInstanceId;
	}
	public void setProcessInstanceId(String processInstanceId) {
		this.processInstanceId = processInstanceId;
	}

	public Boolean getReInvoice() {
		return this.reInvoice;
	}
	public void setReInvoice(Boolean reInvoice) {
		this.reInvoice = reInvoice;
	}

	public String getRejectReason() {
		return this.rejectReason;
	}
	public void setRejectReason(String rejectReason) {
		this.rejectReason = rejectReason;
	}

	public String getReturnReasonType() {
		return this.returnReasonType;
	}
	public void setReturnReasonType(String returnReasonType) {
		this.returnReasonType = returnReasonType;
	}

	public String getTrackingNo() {
		return this.trackingNo;
	}
	public void setTrackingNo(String trackingNo) {
		this.trackingNo = trackingNo;
	}

}
