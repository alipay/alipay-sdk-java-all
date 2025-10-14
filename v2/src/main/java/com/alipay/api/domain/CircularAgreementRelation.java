package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商家扣款签约关系
 *
 * @author auto create
 * @since 1.0, 2025-09-22 14:16:33
 */
public class CircularAgreementRelation extends AlipayObject {

	private static final long serialVersionUID = 7328291123652993429L;

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
	 * 状态
	 */
	@ApiField("status")
	private String status;

	public String getBindWalletId() {
		return this.bindWalletId;
	}
	public void setBindWalletId(String bindWalletId) {
		this.bindWalletId = bindWalletId;
	}

	public String getBindWalletType() {
		return this.bindWalletType;
	}
	public void setBindWalletType(String bindWalletType) {
		this.bindWalletType = bindWalletType;
	}

	public String getRelationOpenid() {
		return this.relationOpenid;
	}
	public void setRelationOpenid(String relationOpenid) {
		this.relationOpenid = relationOpenid;
	}

	public String getRelationUid() {
		return this.relationUid;
	}
	public void setRelationUid(String relationUid) {
		this.relationUid = relationUid;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
