package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序海报拉取接口
 *
 * @author auto create
 * @since 1.0, 2026-10-09 15:27:54
 */
public class AlipayPayPosterAppQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5536649446237373112L;

	/**
	 * 设备业务标识，调用方须有该设备的查询权限
	 */
	@ApiField("biz_tid")
	private String bizTid;

	/**
	 * 业务标识；当前立减进度条刷新逻辑不使用此字段
	 */
	@ApiField("business_id")
	private String businessId;

	/**
	 * 交互类型，仅支持refresh
	 */
	@ApiField("interaction_type")
	private String interactionType;

	/**
	 * 设备机具型号对应的素材匹配标识，须与biz_tid对应的设备一致
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 海报类型，仅支持REDUCE_PROCESS_POSTER
	 */
	@ApiField("item_type")
	private String itemType;

	/**
	 * 小程序或渲染程序版本号，例如1.1
	 */
	@ApiField("program_version")
	private String programVersion;

	/**
	 * 海报计划ID，须属于指定设备
	 */
	@ApiField("schema_id")
	private String schemaId;

	/**
	 * 缓存模式开关；当前立减进度条刷新路径不使用此值
	 */
	@ApiField("use_cache")
	private Boolean useCache;

	public String getBizTid() {
		return this.bizTid;
	}
	public void setBizTid(String bizTid) {
		this.bizTid = bizTid;
	}

	public String getBusinessId() {
		return this.businessId;
	}
	public void setBusinessId(String businessId) {
		this.businessId = businessId;
	}

	public String getInteractionType() {
		return this.interactionType;
	}
	public void setInteractionType(String interactionType) {
		this.interactionType = interactionType;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getItemType() {
		return this.itemType;
	}
	public void setItemType(String itemType) {
		this.itemType = itemType;
	}

	public String getProgramVersion() {
		return this.programVersion;
	}
	public void setProgramVersion(String programVersion) {
		this.programVersion = programVersion;
	}

	public String getSchemaId() {
		return this.schemaId;
	}
	public void setSchemaId(String schemaId) {
		this.schemaId = schemaId;
	}

	public Boolean getUseCache() {
		return this.useCache;
	}
	public void setUseCache(Boolean useCache) {
		this.useCache = useCache;
	}

}
