package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 查询用户碳账户月数据
 *
 * @author auto create
 * @since 1.0, 2024-03-14 19:27:37
 */
public class AlipaySocialAntforestCarbonmonthQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5452437916743129751L;

	/**
	 * 接口文档提供的绿色场景类型
	 */
	@ApiListField("carbon_type")
	@ApiField("string")
	private List<String> carbonType;

	/**
	 * 月份（选填）如果为空查询最近12个月的碳账户数据，不为空查询输入日期当前月份数据
	 */
	@ApiField("month")
	private Date month;

	/**
	 * 在对应商户的消费者id
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 蚂蚁统一会员ID，执行该操作的支付宝用户
	 */
	@ApiField("user_id")
	private String userId;

	public List<String> getCarbonType() {
		return this.carbonType;
	}
	public void setCarbonType(List<String> carbonType) {
		this.carbonType = carbonType;
	}

	public Date getMonth() {
		return this.month;
	}
	public void setMonth(Date month) {
		this.month = month;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
