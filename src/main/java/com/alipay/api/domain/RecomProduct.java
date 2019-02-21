package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 推荐产品对象
 *
 * @author auto create
 * @since 1.0, 2018-11-23 17:26:55
 */
public class RecomProduct extends AlipayObject {

	private static final long serialVersionUID = 7126297488799691589L;

	/**
	 * 最大允许购买份数
	 */
	@ApiField("max_quan")
	private Long maxQuan;

	/**
	 * 推荐产品展示名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 推荐方案列表
	 */
	@ApiField("plans")
	private RecomPlan plans;

	/**
	 * 推荐返回保费，单位分
	 */
	@ApiField("premium")
	private Long premium;

	/**
	 * 推荐产品ID
	 */
	@ApiField("prod_no")
	private String prodNo;

	/**
	 * 推荐返回结果对象：1：保险产品，2：保险权益
	 */
	@ApiField("type")
	private String type;

	public Long getMaxQuan() {
		return this.maxQuan;
	}
	public void setMaxQuan(Long maxQuan) {
		this.maxQuan = maxQuan;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public RecomPlan getPlans() {
		return this.plans;
	}
	public void setPlans(RecomPlan plans) {
		this.plans = plans;
	}

	public Long getPremium() {
		return this.premium;
	}
	public void setPremium(Long premium) {
		this.premium = premium;
	}

	public String getProdNo() {
		return this.prodNo;
	}
	public void setProdNo(String prodNo) {
		this.prodNo = prodNo;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
