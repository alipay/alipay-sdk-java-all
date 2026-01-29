package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 安心生活商品类目开通
 *
 * @author auto create
 * @since 1.0, 2026-01-28 15:22:42
 */
public class AlipayCommerceLifeserviceCategorySignModel extends AlipayObject {

	private static final long serialVersionUID = 4827262822254863227L;

	/**
	 * 类目编码
	 */
	@ApiField("category_code")
	private String categoryCode;

	/**
	 * null
	 */
	@ApiListField("qualification_info")
	@ApiField("axf_item_category_qualification_req")
	private List<AxfItemCategoryQualificationReq> qualificationInfo;

	public String getCategoryCode() {
		return this.categoryCode;
	}
	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}

	public List<AxfItemCategoryQualificationReq> getQualificationInfo() {
		return this.qualificationInfo;
	}
	public void setQualificationInfo(List<AxfItemCategoryQualificationReq> qualificationInfo) {
		this.qualificationInfo = qualificationInfo;
	}

}
