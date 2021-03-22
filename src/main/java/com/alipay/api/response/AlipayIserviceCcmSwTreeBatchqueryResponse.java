package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.TreeInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.ccm.sw.tree.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2021-01-26 15:20:17
 */
public class AlipayIserviceCcmSwTreeBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4213769592253132914L;

	/** 
	 * 类目集合
	 */
	@ApiField("trees")
	private TreeInfo trees;

	public void setTrees(TreeInfo trees) {
		this.trees = trees;
	}
	public TreeInfo getTrees( ) {
		return this.trees;
	}

}
