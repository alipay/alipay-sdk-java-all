package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 安全回收-用户风险等级查询接口
 *
 * @author auto create
 * @since 1.0, 2022-10-28 19:28:12
 */
public class AlipayCommerceRecycleSecurityQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6378258213978377812L;

	/**
	 * 风险咨询主体设备号
	 */
	@ApiField("apdidtoken")
	private String apdidtoken;

	/**
	 * 风险咨询主体身份证号，非必选，有该字段风险结果更可靠。
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 风险咨询主体用户手机号
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 预估回收价格，单位元。
	 */
	@ApiField("order_amount")
	private String orderAmount;

	/**
	 * 下单时间，标准时间格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("start_time")
	private Date startTime;

	/**
	 * 风险咨询主体的支付宝账号
	 */
	@ApiField("user_id")
	private String userId;

	public String getApdidtoken() {
		return this.apdidtoken;
	}
	public void setApdidtoken(String apdidtoken) {
		this.apdidtoken = apdidtoken;
	}

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getMobile() {
		return this.mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getOrderAmount() {
		return this.orderAmount;
	}
	public void setOrderAmount(String orderAmount) {
		this.orderAmount = orderAmount;
	}

	public Date getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
