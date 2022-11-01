package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询菜类
 *
 * @author auto create
 * @since 1.0, 2018-11-16 17:18:55
 */
public class KoubeiCateringPosCategoryQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1369643343313469259L;

	/**
	 * 分类ID
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
