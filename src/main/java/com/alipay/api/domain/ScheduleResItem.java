package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 结果
 *
 * @author auto create
 * @since 1.0, 2020-05-07 15:30:21
 */
public class ScheduleResItem extends AlipayObject {

	private static final long serialVersionUID = 4831964386682946351L;

	/**
	 * 资源标志
	 */
	@ApiField("id")
	private String id;

	/**
	 * 资源名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 文件类型
	 */
	@ApiField("type")
	private Long type;

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

	public Long getType() {
		return this.type;
	}
	public void setType(Long type) {
		this.type = type;
	}

}
