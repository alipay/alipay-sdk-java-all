package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 活动报名内容
 *
 * @author auto create
 * @since 1.0, 2023-06-06 15:57:54
 */
public class RecruitEnrollContent extends AlipayObject {

	private static final long serialVersionUID = 6146576164187132337L;

	/**
	 * 报名提交的小程序商品列表。
	 */
	@ApiListField("app_items")
	@ApiField("recruit_content_app_item")
	private List<RecruitContentAppItem> appItems;

	/**
	 * 报名提交的小程序列表。
	 */
	@ApiListField("mini_apps")
	@ApiField("recruit_content_mini_app")
	private List<RecruitContentMiniApp> miniApps;

	/**
	 * 报名提交的券活动列表。
	 */
	@ApiListField("voucher_activities")
	@ApiField("recruit_content_voucher_activity")
	private List<RecruitContentVoucherActivity> voucherActivities;

	public List<RecruitContentAppItem> getAppItems() {
		return this.appItems;
	}
	public void setAppItems(List<RecruitContentAppItem> appItems) {
		this.appItems = appItems;
	}

	public List<RecruitContentMiniApp> getMiniApps() {
		return this.miniApps;
	}
	public void setMiniApps(List<RecruitContentMiniApp> miniApps) {
		this.miniApps = miniApps;
	}

	public List<RecruitContentVoucherActivity> getVoucherActivities() {
		return this.voucherActivities;
	}
	public void setVoucherActivities(List<RecruitContentVoucherActivity> voucherActivities) {
		this.voucherActivities = voucherActivities;
	}

}
