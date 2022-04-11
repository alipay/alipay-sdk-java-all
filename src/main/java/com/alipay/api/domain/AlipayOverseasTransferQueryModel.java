package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 汇款信息查询
 *
 * @author auto create
 * @since 1.0, 2020-03-19 20:49:00
 */
public class AlipayOverseasTransferQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3592248485226523179L;

	/**
	 * 透传信息
	 */
	@ApiField("pass_through_info")
	private String passThroughInfo;

	/**
	 * 汇款请求id
	 */
	@ApiField("transfer_request_id")
	private String transferRequestId;

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
