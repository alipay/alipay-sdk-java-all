package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 平台类目信息
 *
 * @author auto create
 * @since 1.0, 2024-04-10 15:18:56
 */
public class ItemCategoryDto extends AlipayObject {

	private static final long serialVersionUID = 3862421497987644763L;

	/**
	 * 类目名称
	 */
	@ApiField("category_name")
	private String categoryName;

	/**
	 * 类目类型
	 */
	@ApiField("category_type")
	private String categoryType;

	/**
	 * 类目名称-全路径
	 */
	@ApiField("full_path_name")
	private String fullPathName;

	/**
	 * 类目id
	 */
	@ApiField("node_id")
	private String nodeId;

	/**
	 * 类目路径
	 */
	@ApiField("path")
	private String path;

	/**
	 * 类目rootId
	 */
	@ApiField("root_node_id")
	private String rootNodeId;

	public String getCategoryName() {
		return this.categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getCategoryType() {
		return this.categoryType;
	}
	public void setCategoryType(String categoryType) {
		this.categoryType = categoryType;
	}

	public String getFullPathName() {
		return this.fullPathName;
	}
	public void setFullPathName(String fullPathName) {
		this.fullPathName = fullPathName;
	}

	public String getNodeId() {
		return this.nodeId;
	}
	public void setNodeId(String nodeId) {
		this.nodeId = nodeId;
	}

	public String getPath() {
		return this.path;
	}
	public void setPath(String path) {
		this.path = path;
	}

	public String getRootNodeId() {
		return this.rootNodeId;
	}
	public void setRootNodeId(String rootNodeId) {
		this.rootNodeId = rootNodeId;
	}

}
