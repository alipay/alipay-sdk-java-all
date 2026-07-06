package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 报告总结
 *
 * @author auto create
 * @since 1.0, 2026-07-06 14:42:56
 */
public class RecycleQcReportSummaryInfo extends AlipayObject {

	private static final long serialVersionUID = 3515291367839741841L;

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
	 * null
	 */
	@ApiListField("product_real_image_id_list")
	@ApiField("string")
	private List<String> productRealImageIdList;

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

	public List<String> getProductRealImageIdList() {
		return this.productRealImageIdList;
	}
	public void setProductRealImageIdList(List<String> productRealImageIdList) {
		this.productRealImageIdList = productRealImageIdList;
	}

	public String getText() {
		return this.text;
	}
	public void setText(String text) {
		this.text = text;
	}

}
