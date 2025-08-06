package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.wallet.info.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-10-28 18:02:23
 */
public class AlipayFundWalletInfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5119145261596465529L;

	/** 
	 * 钱包创建时间
单位：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("create_time")
	private Date createTime;

	/** 
	 * 钱包更新时间
单位：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("modify_time")
	private Date modifyTime;

	/** 
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/** 
	 * 钱包状态
I：初始化（申请中）
E：生效
F：冻结
D：删除
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	/** 
	 * 用户钱包id
	 */
	@ApiField("user_wallet_id")
	private String userWalletId;

	/** 
	 * 钱包模板id
	 */
	@ApiField("wallet_template_id")
	private String walletTemplateId;

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getCreateTime( ) {
		return this.createTime;
	}

	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}
	public Date getModifyTime( ) {
		return this.modifyTime;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public String getOpenId( ) {
		return this.openId;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId( ) {
		return this.userId;
	}

	public void setUserWalletId(String userWalletId) {
		this.userWalletId = userWalletId;
	}
	public String getUserWalletId( ) {
		return this.userWalletId;
	}

	public void setWalletTemplateId(String walletTemplateId) {
		this.walletTemplateId = walletTemplateId;
	}
	public String getWalletTemplateId( ) {
		return this.walletTemplateId;
	}

}
