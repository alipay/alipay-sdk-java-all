package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝就业工资条信息同步
 *
 * @author auto create
 * @since 1.0, 2025-06-16 15:37:43
 */
public class AlipayEbppIndustryJobPayslipSyncModel extends AlipayObject {

	private static final long serialVersionUID = 6596313159423451697L;

	/**
	 * 付款金额，单位：元
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 付款银行卡编码，当付款渠道为银行卡时，该字段必填
详情，编码详情参考：<a href="https://jiuye.yuque.com/org-wiki-jiuye-cpfcqs/araxo9/zax4z4wmsvuxalh2?singleDoc# 《银行简称》" target="_blank">全国银行简称</a>
	 */
	@ApiField("bank_code")
	private String bankCode;

	/**
	 * 三方服务商用户账单详情地址。必须为支付宝链接（alipays://开头），暂不支持H5链接。通过该链接，用户可点击进入三方详情页查看收入明细。
	 */
	@ApiField("bill_detail_url")
	private String billDetailUrl;

	/**
	 * 用户收款账号，可传账号后4位数字或全部数字
	 */
	@ApiField("card_no")
	private String cardNo;

	/**
	 * 用户收款渠道
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 付款企业的信用代码
	 */
	@ApiField("company_cert_no")
	private String companyCertNo;

	/**
	 * 付款企业的公司名称
	 */
	@ApiField("company_name")
	private String companyName;

	/**
	 * 用户账单信息有疑问时可通过该电话进行咨询。可提供付款企业或您平台的客服电话
	 */
	@ApiField("contact_info")
	private String contactInfo;

	/**
	 * 支付宝登录号。业务系统无用户UID时，可通过该参数同步用户支付宝登录账号，手机号/邮箱均可。因手机号/邮箱有一定比例无法匹配到UID，建议有UID的情况下优先同步UID。
	 */
	@ApiField("login_id")
	private String loginId;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 支付宝转账订单id
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 外部业务编号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 备注说明，该内容将会在账单信息中显示
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * 付款时间
	 */
	@ApiField("salary_time")
	private Date salaryTime;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 支付宝账户对应的用户姓名
	 */
	@ApiField("user_name")
	private String userName;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getBankCode() {
		return this.bankCode;
	}
	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}

	public String getBillDetailUrl() {
		return this.billDetailUrl;
	}
	public void setBillDetailUrl(String billDetailUrl) {
		this.billDetailUrl = billDetailUrl;
	}

	public String getCardNo() {
		return this.cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getCompanyCertNo() {
		return this.companyCertNo;
	}
	public void setCompanyCertNo(String companyCertNo) {
		this.companyCertNo = companyCertNo;
	}

	public String getCompanyName() {
		return this.companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getContactInfo() {
		return this.contactInfo;
	}
	public void setContactInfo(String contactInfo) {
		this.contactInfo = contactInfo;
	}

	public String getLoginId() {
		return this.loginId;
	}
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Date getSalaryTime() {
		return this.salaryTime;
	}
	public void setSalaryTime(Date salaryTime) {
		this.salaryTime = salaryTime;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return this.userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

}
