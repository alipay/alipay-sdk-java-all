package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 编辑优酷渠道内容属性信息
 *
 * @author auto create
 * @since 1.0, 2025-08-28 16:56:12
 */
public class AlipayContentCommercialCollectioncontentInfoModifyModel extends AlipayObject {

	private static final long serialVersionUID = 6274448436392769468L;

	/**
	 * 合集ID，对应内容id关联的合集/短剧ID,来源于内容生态生成的ID，生产规则为日期+类型+版本号，该合集ID通过调用内容发布接口时自动生成
	 */
	@ApiField("collection_id")
	private String collectionId;

	/**
	 * 短视频内容id
	 */
	@ApiField("content_id")
	private String contentId;

	/**
	 * 短视频跳转链接
	 */
	@ApiField("jump_url")
	private String jumpUrl;

	public String getCollectionId() {
		return this.collectionId;
	}
	public void setCollectionId(String collectionId) {
		this.collectionId = collectionId;
	}

	public String getContentId() {
		return this.contentId;
	}
	public void setContentId(String contentId) {
		this.contentId = contentId;
	}

	public String getJumpUrl() {
		return this.jumpUrl;
	}
	public void setJumpUrl(String jumpUrl) {
		this.jumpUrl = jumpUrl;
	}

}
