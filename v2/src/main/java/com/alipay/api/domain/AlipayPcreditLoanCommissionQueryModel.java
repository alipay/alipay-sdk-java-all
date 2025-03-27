package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询贷款佣金
 *
 * @author auto create
 * @since 1.0, 2019-11-14 20:25:40
 */
public class AlipayPcreditLoanCommissionQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4495869814644726233L;

	/**
	 * 账户ID
	 */
	@ApiField("account_id")
	private String accountId;

	/**
	 * 账户类型：
1.支付宝登录号-ALIPAY_LOGON_ID
2.支付宝会员ID-ALIPAY_USER_ID
	 */
	@ApiField("account_type")
	private String accountType;

	/**
	 * 指定数据查询的日期，格式为：yyyyMMdd，如果用户指定则使用指定日期，否则使用系统日期
	 */
	@ApiField("biz_date")
	private String bizDate;

	/**
	 * 渠道，用于标识请求来源
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 企业ID，如居然之家、红星美凯龙等
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	/**
	 * 外部请求号，代表了一次请求，作为业务幂等性控制
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 门店ID
	 */
	@ApiField("store_id")
	private String storeId;

	public String getAccountId() {
		return this.accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getAccountType() {
		return this.accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getBizDate() {
		return this.bizDate;
	}
	public void setBizDate(String bizDate) {
		this.bizDate = bizDate;
	}

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getEnterpriseId() {
		return this.enterpriseId;
	}
	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

	public String getStoreId() {
		return this.storeId;
	}
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

}
