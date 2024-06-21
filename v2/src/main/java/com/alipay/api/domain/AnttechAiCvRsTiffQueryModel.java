package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * max遥感工作台tiff展示服务
 *
 * @author auto create
 * @since 1.0, 2023-12-28 14:40:43
 */
public class AnttechAiCvRsTiffQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7766614778192615673L;

	/**
	 * tiff文件路径
	 */
	@ApiField("key")
	private String key;

	/**
	 * 项目id
	 */
	@ApiField("project_id")
	private String projectId;

	/**
	 * 瓦片横坐标
	 */
	@ApiField("x")
	private String x;

	/**
	 * 瓦片y
	 */
	@ApiField("y")
	private String y;

	/**
	 * 瓦片级别
	 */
	@ApiField("z")
	private String z;

	public String getKey() {
		return this.key;
	}
	public void setKey(String key) {
		this.key = key;
	}

	public String getProjectId() {
		return this.projectId;
	}
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public String getX() {
		return this.x;
	}
	public void setX(String x) {
		this.x = x;
	}

	public String getY() {
		return this.y;
	}
	public void setY(String y) {
		this.y = y;
	}

	public String getZ() {
		return this.z;
	}
	public void setZ(String z) {
		this.z = z;
	}

}
