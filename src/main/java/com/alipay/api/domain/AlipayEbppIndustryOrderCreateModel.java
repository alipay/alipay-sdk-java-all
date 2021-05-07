package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 行业业务订单创建
 *
 * @author auto create
 * @since 1.0, 2018-07-17 15:13:37
 */
public class AlipayEbppIndustryOrderCreateModel extends AlipayObject {

	private static final long serialVersionUID = 4714917754726137437L;

	/**
	 * 能力码是由支付宝分配的标识code
	 */
	@ApiField("ability_code")
	private String abilityCode;

	/**
	 * 账单的账期，例如201703表示2017年3月的账单。
	 */
	@ApiField("bill_date")
	private String billDate;

	/**
	 * 业务账户号，例如水费单号，手机号，电费号，信用卡卡号。没有唯一性要求。
	 */
	@ApiField("bill_key")
	private String billKey;

	/**
	 * 用户创建订单时涉及到的业务总金额。单位为：RMB Yuan。取值范围为[0.01，100000000.00)，精确到小数点后两位。
	 */
	@ApiField("biz_amount")
	private String bizAmount;

	/**
	 * 机构简称例如杭州电力HZELECTRIC
	 */
	@ApiField("biz_inst_short_name")
	private String bizInstShortName;

	/**
	 * 业务类型，缴费业务为JF，还款业务HK，公服行业为IND。
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 城市编码，国标码
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 扩展属性，json串(key-value对)
	 */
	@ApiField("extend_field")
	private String extendField;

	/**
	 * 滞纳金额，单位：元
	 */
	@ApiField("fine_amount")
	private String fineAmount;

	/**
	 * 身份标识号，例如身份证号、纳税人识别号等。
	 */
	@ApiField("identity_no")
	private String identityNo;

	/**
	 * 用户的手机号
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * ISV流水号，用于控制幂等，须确保全局唯一
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 拥有该订单的用户姓名
	 */
	@ApiField("owner_name")
	private String ownerName;

	/**
	 * 省份编码，国标码
	 */
	@ApiField("province_code")
	private String provinceCode;

	/**
	 * 子业务类型，水费为WATER，燃气费为GAS，社保为SI，公积金为HF，社保+公积金为SIHF
	 */
	@ApiField("sub_biz_type")
	private String subBizType;

	public String getAbilityCode() {
		return this.abilityCode;
	}
	public void setAbilityCode(String abilityCode) {
		this.abilityCode = abilityCode;
	}

	public String getBillDate() {
		return this.billDate;
	}
	public void setBillDate(String billDate) {
		this.billDate = billDate;
	}

	public String getBillKey() {
		return this.billKey;
	}
	public void setBillKey(String billKey) {
		this.billKey = billKey;
	}

	public String getBizAmount() {
		return this.bizAmount;
	}
	public void setBizAmount(String bizAmount) {
		this.bizAmount = bizAmount;
	}

	public String getBizInstShortName() {
		return this.bizInstShortName;
	}
	public void setBizInstShortName(String bizInstShortName) {
		this.bizInstShortName = bizInstShortName;
	}

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getExtendField() {
		return this.extendField;
	}
	public void setExtendField(String extendField) {
		this.extendField = extendField;
	}

	public String getFineAmount() {
		return this.fineAmount;
	}
	public void setFineAmount(String fineAmount) {
		this.fineAmount = fineAmount;
	}

	public String getIdentityNo() {
		return this.identityNo;
	}
	public void setIdentityNo(String identityNo) {
		this.identityNo = identityNo;
	}

	public String getMobile() {
		return this.mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public String getOwnerName() {
		return this.ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getProvinceCode() {
		return this.provinceCode;
	}
	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}

	public String getSubBizType() {
		return this.subBizType;
	}
	public void setSubBizType(String subBizType) {
		this.subBizType = subBizType;
	}

}
