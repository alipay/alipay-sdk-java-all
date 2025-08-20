package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 线索数据同步
 *
 * @author auto create
 * @since 1.0, 2024-07-26 18:07:22
 */
public class AlipayEcoMycarLeadsDataCreateModel extends AlipayObject {

	private static final long serialVersionUID = 5872727274299341855L;

	/**
	 * 支付宝帐户
	 */
	@ApiField("alipay_account")
	private String alipayAccount;

	/**
	 * 线索车辆
	 */
	@ApiField("leads_car")
	private LeadsCarInfo leadsCar;

	/**
	 * 线索城市代码
	 */
	@ApiField("leads_city_code")
	private String leadsCityCode;

	/**
	 * 线索商户
	 */
	@ApiListField("leads_merchants")
	@ApiField("leads_merchant_info")
	private List<LeadsMerchantInfo> leadsMerchants;

	/**
	 * 由支付宝方为商户进行分配
	 */
	@ApiField("leads_source")
	private String leadsSource;

	/**
	 * 手机号
	 */
	@ApiField("mobile_no")
	private String mobileNo;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 外部线索id
	 */
	@ApiField("out_leads_id")
	private String outLeadsId;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 用户姓名
	 */
	@ApiField("user_name")
	private String userName;

	public String getAlipayAccount() {
		return this.alipayAccount;
	}
	public void setAlipayAccount(String alipayAccount) {
		this.alipayAccount = alipayAccount;
	}

	public LeadsCarInfo getLeadsCar() {
		return this.leadsCar;
	}
	public void setLeadsCar(LeadsCarInfo leadsCar) {
		this.leadsCar = leadsCar;
	}

	public String getLeadsCityCode() {
		return this.leadsCityCode;
	}
	public void setLeadsCityCode(String leadsCityCode) {
		this.leadsCityCode = leadsCityCode;
	}

	public List<LeadsMerchantInfo> getLeadsMerchants() {
		return this.leadsMerchants;
	}
	public void setLeadsMerchants(List<LeadsMerchantInfo> leadsMerchants) {
		this.leadsMerchants = leadsMerchants;
	}

	public String getLeadsSource() {
		return this.leadsSource;
	}
	public void setLeadsSource(String leadsSource) {
		this.leadsSource = leadsSource;
	}

	public String getMobileNo() {
		return this.mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOutLeadsId() {
		return this.outLeadsId;
	}
	public void setOutLeadsId(String outLeadsId) {
		this.outLeadsId = outLeadsId;
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
