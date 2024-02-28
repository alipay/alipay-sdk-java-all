package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 模板栏位的扩展信息
 *
 * @author auto create
 * @since 1.0, 2023-07-03 13:56:01
 */
public class MoreInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 1885468151812886375L;

	/**
	 * 描述，当operate_type为openNative必填
	 */
	@ApiListField("descs")
	@ApiField("string")
	private List<String> descs;

	/**
	 * 扩展参数，需要URL地址回带的值，JSON格式(openweb时填)
	 */
	@ApiField("params")
	private String params;

	/**
	 * 二级页面标题，只有当operate_type为openNative时有效。
	 */
	@ApiField("title")
	private String title;

	/**
	 * 超链接(选择openweb的时候必须填写url参数内容)
	 */
	@ApiField("url")
	private String url;

	public List<String> getDescs() {
		return this.descs;
	}
	public void setDescs(List<String> descs) {
		this.descs = descs;
	}

	public String getParams() {
		return this.params;
	}
	public void setParams(String params) {
		this.params = params;
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
