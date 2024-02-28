package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 爱动主题同步模型
 *
 * @author auto create
 * @since 1.0, 2023-07-07 16:58:05
 */
public class AIDongSubjectSyncDetail extends AlipayObject {

	private static final long serialVersionUID = 1519924194769887529L;

	/**
	 * 主题介绍
	 */
	@ApiField("description")
	private String description;

	/**
	 * 主题头部图片
	 */
	@ApiField("head_image")
	private String headImage;

	/**
	 * 主题图片
	 */
	@ApiField("image")
	private String image;

	/**
	 * 关联的课程id
	 */
	@ApiListField("lesson_id_list")
	@ApiField("string")
	private List<String> lessonIdList;

	/**
	 * 主题名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 标签名称
	 */
	@ApiListField("tag")
	@ApiField("string")
	private List<String> tag;

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public String getHeadImage() {
		return this.headImage;
	}
	public void setHeadImage(String headImage) {
		this.headImage = headImage;
	}

	public String getImage() {
		return this.image;
	}
	public void setImage(String image) {
		this.image = image;
	}

	public List<String> getLessonIdList() {
		return this.lessonIdList;
	}
	public void setLessonIdList(List<String> lessonIdList) {
		this.lessonIdList = lessonIdList;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public List<String> getTag() {
		return this.tag;
	}
	public void setTag(List<String> tag) {
		this.tag = tag;
	}

}
