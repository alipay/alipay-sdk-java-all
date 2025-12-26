package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.InsHealthGainFlowResult;
import com.alipay.api.domain.InsHealthGiftBatchAlreadyOpenedResult;
import com.alipay.api.domain.InsHealthGiftBatchGainSumInsuredResult;
import com.alipay.api.domain.InsHealthGiftBatchMySumInsuredResult;
import com.alipay.api.domain.InsHealthGiftBatchValidGiftResult;
import com.alipay.api.domain.InsHealthSendFlowResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.health.gift.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2025-12-09 19:23:57
 */
public class AlipayInsSceneHealthGiftBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8356457861337914424L;

	/** 
	 * 用户从某个source领取成功的保额
	 */
	@ApiField("gained_sum_insured_by_source")
	private String gainedSumInsuredBySource;

	/** 
	 * 赠险领取流水列表
	 */
	@ApiListField("health_gain_flow_list")
	@ApiField("ins_health_gain_flow_result")
	private List<InsHealthGainFlowResult> healthGainFlowList;

	/** 
	 * 健康险赠险险种是否已开通查询结果
	 */
	@ApiListField("health_gift_batch_already_opened_list")
	@ApiField("ins_health_gift_batch_already_opened_result")
	private List<InsHealthGiftBatchAlreadyOpenedResult> healthGiftBatchAlreadyOpenedList;

	/** 
	 * 健康险赠险待领取权益，目前包含待领取保额，准入
	 */
	@ApiListField("health_gift_batch_gain_sum_insured_list")
	@ApiField("ins_health_gift_batch_gain_sum_insured_result")
	private List<InsHealthGiftBatchGainSumInsuredResult> healthGiftBatchGainSumInsuredList;

	/** 
	 * 健康险赠险用户总保额查询结果
	 */
	@ApiListField("health_gift_batch_my_sum_insured_list")
	@ApiField("ins_health_gift_batch_my_sum_insured_result")
	private List<InsHealthGiftBatchMySumInsuredResult> healthGiftBatchMySumInsuredList;

	/** 
	 * 用户生效赠险查询结果
	 */
	@ApiListField("health_gift_batch_valid_gift_list")
	@ApiField("ins_health_gift_batch_valid_gift_result")
	private List<InsHealthGiftBatchValidGiftResult> healthGiftBatchValidGiftList;

	/** 
	 * 赠险发放流水列表
	 */
	@ApiListField("health_send_flow_list")
	@ApiField("ins_health_send_flow_result")
	private List<InsHealthSendFlowResult> healthSendFlowList;

	public void setGainedSumInsuredBySource(String gainedSumInsuredBySource) {
		this.gainedSumInsuredBySource = gainedSumInsuredBySource;
	}
	public String getGainedSumInsuredBySource( ) {
		return this.gainedSumInsuredBySource;
	}

	public void setHealthGainFlowList(List<InsHealthGainFlowResult> healthGainFlowList) {
		this.healthGainFlowList = healthGainFlowList;
	}
	public List<InsHealthGainFlowResult> getHealthGainFlowList( ) {
		return this.healthGainFlowList;
	}

	public void setHealthGiftBatchAlreadyOpenedList(List<InsHealthGiftBatchAlreadyOpenedResult> healthGiftBatchAlreadyOpenedList) {
		this.healthGiftBatchAlreadyOpenedList = healthGiftBatchAlreadyOpenedList;
	}
	public List<InsHealthGiftBatchAlreadyOpenedResult> getHealthGiftBatchAlreadyOpenedList( ) {
		return this.healthGiftBatchAlreadyOpenedList;
	}

	public void setHealthGiftBatchGainSumInsuredList(List<InsHealthGiftBatchGainSumInsuredResult> healthGiftBatchGainSumInsuredList) {
		this.healthGiftBatchGainSumInsuredList = healthGiftBatchGainSumInsuredList;
	}
	public List<InsHealthGiftBatchGainSumInsuredResult> getHealthGiftBatchGainSumInsuredList( ) {
		return this.healthGiftBatchGainSumInsuredList;
	}

	public void setHealthGiftBatchMySumInsuredList(List<InsHealthGiftBatchMySumInsuredResult> healthGiftBatchMySumInsuredList) {
		this.healthGiftBatchMySumInsuredList = healthGiftBatchMySumInsuredList;
	}
	public List<InsHealthGiftBatchMySumInsuredResult> getHealthGiftBatchMySumInsuredList( ) {
		return this.healthGiftBatchMySumInsuredList;
	}

	public void setHealthGiftBatchValidGiftList(List<InsHealthGiftBatchValidGiftResult> healthGiftBatchValidGiftList) {
		this.healthGiftBatchValidGiftList = healthGiftBatchValidGiftList;
	}
	public List<InsHealthGiftBatchValidGiftResult> getHealthGiftBatchValidGiftList( ) {
		return this.healthGiftBatchValidGiftList;
	}

	public void setHealthSendFlowList(List<InsHealthSendFlowResult> healthSendFlowList) {
		this.healthSendFlowList = healthSendFlowList;
	}
	public List<InsHealthSendFlowResult> getHealthSendFlowList( ) {
		return this.healthSendFlowList;
	}

}
