package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 行业AI提供的知识库安全检测
 *
 * @author auto create
 * @since 1.0, 2025-06-09 09:37:54
 */
public class AlipayEbppIndustrySecurityKnowledgeCheckModel extends AlipayObject {

	private static final long serialVersionUID = 4783772835717134829L;

	/**
	 * 调用方传递的当次安全检测业务id ,当深度检测有风险时会通过SPI 回调，并传递该id
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 对链接自身的黑白名单检测，不涉及链接里的内容
	 */
	@ApiListField("link_list")
	@ApiField("string")
	private List<String> linkList;

	/**
	 * 图片的安全检测
	 */
	@ApiListField("pic_url_list")
	@ApiField("string")
	private List<String> picUrlList;

	/**
	 * 文本安全检测，支持数组形式
	 */
	@ApiListField("text_list")
	@ApiField("string")
	private List<String> textList;

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public List<String> getLinkList() {
		return this.linkList;
	}
	public void setLinkList(List<String> linkList) {
		this.linkList = linkList;
	}

	public List<String> getPicUrlList() {
		return this.picUrlList;
	}
	public void setPicUrlList(List<String> picUrlList) {
		this.picUrlList = picUrlList;
	}

	public List<String> getTextList() {
		return this.textList;
	}
	public void setTextList(List<String> textList) {
		this.textList = textList;
	}

}
