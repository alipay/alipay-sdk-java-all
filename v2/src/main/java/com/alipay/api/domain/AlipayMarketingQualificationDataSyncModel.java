package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 权益交易信息同步
 *
 * @author auto create
 * @since 1.0, 2024-10-08 17:06:17
 */
public class AlipayMarketingQualificationDataSyncModel extends AlipayObject {

	private static final long serialVersionUID = 8797648919753995348L;

	/**
	 * 本次同步的资格相关业务信息
	 */
	@ApiField("biz_info")
	private String bizInfo;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 外部业务单号，用于幂等
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 资格id，用于定位用户的资格数据
	 */
	@ApiField("qualification_id")
	private String qualificationId;

	/**
	 * 支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getBizInfo() {
		return this.bizInfo;
	}
	public void setBizInfo(String bizInfo) {
		this.bizInfo = bizInfo;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getQualificationId() {
		return this.qualificationId;
	}
	public void setQualificationId(String qualificationId) {
		this.qualificationId = qualificationId;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
