package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 物业小区绑定关系修改
 *
 * @author auto create
 * @since 1.0, 2021-03-18 14:36:35
 */
public class AlipayEbppCommunityRelationshipModifyModel extends AlipayObject {

	private static final long serialVersionUID = 2472928567361658183L;

	/**
	 * 每个小区默认的收款帐号为授权物业的支付宝账号，默认不用传该参数。 但为满足部分物业公司财务要求，允许开发者为每个小区服务传入一个指定的物业收款帐号，开发者需要在直付通中设置银行卡相关信息
	 */
	@ApiField("account")
	private String account;

	/**
	 * 每个小区默认的收款账号为授权物业的支付宝账号，默认不用传该参数。用户完成缴费后实时入账至该支付宝账号，后续由物业财务系统根据缴费异步通知和支付宝对账文件进行资金清分。 但为了满足部分物业公司的财务清结算需求，允许在授权物业账号下已设置支付宝收款子账号限制集的前提下，由开发者为指定小区服务传入一个物业公司的支付宝收款子帐号，目前只支持银行卡的分账模式： BANK_CARD_ID - 银行卡号 注意：若传递的收款子账号事先未在支付宝配置，开发者在上线前的支付验证环节会提示不支持收款到该账户，请联系物业公司完成配置事宜。
	 */
	@ApiField("account_type")
	private String accountType;

	/**
	 * 外部户号查询跳转链接,占位符使用#xxx#模式，xxx为占位符枚举，目前支持的枚举值为:communityShortName
	 */
	@ApiField("billkey_url")
	private String billkeyUrl;

	/**
	 * 小区短名
	 */
	@ApiField("community_short_name")
	private String communityShortName;

	/**
	 * 日常服务结束时间，例如24:00
	 */
	@ApiField("daily_end")
	private String dailyEnd;

	/**
	 * 日常服务开始时间，例如00:00
	 */
	@ApiField("daily_start")
	private String dailyStart;

	/**
	 * 扩展字段
	 */
	@ApiField("extend_field")
	private CommunityRelationshipExtendField extendField;

	/**
	 * 外部账单页面跳转链接，占位符使用#xxx#模式，xxx为占位符枚举，目前支持的枚举值为:communityShortName
	 */
	@ApiField("out_bill_url")
	private String outBillUrl;

	/**
	 * 服务结束时间，格式：yyyy-MM-dd HH:mm:ss（精度只到日期）
	 */
	@ApiField("service_end")
	private Date serviceEnd;

	/**
	 * 服务开始时间，格式为yyyy-MM-dd HH:mm:ss（精度只到日期）
	 */
	@ApiField("service_start")
	private Date serviceStart;

	/**
	 * THIRD_PARTY_COMMUNITY_JIAOFEI(物业缴费),
    CENTRAL_SCAN_CODE_PASS(扫码通行联动门禁),
    OPEN_SESAME(扫码通行无门禁),
    H5_SCAN_CODE_PASS(扫码通行内部H5模式)
	 */
	@ApiField("service_type")
	private String serviceType;

	/**
	 * accountType不为空时，需要传入结算的二级商户id
	 */
	@ApiField("smid")
	private String smid;

	public String getAccount() {
		return this.account;
	}
	public void setAccount(String account) {
		this.account = account;
	}

	public String getAccountType() {
		return this.accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getBillkeyUrl() {
		return this.billkeyUrl;
	}
	public void setBillkeyUrl(String billkeyUrl) {
		this.billkeyUrl = billkeyUrl;
	}

	public String getCommunityShortName() {
		return this.communityShortName;
	}
	public void setCommunityShortName(String communityShortName) {
		this.communityShortName = communityShortName;
	}

	public String getDailyEnd() {
		return this.dailyEnd;
	}
	public void setDailyEnd(String dailyEnd) {
		this.dailyEnd = dailyEnd;
	}

	public String getDailyStart() {
		return this.dailyStart;
	}
	public void setDailyStart(String dailyStart) {
		this.dailyStart = dailyStart;
	}

	public CommunityRelationshipExtendField getExtendField() {
		return this.extendField;
	}
	public void setExtendField(CommunityRelationshipExtendField extendField) {
		this.extendField = extendField;
	}

	public String getOutBillUrl() {
		return this.outBillUrl;
	}
	public void setOutBillUrl(String outBillUrl) {
		this.outBillUrl = outBillUrl;
	}

	public Date getServiceEnd() {
		return this.serviceEnd;
	}
	public void setServiceEnd(Date serviceEnd) {
		this.serviceEnd = serviceEnd;
	}

	public Date getServiceStart() {
		return this.serviceStart;
	}
	public void setServiceStart(Date serviceStart) {
		this.serviceStart = serviceStart;
	}

	public String getServiceType() {
		return this.serviceType;
	}
	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

	public String getSmid() {
		return this.smid;
	}
	public void setSmid(String smid) {
		this.smid = smid;
	}

}
