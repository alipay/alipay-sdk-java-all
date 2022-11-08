package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 空壳企业特征模型
 *
 * @author auto create
 * @since 1.0, 2022-01-20 17:25:27
 */
public class ShellCompanyFeatureDetail extends AlipayObject {

	private static final long serialVersionUID = 2193232267534753446L;

	/**
	 * 说明内容
	 */
	@ApiField("content")
	private String content;

	/**
	 * 空壳企业特征枚举主标题
	 */
	@ApiField("main_title")
	private String mainTitle;

	/**
	 * 空壳企业特征枚举子标题
	 */
	@ApiField("sub_title")
	private String subTitle;

	/**
	 * 更新时间 yyyy-MM-dd
	 */
	@ApiField("update_time")
	private String updateTime;

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public String getMainTitle() {
		return this.mainTitle;
	}
	public void setMainTitle(String mainTitle) {
		this.mainTitle = mainTitle;
	}

	public String getSubTitle() {
		return this.subTitle;
	}
	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
	}

	public String getUpdateTime() {
		return this.updateTime;
	}
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

}
