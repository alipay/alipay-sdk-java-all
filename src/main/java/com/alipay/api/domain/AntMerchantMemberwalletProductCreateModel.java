package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 开通会员钱包产品
 *
 * @author auto create
 * @since 1.0, 2022-05-20 15:16:10
 */
public class AntMerchantMemberwalletProductCreateModel extends AlipayObject {

	private static final long serialVersionUID = 2849229663888363995L;

	/**
	 * 会员钱包名称
	 */
	@ApiField("member_wallet_name")
	private String memberWalletName;

	/**
	 * 会员钱包产品类型：
<br>platform 平台钱包
<br>studio 直播间钱包
<br>merchant 商户钱包
	 */
	@ApiField("member_wallet_type")
	private String memberWalletType;

	/**
	 * 外部业务唯一流水号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 会员钱包使用场景ID
<br>直播间钱包传外部直播间唯一标识
<br>商户钱包传支付宝商户ID
	 */
	@ApiField("out_scene_id")
	private String outSceneId;

	public String getMemberWalletName() {
		return this.memberWalletName;
	}
	public void setMemberWalletName(String memberWalletName) {
		this.memberWalletName = memberWalletName;
	}

	public String getMemberWalletType() {
		return this.memberWalletType;
	}
	public void setMemberWalletType(String memberWalletType) {
		this.memberWalletType = memberWalletType;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getOutSceneId() {
		return this.outSceneId;
	}
	public void setOutSceneId(String outSceneId) {
		this.outSceneId = outSceneId;
	}

}
