package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 圈选/预估，选择的标签值
 *
 * @author auto create
 * @since 1.0, 2023-01-10 17:16:37
 */
public class CrowdSelectTagValuesOpenRequest extends AlipayObject {

	private static final long serialVersionUID = 3758679117832767189L;

	/**
	 * 标签ID，取自alipay.merchant.qipan.crowdtag.query接口tag_id字段
	 */
	@ApiField("tag_id")
	private Long tagId;

	/**
	 * 标签可选项范围分类ID，取自alipay.merchant.qipan.crowdtag.query接口tag_option_category_id字段 
<a href="https://opendocs.alipay.com/pre-open/04phhq" target="_blank">私域资产标签值参考标签说明</a>
	 */
	@ApiField("tag_option_category_id")
	private String tagOptionCategoryId;

	/**
	 * 标签值多个用,号分割，注意用英文逗号！！标签值取自alipay.merchant.qipan.crowdtag.query接口value字段
	 */
	@ApiField("values")
	private String values;

	public Long getTagId() {
		return this.tagId;
	}
	public void setTagId(Long tagId) {
		this.tagId = tagId;
	}

	public String getTagOptionCategoryId() {
		return this.tagOptionCategoryId;
	}
	public void setTagOptionCategoryId(String tagOptionCategoryId) {
		this.tagOptionCategoryId = tagOptionCategoryId;
	}

	public String getValues() {
		return this.values;
	}
	public void setValues(String values) {
		this.values = values;
	}

}
