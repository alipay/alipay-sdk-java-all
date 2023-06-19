package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 间连支付红包吱口令获取
 *
 * @author auto create
 * @since 1.0, 2023-05-12 17:50:21
 */
public class AlipayMerchantIndirectSharetokenCreateModel extends AlipayObject {

	private static final long serialVersionUID = 5196141674798594259L;

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
	 * 吱口令有效期，单位秒。例如:3600*24 (代表一天)
	 */
	@ApiField("expire_time")
	private Long expireTime;

	/**
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

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

	public Long getExpireTime() {
		return this.expireTime;
	}
	public void setExpireTime(Long expireTime) {
		this.expireTime = expireTime;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
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
