package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 量表详细信息
 *
 * @author auto create
 * @since 1.0, 2025-02-17 15:47:06
 */
public class GaugeTypeInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 1138361623283729846L;

	/**
	 * 量表唯一主键
	 */
	@ApiField("id")
	private Long id;

	/**
	 * 量表名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 量表问题总数
	 */
	@ApiField("ques_count")
	private Long quesCount;

	/**
	 * 具体的量表类型字类型
	 */
	@ApiField("sub_type")
	private String subType;

	/**
	 * 量表类型
	 */
	@ApiField("type")
	private String type;

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

	public Long getQuesCount() {
		return this.quesCount;
	}
	public void setQuesCount(Long quesCount) {
		this.quesCount = quesCount;
	}

	public String getSubType() {
		return this.subType;
	}
	public void setSubType(String subType) {
		this.subType = subType;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
