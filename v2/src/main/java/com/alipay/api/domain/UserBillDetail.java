package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小二账单明细
 *
 * @author auto create
 * @since 1.0, 2025-09-23 15:16:18
 */
public class UserBillDetail extends AlipayObject {

	private static final long serialVersionUID = 7692958642894614442L;

	/**
	 * 支付宝账号
	 */
	@ApiField("alipay_login_id")
	private String alipayLoginId;

	/**
	 * 用户id
	 */
	@ApiField("alipay_uid")
	private String alipayUid;

	/**
	 * 税前金额，单位：人民币
	 */
	@ApiField("amount_before_tax")
	private String amountBeforeTax;

	/**
	 * 身份证号
	 */
	@ApiField("id_cert_no")
	private String idCertNo;

	/**
	 * 手机号
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 姓名
	 */
	@ApiField("real_name")
	private String realName;

	/**
	 * 用户单据编号，全局唯一，可以用来做幂等
	 */
	@ApiField("user_bill_no")
	private String userBillNo;

	public String getAlipayLoginId() {
		return this.alipayLoginId;
	}
	public void setAlipayLoginId(String alipayLoginId) {
		this.alipayLoginId = alipayLoginId;
	}

	public String getAlipayUid() {
		return this.alipayUid;
	}
	public void setAlipayUid(String alipayUid) {
		this.alipayUid = alipayUid;
	}

	public String getAmountBeforeTax() {
		return this.amountBeforeTax;
	}
	public void setAmountBeforeTax(String amountBeforeTax) {
		this.amountBeforeTax = amountBeforeTax;
	}

	public String getIdCertNo() {
		return this.idCertNo;
	}
	public void setIdCertNo(String idCertNo) {
		this.idCertNo = idCertNo;
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

	public String getRealName() {
		return this.realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getUserBillNo() {
		return this.userBillNo;
	}
	public void setUserBillNo(String userBillNo) {
		this.userBillNo = userBillNo;
	}

}
