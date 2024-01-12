package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 数据资产平台对输数据实验室提供的结果
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:42
 */
public class CustomerEntity extends AlipayObject {

	private static final long serialVersionUID = 7687988663134489214L;

	/**
	 * 实体英文名
	 */
	@ApiField("code")
	private String code;

	/**
	 * 实体描述
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 实体id
	 */
	@ApiField("id")
	private String id;

	/**
	 * 实体中文名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * tag列表
	 */
	@ApiListField("tags")
	@ApiField("customer_tag")
	private List<CustomerTag> tags;

	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public List<CustomerTag> getTags() {
		return this.tags;
	}
	public void setTags(List<CustomerTag> tags) {
		this.tags = tags;
	}

}
