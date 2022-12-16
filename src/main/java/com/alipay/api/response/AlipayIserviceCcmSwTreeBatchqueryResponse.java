package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.TreeInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.ccm.sw.tree.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2022-11-07 19:31:36
 */
public class AlipayIserviceCcmSwTreeBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8285715663514294283L;

	/** 
	 * 类目集合
	 */
	@ApiListField("trees")
	@ApiField("tree_info")
	private List<TreeInfo> trees;

	public void setTrees(List<TreeInfo> trees) {
		this.trees = trees;
	}
	public List<TreeInfo> getTrees( ) {
		return this.trees;
	}

}
