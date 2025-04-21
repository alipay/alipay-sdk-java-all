package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 间连支付红包吱口令获取
 *
 * @author auto create
 * @since 1.0, 2024-01-02 11:12:01
 */
public class AlipayMerchantIndirectSharetokenCreateModel extends AlipayObject {

	private static final long serialVersionUID = 3251713514913543628L;

	/**
	 * 通过吱口令打开支付宝后的页面跳转链接，例如服务商支付页URL
	 */
	@ApiField("biz_link")
	private String bizLink;

	/**
	 * 业务场景码定义，用以区分吱口令应用的业务场景。
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 业务跟踪参数，用于串联用户业务行为的关系
	 */
	@ApiField("biz_tracker")
	private String bizTracker;

	/**
	 * 渠道信息摘要标识，在APP内吱口令跳转时用到，用来标识吱口令关联的服务信息，比如红包、花呗工具。有两种方式获得：1.在于支付宝进行业务合作时，由平台侧分配；2.在咨询前置服务时由接口返回。
	 */
	@ApiField("channel_info")
	private String channelInfo;

	/**
	 * 吱口令有效期，单位秒。例如:3600*24 (代表一天)
	 */
	@ApiField("expire_time")
	private Long expireTime;

	/**
	 * 吱口令生成扩展参数
	 */
	@ApiField("extend_params")
	private ShareCodeCreateExtendParam extendParams;

	/**
	 * 商户的名称
	 */
	@ApiField("merchant_name")
	private String merchantName;

	/**
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 该参数为开放平台为服务商用户分配的用户唯一标识
	 */
	@ApiField("out_open_id")
	private String outOpenId;

	/**
	 * 商户ID
	 */
	@ApiField("partner_id")
	private String partnerId;

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

	public ShareCodeCreateExtendParam getExtendParams() {
		return this.extendParams;
	}
	public void setExtendParams(ShareCodeCreateExtendParam extendParams) {
		this.extendParams = extendParams;
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

	public String getPartnerId() {
		return this.partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
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
