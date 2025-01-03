package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 医药商品标签信息
 *
 * @author auto create
 * @since 1.0, 2024-02-27 13:42:59
 */
public class MedicineTagInfo extends AlipayObject {

	private static final long serialVersionUID = 7223355393736556553L;

	/**
	 * ["满20减2","两件9折"]
	 */
	@ApiListField("tag_text")
	@ApiField("string")
	private List<String> tagText;

	/**
	 * PROMOTION_TAG - 促销标签(如: 满20减2)
FEATURE_TAG - 功能标签(如: 24小时营业)
DELIVERY_TAG - 配送标签(如: 美团专送)
	 */
	@ApiField("tag_type")
	private String tagType;

	public List<String> getTagText() {
		return this.tagText;
	}
	public void setTagText(List<String> tagText) {
		this.tagText = tagText;
	}

	public String getTagType() {
		return this.tagType;
	}
	public void setTagType(String tagType) {
		this.tagType = tagType;
	}

}
