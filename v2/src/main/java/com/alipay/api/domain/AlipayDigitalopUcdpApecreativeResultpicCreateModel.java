package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * ape创意生成图片接口
 *
 * @author auto create
 * @since 1.0, 2023-10-20 19:04:00
 */
public class AlipayDigitalopUcdpApecreativeResultpicCreateModel extends AlipayObject {

	private static final long serialVersionUID = 8128977839324241369L;

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
	 * 合成图片时所需的高
	 */
	@ApiField("height")
	private Long height;

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

	/**
	 * 合成图片时所需的宽
	 */
	@ApiField("width")
	private Long width;

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

	public Long getHeight() {
		return this.height;
	}
	public void setHeight(Long height) {
		this.height = height;
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

	public Long getWidth() {
		return this.width;
	}
	public void setWidth(Long width) {
		this.width = width;
	}

}
