package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 惠支付对集团的权益同步接口
 *
 * @author auto create
 * @since 1.0, 2024-12-24 15:44:45
 */
public class AlipayMarketingDataEquitySyncModel extends AlipayObject {

	private static final long serialVersionUID = 4423876345257499963L;

	/**
	 * biz_time
	 */
	@ApiField("biz_time")
	private Date bizTime;

	/**
	 * equity_code
	 */
	@ApiField("equity_code")
	private String equityCode;

	/**
	 * equity_from
	 */
	@ApiField("equity_from")
	private String equityFrom;

	/**
	 * equity_id
	 */
	@ApiField("equity_id")
	private String equityId;

	/**
	 * equity_info
	 */
	@ApiField("equity_info")
	private EquityInfo equityInfo;

	/**
	 * 支付宝openid
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * original_biz_no
	 */
	@ApiField("original_biz_no")
	private String originalBizNo;

	/**
	 * original_biz_type
	 */
	@ApiField("original_biz_type")
	private String originalBizType;

	/**
	 * out_biz_no
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 支付宝userid
	 */
	@ApiField("user_id")
	private String userId;

	public Date getBizTime() {
		return this.bizTime;
	}
	public void setBizTime(Date bizTime) {
		this.bizTime = bizTime;
	}

	public String getEquityCode() {
		return this.equityCode;
	}
	public void setEquityCode(String equityCode) {
		this.equityCode = equityCode;
	}

	public String getEquityFrom() {
		return this.equityFrom;
	}
	public void setEquityFrom(String equityFrom) {
		this.equityFrom = equityFrom;
	}

	public String getEquityId() {
		return this.equityId;
	}
	public void setEquityId(String equityId) {
		this.equityId = equityId;
	}

	public EquityInfo getEquityInfo() {
		return this.equityInfo;
	}
	public void setEquityInfo(EquityInfo equityInfo) {
		this.equityInfo = equityInfo;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOriginalBizNo() {
		return this.originalBizNo;
	}
	public void setOriginalBizNo(String originalBizNo) {
		this.originalBizNo = originalBizNo;
	}

	public String getOriginalBizType() {
		return this.originalBizType;
	}
	public void setOriginalBizType(String originalBizType) {
		this.originalBizType = originalBizType;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
