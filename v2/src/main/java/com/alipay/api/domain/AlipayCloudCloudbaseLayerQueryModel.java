package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询层列表
 *
 * @author auto create
 * @since 1.0, 2023-09-14 17:45:29
 */
public class AlipayCloudCloudbaseLayerQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7631774794731645642L;

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
	 * 是否逆序
	 */
	@ApiField("desc")
	private Boolean desc;

	/**
	 * 显示名称
	 */
	@ApiField("display_name")
	private String displayName;

	/**
	 * 层名称
	 */
	@ApiField("layer_name")
	private String layerName;

	/**
	 * 层名称模糊查询
	 */
	@ApiField("layer_name_like")
	private String layerNameLike;

	/**
	 * 当前页码
	 */
	@ApiField("page_index")
	private Long pageIndex;

	/**
	 * 每页显示条数
	 */
	@ApiField("page_size")
	private Long pageSize;

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

	public Boolean getDesc() {
		return this.desc;
	}
	public void setDesc(Boolean desc) {
		this.desc = desc;
	}

	public String getDisplayName() {
		return this.displayName;
	}
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public String getLayerName() {
		return this.layerName;
	}
	public void setLayerName(String layerName) {
		this.layerName = layerName;
	}

	public String getLayerNameLike() {
		return this.layerNameLike;
	}
	public void setLayerNameLike(String layerNameLike) {
		this.layerNameLike = layerNameLike;
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

}
