package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * ape数据同步接口
 *
 * @author auto create
 * @since 1.0, 2022-10-14 12:00:21
 */
public class AlipayDigitalopUcdpApedataSyncModel extends AlipayObject {

	private static final long serialVersionUID = 8173843146322863594L;

	/**
	 * 内容数据的列表（商品列表，内容列表，本地零售商品列表，通用物品列表，四个模型只能选一个传，且单次列表数量不要超过100）
	 */
	@ApiListField("content_list")
	@ApiField("ape_content_item")
	private List<ApeContentItem> contentList;

	/**
	 * 商品数据的列表（商品列表，内容列表，本地零售商品列表，通用物品列表，四个模型只能选一个传，且单次列表数量不要超过100）
	 */
	@ApiListField("data_list")
	@ApiField("ape_data_item")
	private List<ApeDataItem> dataList;

	/**
	 * 数据类型，可选值：USER（用户数据）、ITEM（商品数据）、BEHAVIOR（行为数据）
	 */
	@ApiField("data_type")
	private String dataType;

	/**
	 * 通用物品列表（商品列表，内容列表，本地零售商品列表，通用物品列表，四个模型只能选一个传，且单次列表数量不要超过100）
	 */
	@ApiListField("generic_item_list")
	@ApiField("ape_generic_item")
	private List<ApeGenericItem> genericItemList;

	/**
	 * 商家在蚂蚁推荐引擎创建的项目id，调用前需要找蚂蚁技术获取。
	 */
	@ApiField("project_id")
	private String projectId;

	/**
	 * 本地零售商品列表（商品列表，内容列表，本地零售商品列表，通用物品列表，四个模型只能选一个传，且单次列表数量不要超过100）
	 */
	@ApiListField("retail_item_list")
	@ApiField("ape_retail_item")
	private List<ApeRetailItem> retailItemList;

	public List<ApeContentItem> getContentList() {
		return this.contentList;
	}
	public void setContentList(List<ApeContentItem> contentList) {
		this.contentList = contentList;
	}

	public List<ApeDataItem> getDataList() {
		return this.dataList;
	}
	public void setDataList(List<ApeDataItem> dataList) {
		this.dataList = dataList;
	}

	public String getDataType() {
		return this.dataType;
	}
	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	public List<ApeGenericItem> getGenericItemList() {
		return this.genericItemList;
	}
	public void setGenericItemList(List<ApeGenericItem> genericItemList) {
		this.genericItemList = genericItemList;
	}

	public String getProjectId() {
		return this.projectId;
	}
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public List<ApeRetailItem> getRetailItemList() {
		return this.retailItemList;
	}
	public void setRetailItemList(List<ApeRetailItem> retailItemList) {
		this.retailItemList = retailItemList;
	}

}
