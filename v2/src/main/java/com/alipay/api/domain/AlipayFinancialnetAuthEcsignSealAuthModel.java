package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 签呗电子签约印章使用授权服务
 *
 * @author auto create
 * @since 1.0, 2023-05-18 18:55:41
 */
public class AlipayFinancialnetAuthEcsignSealAuthModel extends AlipayObject {

	private static final long serialVersionUID = 7851151638124417388L;

	/**
	 * 经过认证的支付宝账号
	 */
	@ApiField("auth_alipay_no")
	private String authAlipayNo;

	/**
	 * 授权结束时间，只计算年月日。
	 */
	@ApiField("auth_end_date")
	private Date authEndDate;

	/**
	 * 授权开始时间，只计算年月日。
	 */
	@ApiField("auth_start_date")
	private Date authStartDate;

	/**
	 * 印章ID，唯一值。
	 */
	@ApiField("seal_id")
	private String sealId;

	public String getAuthAlipayNo() {
		return this.authAlipayNo;
	}
	public void setAuthAlipayNo(String authAlipayNo) {
		this.authAlipayNo = authAlipayNo;
	}

	public Date getAuthEndDate() {
		return this.authEndDate;
	}
	public void setAuthEndDate(Date authEndDate) {
		this.authEndDate = authEndDate;
	}

	public Date getAuthStartDate() {
		return this.authStartDate;
	}
	public void setAuthStartDate(Date authStartDate) {
		this.authStartDate = authStartDate;
	}

	public String getSealId() {
		return this.sealId;
	}
	public void setSealId(String sealId) {
		this.sealId = sealId;
	}

}
