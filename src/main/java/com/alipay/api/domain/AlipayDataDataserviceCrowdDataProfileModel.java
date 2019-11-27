package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 数据中心人群数据画像
 *
 * @author auto create
 * @since 1.0, 2016-04-13 13:50:25
 */
public class AlipayDataDataserviceCrowdDataProfileModel extends AlipayObject {

	private static final long serialVersionUID = 5193125367595721541L;

	/**
	 * 人群规则分组ID
	 */
	@ApiField("condition_id")
	private Long conditionId;

	/**
	 * 统计标签值，多个值以半角竖线|分割
	 */
	@ApiField("tag_codes")
	private String tagCodes;

	public Long getConditionId() {
		return this.conditionId;
	}
	public void setConditionId(Long conditionId) {
		this.conditionId = conditionId;
	}

	public String getTagCodes() {
		return this.tagCodes;
	}
	public void setTagCodes(String tagCodes) {
		this.tagCodes = tagCodes;
	}

}
