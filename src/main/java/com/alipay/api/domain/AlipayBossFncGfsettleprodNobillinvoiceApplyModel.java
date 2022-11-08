package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 无账单开票申请接口
 *
 * @author auto create
 * @since 1.0, 2022-04-14 16:09:02
 */
public class AlipayBossFncGfsettleprodNobillinvoiceApplyModel extends AlipayObject {

	private static final long serialVersionUID = 8889176244868122858L;

	/**
	 * 指定的审批人员，值为审批人员的域账号
	 */
	@ApiField("audit_staff")
	private String auditStaff;

	/**
	 * 调用方身份识别标记(应用名称) 与业务单据号(biz_no)联合唯一
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 业务单据号 必填
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 指定发票后续是否可以关联账单 Y:可以 N：不可以
	 */
	@ApiField("can_link")
	private String canLink;

	/**
	 * 销方OU的instId
	 */
	@ApiField("inst_id")
	private String instId;

	/**
	 * 发票行
	 */
	@ApiListField("invoice_line_list")
	@ApiField("invoice_line_info_order")
	private List<InvoiceLineInfoOrder> invoiceLineList;

	/**
	 * 发票介质 01:电子；02：纸质
	 */
	@ApiField("invoice_material")
	private String invoiceMaterial;

	/**
	 * 票面备注 该内容会原样展示到发票上
	 */
	@ApiField("invoice_note")
	private String invoiceNote;

	/**
	 * 发票类型 01：专票； 02：普票
	 */
	@ApiField("invoice_type")
	private String invoiceType;

	/**
	 * 申请开票的原因如：客户账单调整中先通过无账单开出；
在审批的时候能够看见
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 申请人
	 */
	@ApiField("operator")
	private String operator;

	/**
	 * 操作人的域账号，创建流程单使用
	 */
	@ApiField("operator_domain_name")
	private String operatorDomainName;

	/**
	 * 申请开票方式 01:系统；02：手工
如无特殊情况请传02
	 */
	@ApiField("order_way")
	private String orderWay;

	/**
	 * 购方信息
	 */
	@ApiField("user_invoice_info")
	private UserInvoiceInfoOrder userInvoiceInfo;

	public String getAuditStaff() {
		return this.auditStaff;
	}
	public void setAuditStaff(String auditStaff) {
		this.auditStaff = auditStaff;
	}

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	public String getCanLink() {
		return this.canLink;
	}
	public void setCanLink(String canLink) {
		this.canLink = canLink;
	}

	public String getInstId() {
		return this.instId;
	}
	public void setInstId(String instId) {
		this.instId = instId;
	}

	public List<InvoiceLineInfoOrder> getInvoiceLineList() {
		return this.invoiceLineList;
	}
	public void setInvoiceLineList(List<InvoiceLineInfoOrder> invoiceLineList) {
		this.invoiceLineList = invoiceLineList;
	}

	public String getInvoiceMaterial() {
		return this.invoiceMaterial;
	}
	public void setInvoiceMaterial(String invoiceMaterial) {
		this.invoiceMaterial = invoiceMaterial;
	}

	public String getInvoiceNote() {
		return this.invoiceNote;
	}
	public void setInvoiceNote(String invoiceNote) {
		this.invoiceNote = invoiceNote;
	}

	public String getInvoiceType() {
		return this.invoiceType;
	}
	public void setInvoiceType(String invoiceType) {
		this.invoiceType = invoiceType;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getOperator() {
		return this.operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getOperatorDomainName() {
		return this.operatorDomainName;
	}
	public void setOperatorDomainName(String operatorDomainName) {
		this.operatorDomainName = operatorDomainName;
	}

	public String getOrderWay() {
		return this.orderWay;
	}
	public void setOrderWay(String orderWay) {
		this.orderWay = orderWay;
	}

	public UserInvoiceInfoOrder getUserInvoiceInfo() {
		return this.userInvoiceInfo;
	}
	public void setUserInvoiceInfo(UserInvoiceInfoOrder userInvoiceInfo) {
		this.userInvoiceInfo = userInvoiceInfo;
	}

}
