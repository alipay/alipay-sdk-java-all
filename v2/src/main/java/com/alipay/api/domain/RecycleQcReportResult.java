package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商户质检结果
 *
 * @author auto create
 * @since 1.0, 2025-03-25 14:16:45
 */
public class RecycleQcReportResult extends AlipayObject {

	private static final long serialVersionUID = 2589483715267922463L;

	/**
	 * null
	 */
	@ApiListField("image_id_list")
	@ApiField("string")
	private List<String> imageIdList;

	/**
	 * 文案
	 */
	@ApiField("text")
	private String text;

	public List<String> getImageIdList() {
		return this.imageIdList;
	}
	public void setImageIdList(List<String> imageIdList) {
		this.imageIdList = imageIdList;
	}

	public String getText() {
		return this.text;
	}
	public void setText(String text) {
		this.text = text;
	}

}
