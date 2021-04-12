package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 问答库
 *
 * @author auto create
 * @since 1.0, 2021-01-06 19:42:48
 */
public class LibraryInfo extends AlipayObject {

	private static final long serialVersionUID = 8684878624162627779L;

	/**
	 * 知识库ID
	 */
	@ApiField("id")
	private Long id;

	/**
	 * 知识库名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 类目ID
	 */
	@ApiField("tree_id")
	private Long treeId;

	/**
	 * 修改时间
	 */
	@ApiField("update_time")
	private Date updateTime;

	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Long getTreeId() {
		return this.treeId;
	}
	public void setTreeId(Long treeId) {
		this.treeId = treeId;
	}

	public Date getUpdateTime() {
		return this.updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

}
