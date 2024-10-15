package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 蚂蚁直播字幕纠正扩展模型
 *
 * @author auto create
 * @since 1.0, 2021-06-23 10:45:08
 */
public class AliveSubtitleExt extends AlipayObject {

	private static final long serialVersionUID = 1368731124191996218L;

	/**
	 * 字幕命中特殊行为逻辑，例如口播关注
	 */
	@ApiField("action_type")
	private String actionType;

	/**
	 * base64 url
	 */
	@ApiField("action_url")
	private String actionUrl;

	/**
	 * 当前句子识别结果的置信度，取值范围：[0.0,1.0]。值越大表示置信度越高
	 */
	@ApiField("confidence")
	private String confidence;

	/**
	 * 句子截止时间，单位为ms
	 */
	@ApiField("end_time")
	private String endTime;

	/**
	 * 句子编号，从1开始递增（asr规则）。
	 */
	@ApiField("index")
	private Long index;

	/**
	 * PASSED("数据识别通过，可以在网站上正常显示"),

    REJECTED("被拒绝的数据，比如内容出现违禁词；不能出现在我们网站上"),

    REJECTED_CC("被拒绝的数据，但是展示效果为CC效果"),

    CC("CC表示用户发表数据后，提示成功。"),

    RECOVER("恢复数据，将误判断的内容，恢复回来"),

    DELETE("删除数据, 为了不扩大化数据的传播，删除历史已经发出去的数据。");
	 */
	@ApiField("info_sec_result")
	private String infoSecResult;

	/**
	 * 句子超始时间，单位为ms
	 */
	@ApiField("start_time")
	private String startTime;

	/**
	 * 长句拆为短句后，长句中索引，从0开始
	 */
	@ApiField("sub_index")
	private Long subIndex;

	public String getActionType() {
		return this.actionType;
	}
	public void setActionType(String actionType) {
		this.actionType = actionType;
	}

	public String getActionUrl() {
		return this.actionUrl;
	}
	public void setActionUrl(String actionUrl) {
		this.actionUrl = actionUrl;
	}

	public String getConfidence() {
		return this.confidence;
	}
	public void setConfidence(String confidence) {
		this.confidence = confidence;
	}

	public String getEndTime() {
		return this.endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public Long getIndex() {
		return this.index;
	}
	public void setIndex(Long index) {
		this.index = index;
	}

	public String getInfoSecResult() {
		return this.infoSecResult;
	}
	public void setInfoSecResult(String infoSecResult) {
		this.infoSecResult = infoSecResult;
	}

	public String getStartTime() {
		return this.startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public Long getSubIndex() {
		return this.subIndex;
	}
	public void setSubIndex(Long subIndex) {
		this.subIndex = subIndex;
	}

}
