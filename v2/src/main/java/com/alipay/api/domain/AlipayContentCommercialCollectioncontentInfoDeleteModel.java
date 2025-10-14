package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 删除优酷短视频内容信息
 *
 * @author auto create
 * @since 1.0, 2025-08-28 16:56:12
 */
public class AlipayContentCommercialCollectioncontentInfoDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 7311833683282182676L;

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
	 * 请求类型：1: 新增短素材 2 编辑短素材 3 删除短素材 4 编辑合集内容
	 */
	@ApiField("request_type")
	private String requestType;

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

	public String getRequestType() {
		return this.requestType;
	}
	public void setRequestType(String requestType) {
		this.requestType = requestType;
	}

}
