package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 图片审核结果查询
 *
 * @author auto create
 * @since 1.0, 2025-07-04 17:26:22
 */
public class AlipayPayImgReviewQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7257789647211679567L;

	/**
	 * 查询依据的文件id
	 */
	@ApiField("material_id")
	private String materialId;

	public String getMaterialId() {
		return this.materialId;
	}
	public void setMaterialId(String materialId) {
		this.materialId = materialId;
	}

}
