package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 场景营销内容
 *
 * @author auto create
 * @since 1.0, 2018-06-13 22:45:04
 */
public class SceneMarketingContent extends AlipayObject {

	private static final long serialVersionUID = 2873921114813667742L;

	/**
	 * 美食 娱乐等分类条目
	 */
	@ApiField("category")
	private String category;

	/**
	 * 小图标地址
	 */
	@ApiField("icon")
	private String icon;

	/**
	 * 营销图片地址
	 */
	@ApiField("image")
	private String image;

	/**
	 * 营销内容意义
	 */
	@ApiField("meaning")
	private String meaning;

	/**
	 * 优惠信息的html格式展示参考
	 */
	@ApiField("meaning_desc")
	private String meaningDesc;

	/**
	 * 营销内容标签
	 */
	@ApiListField("tags")
	@ApiField("string")
	private List<String> tags;

	/**
	 * 限制及特性描述
	 */
	@ApiListField("tips")
	@ApiField("string")
	private List<String> tips;

	/**
	 * 营销内容标题
	 */
	@ApiField("title")
	private String title;

	/**
	 * 营销内容类型，例如优惠好店，商圈特惠
	 */
	@ApiField("type")
	private String type;

	/**
	 * 营销内容跳转地址
	 */
	@ApiField("url")
	private String url;

	public String getCategory() {
		return this.category;
	}
	public void setCategory(String category) {
		this.category = category;
	}

	public String getIcon() {
		return this.icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getImage() {
		return this.image;
	}
	public void setImage(String image) {
		this.image = image;
	}

	public String getMeaning() {
		return this.meaning;
	}
	public void setMeaning(String meaning) {
		this.meaning = meaning;
	}

	public String getMeaningDesc() {
		return this.meaningDesc;
	}
	public void setMeaningDesc(String meaningDesc) {
		this.meaningDesc = meaningDesc;
	}

	public List<String> getTags() {
		return this.tags;
	}
	public void setTags(List<String> tags) {
		this.tags = tags;
	}

	public List<String> getTips() {
		return this.tips;
	}
	public void setTips(List<String> tips) {
		this.tips = tips;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

}
