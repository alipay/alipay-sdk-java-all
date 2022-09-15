package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * ape数据同步接口
 *
 * @author auto create
 * @since 1.0, 2022-08-08 20:25:15
 */
public class AlipayDigitalopUcdpApedataSyncModel extends AlipayObject {

	private static final long serialVersionUID = 5299231215255225593L;

	/**
	 * 内容数据的列表
	 */
	@ApiListField("content_list")
	@ApiField("ape_content_item")
	private List<ApeContentItem> contentList;

	/**
	 * 同步数据的列表
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
	 * 商家在蚂蚁推荐引擎创建的项目id，调用前需要找蚂蚁技术获取。
	 */
	@ApiField("project_id")
	private String projectId;

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

	public String getProjectId() {
		return this.projectId;
	}
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

}
