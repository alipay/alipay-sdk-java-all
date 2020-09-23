package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序模板消息申请
 *
 * @author auto create
 * @since 1.0, 2018-01-23 18:22:07
 */
public class AlipayOpenMiniTemplatemessageUsertemplateApplyModel extends AlipayObject {

	private static final long serialVersionUID = 7536175366686811486L;

	/**
	 * 开发者自行组合好的模板关键词列表，关键词之间使用英文的逗号“,”进行分割，关键词顺序可以自由搭配，最多支持10个关键词组合,这里组织的关键词，在发送模板消息接口中，按照这里的顺序进行占位符替换
	 */
	@ApiField("keyword_list")
	private String keywordList;

	/**
	 * 模板库id，可登录小程序后台查看获取
	 */
	@ApiField("template_library_id")
	private String templateLibraryId;

	public String getKeywordList() {
		return this.keywordList;
	}
	public void setKeywordList(String keywordList) {
		this.keywordList = keywordList;
	}

	public String getTemplateLibraryId() {
		return this.templateLibraryId;
	}
	public void setTemplateLibraryId(String templateLibraryId) {
		this.templateLibraryId = templateLibraryId;
	}

}
