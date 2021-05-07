package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 知识库-节点-修改
 *
 * @author auto create
 * @since 1.0, 2021-01-26 15:19:14
 */
public class AlipayIserviceCcmSwTreecategoryModifyModel extends AlipayObject {

	private static final long serialVersionUID = 1429942786749486728L;

	/**
	 * 子部门ID，不传为默认部门
	 */
	@ApiField("ccs_instance_id")
	private String ccsInstanceId;

	/**
	 * 描述
	 */
	@ApiField("description")
	private String description;

	/**
	 * 父节点ID
	 */
	@ApiField("father_id")
	private String fatherId;

	/**
	 * 节点ID
	 */
	@ApiField("id")
	private Long id;

	/**
	 * 节点名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 标签。KNOWLEDGE（知识库）；PLATFORM（公有云工作台）；HELP（公有云帮助中心）
	 */
	@ApiField("tags")
	private String tags;

	public String getCcsInstanceId() {
		return this.ccsInstanceId;
	}
	public void setCcsInstanceId(String ccsInstanceId) {
		this.ccsInstanceId = ccsInstanceId;
	}

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public String getFatherId() {
		return this.fatherId;
	}
	public void setFatherId(String fatherId) {
		this.fatherId = fatherId;
	}

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

	public String getTags() {
		return this.tags;
	}
	public void setTags(String tags) {
		this.tags = tags;
	}

}
