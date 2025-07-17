package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 根据父节点批量查询子节点信息
 *
 * @author auto create
 * @since 1.0, 2023-08-15 11:40:30
 */
public class AlipayMerchantNetworkNodeBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 5141882512828924862L;

	/**
	 * 商家网络类型
	 */
	@ApiField("network_type")
	private String networkType;

	/**
	 * 页面的显示记录条数
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 商家的网络节点ID，一般为商家系统的公司，部门等关系之间的唯一ID
	 */
	@ApiField("parent_merchant_node_id")
	private String parentMerchantNodeId;

	/**
	 * 商家网络的根节点，一般为总部企业账号PID （邀测阶段为商家与支付宝产生合作，由支付宝进行协商提供给商家）
	 */
	@ApiField("root_id")
	private String rootId;

	/**
	 * 起始记录
	 */
	@ApiField("start_row")
	private Long startRow;

	public String getNetworkType() {
		return this.networkType;
	}
	public void setNetworkType(String networkType) {
		this.networkType = networkType;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public String getParentMerchantNodeId() {
		return this.parentMerchantNodeId;
	}
	public void setParentMerchantNodeId(String parentMerchantNodeId) {
		this.parentMerchantNodeId = parentMerchantNodeId;
	}

	public String getRootId() {
		return this.rootId;
	}
	public void setRootId(String rootId) {
		this.rootId = rootId;
	}

	public Long getStartRow() {
		return this.startRow;
	}
	public void setStartRow(Long startRow) {
		this.startRow = startRow;
	}

}
