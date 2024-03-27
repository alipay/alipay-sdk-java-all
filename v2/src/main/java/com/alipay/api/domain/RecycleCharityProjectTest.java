package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * RecycleCharityProject
 *
 * @author auto create
 * @since 1.0, 2023-03-29 10:31:54
 */
public class RecycleCharityProjectTest extends AlipayObject {

	private static final long serialVersionUID = 5551182961939243972L;

	/**
	 * 1111
	 */
	@ApiField("project_id")
	private String projectId;

	/**
	 * 1111
	 */
	@ApiField("project_open_id")
	private String projectOpenId;

	public String getProjectId() {
		return this.projectId;
	}
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public String getProjectOpenId() {
		return this.projectOpenId;
	}
	public void setProjectOpenId(String projectOpenId) {
		this.projectOpenId = projectOpenId;
	}

}
