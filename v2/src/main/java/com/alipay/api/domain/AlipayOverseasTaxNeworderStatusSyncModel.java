package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 退税单状态同步
 *
 * @author auto create
 * @since 1.0, 2023-07-18 20:57:04
 */
public class AlipayOverseasTaxNeworderStatusSyncModel extends AlipayObject {

	private static final long serialVersionUID = 7355359318381284696L;

	/**
	 * 纸质退税单号
	 */
	@ApiField("doc_id")
	private String docId;

	/**
	 * 扩展参数json格式
	 */
	@ApiField("extend_param")
	private String extendParam;

	/**
	 * 当前状态，海关已盖章（STAMPED），海关拒绝（REJECTED_BY_CUSTOMS），退税机构收到退税单（RECEIVED），作废（VOIDED），失败（FAILED），过期（EXPIRED），已退税（REFUNDED），已使用非支付宝退税（REFUNDED_NON_ALIPAY）
	 */
	@ApiField("status")
	private String status;

	/**
	 * 当前状态发生变更的时间(UTC+8)，格式yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("status_change_time")
	private Date statusChangeTime;

	/**
	 * 当前状态要给用户的提示信息
	 */
	@ApiField("status_msg")
	private String statusMsg;

	/**
	 * 支付宝退税单号
	 */
	@ApiField("tax_order_no")
	private String taxOrderNo;

	/**
	 * 支付宝资金订单号，预授权退税下单接口返回的tax_refund_no，原单笔退税接口返回的refund_order_no，批量退税结果文件倒数第二列。当且status为REFUNDED时必选，其余状态忽略
	 */
	@ApiField("tax_payment_no")
	private String taxPaymentNo;

	public String getDocId() {
		return this.docId;
	}
	public void setDocId(String docId) {
		this.docId = docId;
	}

	public String getExtendParam() {
		return this.extendParam;
	}
	public void setExtendParam(String extendParam) {
		this.extendParam = extendParam;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public Date getStatusChangeTime() {
		return this.statusChangeTime;
	}
	public void setStatusChangeTime(Date statusChangeTime) {
		this.statusChangeTime = statusChangeTime;
	}

	public String getStatusMsg() {
		return this.statusMsg;
	}
	public void setStatusMsg(String statusMsg) {
		this.statusMsg = statusMsg;
	}

	public String getTaxOrderNo() {
		return this.taxOrderNo;
	}
	public void setTaxOrderNo(String taxOrderNo) {
		this.taxOrderNo = taxOrderNo;
	}

	public String getTaxPaymentNo() {
		return this.taxPaymentNo;
	}
	public void setTaxPaymentNo(String taxPaymentNo) {
		this.taxPaymentNo = taxPaymentNo;
	}

}
