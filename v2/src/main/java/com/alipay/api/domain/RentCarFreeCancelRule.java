package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 免费取消规则
 *
 * @author auto create
 * @since 1.0, 2024-04-09 23:02:26
 */
public class RentCarFreeCancelRule extends AlipayObject {

	private static final long serialVersionUID = 3225641363969944464L;

	/**
	 * 免费取消截止时间。free_type=1时使用此字段
	 */
	@ApiField("free_date")
	private Date freeDate;

	/**
	 * 可免费取消的时间，单位分钟。用户free_type=2时
	 */
	@ApiField("free_minutes")
	private Long freeMinutes;

	/**
	 * 免费取消共4种类型：
1、指定时间前可免费取消（xxxx年xx月xx日xx时xx分前可免费取消）
2、支付后一段时间内可免费取消（支付后15分钟内免费取消）
3、取车前免费取消
4、不能免费取消
	 */
	@ApiField("free_type")
	private Long freeType;

	public Date getFreeDate() {
		return this.freeDate;
	}
	public void setFreeDate(Date freeDate) {
		this.freeDate = freeDate;
	}

	public Long getFreeMinutes() {
		return this.freeMinutes;
	}
	public void setFreeMinutes(Long freeMinutes) {
		this.freeMinutes = freeMinutes;
	}

	public Long getFreeType() {
		return this.freeType;
	}
	public void setFreeType(Long freeType) {
		this.freeType = freeType;
	}

}
