package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 健身计划同步接口
 *
 * @author auto create
 * @since 1.0, 2020-06-18 11:51:05
 */
public class KoubeiServindustryExercisePlanSyncModel extends AlipayObject {

	private static final long serialVersionUID = 2476772128382471889L;

	/**
	 * 数据版本号。linux时间戳，到毫秒级别。如果同步数据的版本号小于口碑服务器已有数据的版本号，则会被丢弃。
	 */
	@ApiField("data_version")
	private String dataVersion;

	/**
	 * 口碑用户健身通行证ID，和用户ID一一对应
	 */
	@ApiField("fitness_id")
	private String fitnessId;

	/**
	 * 健身计划列表
	 */
	@ApiListField("plan_list")
	@ApiField("exercise_plan_open_model")
	private List<ExercisePlanOpenModel> planList;

	/**
	 * 口碑店铺ID
	 */
	@ApiField("shop_id")
	private String shopId;

	public String getDataVersion() {
		return this.dataVersion;
	}
	public void setDataVersion(String dataVersion) {
		this.dataVersion = dataVersion;
	}

	public String getFitnessId() {
		return this.fitnessId;
	}
	public void setFitnessId(String fitnessId) {
		this.fitnessId = fitnessId;
	}

	public List<ExercisePlanOpenModel> getPlanList() {
		return this.planList;
	}
	public void setPlanList(List<ExercisePlanOpenModel> planList) {
		this.planList = planList;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

}
