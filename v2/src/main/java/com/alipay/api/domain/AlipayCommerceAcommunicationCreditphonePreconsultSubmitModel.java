package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 信用购运营商批量预鉴权提交接口
 *
 * @author auto create
 * @since 1.0, 2026-07-21 17:02:51
 */
public class AlipayCommerceAcommunicationCreditphonePreconsultSubmitModel extends AlipayObject {

	private static final long serialVersionUID = 5629423892936475388L;

	/**
	 * 支付宝用户ID
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 套餐金额，单位：CNY
	 */
	@ApiField("busi_level")
	private String busiLevel;

	/**
	 * 身份证号
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 是否需要身份证一致性校验，默认是false
	 */
	@ApiField("check_cert_no")
	private Boolean checkCertNo;

	/**
	 * 冻结金额，单位：CNY
	 */
	@ApiField("freeze_amount")
	private String freezeAmount;

	/**
	 * null
	 */
	@ApiListField("inst_pid_list")
	@ApiField("string")
	private List<String> instPidList;

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
	 * 手机号
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 支付宝openId
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 省份
	 */
	@ApiField("province")
	private String province;

	/**
	 * 请求流水号
	 */
	@ApiField("request_no")
	private String requestNo;

	/**
	 * 直降金额，单位 CNY
	 */
	@ApiField("total_bonus")
	private String totalBonus;

	/**
	 * 用户姓名
	 */
	@ApiField("user_name")
	private String userName;

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

	public List<String> getInstPidList() {
		return this.instPidList;
	}
	public void setInstPidList(List<String> instPidList) {
		this.instPidList = instPidList;
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

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
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
