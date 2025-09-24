package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 出游套餐信息
 *
 * @author auto create
 * @since 1.0, 2024-04-18 21:19:15
 */
public class TourPackageInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 1513442527519886214L;

	/**
	 * 出发时间
	 */
	@ApiField("departure_time")
	private Date departureTime;

	/**
	 * 出行人身份证信息
	 */
	@ApiField("identity_card")
	private String identityCard;

	/**
	 * 出行人电话
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 出行人姓名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 人数信息
	 */
	@ApiField("population")
	private String population;

	/**
	 * 回程时间
	 */
	@ApiField("return_time")
	private Date returnTime;

	public Date getDepartureTime() {
		return this.departureTime;
	}
	public void setDepartureTime(Date departureTime) {
		this.departureTime = departureTime;
	}

	public String getIdentityCard() {
		return this.identityCard;
	}
	public void setIdentityCard(String identityCard) {
		this.identityCard = identityCard;
	}

	public String getMobile() {
		return this.mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getPopulation() {
		return this.population;
	}
	public void setPopulation(String population) {
		this.population = population;
	}

	public Date getReturnTime() {
		return this.returnTime;
	}
	public void setReturnTime(Date returnTime) {
		this.returnTime = returnTime;
	}

}
