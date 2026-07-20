package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 智能货柜设备标签信息结构
 *
 * @author auto create
 * @since 1.0, 2026-04-24 17:21:28
 */
public class DeviceLabelInfo extends AlipayObject {

	private static final long serialVersionUID = 3739647788658185816L;

	/**
	 * 标签key
	 */
	@ApiField("label_key")
	private String labelKey;

	/**
	 * 标签值
	 */
	@ApiField("label_value")
	private String labelValue;

	public String getLabelKey() {
		return this.labelKey;
	}
	public void setLabelKey(String labelKey) {
		this.labelKey = labelKey;
	}

	public String getLabelValue() {
		return this.labelValue;
	}
	public void setLabelValue(String labelValue) {
		this.labelValue = labelValue;
	}

}
