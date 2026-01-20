package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.circular.agreement.sign response.
 * 
 * @author auto create
 * @since 1.0, 2026-01-19 17:22:43
 */
public class AlipayCircularAgreementSignResponse extends AlipayResponse {

	private static final long serialVersionUID = 1444996778722857959L;

	/** 
	 * 绑定的收款钱包信息Id
	 */
	@ApiField("bind_wallet_id")
	private String bindWalletId;

	/** 
	 * 代扣关系支付类型
	 */
	@ApiField("bind_wallet_type")
	private String bindWalletType;

	/** 
	 * 账户所属openid
	 */
	@ApiField("relation_openid")
	private String relationOpenid;

	/** 
	 * 账户所属uid
	 */
	@ApiField("relation_uid")
	private String relationUid;

	/** 
	 * 签约状态
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 代扣页面链接，与sign_channel关联
	 */
	@ApiField("url")
	private String url;

	public void setBindWalletId(String bindWalletId) {
		this.bindWalletId = bindWalletId;
	}
	public String getBindWalletId( ) {
		return this.bindWalletId;
	}

	public void setBindWalletType(String bindWalletType) {
		this.bindWalletType = bindWalletType;
	}
	public String getBindWalletType( ) {
		return this.bindWalletType;
	}

	public void setRelationOpenid(String relationOpenid) {
		this.relationOpenid = relationOpenid;
	}
	public String getRelationOpenid( ) {
		return this.relationOpenid;
	}

	public void setRelationUid(String relationUid) {
		this.relationUid = relationUid;
	}
	public String getRelationUid( ) {
		return this.relationUid;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	public String getUrl( ) {
		return this.url;
	}

}
