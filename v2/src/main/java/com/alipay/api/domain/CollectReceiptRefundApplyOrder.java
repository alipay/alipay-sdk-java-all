package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 退款请求
 *
 * @author auto create
 * @since 1.0, 2023-04-07 15:54:42
 */
public class CollectReceiptRefundApplyOrder extends AlipayObject {

	private static final long serialVersionUID = 2784971461988281513L;

	/**
	 * 退款备注
	 */
	@ApiListField("attachment_file_list")
	@ApiField("attachment_file")
	private List<AttachmentFile> attachmentFileList;

	/**
	 * 退款所属业务场景
	 */
	@ApiField("business_scene")
	private String businessScene;

	/**
	 * 退款渠道
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 幂等号
	 */
	@ApiField("idempotent_no")
	private String idempotentNo;

	/**
	 * 备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * true 需要审批  false 无需审批
	 */
	@ApiField("need_audit")
	private Boolean needAudit;

	/**
	 * 操作人
	 */
	@ApiField("operator")
	private String operator;

	/**
	 * 操作人ID
	 */
	@ApiField("operator_id")
	private String operatorId;

	/**
	 * 操作人ID
	 */
	@ApiField("operator_staff_no")
	private String operatorStaffNo;

	/**
	 * 收款单号
	 */
	@ApiField("receipt_no")
	private String receiptNo;

	/**
	 * 退款金额
	 */
	@ApiField("refund_amount")
	private MultiCurrencyMoneyOpenApi refundAmount;

	/**
	 * 收款方账号名称
	 */
	@ApiField("refund_payee_account_name")
	private String refundPayeeAccountName;

	/**
	 * 收款方账号
	 */
	@ApiField("refund_payee_account_no")
	private String refundPayeeAccountNo;

	/**
	 * 退款账户扩展信息
	 */
	@ApiField("refund_payee_ext_inf")
	private MapTypeParam refundPayeeExtInf;

	public List<AttachmentFile> getAttachmentFileList() {
		return this.attachmentFileList;
	}
	public void setAttachmentFileList(List<AttachmentFile> attachmentFileList) {
		this.attachmentFileList = attachmentFileList;
	}

	public String getBusinessScene() {
		return this.businessScene;
	}
	public void setBusinessScene(String businessScene) {
		this.businessScene = businessScene;
	}

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getIdempotentNo() {
		return this.idempotentNo;
	}
	public void setIdempotentNo(String idempotentNo) {
		this.idempotentNo = idempotentNo;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public Boolean getNeedAudit() {
		return this.needAudit;
	}
	public void setNeedAudit(Boolean needAudit) {
		this.needAudit = needAudit;
	}

	public String getOperator() {
		return this.operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getOperatorId() {
		return this.operatorId;
	}
	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}

	public String getOperatorStaffNo() {
		return this.operatorStaffNo;
	}
	public void setOperatorStaffNo(String operatorStaffNo) {
		this.operatorStaffNo = operatorStaffNo;
	}

	public String getReceiptNo() {
		return this.receiptNo;
	}
	public void setReceiptNo(String receiptNo) {
		this.receiptNo = receiptNo;
	}

	public MultiCurrencyMoneyOpenApi getRefundAmount() {
		return this.refundAmount;
	}
	public void setRefundAmount(MultiCurrencyMoneyOpenApi refundAmount) {
		this.refundAmount = refundAmount;
	}

	public String getRefundPayeeAccountName() {
		return this.refundPayeeAccountName;
	}
	public void setRefundPayeeAccountName(String refundPayeeAccountName) {
		this.refundPayeeAccountName = refundPayeeAccountName;
	}

	public String getRefundPayeeAccountNo() {
		return this.refundPayeeAccountNo;
	}
	public void setRefundPayeeAccountNo(String refundPayeeAccountNo) {
		this.refundPayeeAccountNo = refundPayeeAccountNo;
	}

	public MapTypeParam getRefundPayeeExtInf() {
		return this.refundPayeeExtInf;
	}
	public void setRefundPayeeExtInf(MapTypeParam refundPayeeExtInf) {
		this.refundPayeeExtInf = refundPayeeExtInf;
	}

}
