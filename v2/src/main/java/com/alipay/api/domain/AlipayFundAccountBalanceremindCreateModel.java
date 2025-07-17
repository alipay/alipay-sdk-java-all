package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 创建余额提醒计划
 *
 * @author auto create
 * @since 1.0, 2024-07-18 15:57:59
 */
public class AlipayFundAccountBalanceremindCreateModel extends AlipayObject {

	private static final long serialVersionUID = 4373898428498813553L;

	/**
	 * 场景码，固定传：CREAT_PLAN
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 单位：元，触发余额提醒的上限阈值，当需要设置余额大于某值触发通知时设置改字段，设置后余额大于该值时按规则发送余额提醒通知
	 */
	@ApiField("max_remind_balance")
	private String maxRemindBalance;

	/**
	 * 单位：元，触发余额提醒的下限阈值，当需要设置下限时填充此字段，设置后余额小于该值时按规则发送余额提醒通知
	 */
	@ApiField("min_remind_balance")
	private String minRemindBalance;

	/**
	 * 被监控账户
	 */
	@ApiField("monitor_user_id")
	private String monitorUserId;

	/**
	 * 被监控账户
	 */
	@ApiField("monitor_user_open_id")
	private String monitorUserOpenId;

	/**
	 * 外部单号，每个服务商相同单号只能创建一个余额提醒计划
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 余额提醒计划的名称，在支付宝端内暂未对客展示，为空时会自动填充一个默认值
	 */
	@ApiField("plan_name")
	private String planName;

	/**
	 * 产品码，固定传：BALANCE_REMIND
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 提醒人信息列表
	 */
	@ApiListField("remind_person_list")
	@ApiField("remind_person_info_d_t_o")
	private List<RemindPersonInfoDTO> remindPersonList;

	/**
	 * 计划的调度信息，包括每天的时间，和重复频率
	 */
	@ApiListField("schedule_info_list")
	@ApiField("schedule_info_d_t_o")
	private List<ScheduleInfoDTO> scheduleInfoList;

	/**
	 * 接入方的业务场景，如示例值：ETC代扣场景
	 */
	@ApiField("third_biz_scene")
	private String thirdBizScene;

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getMaxRemindBalance() {
		return this.maxRemindBalance;
	}
	public void setMaxRemindBalance(String maxRemindBalance) {
		this.maxRemindBalance = maxRemindBalance;
	}

	public String getMinRemindBalance() {
		return this.minRemindBalance;
	}
	public void setMinRemindBalance(String minRemindBalance) {
		this.minRemindBalance = minRemindBalance;
	}

	public String getMonitorUserId() {
		return this.monitorUserId;
	}
	public void setMonitorUserId(String monitorUserId) {
		this.monitorUserId = monitorUserId;
	}

	public String getMonitorUserOpenId() {
		return this.monitorUserOpenId;
	}
	public void setMonitorUserOpenId(String monitorUserOpenId) {
		this.monitorUserOpenId = monitorUserOpenId;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getPlanName() {
		return this.planName;
	}
	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public List<RemindPersonInfoDTO> getRemindPersonList() {
		return this.remindPersonList;
	}
	public void setRemindPersonList(List<RemindPersonInfoDTO> remindPersonList) {
		this.remindPersonList = remindPersonList;
	}

	public List<ScheduleInfoDTO> getScheduleInfoList() {
		return this.scheduleInfoList;
	}
	public void setScheduleInfoList(List<ScheduleInfoDTO> scheduleInfoList) {
		this.scheduleInfoList = scheduleInfoList;
	}

	public String getThirdBizScene() {
		return this.thirdBizScene;
	}
	public void setThirdBizScene(String thirdBizScene) {
		this.thirdBizScene = thirdBizScene;
	}

}
