package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 流程详细信息
 *
 * @author auto create
 * @since 1.0, 2024-08-14 15:48:29
 */
public class AntlescenterProcessDTO extends AlipayObject {

	private static final long serialVersionUID = 8195339732258785378L;

	/**
	 * 审批流其他信息
	 */
	@ApiField("process_extra")
	private String processExtra;

	/**
	 * 审批流程单号
	 */
	@ApiField("process_id")
	private String processId;

	/**
	 * 审批流其他信息dto
	 */
	@ApiListField("process_info_list")
	@ApiField("approval_flow_info")
	private List<ApprovalFlowInfo> processInfoList;

	/**
	 * 审批流类型
	 */
	@ApiField("process_type")
	private String processType;

	public String getProcessExtra() {
		return this.processExtra;
	}
	public void setProcessExtra(String processExtra) {
		this.processExtra = processExtra;
	}

	public String getProcessId() {
		return this.processId;
	}
	public void setProcessId(String processId) {
		this.processId = processId;
	}

	public List<ApprovalFlowInfo> getProcessInfoList() {
		return this.processInfoList;
	}
	public void setProcessInfoList(List<ApprovalFlowInfo> processInfoList) {
		this.processInfoList = processInfoList;
	}

	public String getProcessType() {
		return this.processType;
	}
	public void setProcessType(String processType) {
		this.processType = processType;
	}

}
