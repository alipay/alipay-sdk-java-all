package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ape选品数据同步接口
 *
 * @author auto create
 * @since 1.0, 2022-11-02 14:24:09
 */
public class AlipayDigitalopUcdpApeselectSyncModel extends AlipayObject {

	private static final long serialVersionUID = 5438241611139657132L;

	/**
	 * 商家在蚂蚁推荐引擎创建的项目id，调用前需要找蚂蚁技术获取。
	 */
	@ApiField("project_id")
	private String projectId;

	/**
	 * ape物品和选品池的关系
	 */
	@ApiField("select_list")
	private ApeSelect selectList;

	public String getProjectId() {
		return this.projectId;
	}
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public ApeSelect getSelectList() {
		return this.selectList;
	}
	public void setSelectList(ApeSelect selectList) {
		this.selectList = selectList;
	}

}
