package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.ecny.wallet.bind.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-05-13 13:57:48
 */
public class MybankEcnyWalletBindQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7171161762574326341L;

	/** 
	 * 绑定协议编号
	 */
	@ApiField("bind_ar_no")
	private String bindArNo;

	/** 
	 * 用户绑定时间
	 */
	@ApiField("bind_time")
	private String bindTime;

	/** 
	 * 钱包冻结类型
	 */
	@ApiField("freeze_type")
	private String freezeType;

	/** 
	 * 是否有钱包已绑定至平台
	 */
	@ApiField("has_bound")
	private String hasBound;

	/** 
	 * 身份信息令牌。用于其他接口中密文传递用户信息。
	 */
	@ApiField("identify_token")
	private String identifyToken;

	/** 
	 * 钱包额度管控标识。若额度受管控，则钱包的各项限额将降至匿名钱包限额。
	 */
	@ApiField("quota_control_flag")
	private String quotaControlFlag;

	/** 
	 * 用户在平台的身份
	 */
	@ApiField("role_type")
	private String roleType;

	/** 
	 * 钱包编号
	 */
	@ApiField("wallet_id")
	private String walletId;

	/** 
	 * 钱包等级。三类及以上钱包为实名钱包。
	 */
	@ApiField("wallet_level")
	private String walletLevel;

	/** 
	 * 钱包状态
	 */
	@ApiField("wallet_status")
	private String walletStatus;

	public void setBindArNo(String bindArNo) {
		this.bindArNo = bindArNo;
	}
	public String getBindArNo( ) {
		return this.bindArNo;
	}

	public void setBindTime(String bindTime) {
		this.bindTime = bindTime;
	}
	public String getBindTime( ) {
		return this.bindTime;
	}

	public void setFreezeType(String freezeType) {
		this.freezeType = freezeType;
	}
	public String getFreezeType( ) {
		return this.freezeType;
	}

	public void setHasBound(String hasBound) {
		this.hasBound = hasBound;
	}
	public String getHasBound( ) {
		return this.hasBound;
	}

	public void setIdentifyToken(String identifyToken) {
		this.identifyToken = identifyToken;
	}
	public String getIdentifyToken( ) {
		return this.identifyToken;
	}

	public void setQuotaControlFlag(String quotaControlFlag) {
		this.quotaControlFlag = quotaControlFlag;
	}
	public String getQuotaControlFlag( ) {
		return this.quotaControlFlag;
	}

	public void setRoleType(String roleType) {
		this.roleType = roleType;
	}
	public String getRoleType( ) {
		return this.roleType;
	}

	public void setWalletId(String walletId) {
		this.walletId = walletId;
	}
	public String getWalletId( ) {
		return this.walletId;
	}

	public void setWalletLevel(String walletLevel) {
		this.walletLevel = walletLevel;
	}
	public String getWalletLevel( ) {
		return this.walletLevel;
	}

	public void setWalletStatus(String walletStatus) {
		this.walletStatus = walletStatus;
	}
	public String getWalletStatus( ) {
		return this.walletStatus;
	}

}
