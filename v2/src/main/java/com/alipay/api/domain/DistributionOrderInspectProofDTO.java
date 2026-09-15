package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 验货异常描述凭证
 *
 * @author auto create
 * @since 1.0, 2026-09-04 17:07:56
 */
public class DistributionOrderInspectProofDTO extends AlipayObject {

	private static final long serialVersionUID = 3858543174892855956L;

	/**
	 * null
	 */
	@ApiListField("img_ids")
	@ApiField("string")
	private List<String> imgIds;

	/**
	 * 异常描述
	 */
	@ApiField("text")
	private String text;

	public List<String> getImgIds() {
		return this.imgIds;
	}
	public void setImgIds(List<String> imgIds) {
		this.imgIds = imgIds;
	}

	public String getText() {
		return this.text;
	}
	public void setText(String text) {
		this.text = text;
	}

}
