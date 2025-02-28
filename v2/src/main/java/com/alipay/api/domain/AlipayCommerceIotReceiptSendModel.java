package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 电子小票信息发送接口
 *
 * @author auto create
 * @since 1.0, 2021-11-17 16:06:33
 */
public class AlipayCommerceIotReceiptSendModel extends AlipayObject {

	private static final long serialVersionUID = 6739185761267498562L;

	/**
	 * 用户支付宝uid，支付渠道为alipay时必填
	 */
	@ApiField("alipay_uid")
	private String alipayUid;

	/**
	 * 业务appid，需要是同源appid。即同一个pid下的appid
	 */
	@ApiField("biz_app_id")
	private String bizAppId;

	/**
	 * 电子小票详情信息
	 */
	@ApiField("biz_data")
	private ReceiptBizData bizData;

	/**
	 * 机具身份id
	 */
	@ApiField("biztid")
	private String biztid;

	/**
	 * 支付渠道
alipay=支付宝
wechat=微信
other=其余
	 */
	@ApiField("pay_channel")
	private String payChannel;

	/**
	 * 直联商户填写pid，  pid和smid必填其一
	 */
	@ApiField("pid")
	private String pid;

	/**
	 * 间联商户填写smid，pid和smid必填其一
	 */
	@ApiField("smid")
	private String smid;

	/**
	 * 接入来源
	 */
	@ApiField("source")
	private String source;

	public String getAlipayUid() {
		return this.alipayUid;
	}
	public void setAlipayUid(String alipayUid) {
		this.alipayUid = alipayUid;
	}

	public String getBizAppId() {
		return this.bizAppId;
	}
	public void setBizAppId(String bizAppId) {
		this.bizAppId = bizAppId;
	}

	public ReceiptBizData getBizData() {
		return this.bizData;
	}
	public void setBizData(ReceiptBizData bizData) {
		this.bizData = bizData;
	}

	public String getBiztid() {
		return this.biztid;
	}
	public void setBiztid(String biztid) {
		this.biztid = biztid;
	}

	public String getPayChannel() {
		return this.payChannel;
	}
	public void setPayChannel(String payChannel) {
		this.payChannel = payChannel;
	}

	public String getPid() {
		return this.pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getSmid() {
		return this.smid;
	}
	public void setSmid(String smid) {
		this.smid = smid;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

}
