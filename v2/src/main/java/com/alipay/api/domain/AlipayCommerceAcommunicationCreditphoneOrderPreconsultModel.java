package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 运营商行业信用购预咨询
 *
 * @author auto create
 * @since 1.0, 2024-06-21 11:07:51
 */
public class AlipayCommerceAcommunicationCreditphoneOrderPreconsultModel extends AlipayObject {

	private static final long serialVersionUID = 4267521163127361941L;

	/**
	 * 支付宝用户id
	 */
	@ApiField("alipay_open_id")
	private String alipayOpenId;

	/**
	 * 支付宝用户id
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 冻结金额，单位元
	 */
	@ApiField("freeze_amount")
	private String freezeAmount;

	/**
	 * 运营商简称，中国移动、中国电信、中国联通、中国广电
	 */
	@ApiField("isp_abbr_cn")
	private String ispAbbrCn;

	/**
	 * 门店id
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/**
	 * 门店名称
	 */
	@ApiField("merchant_name")
	private String merchantName;

	/**
	 * 省份
	 */
	@ApiField("province")
	private String province;

	/**
	 * 请求号
	 */
	@ApiField("request_no")
	private String requestNo;

	/**
	 * 套餐id
	 */
	@ApiField("spu_id")
	private String spuId;

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

	public String getFreezeAmount() {
		return this.freezeAmount;
	}
	public void setFreezeAmount(String freezeAmount) {
		this.freezeAmount = freezeAmount;
	}

	public String getIspAbbrCn() {
		return this.ispAbbrCn;
	}
	public void setIspAbbrCn(String ispAbbrCn) {
		this.ispAbbrCn = ispAbbrCn;
	}

	public String getMerchantId() {
		return this.merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public String getMerchantName() {
		return this.merchantName;
	}
	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}

	public String getProvince() {
		return this.province;
	}
	public void setProvince(String province) {
		this.province = province;
	}

	public String getRequestNo() {
		return this.requestNo;
	}
	public void setRequestNo(String requestNo) {
		this.requestNo = requestNo;
	}

	public String getSpuId() {
		return this.spuId;
	}
	public void setSpuId(String spuId) {
		this.spuId = spuId;
	}

}
