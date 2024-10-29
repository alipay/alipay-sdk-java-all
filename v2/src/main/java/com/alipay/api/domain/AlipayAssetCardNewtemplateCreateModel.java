package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 外部商户标准卡模板创建
 *
 * @author auto create
 * @since 1.0, 2024-05-27 13:57:57
 */
public class AlipayAssetCardNewtemplateCreateModel extends AlipayObject {

	private static final long serialVersionUID = 4165419164252322264L;

	/**
	 * 账户模式：借记/贷记/借贷合一账户模式
	 */
	@ApiField("account_model")
	private String accountModel;

	/**
	 * 按照资金产品维度定义的资产类型
	 */
	@ApiField("assets_code")
	private String assetsCode;

	/**
	 * 业务来源
	 */
	@ApiField("biz_from")
	private String bizFrom;

	/**
	 * 资金信息列表[{"fundType":"HUA_BEI"}]
	 */
	@ApiListField("card_fund_infos")
	@ApiField("card_fund_info")
	private List<CardFundInfo> cardFundInfos;

	/**
	 * 卡模式：单卡/多卡模式
	 */
	@ApiField("card_model")
	private String cardModel;

	/**
	 * 卡名称
	 */
	@ApiField("card_name")
	private String cardName;

	/**
	 * 创建人userId
	 */
	@ApiField("creator")
	private String creator;

	/**
	 * 贷记信息{"allowOverPay":false,"creditQuota":"0"}
	 */
	@ApiField("credit_info")
	private CardCreditInfo creditInfo;

	/**
	 * 扩展信息
	 */
	@ApiField("extend_info")
	private String extendInfo;

	/**
	 * 操作人userId
	 */
	@ApiField("operator")
	private String operator;

	/**
	 * 比如某种业务标准外部订单号,比如交易外部订单号，代表商户端自己订单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 商户和支付宝交互时，用于代表支付宝分配给商户ID
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 卡账户生命周期类型：长期卡/月卡
	 */
	@ApiField("period_type")
	private String periodType;

	/**
	 * 按照业务资产维度定义的产品编码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 模板结算商户id，后续商户资金流入的指定账户
	 */
	@ApiField("settle_user_id")
	private String settleUserId;

	/**
	 * 商户资金签约主体
	 */
	@ApiField("sign_principal")
	private String signPrincipal;

	public String getAccountModel() {
		return this.accountModel;
	}
	public void setAccountModel(String accountModel) {
		this.accountModel = accountModel;
	}

	public String getAssetsCode() {
		return this.assetsCode;
	}
	public void setAssetsCode(String assetsCode) {
		this.assetsCode = assetsCode;
	}

	public String getBizFrom() {
		return this.bizFrom;
	}
	public void setBizFrom(String bizFrom) {
		this.bizFrom = bizFrom;
	}

	public List<CardFundInfo> getCardFundInfos() {
		return this.cardFundInfos;
	}
	public void setCardFundInfos(List<CardFundInfo> cardFundInfos) {
		this.cardFundInfos = cardFundInfos;
	}

	public String getCardModel() {
		return this.cardModel;
	}
	public void setCardModel(String cardModel) {
		this.cardModel = cardModel;
	}

	public String getCardName() {
		return this.cardName;
	}
	public void setCardName(String cardName) {
		this.cardName = cardName;
	}

	public String getCreator() {
		return this.creator;
	}
	public void setCreator(String creator) {
		this.creator = creator;
	}

	public CardCreditInfo getCreditInfo() {
		return this.creditInfo;
	}
	public void setCreditInfo(CardCreditInfo creditInfo) {
		this.creditInfo = creditInfo;
	}

	public String getExtendInfo() {
		return this.extendInfo;
	}
	public void setExtendInfo(String extendInfo) {
		this.extendInfo = extendInfo;
	}

	public String getOperator() {
		return this.operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getPartnerId() {
		return this.partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	public String getPeriodType() {
		return this.periodType;
	}
	public void setPeriodType(String periodType) {
		this.periodType = periodType;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getSettleUserId() {
		return this.settleUserId;
	}
	public void setSettleUserId(String settleUserId) {
		this.settleUserId = settleUserId;
	}

	public String getSignPrincipal() {
		return this.signPrincipal;
	}
	public void setSignPrincipal(String signPrincipal) {
		this.signPrincipal = signPrincipal;
	}

}
