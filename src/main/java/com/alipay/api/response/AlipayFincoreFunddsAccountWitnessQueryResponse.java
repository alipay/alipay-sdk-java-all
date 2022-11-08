package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fincore.fundds.account.witness.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-01-13 17:50:40
 */
public class AlipayFincoreFunddsAccountWitnessQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1369334138643214918L;

	/** 
	 * 分账托管子户账号
	 */
	@ApiField("account_no")
	private String accountNo;

	/** 
	 * 账户状态
	 */
	@ApiField("account_status")
	private String accountStatus;

	/** 
	 * 账户类型, 监管户-SUPERVISED_ACC,托管子户-ENTRUST_SUB_ACC
	 */
	@ApiField("account_type")
	private String accountType;

	/** 
	 * 可用余额 ;可用金额=总余额-冻结金额-系统预留金额，业务直接使用即可
	 */
	@ApiField("available_balance")
	private String availableBalance;

	/** 
	 * 总余额，两位小数，1.23表示1.23元，币种单位：CNY元
	 */
	@ApiField("balance")
	private String balance;

	/** 
	 * 可变ID，长度<32位即可。用来识别同一个user_id账户下面多维度账户。
	 */
	@ApiField("external_entity_id")
	private String externalEntityId;

	/** 
	 * 冻结余额 ;需要感知冻结金额的情况
	 */
	@ApiField("freeze_balance")
	private String freezeBalance;

	/** 
	 * 创建时间（格式为：yyyy-MM-dd HH:mm:ss）
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/** 
	 * 修改时间（格式为：yyyy-MM-dd HH:mm:ss）
	 */
	@ApiField("gmt_modified")
	private Date gmtModified;

	/** 
	 * 用户id或二级商户smid，子户维度。2088开头16位数字
	 */
	@ApiField("user_id")
	private String userId;

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public String getAccountNo( ) {
		return this.accountNo;
	}

	public void setAccountStatus(String accountStatus) {
		this.accountStatus = accountStatus;
	}
	public String getAccountStatus( ) {
		return this.accountStatus;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getAccountType( ) {
		return this.accountType;
	}

	public void setAvailableBalance(String availableBalance) {
		this.availableBalance = availableBalance;
	}
	public String getAvailableBalance( ) {
		return this.availableBalance;
	}

	public void setBalance(String balance) {
		this.balance = balance;
	}
	public String getBalance( ) {
		return this.balance;
	}

	public void setExternalEntityId(String externalEntityId) {
		this.externalEntityId = externalEntityId;
	}
	public String getExternalEntityId( ) {
		return this.externalEntityId;
	}

	public void setFreezeBalance(String freezeBalance) {
		this.freezeBalance = freezeBalance;
	}
	public String getFreezeBalance( ) {
		return this.freezeBalance;
	}

	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}
	public Date getGmtCreate( ) {
		return this.gmtCreate;
	}

	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}
	public Date getGmtModified( ) {
		return this.gmtModified;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId( ) {
		return this.userId;
	}

}
