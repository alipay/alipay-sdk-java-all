package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 响应评价结果
 *
 * @author auto create
 * @since 1.0, 2024-12-02 10:48:27
 */
public class EvaluateResult extends AlipayObject {

	private static final long serialVersionUID = 2347854131585452677L;

	/**
	 * 有效调节电量，单位：kWh
	 */
	@ApiField("actual_energy")
	private String actualEnergy;

	/**
	 * 预估收益，单位：元
	 */
	@ApiField("estimate_profit")
	private String estimateProfit;

	/**
	 * 响应评价有效调节量
	 */
	@ApiListField("evaluate_adjustment")
	@ApiField("load_info_node")
	private List<LoadInfoNode> evaluateAdjustment;

	/**
	 * 响应评价运行功率
	 */
	@ApiListField("evaluate_load")
	@ApiField("load_info_node")
	private List<LoadInfoNode> evaluateLoad;

	/**
	 * 有效响应比率（%）
	 */
	@ApiField("ratio")
	private String ratio;

	/**
	 * 实际调节电量，单位：kWh
	 */
	@ApiField("real_energy")
	private String realEnergy;

	/**
	 * 实际运行负荷，单位：kW
	 */
	@ApiField("real_load")
	private String realLoad;

	/**
	 * 响应结束时间
	 */
	@ApiField("response_end_time")
	private Date responseEndTime;

	/**
	 * 响应开始时间
	 */
	@ApiField("response_start_time")
	private Date responseStartTime;

	/**
	 * 目标调节电量，单位：kWh
	 */
	@ApiField("target_energy")
	private String targetEnergy;

	/**
	 * 目标运行负荷，单位：kW
	 */
	@ApiField("target_load")
	private String targetLoad;

	public String getActualEnergy() {
		return this.actualEnergy;
	}
	public void setActualEnergy(String actualEnergy) {
		this.actualEnergy = actualEnergy;
	}

	public String getEstimateProfit() {
		return this.estimateProfit;
	}
	public void setEstimateProfit(String estimateProfit) {
		this.estimateProfit = estimateProfit;
	}

	public List<LoadInfoNode> getEvaluateAdjustment() {
		return this.evaluateAdjustment;
	}
	public void setEvaluateAdjustment(List<LoadInfoNode> evaluateAdjustment) {
		this.evaluateAdjustment = evaluateAdjustment;
	}

	public List<LoadInfoNode> getEvaluateLoad() {
		return this.evaluateLoad;
	}
	public void setEvaluateLoad(List<LoadInfoNode> evaluateLoad) {
		this.evaluateLoad = evaluateLoad;
	}

	public String getRatio() {
		return this.ratio;
	}
	public void setRatio(String ratio) {
		this.ratio = ratio;
	}

	public String getRealEnergy() {
		return this.realEnergy;
	}
	public void setRealEnergy(String realEnergy) {
		this.realEnergy = realEnergy;
	}

	public String getRealLoad() {
		return this.realLoad;
	}
	public void setRealLoad(String realLoad) {
		this.realLoad = realLoad;
	}

	public Date getResponseEndTime() {
		return this.responseEndTime;
	}
	public void setResponseEndTime(Date responseEndTime) {
		this.responseEndTime = responseEndTime;
	}

	public Date getResponseStartTime() {
		return this.responseStartTime;
	}
	public void setResponseStartTime(Date responseStartTime) {
		this.responseStartTime = responseStartTime;
	}

	public String getTargetEnergy() {
		return this.targetEnergy;
	}
	public void setTargetEnergy(String targetEnergy) {
		this.targetEnergy = targetEnergy;
	}

	public String getTargetLoad() {
		return this.targetLoad;
	}
	public void setTargetLoad(String targetLoad) {
		this.targetLoad = targetLoad;
	}

}
