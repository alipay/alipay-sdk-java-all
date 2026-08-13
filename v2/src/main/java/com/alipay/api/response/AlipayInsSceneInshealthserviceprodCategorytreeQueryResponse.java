package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ExternalCategoryTreeNode;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.inshealthserviceprod.categorytree.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-08-07 11:21:47
 */
public class AlipayInsSceneInshealthserviceprodCategorytreeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2787433852438211685L;

	/** 
	 * 类目树节点列表
	 */
	@ApiField("category_tree_list")
	private ExternalCategoryTreeNode categoryTreeList;

	public void setCategoryTreeList(ExternalCategoryTreeNode categoryTreeList) {
		this.categoryTreeList = categoryTreeList;
	}
	public ExternalCategoryTreeNode getCategoryTreeList( ) {
		return this.categoryTreeList;
	}

}
