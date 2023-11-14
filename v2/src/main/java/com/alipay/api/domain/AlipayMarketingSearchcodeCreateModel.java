package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝搜索码发放接口
 *
 * @author auto create
 * @since 1.0, 2023-04-12 14:28:30
 */
public class AlipayMarketingSearchcodeCreateModel extends AlipayObject {

	private static final long serialVersionUID = 2324549156196464241L;

	/**
	 * 业务标识，类似于业务主键，诸如pid、uid、门店id
	 */
	@ApiField("biz_linked_id")
	private String bizLinkedId;

	/**
	 * 搜索码的业务类型，新增业务请联系PD和开发分配
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 展示在搜索码搜索后，搜索box面板上banner的描述文案
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 搜索码的有效期，单位s
	 */
	@ApiField("timeout")
	private String timeout;

	/**
	 * 展示在搜索码搜索后，box的面板上banner的标题字段
	 */
	@ApiField("title")
	private String title;

	/**
	 * 点击搜索box的banner后的跳转地址
	 */
	@ApiField("url")
	private String url;

	public String getBizLinkedId() {
		return this.bizLinkedId;
	}
	public void setBizLinkedId(String bizLinkedId) {
		this.bizLinkedId = bizLinkedId;
	}

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getTimeout() {
		return this.timeout;
	}
	public void setTimeout(String timeout) {
		this.timeout = timeout;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

}
