package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 用户与商家之间的协商记录
 *
 * @author auto create
 * @since 1.0, 2021-06-07 10:41:19
 */
public class ReplyRecordResponse extends AlipayObject {

	private static final long serialVersionUID = 3876129581534176384L;

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
	 * 回复人名称
	 */
	@ApiField("replier_name")
	private String replierName;

	/**
	 * 用户：USER 
商家：MERCHANT
系统：SYSTEM
审核小二：AUDITOR
政府单位：GOVERNMENT
	 */
	@ApiField("replier_role")
	private String replierRole;

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

	public String getReplierName() {
		return this.replierName;
	}
	public void setReplierName(String replierName) {
		this.replierName = replierName;
	}

	public String getReplierRole() {
		return this.replierRole;
	}
	public void setReplierRole(String replierRole) {
		this.replierRole = replierRole;
	}

}
