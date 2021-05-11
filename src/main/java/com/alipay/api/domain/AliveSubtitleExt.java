package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 蚂蚁直播字幕纠正扩展模型
 *
 * @author auto create
 * @since 1.0, 2021-03-19 15:40:07
 */
public class AliveSubtitleExt extends AlipayObject {

	private static final long serialVersionUID = 3149837663141844546L;

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
	 * 句子超始时间，单位为ms
	 */
	@ApiField("start_time")
	private String startTime;

	/**
	 * 长句拆为短句后，长句中索引，从0开始
	 */
	@ApiField("sub_index")
	private Long subIndex;

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
