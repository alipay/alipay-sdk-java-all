package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 会员卡消费记录同步
 *
 * @author auto create
 * @since 1.0, 2019-08-08 19:58:13
 */
public class AlipayMarketingCardConsumeSyncModel extends AlipayObject {

	private static final long serialVersionUID = 7485123824694549665L;

	/**
	 * 用户实际付的现金金额
1.针对预付卡面额的核销金额在use_benefit_list展现，作为权益金额
2.权益金额不叠加在该金额上
	 */
	@ApiField("act_pay_amount")
	private String actPayAmount;

	/**
	 * 卡信息（交易后的实际卡信息）
	 */
	@ApiField("card_info")
	private MerchantCard cardInfo;

	/**
	 * 获取权益列表
	 */
	@ApiListField("gain_benefit_list")
	@ApiField("benefit_info_detail")
	private List<BenefitInfoDetail> gainBenefitList;

	/**
	 * 备注信息，现有直接填写门店信息
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 门店编号
	 */
	@ApiField("shop_code")
	private String shopCode;

	/**
	 * 产生该笔交易时，用户出具的凭证类型
ALIPAY：支付宝电子卡
ENTITY：实体卡
OTHER：其他
	 */
	@ApiField("swipe_cert_type")
	private String swipeCertType;

	/**
	 * 支付宝业务卡号，开卡接口中返回获取
	 */
	@ApiField("target_card_no")
	private String targetCardNo;

	/**
	 * 卡号类型
BIZ_CARD：支付宝业务卡号
	 */
	@ApiField("target_card_no_type")
	private String targetCardNoType;

	/**
	 * 交易金额：本次交易的实际总金额（可认为标价金额）
	 */
	@ApiField("trade_amount")
	private String tradeAmount;

	/**
	 * 交易名称
为空时根据交易类型提供默认名称
	 */
	@ApiField("trade_name")
	private String tradeName;

	/**
	 * 支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/**
	 * 线下交易时间（是用户付款的交易时间）
当交易时间晚于上次消费记录同步时间，则会发生卡信息变更
	 */
	@ApiField("trade_time")
	private Date tradeTime;

	/**
	 * 交易类型
开卡：OPEN
消费：TRADE
充值：DEPOSIT
退卡：RETURN
	 */
	@ApiField("trade_type")
	private String tradeType;

	/**
	 * 实际消耗的权益
	 */
	@ApiListField("use_benefit_list")
	@ApiField("benefit_info_detail")
	private List<BenefitInfoDetail> useBenefitList;

	public String getActPayAmount() {
		return this.actPayAmount;
	}
	public void setActPayAmount(String actPayAmount) {
		this.actPayAmount = actPayAmount;
	}

	public MerchantCard getCardInfo() {
		return this.cardInfo;
	}
	public void setCardInfo(MerchantCard cardInfo) {
		this.cardInfo = cardInfo;
	}

	public List<BenefitInfoDetail> getGainBenefitList() {
		return this.gainBenefitList;
	}
	public void setGainBenefitList(List<BenefitInfoDetail> gainBenefitList) {
		this.gainBenefitList = gainBenefitList;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getShopCode() {
		return this.shopCode;
	}
	public void setShopCode(String shopCode) {
		this.shopCode = shopCode;
	}

	public String getSwipeCertType() {
		return this.swipeCertType;
	}
	public void setSwipeCertType(String swipeCertType) {
		this.swipeCertType = swipeCertType;
	}

	public String getTargetCardNo() {
		return this.targetCardNo;
	}
	public void setTargetCardNo(String targetCardNo) {
		this.targetCardNo = targetCardNo;
	}

	public String getTargetCardNoType() {
		return this.targetCardNoType;
	}
	public void setTargetCardNoType(String targetCardNoType) {
		this.targetCardNoType = targetCardNoType;
	}

	public String getTradeAmount() {
		return this.tradeAmount;
	}
	public void setTradeAmount(String tradeAmount) {
		this.tradeAmount = tradeAmount;
	}

	public String getTradeName() {
		return this.tradeName;
	}
	public void setTradeName(String tradeName) {
		this.tradeName = tradeName;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

	public Date getTradeTime() {
		return this.tradeTime;
	}
	public void setTradeTime(Date tradeTime) {
		this.tradeTime = tradeTime;
	}

	public String getTradeType() {
		return this.tradeType;
	}
	public void setTradeType(String tradeType) {
		this.tradeType = tradeType;
	}

	public List<BenefitInfoDetail> getUseBenefitList() {
		return this.useBenefitList;
	}
	public void setUseBenefitList(List<BenefitInfoDetail> useBenefitList) {
		this.useBenefitList = useBenefitList;
	}

}
