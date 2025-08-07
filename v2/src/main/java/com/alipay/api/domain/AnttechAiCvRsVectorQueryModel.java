package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * max遥感工作台矢量数据展示服务
 *
 * @author auto create
 * @since 1.0, 2023-12-28 14:40:31
 */
public class AnttechAiCvRsVectorQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5526742843321988462L;

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
	 * 瓦片横坐标
	 */
	@ApiField("y")
	private String y;

	/**
	 * 瓦片级别
	 */
	@ApiField("z")
	private String z;

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
