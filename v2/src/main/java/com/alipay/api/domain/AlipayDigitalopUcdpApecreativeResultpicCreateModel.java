package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * ape创意生成图片接口
 *
 * @author auto create
 * @since 1.0, 2023-07-27 10:37:04
 */
public class AlipayDigitalopUcdpApecreativeResultpicCreateModel extends AlipayObject {

	private static final long serialVersionUID = 4859267855862191818L;

	/**
	 * 文本信息
	 */
	@ApiListField("creative_item_design_text_list")
	@ApiField("item_design_text_info")
	private List<ItemDesignTextInfo> creativeItemDesignTextList;

	/**
	 * 行业描述
	 */
	@ApiField("description")
	private String description;

	/**
	 * ape创意组id
	 */
	@ApiField("group_id")
	private String groupId;

	/**
	 * 商家在蚂蚁推荐引擎创建的项目id，调用前需要找蚂蚁技术获取。
	 */
	@ApiField("project_id")
	private String projectId;

	/**
	 * 风格id list
	 */
	@ApiListField("style_id_list")
	@ApiField("string")
	private List<String> styleIdList;

	public List<ItemDesignTextInfo> getCreativeItemDesignTextList() {
		return this.creativeItemDesignTextList;
	}
	public void setCreativeItemDesignTextList(List<ItemDesignTextInfo> creativeItemDesignTextList) {
		this.creativeItemDesignTextList = creativeItemDesignTextList;
	}

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public String getGroupId() {
		return this.groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public String getProjectId() {
		return this.projectId;
	}
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public List<String> getStyleIdList() {
		return this.styleIdList;
	}
	public void setStyleIdList(List<String> styleIdList) {
		this.styleIdList = styleIdList;
	}

}
