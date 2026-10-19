package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 推送淘宝营销人群
 *
 * @author auto create
 * @since 1.0, 2026-10-10 21:41:08
 */
public class AlipayTradeCrowdConsultModel extends AlipayObject {

	private static final long serialVersionUID = 8874829688332651529L;

	/**
	 * 单位元
	 */
	@ApiField("average_amount")
	private String averageAmount;

	/**
	 * 定义咨询人群场景，如花呗、Z1
	 */
	@ApiListField("consult_crowd_list")
	@ApiField("string")
	private List<String> consultCrowdList;

	/**
	 * 人群推送接口淘侧ab实验切流标识
	 */
	@ApiListField("experiment_flag")
	@ApiField("experiment_object")
	private List<ExperimentObject> experimentFlag;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 表明这笔请求的场景，目前只支持aacProspectMarketing一个值，表示该场景为AAC潜客营销场景
	 */
	@ApiField("scene")
	private String scene;

	/**
	 * 表明着笔请求的场景，可以同时包含多个场景，目前支持
AAC潜客营销-aacProspectMarketing
未绑卡人群首绑营销-bindCard
	 */
	@ApiListField("scene_list")
	@ApiField("string")
	private List<String> sceneList;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getAverageAmount() {
		return this.averageAmount;
	}
	public void setAverageAmount(String averageAmount) {
		this.averageAmount = averageAmount;
	}

	public List<String> getConsultCrowdList() {
		return this.consultCrowdList;
	}
	public void setConsultCrowdList(List<String> consultCrowdList) {
		this.consultCrowdList = consultCrowdList;
	}

	public List<ExperimentObject> getExperimentFlag() {
		return this.experimentFlag;
	}
	public void setExperimentFlag(List<ExperimentObject> experimentFlag) {
		this.experimentFlag = experimentFlag;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
	}

	public List<String> getSceneList() {
		return this.sceneList;
	}
	public void setSceneList(List<String> sceneList) {
		this.sceneList = sceneList;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
