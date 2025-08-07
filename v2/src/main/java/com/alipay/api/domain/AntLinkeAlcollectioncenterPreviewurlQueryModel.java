package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询案件的函件预览链接
 *
 * @author auto create
 * @since 1.0, 2024-04-15 17:42:26
 */
public class AntLinkeAlcollectioncenterPreviewurlQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2865413798277152374L;

	/**
	 * 查询案件下的函件预览链接
	 */
	@ApiField("affair_id")
	private String affairId;

	public String getAffairId() {
		return this.affairId;
	}
	public void setAffairId(String affairId) {
		this.affairId = affairId;
	}

}
