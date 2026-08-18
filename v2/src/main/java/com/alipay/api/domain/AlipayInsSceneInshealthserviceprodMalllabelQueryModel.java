package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询商品标签
 *
 * @author auto create
 * @since 1.0, 2026-08-07 11:21:43
 */
public class AlipayInsSceneInshealthserviceprodMalllabelQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1125515311653958927L;

	/**
	 * 一级类目ID
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
