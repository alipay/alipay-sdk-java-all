package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 运动项目健身计划删除
 *
 * @author auto create
 * @since 1.0, 2019-07-31 16:06:48
 */
public class KoubeiServindustryExercisePlanDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 6731171536463791667L;

	/**
	 * 运动计划类型。枚举：运动项目(ITEM),或课程(COURSE),单次记录(ITEM_SINGLE)
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 健身用户id
	 */
	@ApiField("fitness_id")
	private String fitnessId;

	/**
	 * 操作类型，DELETE_CRITERIA=删除符合条件记录,DELETE_SHOP=删除用户该门店下记录
	 */
	@ApiField("operate_type")
	private String operateType;

	/**
	 * 外部请求id
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 门店id
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 时间维度类型。枚举：DAY("日"),WEEK("周"),MONTH("月"),LIFE("终生"),TEMP("短期")
	 */
	@ApiField("time_dimension_type")
	private String timeDimensionType;

	/**
	 * 维度所对应的值
	 */
	@ApiField("values")
	private String values;

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getFitnessId() {
		return this.fitnessId;
	}
	public void setFitnessId(String fitnessId) {
		this.fitnessId = fitnessId;
	}

	public String getOperateType() {
		return this.operateType;
	}
	public void setOperateType(String operateType) {
		this.operateType = operateType;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getTimeDimensionType() {
		return this.timeDimensionType;
	}
	public void setTimeDimensionType(String timeDimensionType) {
		this.timeDimensionType = timeDimensionType;
	}

	public String getValues() {
		return this.values;
	}
	public void setValues(String values) {
		this.values = values;
	}

}
