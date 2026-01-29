package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 预算预警信息
 *
 * @author auto create
 * @since 1.0, 2025-01-18 13:46:21
 */
public class DtbankActivityAlertConfigInfo extends AlipayObject {

	private static final long serialVersionUID = 4897522912421849826L;

	/**
	 * 总剩余预算预警值，单位：分
	 */
	@ApiField("alert_value")
	private Long alertValue;

	/**
	 * 接口通知应用APPID
	 */
	@ApiListField("app_id_list")
	@ApiField("string")
	private List<String> appIdList;

	/**
	 * 预警方式：MESSAGE：短信；INTERFACE：接口
	 */
	@ApiField("budget_alert_notify_type")
	private String budgetAlertNotifyType;

	/**
	 * 短信通知联系人列表
	 */
	@ApiListField("phone_no_list")
	@ApiField("string")
	private List<String> phoneNoList;

	/**
	 * 配置的核销速率预警值，单位：分
	 */
	@ApiField("write_off_rate_alert_value")
	private Long writeOffRateAlertValue;

	public Long getAlertValue() {
		return this.alertValue;
	}
	public void setAlertValue(Long alertValue) {
		this.alertValue = alertValue;
	}

	public List<String> getAppIdList() {
		return this.appIdList;
	}
	public void setAppIdList(List<String> appIdList) {
		this.appIdList = appIdList;
	}

	public String getBudgetAlertNotifyType() {
		return this.budgetAlertNotifyType;
	}
	public void setBudgetAlertNotifyType(String budgetAlertNotifyType) {
		this.budgetAlertNotifyType = budgetAlertNotifyType;
	}

	public List<String> getPhoneNoList() {
		return this.phoneNoList;
	}
	public void setPhoneNoList(List<String> phoneNoList) {
		this.phoneNoList = phoneNoList;
	}

	public Long getWriteOffRateAlertValue() {
		return this.writeOffRateAlertValue;
	}
	public void setWriteOffRateAlertValue(Long writeOffRateAlertValue) {
		this.writeOffRateAlertValue = writeOffRateAlertValue;
	}

}
