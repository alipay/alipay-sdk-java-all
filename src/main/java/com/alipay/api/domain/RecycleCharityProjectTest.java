package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * RecycleCharityProject
 *
 * @author auto create
 * @since 1.0, 2022-06-07 11:43:56
 */
public class RecycleCharityProjectTest extends AlipayObject {

	private static final long serialVersionUID = 2844471391434622888L;

	/**
	 * 1111
	 */
	@ApiField("project_id")
	private String projectId;

	public String getProjectId() {
		return this.projectId;
	}
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

}
