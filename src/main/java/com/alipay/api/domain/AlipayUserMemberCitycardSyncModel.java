package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 区域运营城市会员卡同步
 *
 * @author auto create
 * @since 1.0, 2022-09-30 20:57:48
 */
public class AlipayUserMemberCitycardSyncModel extends AlipayObject {

	private static final long serialVersionUID = 7589854313158838222L;

	/**
	 * 支付宝用户的openid
	 */
	@ApiField("alipay_open_id")
	private String alipayOpenId;

	/**
	 * 支付宝用户id
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 业务发生时间，YYYY-MM-dd HH:mm:ss
	 */
	@ApiField("biz_occur_time")
	private String bizOccurTime;

	/**
	 * 城市行政区域码
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 外部会员卡卡号，唯一
	 */
	@ApiField("out_card_no")
	private String outCardNo;

	/**
	 * 开卡支付支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/**
	 * 卡有效期结束时间，YYYY-MM-dd HH:mm:ss
	 */
	@ApiField("valid_end")
	private String validEnd;

	/**
	 * 卡有效期开始时间，YYYY-MM-dd HH:mm:ss
	 */
	@ApiField("valid_start")
	private String validStart;

	public String getAlipayOpenId() {
		return this.alipayOpenId;
	}
	public void setAlipayOpenId(String alipayOpenId) {
		this.alipayOpenId = alipayOpenId;
	}

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

	public String getBizOccurTime() {
		return this.bizOccurTime;
	}
	public void setBizOccurTime(String bizOccurTime) {
		this.bizOccurTime = bizOccurTime;
	}

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getOutCardNo() {
		return this.outCardNo;
	}
	public void setOutCardNo(String outCardNo) {
		this.outCardNo = outCardNo;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

	public String getValidEnd() {
		return this.validEnd;
	}
	public void setValidEnd(String validEnd) {
		this.validEnd = validEnd;
	}

	public String getValidStart() {
		return this.validStart;
	}
	public void setValidStart(String validStart) {
		this.validStart = validStart;
	}

}
