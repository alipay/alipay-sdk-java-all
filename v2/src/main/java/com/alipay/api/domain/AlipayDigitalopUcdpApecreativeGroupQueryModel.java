package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ape创意素材组查询接口
 *
 * @author auto create
 * @since 1.0, 2023-07-26 20:10:40
 */
public class AlipayDigitalopUcdpApecreativeGroupQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4366498549726111737L;

	/**
	 * 商家在蚂蚁推荐引擎创建的项目id，调用前需要找蚂蚁技术获取。
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
