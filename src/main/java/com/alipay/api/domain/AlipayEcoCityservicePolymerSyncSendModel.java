package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务聚合系统迁移域内数据同步
 *
 * @author auto create
 * @since 1.0, 2020-05-12 10:18:59
 */
public class AlipayEcoCityservicePolymerSyncSendModel extends AlipayObject {

	private static final long serialVersionUID = 4319524327373598693L;

	/**
	 * 描述实体变更类型，包含新增、删除、修改
	 */
	@ApiField("cud_type")
	private String cudType;

	/**
	 * 变更实体的详细内容，为json格式，根据entity_type的不同而具有不同的格式。
	 */
	@ApiField("entity_content")
	private String entityContent;

	/**
	 * 该参数为变更实体类型，可能的变更实体包含：
城市、分类、服务、展台、角标、标签
	 */
	@ApiField("entity_type")
	private String entityType;

	public String getCudType() {
		return this.cudType;
	}
	public void setCudType(String cudType) {
		this.cudType = cudType;
	}

	public String getEntityContent() {
		return this.entityContent;
	}
	public void setEntityContent(String entityContent) {
		this.entityContent = entityContent;
	}

	public String getEntityType() {
		return this.entityType;
	}
	public void setEntityType(String entityType) {
		this.entityType = entityType;
	}

}
