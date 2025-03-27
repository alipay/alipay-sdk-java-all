package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 工商企业背景信息
 *
 * @author auto create
 * @since 1.0, 2025-01-20 11:20:21
 */
public class ZmepDossierBackgroundInfo extends AlipayObject {

	private static final long serialVersionUID = 3511568822467821466L;

	/**
	 * 企业背景标签
	 */
	@ApiListField("label")
	@ApiField("string")
	private List<String> label;

	public List<String> getLabel() {
		return this.label;
	}
	public void setLabel(List<String> label) {
		this.label = label;
	}

}
