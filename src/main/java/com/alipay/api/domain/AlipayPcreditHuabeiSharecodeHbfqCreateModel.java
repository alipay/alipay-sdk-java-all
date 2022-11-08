package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 花呗分期吱口令码申领
 *
 * @author auto create
 * @since 1.0, 2022-05-16 17:32:26
 */
public class AlipayPcreditHuabeiSharecodeHbfqCreateModel extends AlipayObject {

	private static final long serialVersionUID = 3677561913966612131L;

	/**
	 * 用户在支付宝的唯一标识，以 2088 开头的 16 位纯数字组成。
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 跳转业务链接，例如ISV服务商的支付页面
	 */
	@ApiField("biz_link")
	private String bizLink;

	/**
	 * 业务场景
例如：ISV_PAY：ISV的支付场景
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 扩展内容，主要满足花呗分期相关的额鉴权验等功能
	 */
	@ApiField("ext_info")
	private FQExtendParams extInfo;

	/**
	 * 商户本次操作的请求流水号，用于标示请求流水的唯一性，不能包含除英文、数字以外的字符，需要保证在商户端不重复。
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 商户ID，以 2088 开头的 16 位纯数字组成。
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 需要支付的金额，单位为：元（人民币），精确到小数点后两位
	 */
	@ApiField("pay_amount")
	private String payAmount;

	/**
	 * 支付宝商家ID，即商家账号在支付宝的唯一标识，以 2088 开头的 16 位纯数字组成。。
	 */
	@ApiField("seller_id")
	private String sellerId;

	/**
	 * 业务来源，业务接入的约定标识，代表业务的调用方。例如：ISV公司名称缩写
	 */
	@ApiField("source")
	private String source;

	/**
	 * 支付宝二级商户编号。 直付通模式和机构间连模式下必传，其它场景下不需要传入。
	 */
	@ApiField("sub_merchant_id")
	private String subMerchantId;

	/**
	 * 吱口令的有效期，例如：3600*24（代表一天）
	 */
	@ApiField("time_out")
	private Long timeOut;

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

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

	public FQExtendParams getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(FQExtendParams extInfo) {
		this.extInfo = extInfo;
	}

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
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

	public String getSellerId() {
		return this.sellerId;
	}
	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public String getSubMerchantId() {
		return this.subMerchantId;
	}
	public void setSubMerchantId(String subMerchantId) {
		this.subMerchantId = subMerchantId;
	}

	public Long getTimeOut() {
		return this.timeOut;
	}
	public void setTimeOut(Long timeOut) {
		this.timeOut = timeOut;
	}

}
