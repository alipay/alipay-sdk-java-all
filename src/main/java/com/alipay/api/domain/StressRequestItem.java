package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序压测上报资源模型
 *
 * @author auto create
 * @since 1.0, 2020-11-19 21:49:18
 */
public class StressRequestItem extends AlipayObject {

	private static final long serialVersionUID = 7864729747565662495L;

	/**
	 * 资源名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 资源大小，单位是B
	 */
	@ApiField("size")
	private Long size;

	/**
	 * 结果码
	 */
	@ApiField("status")
	private String status;

	/**
	 * 请求时间，单位是 ms
	 */
	@ApiField("time")
	private String time;

	/**
	 * 资源类型
	 */
	@ApiField("type")
	private String type;

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Long getSize() {
		return this.size;
	}
	public void setSize(Long size) {
		this.size = size;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getTime() {
		return this.time;
	}
	public void setTime(String time) {
		this.time = time;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
