package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.TreeNodeInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.network.node.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 04:56:44
 */
public class AlipayMerchantNetworkNodeBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2783668291818536539L;

	/** 
	 * 当前页码，默认第一页
	 */
	@ApiField("page_num")
	private Long pageNum;

	/** 
	 * 总页数
	 */
	@ApiField("total_pages")
	private Long totalPages;

	/** 
	 * 总记录数
	 */
	@ApiField("total_size")
	private Long totalSize;

	/** 
	 * 节点列表
	 */
	@ApiListField("tree_node_info_list")
	@ApiField("tree_node_info")
	private List<TreeNodeInfo> treeNodeInfoList;

	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}
	public Long getPageNum( ) {
		return this.pageNum;
	}

	public void setTotalPages(Long totalPages) {
		this.totalPages = totalPages;
	}
	public Long getTotalPages( ) {
		return this.totalPages;
	}

	public void setTotalSize(Long totalSize) {
		this.totalSize = totalSize;
	}
	public Long getTotalSize( ) {
		return this.totalSize;
	}

	public void setTreeNodeInfoList(List<TreeNodeInfo> treeNodeInfoList) {
		this.treeNodeInfoList = treeNodeInfoList;
	}
	public List<TreeNodeInfo> getTreeNodeInfoList( ) {
		return this.treeNodeInfoList;
	}

}
