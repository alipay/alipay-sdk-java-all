package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 门店类目配置信息
 *
 * @author auto create
 * @since 1.0, 2017-02-07 16:47:06
 */
public class ShopCategoryConfigInfo extends AlipayObject {

	private static final long serialVersionUID = 7252374249694746581L;

	/**
	 * 类目ID
	 */
	@ApiField("id")
	private String id;

	/**
	 * 是否是叶子节点
	 */
	@ApiField("is_leaf")
	private String isLeaf;

	/**
	 * 类目层级
	 */
	@ApiField("level")
	private String level;

	/**
	 * 类目层级路径
	 */
	@ApiField("link")
	private String link;

	/**
	 * 类目名称
	 */
	@ApiField("nm")
	private String nm;

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getIsLeaf() {
		return this.isLeaf;
	}
	public void setIsLeaf(String isLeaf) {
		this.isLeaf = isLeaf;
	}

	public String getLevel() {
		return this.level;
	}
	public void setLevel(String level) {
		this.level = level;
	}

	public String getLink() {
		return this.link;
	}
	public void setLink(String link) {
		this.link = link;
	}

	public String getNm() {
		return this.nm;
	}
	public void setNm(String nm) {
		this.nm = nm;
	}

}
