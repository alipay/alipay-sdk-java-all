package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户种植树统计信息，按树种、是否合种分类统计
 *
 * @author auto create
 * @since 1.0, 2019-08-09 20:46:26
 */
public class TreeData extends AlipayObject {

	private static final long serialVersionUID = 2287427479134583198L;

	/**
	 * 是否合种。true：是合种，false：不是合种
	 */
	@ApiField("cooperation")
	private Boolean cooperation;

	/**
	 * 当前分类下已种植树数量，如：合种胡杨1棵，个人种植胡杨1棵
	 */
	@ApiField("num")
	private Long num;

	/**
	 * 树种别名
	 */
	@ApiField("tree_alias")
	private String treeAlias;

	/**
	 * 树种类型，保护地【RESERVE】还是树苗【TREE】
	 */
	@ApiField("tree_type")
	private String treeType;

	public Boolean getCooperation() {
		return this.cooperation;
	}
	public void setCooperation(Boolean cooperation) {
		this.cooperation = cooperation;
	}

	public Long getNum() {
		return this.num;
	}
	public void setNum(Long num) {
		this.num = num;
	}

	public String getTreeAlias() {
		return this.treeAlias;
	}
	public void setTreeAlias(String treeAlias) {
		this.treeAlias = treeAlias;
	}

	public String getTreeType() {
		return this.treeType;
	}
	public void setTreeType(String treeType) {
		this.treeType = treeType;
	}

}
