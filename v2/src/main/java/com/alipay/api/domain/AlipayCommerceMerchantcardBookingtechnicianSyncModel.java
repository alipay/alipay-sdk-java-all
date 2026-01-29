package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 手艺人同步
 *
 * @author auto create
 * @since 1.0, 2025-12-03 10:27:43
 */
public class AlipayCommerceMerchantcardBookingtechnicianSyncModel extends AlipayObject {

	private static final long serialVersionUID = 7472583316653135788L;

	/**
	 * 手艺人头像文件id 来源于alipay.open.file.upload支付宝文件上传接口
	 */
	@ApiField("avatar_file_id")
	private String avatarFileId;

	/**
	 * 手艺人从业开始月份 格式 yyyy-MM【首次同步手艺人信息时必填】
	 */
	@ApiField("career_start_month")
	private String careerStartMonth;

	/**
	 * 手艺人昵称【首次同步手艺人信息时必填】
	 */
	@ApiField("nick")
	private String nick;

	/**
	 * 外部手艺人id【可选，有就传】
	 */
	@ApiField("out_technician_id")
	private String outTechnicianId;

	/**
	 * 手艺人手机号【首次同步手艺人信息时必填】
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
	 * 门店id【必填】
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 手艺人状态（枚举）【首次同步手艺人信息时必填】
deleted      永久删除，后续不可恢复，不可再被查询到
active       可预约状态
inactive     不可预约，后续可恢复成active
	 */
	@ApiField("status")
	private String status;

	/**
	 * 手艺人id 为空表示新建/有值表示更新
	 */
	@ApiField("technician_id")
	private String technicianId;

	/**
	 * 手艺人岗位头衔【首次同步手艺人信息时必填】
	 */
	@ApiField("title")
	private String title;

	/**
	 * null
	 */
	@ApiListField("week_plans")
	@ApiField("schedule_week_plan_info")
	private List<ScheduleWeekPlanInfo> weekPlans;

	public String getAvatarFileId() {
		return this.avatarFileId;
	}
	public void setAvatarFileId(String avatarFileId) {
		this.avatarFileId = avatarFileId;
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
