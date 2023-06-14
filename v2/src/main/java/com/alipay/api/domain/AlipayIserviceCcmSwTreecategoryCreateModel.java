package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 知识库-节点-创建
 *
 * @author auto create
 * @since 1.0, 2022-10-26 14:59:47
 */
public class AlipayIserviceCcmSwTreecategoryCreateModel extends AlipayObject {

	private static final long serialVersionUID = 1265838196674495421L;

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
	private Long fatherId;

	/**
	 * 节点名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 标签。KNOWLEDGE（知识库）；PLATFORM（公有云工作台）；HELP（公有云帮助中心）
	 */
	@ApiListField("tags")
	@ApiField("string")
	private List<String> tags;

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

	public Long getFatherId() {
		return this.fatherId;
	}
	public void setFatherId(Long fatherId) {
		this.fatherId = fatherId;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public List<String> getTags() {
		return this.tags;
	}
	public void setTags(List<String> tags) {
		this.tags = tags;
	}

}
