package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 付款码同步设备
 *
 * @author auto create
 * @since 1.0, 2025-08-27 20:00:53
 */
public class AlipayPayDeviceNlinkPaycodeSyncModel extends AlipayObject {

	private static final long serialVersionUID = 1395311968539781679L;

	/**
	 * 用户的userId。
	 */
	@ApiField("biz_user_id")
	private String bizUserId;

	/**
	 * 付款码创建时间
	 */
	@ApiField("create_time")
	private Date createTime;

	/**
	 * 付款码过期时间
	 */
	@ApiField("expire_time")
	private Date expireTime;

	/**
	 * 碰一下的唯一标识，可用于串联每次用户碰的行为的所有业务链路
	 */
	@ApiField("ntoken")
	private String ntoken;

	/**
	 * 用户支付用到的码值，且商家可以用于创单的码值
	 */
	@ApiField("paycode")
	private String paycode;

	/**
	 * 是否可支付，PAYABLE/NOT_PAYABLE
	 */
	@ApiField("paycode_status")
	private String paycodeStatus;

	/**
	 * 用户支付的单号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public String getBizUserId() {
		return this.bizUserId;
	}
	public void setBizUserId(String bizUserId) {
		this.bizUserId = bizUserId;
	}

	public Date getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getExpireTime() {
		return this.expireTime;
	}
	public void setExpireTime(Date expireTime) {
		this.expireTime = expireTime;
	}

	public String getNtoken() {
		return this.ntoken;
	}
	public void setNtoken(String ntoken) {
		this.ntoken = ntoken;
	}

	public String getPaycode() {
		return this.paycode;
	}
	public void setPaycode(String paycode) {
		this.paycode = paycode;
	}

	public String getPaycodeStatus() {
		return this.paycodeStatus;
	}
	public void setPaycodeStatus(String paycodeStatus) {
		this.paycodeStatus = paycodeStatus;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}
