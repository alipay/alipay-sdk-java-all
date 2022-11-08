package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 自定义上传展示文案参数
 *
 * @author auto create
 * @since 1.0, 2022-06-16 19:37:57
 */
public class CustomInfo extends AlipayObject {

	private static final long serialVersionUID = 8658174216792613776L;

	/**
	 * 金额类描述内容，单位为分
如，title为餐补，amount 为500，
即展示内容为 餐补  ￥5.00
	 */
	@ApiField("amount")
	private Long amount;

	/**
	 * 非金额类描述内容，长度限制为8.
如，title 为餐补 description 为学生补贴
展示内容即为
餐补    学生补贴
	 */
	@ApiField("description")
	private String description;

	/**
	 * 用于支付结果页展示，改字段为左侧标题
	 */
	@ApiField("title")
	private String title;

	public Long getAmount() {
		return this.amount;
	}
	public void setAmount(Long amount) {
		this.amount = amount;
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

}
