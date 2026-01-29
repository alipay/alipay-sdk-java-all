package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 租赁服务单确认
 *
 * @author auto create
 * @since 1.0, 2025-12-25 10:57:41
 */
public class AlipayCommerceRentOrderServiceticketConfirmModel extends AlipayObject {

	private static final long serialVersionUID = 4799358882317948654L;

	/**
	 * 补充描述
	 */
	@ApiField("additional_description")
	private String additionalDescription;

	/**
	 * 操作
	 */
	@ApiField("operation_type")
	private String operationType;

	/**
	 * 操作原因
	 */
	@ApiField("reason_code")
	private String reasonCode;

	/**
	 * 服务单ID
	 */
	@ApiField("service_ticket_id")
	private String serviceTicketId;

	public String getAdditionalDescription() {
		return this.additionalDescription;
	}
	public void setAdditionalDescription(String additionalDescription) {
		this.additionalDescription = additionalDescription;
	}

	public String getOperationType() {
		return this.operationType;
	}
	public void setOperationType(String operationType) {
		this.operationType = operationType;
	}

	public String getReasonCode() {
		return this.reasonCode;
	}
	public void setReasonCode(String reasonCode) {
		this.reasonCode = reasonCode;
	}

	public String getServiceTicketId() {
		return this.serviceTicketId;
	}
	public void setServiceTicketId(String serviceTicketId) {
		this.serviceTicketId = serviceTicketId;
	}

}
