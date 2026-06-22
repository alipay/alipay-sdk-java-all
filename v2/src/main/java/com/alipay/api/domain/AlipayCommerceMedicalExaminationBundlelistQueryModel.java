package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询组合品标品列表接口
 *
 * @author auto create
 * @since 1.0, 2026-05-20 21:02:50
 */
public class AlipayCommerceMedicalExaminationBundlelistQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3793971483644514491L;

	/**
	 * 标签编码(对应是检查类型或者检验类型)
CHECK_CATEGORY、
检验类目类型：
INSPECTION_CATEGORY

不传默认查全部的
	 */
	@ApiField("tag_code")
	private String tagCode;

	public String getTagCode() {
		return this.tagCode;
	}
	public void setTagCode(String tagCode) {
		this.tagCode = tagCode;
	}

}
