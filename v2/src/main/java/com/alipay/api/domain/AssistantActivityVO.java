package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小助手活动模型
 *
 * @author auto create
 * @since 1.0, 2025-10-22 09:34:45
 */
public class AssistantActivityVO extends AlipayObject {

	private static final long serialVersionUID = 3183116385365885915L;

	/**
	 * 活动跳转行动点
	 */
	@ApiField("action_name")
	private String actionName;

	/**
	 * 活动跳转地址
	 */
	@ApiField("action_url")
	private String actionUrl;

	/**
	 * 人群code，需要通过<a href="https://opendocs.alipay.com/open/09c10677_alipay.marketing.qipan.crowdoperation.create?pathHash=3d8bad63">棋盘人群创建接口</a>创建并获取返回crowd_code作为这个地方传的人群code参数
	 */
	@ApiField("crowd_code")
	private String crowdCode;

	/**
	 * 人群类型
	 */
	@ApiField("crowd_type")
	private String crowdType;

	/**
	 * 活动描述，可以不填
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 图片文件id，支持的图片 jpg、jpeg、png，宽高1:1，大小小于2M，请先通过图片上传接口上传图片<a href="https://opendocs.alipay.com/apis/036ros">https://opendocs.alipay.com/apis/036ros</a> 并获取到 file_id 作为这个入参的值
	 */
	@ApiField("image_id")
	private String imageId;

	/**
	 * 活动标题，展示在c端小助手内的标题
	 */
	@ApiField("title")
	private String title;

	public String getActionName() {
		return this.actionName;
	}
	public void setActionName(String actionName) {
		this.actionName = actionName;
	}

	public String getActionUrl() {
		return this.actionUrl;
	}
	public void setActionUrl(String actionUrl) {
		this.actionUrl = actionUrl;
	}

	public String getCrowdCode() {
		return this.crowdCode;
	}
	public void setCrowdCode(String crowdCode) {
		this.crowdCode = crowdCode;
	}

	public String getCrowdType() {
		return this.crowdType;
	}
	public void setCrowdType(String crowdType) {
		this.crowdType = crowdType;
	}

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getImageId() {
		return this.imageId;
	}
	public void setImageId(String imageId) {
		this.imageId = imageId;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
