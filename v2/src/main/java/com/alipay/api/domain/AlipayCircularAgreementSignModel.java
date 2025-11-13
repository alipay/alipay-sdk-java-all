package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 租赁商家扣款签约
 *
 * @author auto create
 * @since 1.0, 2025-10-22 10:21:41
 */
public class AlipayCircularAgreementSignModel extends AlipayObject {

	private static final long serialVersionUID = 7222923889687621272L;

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
	 * 扣款账户所属openid
	 */
	@ApiField("relation_openid")
	private String relationOpenid;

	/**
	 * 扣款账户所属uid
	 */
	@ApiField("relation_uid")
	private String relationUid;

	/**
	 * 场景
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 签约方式，默认QRCODE
	 */
	@ApiField("sign_channel")
	private String signChannel;

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

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

	public String getSignChannel() {
		return this.signChannel;
	}
	public void setSignChannel(String signChannel) {
		this.signChannel = signChannel;
	}

}
