package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 查询语音素材模板列表
 *
 * @author auto create
 * @since 1.0, 2026-07-09 10:29:30
 */
public class AlipayCommerceLogisticsVoiceTemplateQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1633589473417976683L;

	/**
	 * 从1开始，默认1
	 */
	@ApiField("page_no")
	private Long pageNo;

	/**
	 * 默认20
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 场景类型
	 */
	@ApiField("scene_type")
	private String sceneType;

	/**
	 * null
	 */
	@ApiListField("status_list")
	@ApiField("string")
	private List<String> statusList;

	public Long getPageNo() {
		return this.pageNo;
	}
	public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public String getSceneType() {
		return this.sceneType;
	}
	public void setSceneType(String sceneType) {
		this.sceneType = sceneType;
	}

	public List<String> getStatusList() {
		return this.statusList;
	}
	public void setStatusList(List<String> statusList) {
		this.statusList = statusList;
	}

}
