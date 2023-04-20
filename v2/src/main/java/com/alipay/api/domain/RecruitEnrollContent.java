package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 活动报名内容
 *
 * @author auto create
 * @since 1.0, 2023-03-26 14:34:44
 */
public class RecruitEnrollContent extends AlipayObject {

	private static final long serialVersionUID = 3229783335923291185L;

	/**
	 * 报名提交的小程序商品列表。
	 */
	@ApiListField("app_items")
	@ApiField("recruit_content_app_item")
	private List<RecruitContentAppItem> appItems;

	public List<RecruitContentAppItem> getAppItems() {
		return this.appItems;
	}
	public void setAppItems(List<RecruitContentAppItem> appItems) {
		this.appItems = appItems;
	}

}
