package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 蓝花火社区话题创建接口
 *
 * @author auto create
 * @since 1.0, 2025-01-22 16:51:08
 */
public class AlipayCommerceIcommunityTopicCreateModel extends AlipayObject {

	private static final long serialVersionUID = 6749512615431357414L;

	/**
	 * 当前话题创建外部请求的唯一标识
	 */
	@ApiField("out_request_id")
	private String outRequestId;

	/**
	 * 创建话题的头像，该头像用于C端用户选择时展示
	 */
	@ApiField("topic_avatar")
	private String topicAvatar;

	/**
	 * 话题背景图资源id,可以通过 alipay.open.file.upload 获取图片文件资源id
	 */
	@ApiField("topic_background_image")
	private String topicBackgroundImage;

	/**
	 * 用于调用方的业务场景
	 */
	@ApiField("topic_create_biz_scene")
	private String topicCreateBizScene;

	/**
	 * 话题创建人id
	 */
	@ApiField("topic_creator_id")
	private String topicCreatorId;

	/**
	 * 话题内容的描述
	 */
	@ApiField("topic_desc")
	private String topicDesc;

	/**
	 * 话题关联的小组id列表
	 */
	@ApiListField("topic_link_group_ids")
	@ApiField("string")
	private List<String> topicLinkGroupIds;

	/**
	 * 话题名称
	 */
	@ApiField("topic_name")
	private String topicName;

	public String getOutRequestId() {
		return this.outRequestId;
	}
	public void setOutRequestId(String outRequestId) {
		this.outRequestId = outRequestId;
	}

	public String getTopicAvatar() {
		return this.topicAvatar;
	}
	public void setTopicAvatar(String topicAvatar) {
		this.topicAvatar = topicAvatar;
	}

	public String getTopicBackgroundImage() {
		return this.topicBackgroundImage;
	}
	public void setTopicBackgroundImage(String topicBackgroundImage) {
		this.topicBackgroundImage = topicBackgroundImage;
	}

	public String getTopicCreateBizScene() {
		return this.topicCreateBizScene;
	}
	public void setTopicCreateBizScene(String topicCreateBizScene) {
		this.topicCreateBizScene = topicCreateBizScene;
	}

	public String getTopicCreatorId() {
		return this.topicCreatorId;
	}
	public void setTopicCreatorId(String topicCreatorId) {
		this.topicCreatorId = topicCreatorId;
	}

	public String getTopicDesc() {
		return this.topicDesc;
	}
	public void setTopicDesc(String topicDesc) {
		this.topicDesc = topicDesc;
	}

	public List<String> getTopicLinkGroupIds() {
		return this.topicLinkGroupIds;
	}
	public void setTopicLinkGroupIds(List<String> topicLinkGroupIds) {
		this.topicLinkGroupIds = topicLinkGroupIds;
	}

	public String getTopicName() {
		return this.topicName;
	}
	public void setTopicName(String topicName) {
		this.topicName = topicName;
	}

}
