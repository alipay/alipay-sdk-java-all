package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 本地商品类目与父类目信息
 *
 * @author auto create
 * @since 1.0, 2023-07-17 17:48:33
 */
public class LocalCategoryAndParentVO extends AlipayObject {

	private static final long serialVersionUID = 2334692137217585928L;

	/**
	 * 叶子类目与它的父类目
	 */
	@ApiListField("cat_and_parent")
	@ApiField("local_appx_category_v_o")
	private List<LocalAppxCategoryVO> catAndParent;

	public List<LocalAppxCategoryVO> getCatAndParent() {
		return this.catAndParent;
	}
	public void setCatAndParent(List<LocalAppxCategoryVO> catAndParent) {
		this.catAndParent = catAndParent;
	}

}
