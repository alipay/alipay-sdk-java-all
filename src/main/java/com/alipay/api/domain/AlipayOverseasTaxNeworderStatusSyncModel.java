package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 退税单状态同步
 *
 * @author auto create
 * @since 1.0, 2019-11-27 10:26:46
 */
public class AlipayOverseasTaxNeworderStatusSyncModel extends AlipayObject {

	private static final long serialVersionUID = 3764132434954397989L;

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
	 * 当前状态，海关已盖章（STAMPED），退税机构收到退税单（INST_RECEIVED），作废（INST_INVALID），失败（INST_FAIL），已退税（REFUNDED）。注意：作废和失败只能对退税单INIT状态生效；
	 */
	@ApiField("status")
	private String status;

	/**
	 * 修改当前状态的时间(UTC+8)，格式yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("status_change_time")
	private Date statusChangeTime;

	/**
	 * 当前状态要给用户的提示信息
	 */
	@ApiField("status_msg")
	private String statusMsg;

	/**
	 * 支付宝退税放款流水号，用于退税单关联退税资金订单。原单笔退税接口返回的refund_order_no，批量退税结果文件倒数第二列。当status为REFUNDED时必选，其余状态忽略。
	 */
	@ApiField("tax_no")
	private String taxNo;

	/**
	 * 支付宝退税单号
	 */
	@ApiField("tax_order_no")
	private String taxOrderNo;

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

	public String getTaxNo() {
		return this.taxNo;
	}
	public void setTaxNo(String taxNo) {
		this.taxNo = taxNo;
	}

	public String getTaxOrderNo() {
		return this.taxOrderNo;
	}
	public void setTaxOrderNo(String taxOrderNo) {
		this.taxOrderNo = taxOrderNo;
	}

}
