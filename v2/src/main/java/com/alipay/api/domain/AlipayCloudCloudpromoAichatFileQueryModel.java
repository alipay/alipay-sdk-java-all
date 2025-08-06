package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序云营销智能问答文件列表查询
 *
 * @author auto create
 * @since 1.0, 2024-08-05 17:38:28
 */
public class AlipayCloudCloudpromoAichatFileQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5269568818689511918L;

	/**
	 * 当前页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 每页显示条数，默认20
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 场景唯一标识，该字段由客户在问答系统上登记注册时候生成，并提供给客户使用
	 */
	@ApiField("scene_id")
	private String sceneId;

	public Long getPageNum() {
		return this.pageNum;
	}
	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public String getSceneId() {
		return this.sceneId;
	}
	public void setSceneId(String sceneId) {
		this.sceneId = sceneId;
	}

}
