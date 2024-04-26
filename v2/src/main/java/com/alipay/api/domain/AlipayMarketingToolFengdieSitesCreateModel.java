package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创建云凤蝶站点
 *
 * @author auto create
 * @since 1.0, 2021-06-25 21:55:40
 */
public class AlipayMarketingToolFengdieSitesCreateModel extends AlipayObject {

	private static final long serialVersionUID = 2587941911446927858L;

	/**
	 * 云凤蝶站点初始化数据
	 */
	@ApiField("activity")
	private FengdieSitesCreateModel activity;

	/**
	 * 作为当前操作者的空间成员用户名， 值为 origin_user_id（即创建空间成员接口的入参），应确保 operator 是参数 space_id 对应的空间成员
	 */
	@ApiField("operator")
	private String operator;

	/**
	 * 操作的空间 ID
	 */
	@ApiField("space_id")
	private String spaceId;

	/**
	 * 创建站点使用的模板名称
	 */
	@ApiField("template_name")
	private String templateName;

	public FengdieSitesCreateModel getActivity() {
		return this.activity;
	}
	public void setActivity(FengdieSitesCreateModel activity) {
		this.activity = activity;
	}

	public String getOperator() {
		return this.operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getSpaceId() {
		return this.spaceId;
	}
	public void setSpaceId(String spaceId) {
		this.spaceId = spaceId;
	}

	public String getTemplateName() {
		return this.templateName;
	}
	public void setTemplateName(String templateName) {
		this.templateName = templateName;
	}

}
