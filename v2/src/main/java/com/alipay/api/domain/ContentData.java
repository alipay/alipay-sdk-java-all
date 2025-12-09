package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 以Map形式返回具体内容
 *
 * @author auto create
 * @since 1.0, 2025-11-26 17:22:41
 */
public class ContentData extends AlipayObject {

	private static final long serialVersionUID = 6672557335983237593L;

	/**
	 * 健康史
	 */
	@ApiField("health_history")
	private HealthHistory healthHistory;

	/**
	 * null
	 */
	@ApiListField("health_report_list")
	@ApiField("health_report")
	private List<HealthReport> healthReportList;

	/**
	 * 用户资料
	 */
	@ApiField("user_folder")
	private HealthcareData userFolder;

	/**
	 * 个人信息
	 */
	@ApiField("userbase")
	private Userbase userbase;

	public HealthHistory getHealthHistory() {
		return this.healthHistory;
	}
	public void setHealthHistory(HealthHistory healthHistory) {
		this.healthHistory = healthHistory;
	}

	public List<HealthReport> getHealthReportList() {
		return this.healthReportList;
	}
	public void setHealthReportList(List<HealthReport> healthReportList) {
		this.healthReportList = healthReportList;
	}

	public HealthcareData getUserFolder() {
		return this.userFolder;
	}
	public void setUserFolder(HealthcareData userFolder) {
		this.userFolder = userFolder;
	}

	public Userbase getUserbase() {
		return this.userbase;
	}
	public void setUserbase(Userbase userbase) {
		this.userbase = userbase;
	}

}
