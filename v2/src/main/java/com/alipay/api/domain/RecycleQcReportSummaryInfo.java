package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 报告总结
 *
 * @author auto create
 * @since 1.0, 2025-11-17 15:02:41
 */
public class RecycleQcReportSummaryInfo extends AlipayObject {

	private static final long serialVersionUID = 4395246137971898851L;

	/**
	 * null
	 */
	@ApiListField("image_id_list")
	@ApiField("string")
	private List<String> imageIdList;

	/**
	 * 不一致内容的特殊描述
	 */
	@ApiField("inconsistent_text")
	private String inconsistentText;

	/**
	 * 报告总结文本内容
	 */
	@ApiField("text")
	private String text;

	public List<String> getImageIdList() {
		return this.imageIdList;
	}
	public void setImageIdList(List<String> imageIdList) {
		this.imageIdList = imageIdList;
	}

	public String getInconsistentText() {
		return this.inconsistentText;
	}
	public void setInconsistentText(String inconsistentText) {
		this.inconsistentText = inconsistentText;
	}

	public String getText() {
		return this.text;
	}
	public void setText(String text) {
		this.text = text;
	}

}
