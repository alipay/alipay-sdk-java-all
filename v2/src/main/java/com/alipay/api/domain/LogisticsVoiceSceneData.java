package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-07-09 10:29:31
 */
public class LogisticsVoiceSceneData extends AlipayObject {

	private static final long serialVersionUID = 2433671556479121987L;

	/**
	 * 业务日期
	 */
	@ApiField("biz_date")
	private String bizDate;

	/**
	 * 维度值
	 */
	@ApiField("dim_key")
	private String dimKey;

	/**
	 * 维度类型
	 */
	@ApiField("dim_type")
	private String dimType;

	/**
	 * 下发数量
	 */
	@ApiField("dispatch_count")
	private Long dispatchCount;

	/**
	 * 播放成功数量
	 */
	@ApiField("play_success_count")
	private Long playSuccessCount;

	/**
	 * 场景类型
	 */
	@ApiField("scene_type")
	private String sceneType;

	/**
	 * 语音模板ID
	 */
	@ApiField("voice_template_id")
	private String voiceTemplateId;

	public String getBizDate() {
		return this.bizDate;
	}
	public void setBizDate(String bizDate) {
		this.bizDate = bizDate;
	}

	public String getDimKey() {
		return this.dimKey;
	}
	public void setDimKey(String dimKey) {
		this.dimKey = dimKey;
	}

	public String getDimType() {
		return this.dimType;
	}
	public void setDimType(String dimType) {
		this.dimType = dimType;
	}

	public Long getDispatchCount() {
		return this.dispatchCount;
	}
	public void setDispatchCount(Long dispatchCount) {
		this.dispatchCount = dispatchCount;
	}

	public Long getPlaySuccessCount() {
		return this.playSuccessCount;
	}
	public void setPlaySuccessCount(Long playSuccessCount) {
		this.playSuccessCount = playSuccessCount;
	}

	public String getSceneType() {
		return this.sceneType;
	}
	public void setSceneType(String sceneType) {
		this.sceneType = sceneType;
	}

	public String getVoiceTemplateId() {
		return this.voiceTemplateId;
	}
	public void setVoiceTemplateId(String voiceTemplateId) {
		this.voiceTemplateId = voiceTemplateId;
	}

}
