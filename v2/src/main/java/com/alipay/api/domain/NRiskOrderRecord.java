package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 设备工单的处理记录
 *
 * @author auto create
 * @since 1.0, 2025-05-28 09:56:24
 */
public class NRiskOrderRecord extends AlipayObject {

	private static final long serialVersionUID = 6327489382523276149L;

	/**
	 * 描叙事件的唯一编号
	 */
	@ApiField("event_no")
	private String eventNo;

	/**
	 * 处理人ID
	 */
	@ApiField("handler_id")
	private String handlerId;

	/**
	 * 记录处理人姓名
	 */
	@ApiField("handler_name")
	private String handlerName;

	/**
	 * 补充工单处理说明
	 */
	@ApiField("notes")
	private String notes;

	/**
	 * 描叙工单的唯一编号
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 设备工单处理图片
	 */
	@ApiField("process_photos")
	private String processPhotos;

	/**
	 * 用于记录处理的时间
	 */
	@ApiField("process_time")
	private String processTime;

	/**
	 * 工单处置方案记录
	 */
	@ApiField("solution_name")
	private String solutionName;

	public String getEventNo() {
		return this.eventNo;
	}
	public void setEventNo(String eventNo) {
		this.eventNo = eventNo;
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

	public String getProcessPhotos() {
		return this.processPhotos;
	}
	public void setProcessPhotos(String processPhotos) {
		this.processPhotos = processPhotos;
	}

	public String getProcessTime() {
		return this.processTime;
	}
	public void setProcessTime(String processTime) {
		this.processTime = processTime;
	}

	public String getSolutionName() {
		return this.solutionName;
	}
	public void setSolutionName(String solutionName) {
		this.solutionName = solutionName;
	}

}
