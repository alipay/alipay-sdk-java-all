package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 吱口令生成测试
 *
 * @author auto create
 * @since 1.0, 2023-10-13 15:48:50
 */
public class AlipayTradeScenepaySharecodetestCreateModel extends AlipayObject {

	private static final long serialVersionUID = 3316155422556852535L;

	/**
	 * 通过吱口令打开支付宝后的页面跳转链接，例如服务商支付页URL
	 */
	@ApiField("biz_link")
	private String bizLink;

	/**
	 * 业务场景码，用于识别吱口令场景，区分回流弹窗样式，请与对接同学确认应用场景后获取
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 业务跟踪参数，用于串联用户业务行为的关系
	 */
	@ApiField("biz_tracker")
	private String bizTracker;

	/**
	 * 渠道信息摘要标识，在APP内吱口令跳转时用到，用来标识吱口令关联的服务信息，比如红包、花呗工具。有两种方式获得：1.在于支付宝进行业务合作时，由平台侧分配；2.在咨询前置服务时由接口返回
	 */
	@ApiField("channel_info")
	private String channelInfo;

	/**
	 * 吱口令有效期，单位秒。例如:300 (代表5分钟)
	 */
	@ApiField("expire_time")
	private Long expireTime;

	/**
	 * 商户的名称，用于在回流弹窗页显示
	 */
	@ApiField("merchant_name")
	private String merchantName;

	/**
	 * 外部业务号，需要保障幂等性
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 该参数为开放平台为服务商用户分配的用户唯一标识
	 */
	@ApiField("out_open_id")
	private String outOpenId;

	/**
	 * 订单需要支付的金额，单位为元(人民币)，精确到小数点后两位，取值范围：[0.01,100000000] 。
	 */
	@ApiField("pay_amount")
	private String payAmount;

	/**
	 * 支付宝间连商户SMID
	 */
	@ApiField("sub_merchant_id")
	private String subMerchantId;

	public String getBizLink() {
		return this.bizLink;
	}
	public void setBizLink(String bizLink) {
		this.bizLink = bizLink;
	}

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getBizTracker() {
		return this.bizTracker;
	}
	public void setBizTracker(String bizTracker) {
		this.bizTracker = bizTracker;
	}

	public String getChannelInfo() {
		return this.channelInfo;
	}
	public void setChannelInfo(String channelInfo) {
		this.channelInfo = channelInfo;
	}

	public Long getExpireTime() {
		return this.expireTime;
	}
	public void setExpireTime(Long expireTime) {
		this.expireTime = expireTime;
	}

	public String getMerchantName() {
		return this.merchantName;
	}
	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getOutOpenId() {
		return this.outOpenId;
	}
	public void setOutOpenId(String outOpenId) {
		this.outOpenId = outOpenId;
	}

	public String getPayAmount() {
		return this.payAmount;
	}
	public void setPayAmount(String payAmount) {
		this.payAmount = payAmount;
	}

	public String getSubMerchantId() {
		return this.subMerchantId;
	}
	public void setSubMerchantId(String subMerchantId) {
		this.subMerchantId = subMerchantId;
	}

}
