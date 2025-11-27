package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 运营商行业信用购预咨询
 *
 * @author auto create
 * @since 1.0, 2025-11-27 09:59:22
 */
public class AlipayCommerceAcommunicationCreditphoneOrderPreconsultModel extends AlipayObject {

	private static final long serialVersionUID = 4323378384687566577L;

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
	 * 套餐金额
	 */
	@ApiField("busi_level")
	private String busiLevel;

	/**
	 * 用户身份证号
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 是否需要身份证一致性校验，默认是false
	 */
	@ApiField("check_cert_no")
	private Boolean checkCertNo;

	/**
	 * 冻结金额，单位元
	 */
	@ApiField("freeze_amount")
	private String freezeAmount;

	/**
	 * 分期期数
	 */
	@ApiField("installment_numbers")
	private Long installmentNumbers;

	/**
	 * 运营商简称，中国移动、中国电信、中国联通、中国广电
	 */
	@ApiField("isp_abbr_cn")
	private String ispAbbrCn;

	/**
	 * 商品名称
	 */
	@ApiField("item_name")
	private String itemName;

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
	 * 用户手机号
	 */
	@ApiField("mobile")
	private String mobile;

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

	/**
	 * 直降金额，单位 元
	 */
	@ApiField("total_bonus")
	private String totalBonus;

	/**
	 * 用户姓名
	 */
	@ApiField("user_name")
	private String userName;

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

	public String getBusiLevel() {
		return this.busiLevel;
	}
	public void setBusiLevel(String busiLevel) {
		this.busiLevel = busiLevel;
	}

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public Boolean getCheckCertNo() {
		return this.checkCertNo;
	}
	public void setCheckCertNo(Boolean checkCertNo) {
		this.checkCertNo = checkCertNo;
	}

	public String getFreezeAmount() {
		return this.freezeAmount;
	}
	public void setFreezeAmount(String freezeAmount) {
		this.freezeAmount = freezeAmount;
	}

	public Long getInstallmentNumbers() {
		return this.installmentNumbers;
	}
	public void setInstallmentNumbers(Long installmentNumbers) {
		this.installmentNumbers = installmentNumbers;
	}

	public String getIspAbbrCn() {
		return this.ispAbbrCn;
	}
	public void setIspAbbrCn(String ispAbbrCn) {
		this.ispAbbrCn = ispAbbrCn;
	}

	public String getItemName() {
		return this.itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
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

	public String getMobile() {
		return this.mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
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

	public String getTotalBonus() {
		return this.totalBonus;
	}
	public void setTotalBonus(String totalBonus) {
		this.totalBonus = totalBonus;
	}

	public String getUserName() {
		return this.userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

}
