package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商户质检结果
 *
 * @author auto create
 * @since 1.0, 2025-02-07 14:32:25
 */
public class RecycleQcReportResult extends AlipayObject {

	private static final long serialVersionUID = 4395199128671934718L;

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
