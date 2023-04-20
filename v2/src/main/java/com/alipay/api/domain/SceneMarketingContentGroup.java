package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 场景营销内容分组
 *
 * @author auto create
 * @since 1.0, 2018-06-05 11:05:01
 */
public class SceneMarketingContentGroup extends AlipayObject {

	private static final long serialVersionUID = 2137434744547151711L;

	/**
	 * 营销内容列表
	 */
	@ApiListField("data_list")
	@ApiField("scene_marketing_content")
	private List<SceneMarketingContent> dataList;

	/**
	 * 分组名称
	 */
	@ApiField("group_name")
	private String groupName;

	/**
	 * 简要描述
	 */
	@ApiField("summary")
	private String summary;

	public List<SceneMarketingContent> getDataList() {
		return this.dataList;
	}
	public void setDataList(List<SceneMarketingContent> dataList) {
		this.dataList = dataList;
	}

	public String getGroupName() {
		return this.groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public String getSummary() {
		return this.summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}

}
