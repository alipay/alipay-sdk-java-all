package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 尚闻流量卡充值状态同步
 *
 * @author auto create
 * @since 1.0, 2025-10-24 13:49:19
 */
public class AlipayTerminalEdgecloudSwnetflowRechargeSyncModel extends AlipayObject {

	private static final long serialVersionUID = 5484794132481696223L;

	/**
	 * 同步流量卡充值单状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 蚂蚁进行流量卡充值时传入的业务单号
	 */
	@ApiField("trace_no")
	private String traceNo;

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getTraceNo() {
		return this.traceNo;
	}
	public void setTraceNo(String traceNo) {
		this.traceNo = traceNo;
	}

}
