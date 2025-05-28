package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.TaskInstanceRewardInfoDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.common.taskdata.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-10-08 10:03:51
 */
public class AlipayCommerceCommonTaskdataQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4478154436778176529L;

	/** 
	 * 去重后的扫码量
	 */
	@ApiField("deduplicate_scan_num")
	private String deduplicateScanNum;

	/** 
	 * 任务的激励信息
	 */
	@ApiListField("reward_info")
	@ApiField("task_instance_reward_info_d_t_o")
	private List<TaskInstanceRewardInfoDTO> rewardInfo;

	/** 
	 * 任务扫码量
	 */
	@ApiField("scan_num")
	private String scanNum;

	/** 
	 * 任务实例id
	 */
	@ApiField("task_instance_id")
	private String taskInstanceId;

	/** 
	 * 任务模板id
	 */
	@ApiField("task_template_id")
	private String taskTemplateId;

	/** 
	 * 任务交易下单量
	 */
	@ApiField("trade_num")
	private String tradeNum;

	public void setDeduplicateScanNum(String deduplicateScanNum) {
		this.deduplicateScanNum = deduplicateScanNum;
	}
	public String getDeduplicateScanNum( ) {
		return this.deduplicateScanNum;
	}

	public void setRewardInfo(List<TaskInstanceRewardInfoDTO> rewardInfo) {
		this.rewardInfo = rewardInfo;
	}
	public List<TaskInstanceRewardInfoDTO> getRewardInfo( ) {
		return this.rewardInfo;
	}

	public void setScanNum(String scanNum) {
		this.scanNum = scanNum;
	}
	public String getScanNum( ) {
		return this.scanNum;
	}

	public void setTaskInstanceId(String taskInstanceId) {
		this.taskInstanceId = taskInstanceId;
	}
	public String getTaskInstanceId( ) {
		return this.taskInstanceId;
	}

	public void setTaskTemplateId(String taskTemplateId) {
		this.taskTemplateId = taskTemplateId;
	}
	public String getTaskTemplateId( ) {
		return this.taskTemplateId;
	}

	public void setTradeNum(String tradeNum) {
		this.tradeNum = tradeNum;
	}
	public String getTradeNum( ) {
		return this.tradeNum;
	}

}
