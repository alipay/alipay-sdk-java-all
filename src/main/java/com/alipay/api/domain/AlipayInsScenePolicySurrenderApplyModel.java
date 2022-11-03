package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 退保受理
 *
 * @author auto create
 * @since 1.0, 2019-04-11 22:26:26
 */
public class AlipayInsScenePolicySurrenderApplyModel extends AlipayObject {

	private static final long serialVersionUID = 5588462444263728256L;

	/**
	 * 退保扩展参数 ;标准json格式
	 */
	@ApiField("biz_data")
	private String bizData;

	/**
	 * 蚂蚁保险平台生成的保单号
	 */
	@ApiField("policy_no")
	private String policyNo;

	/**
	 * 退保时标识的退保计价方式:
01:退保不退款 02:指定金额退款 03:全额退 04:区间退保 05:全额比例退
	 */
	@ApiField("surrender_price_type")
	private String surrenderPriceType;

	/**
	 * 退保原因说明
	 */
	@ApiField("surrender_reason")
	private String surrenderReason;

	/**
	 * 标识保单的退保时间(如不输入，默认当前时间)
	 */
	@ApiField("surrender_time")
	private Date surrenderTime;

	public String getBizData() {
		return this.bizData;
	}
	public void setBizData(String bizData) {
		this.bizData = bizData;
	}

	public String getPolicyNo() {
		return this.policyNo;
	}
	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}

	public String getSurrenderPriceType() {
		return this.surrenderPriceType;
	}
	public void setSurrenderPriceType(String surrenderPriceType) {
		this.surrenderPriceType = surrenderPriceType;
	}

	public String getSurrenderReason() {
		return this.surrenderReason;
	}
	public void setSurrenderReason(String surrenderReason) {
		this.surrenderReason = surrenderReason;
	}

	public Date getSurrenderTime() {
		return this.surrenderTime;
	}
	public void setSurrenderTime(Date surrenderTime) {
		this.surrenderTime = surrenderTime;
	}

}
