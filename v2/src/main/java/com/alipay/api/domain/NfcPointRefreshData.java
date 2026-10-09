package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 立减进度条渲染结果
 *
 * @author auto create
 * @since 1.0, 2026-10-09 15:27:54
 */
public class NfcPointRefreshData extends AlipayObject {

	private static final long serialVersionUID = 1783164384417663675L;

	/**
	 * 本接口仅支持text氛围
	 */
	@ApiField("atmosphere")
	private String atmosphere;

	/**
	 * 百分比模式下的消耗值
	 */
	@ApiField("consume_value")
	private Long consumeValue;

	/**
	 * 埋点信息
	 */
	@ApiField("event_tracking_module")
	private NfcPointRefreshEventTracking eventTrackingModule;

	/**
	 * 曝光规则
	 */
	@ApiField("exposure_rule")
	private NfcPointRefreshExposureRule exposureRule;

	/**
	 * 本接口固定为立减进度条海报
	 */
	@ApiField("item_type")
	private String itemType;

	/**
	 * 进度匹配文案
	 */
	@ApiField("match_text")
	private NfcPointRefreshMatchText matchText;

	/**
	 * 立减进度条海报的补充说明文案
	 */
	@ApiField("message")
	private String message;

	/**
	 * 海报素材展示点位：paying_discount为支付中，after_pay_voucher为支付后
	 */
	@ApiField("point_code")
	private String pointCode;

	/**
	 * 进度条配置
	 */
	@ApiField("process_setting")
	private NfcPointRefreshProcessSetting processSetting;

	/**
	 * 当前展示进度；show_type为percent时单位为%，为count时单位为份
	 */
	@ApiField("process_value")
	private Long processValue;

	/**
	 * null
	 */
	@ApiListField("resources")
	@ApiField("nfc_point_refresh_resource")
	private List<NfcPointRefreshResource> resources;

	/**
	 * 展示文案
	 */
	@ApiField("show_text")
	private NfcPointRefreshShowText showText;

	/**
	 * null
	 */
	@ApiListField("voice_resources")
	@ApiField("nfc_point_refresh_voice_resource")
	private List<NfcPointRefreshVoiceResource> voiceResources;

	public String getAtmosphere() {
		return this.atmosphere;
	}
	public void setAtmosphere(String atmosphere) {
		this.atmosphere = atmosphere;
	}

	public Long getConsumeValue() {
		return this.consumeValue;
	}
	public void setConsumeValue(Long consumeValue) {
		this.consumeValue = consumeValue;
	}

	public NfcPointRefreshEventTracking getEventTrackingModule() {
		return this.eventTrackingModule;
	}
	public void setEventTrackingModule(NfcPointRefreshEventTracking eventTrackingModule) {
		this.eventTrackingModule = eventTrackingModule;
	}

	public NfcPointRefreshExposureRule getExposureRule() {
		return this.exposureRule;
	}
	public void setExposureRule(NfcPointRefreshExposureRule exposureRule) {
		this.exposureRule = exposureRule;
	}

	public String getItemType() {
		return this.itemType;
	}
	public void setItemType(String itemType) {
		this.itemType = itemType;
	}

	public NfcPointRefreshMatchText getMatchText() {
		return this.matchText;
	}
	public void setMatchText(NfcPointRefreshMatchText matchText) {
		this.matchText = matchText;
	}

	public String getMessage() {
		return this.message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

	public String getPointCode() {
		return this.pointCode;
	}
	public void setPointCode(String pointCode) {
		this.pointCode = pointCode;
	}

	public NfcPointRefreshProcessSetting getProcessSetting() {
		return this.processSetting;
	}
	public void setProcessSetting(NfcPointRefreshProcessSetting processSetting) {
		this.processSetting = processSetting;
	}

	public Long getProcessValue() {
		return this.processValue;
	}
	public void setProcessValue(Long processValue) {
		this.processValue = processValue;
	}

	public List<NfcPointRefreshResource> getResources() {
		return this.resources;
	}
	public void setResources(List<NfcPointRefreshResource> resources) {
		this.resources = resources;
	}

	public NfcPointRefreshShowText getShowText() {
		return this.showText;
	}
	public void setShowText(NfcPointRefreshShowText showText) {
		this.showText = showText;
	}

	public List<NfcPointRefreshVoiceResource> getVoiceResources() {
		return this.voiceResources;
	}
	public void setVoiceResources(List<NfcPointRefreshVoiceResource> voiceResources) {
		this.voiceResources = voiceResources;
	}

}
