package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 直播间资源审核
 *
 * @author auto create
 * @since 1.0, 2025-11-13 14:32:41
 */
public class AlipayContentLiveAnchorResourceAuditModel extends AlipayObject {

	private static final long serialVersionUID = 5586143786878638882L;

	/**
	 * 鉴权token
	 */
	@ApiField("access_token")
	private String accessToken;

	/**
	 * 玩法名称
	 */
	@ApiField("interactive_name")
	private String interactiveName;

	/**
	 * 主播号ID
	 */
	@ApiField("public_id")
	private String publicId;

	/**
	 * null
	 */
	@ApiListField("resource_list")
	@ApiField("string")
	private List<String> resourceList;

	/**
	 * TEXT：文本
IMAGE：图片
VIDEO：视频
	 */
	@ApiField("resource_type")
	private String resourceType;

	public String getAccessToken() {
		return this.accessToken;
	}
	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	public String getInteractiveName() {
		return this.interactiveName;
	}
	public void setInteractiveName(String interactiveName) {
		this.interactiveName = interactiveName;
	}

	public String getPublicId() {
		return this.publicId;
	}
	public void setPublicId(String publicId) {
		this.publicId = publicId;
	}

	public List<String> getResourceList() {
		return this.resourceList;
	}
	public void setResourceList(List<String> resourceList) {
		this.resourceList = resourceList;
	}

	public String getResourceType() {
		return this.resourceType;
	}
	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
	}

}
