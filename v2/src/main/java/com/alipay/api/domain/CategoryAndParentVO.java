package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 类目+父类目VO
 *
 * @author auto create
 * @since 1.0, 2023-07-17 17:48:20
 */
public class CategoryAndParentVO extends AlipayObject {

	private static final long serialVersionUID = 2242526633753574915L;

	/**
	 * 叶子类目与它的父类目
	 */
	@ApiListField("cat_and_parent")
	@ApiField("appx_category_v_o")
	private List<AppxCategoryVO> catAndParent;

	public List<AppxCategoryVO> getCatAndParent() {
		return this.catAndParent;
	}
	public void setCatAndParent(List<AppxCategoryVO> catAndParent) {
		this.catAndParent = catAndParent;
	}

}
