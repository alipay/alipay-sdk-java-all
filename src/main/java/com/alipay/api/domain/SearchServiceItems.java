package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 服务申请单提报详情数据
 *
 * @author auto create
 * @since 1.0, 2021-09-17 18:01:34
 */
public class SearchServiceItems extends AlipayObject {

	private static final long serialVersionUID = 4111155946892636274L;

	/**
	 * 申请单状态
	 */
	@ApiField("box_status")
	private String boxStatus;

	/**
	 * 类目id
	 */
	@ApiListField("category_codes")
	@ApiField("string")
	private List<String> categoryCodes;

	/**
	 * 服务申请单提报关键词
	 */
	@ApiListField("key_words")
	@ApiField("string")
	private List<String> keyWords;

	/**
	 * 模板id
	 */
	@ApiField("template_id")
	private String templateId;

	public String getBoxStatus() {
		return this.boxStatus;
	}
	public void setBoxStatus(String boxStatus) {
		this.boxStatus = boxStatus;
	}

	public List<String> getCategoryCodes() {
		return this.categoryCodes;
	}
	public void setCategoryCodes(List<String> categoryCodes) {
		this.categoryCodes = categoryCodes;
	}

	public List<String> getKeyWords() {
		return this.keyWords;
	}
	public void setKeyWords(List<String> keyWords) {
		this.keyWords = keyWords;
	}

	public String getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

}
