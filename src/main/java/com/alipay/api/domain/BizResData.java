package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻信用企业征信产品推广码业务查询
 *
 * @author auto create
 * @since 1.0, 2019-01-15 18:56:05
 */
public class BizResData extends AlipayObject {

	private static final long serialVersionUID = 4633664141824982786L;

	/**
	 * 支用金额
	 */
	@ApiField("biz_amount")
	private Long bizAmount;

	/**
	 * 支用日期
	 */
	@ApiField("biz_date")
	private String bizDate;

	/**
	 * 业务借据号
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 业务消费者唯一标志
	 */
	@ApiField("biz_user_id")
	private String bizUserId;

	public Long getBizAmount() {
		return this.bizAmount;
	}
	public void setBizAmount(Long bizAmount) {
		this.bizAmount = bizAmount;
	}

	public String getBizDate() {
		return this.bizDate;
	}
	public void setBizDate(String bizDate) {
		this.bizDate = bizDate;
	}

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	public String getBizUserId() {
		return this.bizUserId;
	}
	public void setBizUserId(String bizUserId) {
		this.bizUserId = bizUserId;
	}

}
