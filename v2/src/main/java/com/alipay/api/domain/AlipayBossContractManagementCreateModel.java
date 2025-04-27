package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 开启蚂蚁关联交易合约审批接口
 *
 * @author auto create
 * @since 1.0, 2019-12-23 13:59:20
 */
public class AlipayBossContractManagementCreateModel extends AlipayObject {

	private static final long serialVersionUID = 8493814968286935361L;

	/**
	 * 来源（如：采购系统-ALI_PURCHASE_SYSTEM）
	 */
	@ApiField("biz_source")
	private String bizSource;

	/**
	 * 合约批次号
	 */
	@ApiField("contract_batch_no")
	private String contractBatchNo;

	/**
	 * 合同信息列表
	 */
	@ApiListField("contract_info_list")
	@ApiField("contract_info")
	private List<ContractInfo> contractInfoList;

	/**
	 * 业务方流程实列ID
	 */
	@ApiField("process_instance_id")
	private String processInstanceId;

	/**
	 * 业务方需要推进的流程任务ID
	 */
	@ApiField("task_id")
	private String taskId;

	public String getBizSource() {
		return this.bizSource;
	}
	public void setBizSource(String bizSource) {
		this.bizSource = bizSource;
	}

	public String getContractBatchNo() {
		return this.contractBatchNo;
	}
	public void setContractBatchNo(String contractBatchNo) {
		this.contractBatchNo = contractBatchNo;
	}

	public List<ContractInfo> getContractInfoList() {
		return this.contractInfoList;
	}
	public void setContractInfoList(List<ContractInfo> contractInfoList) {
		this.contractInfoList = contractInfoList;
	}

	public String getProcessInstanceId() {
		return this.processInstanceId;
	}
	public void setProcessInstanceId(String processInstanceId) {
		this.processInstanceId = processInstanceId;
	}

	public String getTaskId() {
		return this.taskId;
	}
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

}
