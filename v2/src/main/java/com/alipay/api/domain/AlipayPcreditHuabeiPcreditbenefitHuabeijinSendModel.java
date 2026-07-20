package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 花呗金特殊权益的发放
 *
 * @author auto create
 * @since 1.0, 2026-07-14 14:37:09
 */
public class AlipayPcreditHuabeiPcreditbenefitHuabeijinSendModel extends AlipayObject {

	private static final long serialVersionUID = 5622892789857475235L;

	/**
	 * 发奖活动id,花呗分配
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 123 表示123分，单位为分，1.23元
	 */
	@ApiField("actual_amount")
	private Long actualAmount;

	/**
	 * 行业场景标识,依赖双方约定
	 */
	@ApiField("industry_value")
	private String industryValue;

	/**
	 * 用于给场景获得花呗金时设置权益展示文案使用
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 出行订单描述，商品信息等
	 */
	@ApiField("order_desc")
	private String orderDesc;

	/**
	 * 标准日期格式，如2020-01-01 00:00:01
比如用户支付的时间
	 */
	@ApiField("order_time")
	private Date orderTime;

	/**
	 * 商家业务订单号（商家侧订单号，风险巡检时用于与支付宝交易系统对账）
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 支付宝订单
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getActivityId() {
		return this.activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public Long getActualAmount() {
		return this.actualAmount;
	}
	public void setActualAmount(Long actualAmount) {
		this.actualAmount = actualAmount;
	}

	public String getIndustryValue() {
		return this.industryValue;
	}
	public void setIndustryValue(String industryValue) {
		this.industryValue = industryValue;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOrderDesc() {
		return this.orderDesc;
	}
	public void setOrderDesc(String orderDesc) {
		this.orderDesc = orderDesc;
	}

	public Date getOrderTime() {
		return this.orderTime;
	}
	public void setOrderTime(Date orderTime) {
		this.orderTime = orderTime;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
