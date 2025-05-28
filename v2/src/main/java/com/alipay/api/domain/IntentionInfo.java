package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 意图信息
 *
 * @author auto create
 * @since 1.0, 2025-05-22 17:53:36
 */
public class IntentionInfo extends AlipayObject {

	private static final long serialVersionUID = 1624936862386199273L;

	/**
	 * 区域信息
	 */
	@ApiField("area_info")
	private IntentionAreaInfo areaInfo;

	/**
	 * 意图基础信息
	 */
	@ApiField("base_info")
	private IntentionBaseInfo baseInfo;

	public IntentionAreaInfo getAreaInfo() {
		return this.areaInfo;
	}
	public void setAreaInfo(IntentionAreaInfo areaInfo) {
		this.areaInfo = areaInfo;
	}

	public IntentionBaseInfo getBaseInfo() {
		return this.baseInfo;
	}
	public void setBaseInfo(IntentionBaseInfo baseInfo) {
		this.baseInfo = baseInfo;
	}

}
