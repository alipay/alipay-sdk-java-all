package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 抽发奖玩法模板信息
 *
 * @author auto create
 * @since 1.0, 2024-08-02 10:17:55
 */
public class BenefitPlayLuckDrawTemplateInfo extends AlipayObject {

	private static final long serialVersionUID = 4149649256876262913L;

	/**
	 * 玩法模板编码。非固定值，由业务运营定义
	 */
	@ApiField("code")
	private String code;

	/**
	 * 玩法展示信息
	 */
	@ApiField("display_info")
	private BenefitTemplateDisplayInfo displayInfo;

	/**
	 * 模板结束时间
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 权益模板优先级，衡量权益权重。无度量单位，数值越大，权重越大。
	 */
	@ApiField("priority")
	private Long priority;

	/**
	 * 奖品模型信息
	 */
	@ApiField("reward_info")
	private BenefitRewardInfo rewardInfo;

	/**
	 * 权益模板业务场景码。非固定值，由业务运营配置
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 模板开始时间
	 */
	@ApiField("start_time")
	private Date startTime;

	/**
	 * 具体玩法模板状态，非错误码
	 */
	@ApiField("status")
	private String status;

	/**
	 * 权益模板业务子场景码。非固定值，由业务运营配置
	 */
	@ApiField("sub_scene_code")
	private String subSceneCode;

	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public BenefitTemplateDisplayInfo getDisplayInfo() {
		return this.displayInfo;
	}
	public void setDisplayInfo(BenefitTemplateDisplayInfo displayInfo) {
		this.displayInfo = displayInfo;
	}

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public Long getPriority() {
		return this.priority;
	}
	public void setPriority(Long priority) {
		this.priority = priority;
	}

	public BenefitRewardInfo getRewardInfo() {
		return this.rewardInfo;
	}
	public void setRewardInfo(BenefitRewardInfo rewardInfo) {
		this.rewardInfo = rewardInfo;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

	public Date getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getSubSceneCode() {
		return this.subSceneCode;
	}
	public void setSubSceneCode(String subSceneCode) {
		this.subSceneCode = subSceneCode;
	}

}
