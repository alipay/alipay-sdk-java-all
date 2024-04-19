package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 大出行智能平台-充电规划任务-创建
 *
 * @author auto create
 * @since 1.0, 2023-09-15 09:27:51
 */
public class AlipayCommerceTransportIntelligentizeChargescheduleCreateModel extends AlipayObject {

	private static final long serialVersionUID = 5668839365962788114L;

	/**
	 * 充电规划模式
	 */
	@ApiField("charge_schedule_mode")
	private String chargeScheduleMode;

	/**
	 * 城市代码，请按照支付宝标准传参
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 公交企业ID，由公交业主/公交ISV管理
	 */
	@ApiField("corp_id")
	private String corpId;

	/**
	 * 扩展参数，json格式，由双方约定取值
	 */
	@ApiField("ext_param")
	private String extParam;

	/**
	 * 请求ID，唯一标识一次请求
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 服务任务名称，标记任务信息
	 */
	@ApiField("service_task_name")
	private String serviceTaskName;

	/**
	 * 排班计划列表
	 */
	@ApiListField("work_schedule_plan_list")
	@ApiField("work_schedule_plan")
	private List<WorkSchedulePlan> workSchedulePlanList;

	public String getChargeScheduleMode() {
		return this.chargeScheduleMode;
	}
	public void setChargeScheduleMode(String chargeScheduleMode) {
		this.chargeScheduleMode = chargeScheduleMode;
	}

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getCorpId() {
		return this.corpId;
	}
	public void setCorpId(String corpId) {
		this.corpId = corpId;
	}

	public String getExtParam() {
		return this.extParam;
	}
	public void setExtParam(String extParam) {
		this.extParam = extParam;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getServiceTaskName() {
		return this.serviceTaskName;
	}
	public void setServiceTaskName(String serviceTaskName) {
		this.serviceTaskName = serviceTaskName;
	}

	public List<WorkSchedulePlan> getWorkSchedulePlanList() {
		return this.workSchedulePlanList;
	}
	public void setWorkSchedulePlanList(List<WorkSchedulePlan> workSchedulePlanList) {
		this.workSchedulePlanList = workSchedulePlanList;
	}

}
