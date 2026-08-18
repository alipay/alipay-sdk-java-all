package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询叶子类目属性
 *
 * @author auto create
 * @since 1.0, 2026-08-07 11:21:44
 */
public class AlipayInsSceneInshealthserviceprodCategorypropertyQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2745973398422491281L;

	/**
	 * 类目ID
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
