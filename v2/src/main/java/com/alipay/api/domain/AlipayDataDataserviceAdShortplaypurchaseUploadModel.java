package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 短剧付费数据上传
 *
 * @author auto create
 * @since 1.0, 2026-06-16 16:21:44
 */
public class AlipayDataDataserviceAdShortplaypurchaseUploadModel extends AlipayObject {

	private static final long serialVersionUID = 8364798273528364714L;

	/**
	 * 短剧小程序appid
	 */
	@ApiField("appid")
	private String appid;

	/**
	 * 短剧剧集id
	 */
	@ApiField("drama_id")
	private String dramaId;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 付费时间
	 */
	@ApiField("payment_time")
	private Date paymentTime;

	/**
	 * 剧集支付金额， 人民币，单位“分”
	 */
	@ApiField("shortplay_amount")
	private String shortplayAmount;

	/**
	 * 短剧链接
	 */
	@ApiField("shortplay_link")
	private String shortplayLink;

	/**
	 * 交易号
	 */
	@ApiField("trans_number")
	private String transNumber;

	/**
	 * 短剧购买用户支付宝2088id
	 */
	@ApiField("uuid")
	private String uuid;

	public String getAppid() {
		return this.appid;
	}
	public void setAppid(String appid) {
		this.appid = appid;
	}

	public String getDramaId() {
		return this.dramaId;
	}
	public void setDramaId(String dramaId) {
		this.dramaId = dramaId;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public Date getPaymentTime() {
		return this.paymentTime;
	}
	public void setPaymentTime(Date paymentTime) {
		this.paymentTime = paymentTime;
	}

	public String getShortplayAmount() {
		return this.shortplayAmount;
	}
	public void setShortplayAmount(String shortplayAmount) {
		this.shortplayAmount = shortplayAmount;
	}

	public String getShortplayLink() {
		return this.shortplayLink;
	}
	public void setShortplayLink(String shortplayLink) {
		this.shortplayLink = shortplayLink;
	}

	public String getTransNumber() {
		return this.transNumber;
	}
	public void setTransNumber(String transNumber) {
		this.transNumber = transNumber;
	}

	public String getUuid() {
		return this.uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

}
