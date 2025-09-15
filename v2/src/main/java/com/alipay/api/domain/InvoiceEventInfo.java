package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 发票事件信息
 *
 * @author auto create
 * @since 1.0, 2024-01-23 16:43:18
 */
public class InvoiceEventInfo extends AlipayObject {

	private static final long serialVersionUID = 3513262885516435752L;

	/**
	 * 开票金额（单位元）
	 */
	@ApiField("invoice_amount")
	private String invoiceAmount;

	/**
	 * 回票事件外部请求号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 流程处理id
	 */
	@ApiField("process_id")
	private String processId;

	/**
	 * 流程处理状态
	 */
	@ApiField("process_status")
	private String processStatus;

	/**
	 * 关联的任务Id列表
	 */
	@ApiListField("task_id_list")
	@ApiField("string")
	private List<String> taskIdList;

	public String getInvoiceAmount() {
		return this.invoiceAmount;
	}
	public void setInvoiceAmount(String invoiceAmount) {
		this.invoiceAmount = invoiceAmount;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getProcessId() {
		return this.processId;
	}
	public void setProcessId(String processId) {
		this.processId = processId;
	}

	public String getProcessStatus() {
		return this.processStatus;
	}
	public void setProcessStatus(String processStatus) {
		this.processStatus = processStatus;
	}

	public List<String> getTaskIdList() {
		return this.taskIdList;
	}
	public void setTaskIdList(List<String> taskIdList) {
		this.taskIdList = taskIdList;
	}

}
