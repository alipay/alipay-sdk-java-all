package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-03-12 13:42:44
 */
public class LifeServiceTechnicianInfo extends AlipayObject {

	private static final long serialVersionUID = 1737512938569189334L;

	/**
	 * 手艺人头像url
	 */
	@ApiField("avatar_url")
	private String avatarUrl;

	/**
	 * 手艺人从业开始月份 格式 yyyy-MM
	 */
	@ApiField("career_start_month")
	private String careerStartMonth;

	/**
	 * 手艺人昵称
	 */
	@ApiField("nick")
	private String nick;

	/**
	 * 三方手艺人id
	 */
	@ApiField("out_technician_id")
	private String outTechnicianId;

	/**
	 * 手艺人手机号
	 */
	@ApiField("phone")
	private String phone;

	/**
	 * null
	 */
	@ApiListField("service_ids")
	@ApiField("string")
	private List<String> serviceIds;

	/**
	 * 蚂蚁门店id
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 手艺人状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * null
	 */
	@ApiListField("technician_attrs")
	@ApiField("life_service_attr")
	private List<LifeServiceAttr> technicianAttrs;

	/**
	 * 手艺人id
	 */
	@ApiField("technician_id")
	private String technicianId;

	/**
	 * 手艺人岗位头衔
	 */
	@ApiField("title")
	private String title;

	/**
	 * null
	 */
	@ApiListField("week_plans")
	@ApiField("schedule_week_plan_info")
	private List<ScheduleWeekPlanInfo> weekPlans;

	public String getAvatarUrl() {
		return this.avatarUrl;
	}
	public void setAvatarUrl(String avatarUrl) {
		this.avatarUrl = avatarUrl;
	}

	public String getCareerStartMonth() {
		return this.careerStartMonth;
	}
	public void setCareerStartMonth(String careerStartMonth) {
		this.careerStartMonth = careerStartMonth;
	}

	public String getNick() {
		return this.nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getOutTechnicianId() {
		return this.outTechnicianId;
	}
	public void setOutTechnicianId(String outTechnicianId) {
		this.outTechnicianId = outTechnicianId;
	}

	public String getPhone() {
		return this.phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public List<String> getServiceIds() {
		return this.serviceIds;
	}
	public void setServiceIds(List<String> serviceIds) {
		this.serviceIds = serviceIds;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public List<LifeServiceAttr> getTechnicianAttrs() {
		return this.technicianAttrs;
	}
	public void setTechnicianAttrs(List<LifeServiceAttr> technicianAttrs) {
		this.technicianAttrs = technicianAttrs;
	}

	public String getTechnicianId() {
		return this.technicianId;
	}
	public void setTechnicianId(String technicianId) {
		this.technicianId = technicianId;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public List<ScheduleWeekPlanInfo> getWeekPlans() {
		return this.weekPlans;
	}
	public void setWeekPlans(List<ScheduleWeekPlanInfo> weekPlans) {
		this.weekPlans = weekPlans;
	}

}
