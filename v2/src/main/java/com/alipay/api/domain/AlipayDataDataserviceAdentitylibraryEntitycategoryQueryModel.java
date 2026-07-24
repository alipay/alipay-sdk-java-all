package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询商品库实体类目信息
 *
 * @author auto create
 * @since 1.0, 2026-07-07 08:52:55
 */
public class AlipayDataDataserviceAdentitylibraryEntitycategoryQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7446262155995948823L;

	/**
	 * 类目ID,如果不传则返回一级类目相关信息
	 */
	@ApiField("cate_id")
	private String cateId;

	public String getCateId() {
		return this.cateId;
	}
	public void setCateId(String cateId) {
		this.cateId = cateId;
	}

}
