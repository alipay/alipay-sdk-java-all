package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 回复记录
 *
 * @author auto create
 * @since 1.0, 2022-06-10 17:42:49
 */
public class ReplyRecord extends AlipayObject {

	private static final long serialVersionUID = 7724653654433263983L;

	/**
	 * 回复内容
	 */
	@ApiField("content")
	private String content;

	/**
	 * 回复时间
	 */
	@ApiField("gmt_create")
	private String gmtCreate;

	/**
	 * 回复图片
	 */
	@ApiListField("images")
	@ApiField("string")
	private List<String> images;

	/**
	 * 回复角色
商家：MERCHANT 
审核小二：AUDITOR
	 */
	@ApiField("replier_role")
	private String replierRole;

	/**
	 * 状态。只在replier_role = ‘AUDITOR’时有值。
appealSuccess：申诉通过
appealFailed：申诉不通过
rectifyPass：整改通过
rectifyReject：整改不通过
	 */
	@ApiField("status")
	private String status;

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public String getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(String gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public List<String> getImages() {
		return this.images;
	}
	public void setImages(List<String> images) {
		this.images = images;
	}

	public String getReplierRole() {
		return this.replierRole;
	}
	public void setReplierRole(String replierRole) {
		this.replierRole = replierRole;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
