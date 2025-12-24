package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用于图灵实时标签更新的标签信息
 *
 * @author auto create
 * @since 1.0, 2025-09-11 11:02:38
 */
public class LabelUpdateDetail extends AlipayObject {

	private static final long serialVersionUID = 4561494783376874223L;

	/**
	 * 传毫秒时间戳，用于数据时序版本控制
	 */
	@ApiField("biz_timestamp")
	private Long bizTimestamp;

	/**
	 * 获取方式参考图灵->标签详情页->数据源字段
	 */
	@ApiField("tag_code")
	private String tagCode;

	/**
	 * 标签值
	 */
	@ApiField("tag_value")
	private String tagValue;

	public Long getBizTimestamp() {
		return this.bizTimestamp;
	}
	public void setBizTimestamp(Long bizTimestamp) {
		this.bizTimestamp = bizTimestamp;
	}

	public String getTagCode() {
		return this.tagCode;
	}
	public void setTagCode(String tagCode) {
		this.tagCode = tagCode;
	}

	public String getTagValue() {
		return this.tagValue;
	}
	public void setTagValue(String tagValue) {
		this.tagValue = tagValue;
	}

}
