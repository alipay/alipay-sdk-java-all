package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 空壳企业工商变更特征
 *
 * @author auto create
 * @since 1.0, 2022-01-20 17:25:27
 */
public class ShellCompanyGsChangeDetail extends AlipayObject {

	private static final long serialVersionUID = 8135337144349387614L;

	/**
	 * 变更后内容
	 */
	@ApiField("after_content")
	private String afterContent;

	/**
	 * 变更前内容
	 */
	@ApiField("before_content")
	private String beforeContent;

	/**
	 * 变更类型
	 */
	@ApiField("change_type")
	private String changeType;

	/**
	 * 描述
	 */
	@ApiField("description")
	private String description;

	/**
	 * 空壳企业公司变更标题
	 */
	@ApiField("title")
	private String title;

	/**
	 * 变更时间
	 */
	@ApiField("update_time")
	private String updateTime;

	public String getAfterContent() {
		return this.afterContent;
	}
	public void setAfterContent(String afterContent) {
		this.afterContent = afterContent;
	}

	public String getBeforeContent() {
		return this.beforeContent;
	}
	public void setBeforeContent(String beforeContent) {
		this.beforeContent = beforeContent;
	}

	public String getChangeType() {
		return this.changeType;
	}
	public void setChangeType(String changeType) {
		this.changeType = changeType;
	}

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getUpdateTime() {
		return this.updateTime;
	}
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

}
