package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * N设备异常工单反馈服务
 *
 * @author auto create
 * @since 1.0, 2025-05-28 09:56:34
 */
public class AlipayPayDeviceNRiskorderModifyModel extends AlipayObject {

	private static final long serialVersionUID = 2564814354479888874L;

	/**
	 * 预计完成处理天数
	 */
	@ApiField("completion_days")
	private Long completionDays;

	/**
	 * 处理人ID
	 */
	@ApiField("handler_id")
	private String handlerId;

	/**
	 * 处理人姓名
	 */
	@ApiField("handler_name")
	private String handlerName;

	/**
	 * 处理意见备注
	 */
	@ApiField("notes")
	private String notes;

	/**
	 * 工单ID
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 外部工单记录，预留
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 处理时间
	 */
	@ApiField("process_time")
	private Date processTime;

	/**
	 * 工单处置方案记录
	 */
	@ApiField("solution_code")
	private String solutionCode;

	public Long getCompletionDays() {
		return this.completionDays;
	}
	public void setCompletionDays(Long completionDays) {
		this.completionDays = completionDays;
	}

	public String getHandlerId() {
		return this.handlerId;
	}
	public void setHandlerId(String handlerId) {
		this.handlerId = handlerId;
	}

	public String getHandlerName() {
		return this.handlerName;
	}
	public void setHandlerName(String handlerName) {
		this.handlerName = handlerName;
	}

	public String getNotes() {
		return this.notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public Date getProcessTime() {
		return this.processTime;
	}
	public void setProcessTime(Date processTime) {
		this.processTime = processTime;
	}

	public String getSolutionCode() {
		return this.solutionCode;
	}
	public void setSolutionCode(String solutionCode) {
		this.solutionCode = solutionCode;
	}

}
