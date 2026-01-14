package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 信用支付统一咨询接口
 *
 * @author auto create
 * @since 1.0, 2023-04-11 17:37:14
 */
public class MybankCreditLoantradePayAssetConsultModel extends AlipayObject {

	private static final long serialVersionUID = 7189381587557776544L;

	/**
	 * 支付宝合作伙伴id
	 */
	@ApiField("alipay_partner_id")
	private String alipayPartnerId;

	/**
	 * 申请金额，最小1元钱
	 */
	@ApiField("apply_amt")
	private CreditPayMoneyVO applyAmt;

	/**
	 * 业务场景
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 咨询资产类型，LOAN_INSTALLMENT或者BILL
	 */
	@ApiListField("credit_asset_types")
	@ApiField("string")
	private List<String> creditAssetTypes;

	/**
	 * 授权场景码
	 */
	@ApiField("mybk_auth_scene_code")
	private String mybkAuthSceneCode;

	/**
	 * 授权令牌
	 */
	@ApiField("mybk_auth_token")
	private String mybkAuthToken;

	/**
	 * 交易订单信息，JSON数组格式的***字符串***，用于描述交易订单详情。再次强调，该字段是字符串形式，用于当做订单扩展使用。序列化整个请求的时候，这个字段一定要是字符串类型，只不过该字段产生，需要将订单List额外进行一次json序列化
	 */
	@ApiField("order_infos")
	private String orderInfos;

	/**
	 * 收单产品码
	 */
	@ApiField("payment_sale_pd_code")
	private String paymentSalePdCode;

	/**
	 * 平台类型
	 */
	@ApiField("platform_type")
	private String platformType;

	/**
	 * 子业务类型
	 */
	@ApiField("sub_biz_scene")
	private String subBizScene;

	/**
	 * 子平台类型
	 */
	@ApiField("sub_platform_type")
	private String subPlatformType;

	/**
	 * 咨询用户信息
	 */
	@ApiField("user")
	private CreditPayUserVO user;

	public String getAlipayPartnerId() {
		return this.alipayPartnerId;
	}
	public void setAlipayPartnerId(String alipayPartnerId) {
		this.alipayPartnerId = alipayPartnerId;
	}

	public CreditPayMoneyVO getApplyAmt() {
		return this.applyAmt;
	}
	public void setApplyAmt(CreditPayMoneyVO applyAmt) {
		this.applyAmt = applyAmt;
	}

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public List<String> getCreditAssetTypes() {
		return this.creditAssetTypes;
	}
	public void setCreditAssetTypes(List<String> creditAssetTypes) {
		this.creditAssetTypes = creditAssetTypes;
	}

	public String getMybkAuthSceneCode() {
		return this.mybkAuthSceneCode;
	}
	public void setMybkAuthSceneCode(String mybkAuthSceneCode) {
		this.mybkAuthSceneCode = mybkAuthSceneCode;
	}

	public String getMybkAuthToken() {
		return this.mybkAuthToken;
	}
	public void setMybkAuthToken(String mybkAuthToken) {
		this.mybkAuthToken = mybkAuthToken;
	}

	public String getOrderInfos() {
		return this.orderInfos;
	}
	public void setOrderInfos(String orderInfos) {
		this.orderInfos = orderInfos;
	}

	public String getPaymentSalePdCode() {
		return this.paymentSalePdCode;
	}
	public void setPaymentSalePdCode(String paymentSalePdCode) {
		this.paymentSalePdCode = paymentSalePdCode;
	}

	public String getPlatformType() {
		return this.platformType;
	}
	public void setPlatformType(String platformType) {
		this.platformType = platformType;
	}

	public String getSubBizScene() {
		return this.subBizScene;
	}
	public void setSubBizScene(String subBizScene) {
		this.subBizScene = subBizScene;
	}

	public String getSubPlatformType() {
		return this.subPlatformType;
	}
	public void setSubPlatformType(String subPlatformType) {
		this.subPlatformType = subPlatformType;
	}

	public CreditPayUserVO getUser() {
		return this.user;
	}
	public void setUser(CreditPayUserVO user) {
		this.user = user;
	}

}
