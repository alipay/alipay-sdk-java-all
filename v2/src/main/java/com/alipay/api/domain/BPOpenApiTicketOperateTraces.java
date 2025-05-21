package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 操作记录以列表形式返回
 *
 * @author auto create
 * @since 1.0, 2024-08-08 14:12:41
 */
public class BPOpenApiTicketOperateTraces extends AlipayObject {

	private static final long serialVersionUID = 4212773746364615843L;

	/**
	 * 操作记录
	 */
	@ApiListField("operate_traces")
	@ApiField("b_p_open_api_ticket_operate_trace")
	private List<BPOpenApiTicketOperateTrace> operateTraces;

	public List<BPOpenApiTicketOperateTrace> getOperateTraces() {
		return this.operateTraces;
	}
	public void setOperateTraces(List<BPOpenApiTicketOperateTrace> operateTraces) {
		this.operateTraces = operateTraces;
	}

}
