package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 汇款撤销
 *
 * @author auto create
 * @since 1.0, 2021-06-02 19:36:35
 */
public class AlipayOverseasTransferCancelModel extends AlipayObject {

	private static final long serialVersionUID = 2838475552145585287L;

	/**
	 * 撤销原因
	 */
	@ApiField("cancel_reason")
	private String cancelReason;

	/**
	 * 透传信息
	 */
	@ApiField("pass_through_info")
	private String passThroughInfo;

	/**
	 * 外部单号
	 */
	@ApiField("transfer_request_id")
	private String transferRequestId;

	public String getCancelReason() {
		return this.cancelReason;
	}
	public void setCancelReason(String cancelReason) {
		this.cancelReason = cancelReason;
	}

	public String getPassThroughInfo() {
		return this.passThroughInfo;
	}
	public void setPassThroughInfo(String passThroughInfo) {
		this.passThroughInfo = passThroughInfo;
	}

	public String getTransferRequestId() {
		return this.transferRequestId;
	}
	public void setTransferRequestId(String transferRequestId) {
		this.transferRequestId = transferRequestId;
	}

}
