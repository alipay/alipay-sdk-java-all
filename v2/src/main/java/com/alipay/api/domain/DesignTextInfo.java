package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 布局文本信息
 *
 * @author auto create
 * @since 1.0, 2023-07-27 10:30:50
 */
public class DesignTextInfo extends AlipayObject {

	private static final long serialVersionUID = 1316985219233887114L;

	/**
	 * 布局id
	 */
	@ApiField("design_id")
	private String designId;

	/**
	 * 文本信息
	 */
	@ApiField("text_group")
	private TextGroup textGroup;

	public String getDesignId() {
		return this.designId;
	}
	public void setDesignId(String designId) {
		this.designId = designId;
	}

	public TextGroup getTextGroup() {
		return this.textGroup;
	}
	public void setTextGroup(TextGroup textGroup) {
		this.textGroup = textGroup;
	}

}
