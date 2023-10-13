package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 查询任务执行历史列表
 *
 * @author auto create
 * @since 1.0, 2023-08-23 15:21:55
 */
public class AlipayCloudCloudbaseDatabaseTaskQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3293326773864978261L;

	/**
	 * 小程序id
	 */
	@ApiField("biz_app_id")
	private String bizAppId;

	/**
	 * 环境id
	 */
	@ApiField("biz_env_id")
	private String bizEnvId;

	/**
	 * 集合名称
	 */
	@ApiField("collection_name")
	private String collectionName;

	/**
	 * 是否逆序
	 */
	@ApiField("desc")
	private Boolean desc;

	/**
	 * 页码
	 */
	@ApiField("page_index")
	private Long pageIndex;

	/**
	 * 每页数量
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 任务类型
	 */
	@ApiListField("task_types")
	@ApiField("string")
	private List<String> taskTypes;

	public String getBizAppId() {
		return this.bizAppId;
	}
	public void setBizAppId(String bizAppId) {
		this.bizAppId = bizAppId;
	}

	public String getBizEnvId() {
		return this.bizEnvId;
	}
	public void setBizEnvId(String bizEnvId) {
		this.bizEnvId = bizEnvId;
	}

	public String getCollectionName() {
		return this.collectionName;
	}
	public void setCollectionName(String collectionName) {
		this.collectionName = collectionName;
	}

	public Boolean getDesc() {
		return this.desc;
	}
	public void setDesc(Boolean desc) {
		this.desc = desc;
	}

	public Long getPageIndex() {
		return this.pageIndex;
	}
	public void setPageIndex(Long pageIndex) {
		this.pageIndex = pageIndex;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public List<String> getTaskTypes() {
		return this.taskTypes;
	}
	public void setTaskTypes(List<String> taskTypes) {
		this.taskTypes = taskTypes;
	}

}
