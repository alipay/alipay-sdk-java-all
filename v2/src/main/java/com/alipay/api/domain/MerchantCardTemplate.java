package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 卡
 *
 * @author auto create
 * @since 1.0, 2025-12-18 17:26:24
 */
public class MerchantCardTemplate extends AlipayObject {

	private static final long serialVersionUID = 1159481814696515161L;

	/**
	 * 违约金信息
	 */
	@ApiField("break_costs_info")
	private BreakCostsInfo breakCostsInfo;

	/**
	 * 卡营销优惠信息
	 */
	@ApiListField("card_promo_list")
	@ApiField("card_promo_info")
	private List<CardPromoInfo> cardPromoList;

	/**
	 * 卡归属的小程序appid
	 */
	@ApiField("card_template_app_id")
	private String cardTemplateAppId;

	/**
	 * 支付宝侧卡ID，创建接口不需要传
	 */
	@ApiField("card_template_id")
	private String cardTemplateId;

	/**
	 * 卡名称（当card_type=AXF_MONEY_CARD时，查询会返回）
	 */
	@ApiField("card_template_name")
	private String cardTemplateName;

	/**
	 * 卡状态，创建接口不需要传
	 */
	@ApiField("card_template_status")
	private String cardTemplateStatus;

	/**
	 * 卡类型
	 */
	@ApiField("card_type")
	private String cardType;

	/**
	 * <a href="https://opendocs.alipay.com/mini/e265db10_alipay.open.app.localitem.allcategory.query?pathHash=186a810a">获取类目接口文档</a>
	 */
	@ApiField("category_id")
	private String categoryId;

	/**
	 * 资金模式，预付或先享，新增时不传默认先享，编辑时不传默认不改变原值
	 */
	@ApiListField("funding_model")
	@ApiField("string")
	private List<String> fundingModel;

	/**
	 * 客服电话
	 */
	@ApiField("hotline")
	private String hotline;

	/**
	 * （1）如需上传详情图，则字段image_detail_id_list和image_detail_url_list二选一传入，image_detail_id_list优先级更高
（2）查询返回时该字段为空，返回image_detail_url_list
	 */
	@ApiListField("image_detail_id_list")
	@ApiField("string")
	private List<String> imageDetailIdList;

	/**
	 * 如需上传详情图，则字段image_detail_id_list和image_detail_url_list二选一传入，image_detail_id_list优先级更高
	 */
	@ApiListField("image_detail_url_list")
	@ApiField("string")
	private List<String> imageDetailUrlList;

	/**
	 * （1）当card_type=MERCHANT_TIMES_CARD或MERCHANT_PERIOD_PAY时，字段image_id_list和image_url_list必须二选一传入，image_id_list优先级更高
（2）查询返回时该字段为空，返回image_url_list
（3）当card_type=AXF_MERCHANT_PERIOD_PAY或AXF_MONEY_CARD或AXF_PERIOD_PAY_INDIRECT 时，该字段选填，若该字段和image_url_list都不传，固定为一方小程序的图片url
	 */
	@ApiListField("image_id_list")
	@ApiField("string")
	private List<String> imageIdList;

	/**
	 * （1）当card_type=MERCHANT_TIMES_CARD或MERCHANT_PERIOD_PAY时，字段image_id_list和image_url_list必须二选一传入，image_id_list优先级更高
（2）当card_type=AXF_MERCHANT_PERIOD_PAY或AXF_MONEY_CARD或AXF_PERIOD_PAY_INDIRECT 时，该字段选填，若该字段和image_url_list都不传，固定为一方小程序的图片url
	 */
	@ApiListField("image_url_list")
	@ApiField("string")
	private List<String> imageUrlList;

	/**
	 * 金额卡的必要参数。其他卡类型无需传入
	 */
	@ApiField("money_card_info")
	private MoneyCardInfo moneyCardInfo;

	/**
	 * 消息通知appId
	 */
	@ApiField("msg_app_id")
	private String msgAppId;

	/**
	 * 用户购买该卡的时候是否需要签署购卡协议
	 */
	@ApiField("need_order_agreement")
	private Boolean needOrderAgreement;

	/**
	 * 线上售卖标识。
01表示已开启线上售卖；02表示未开启线上售卖。
	 */
	@ApiField("online_sale_switch")
	private String onlineSaleSwitch;

	/**
	 * 该字段作用于阵地页线上商城展示
	 */
	@ApiField("online_show_switch")
	private String onlineShowSwitch;

	/**
	 * 外部卡ID
	 */
	@ApiField("out_card_id")
	private String outCardId;

	/**
	 * 驳回原因
	 */
	@ApiListField("reject_reasons")
	@ApiField("card_reject_reason_info")
	private List<CardRejectReasonInfo> rejectReasons;

	/**
	 * 售卖信息
	 */
	@ApiField("sale_info")
	private CardTemplateSale saleInfo;

	/**
	 * 结算方式
	 */
	@ApiField("settle_type")
	private String settleType;

	/**
	 * 是否支持用户主动退卡
	 */
	@ApiField("support_withdraw")
	private String supportWithdraw;

	/**
	 * 次卡信息
	 */
	@ApiField("times_card_info")
	private TimesCardInfo timesCardInfo;

	/**
	 * 使用信息
	 */
	@ApiField("use_info")
	private CardTemplateUse useInfo;

	public BreakCostsInfo getBreakCostsInfo() {
		return this.breakCostsInfo;
	}
	public void setBreakCostsInfo(BreakCostsInfo breakCostsInfo) {
		this.breakCostsInfo = breakCostsInfo;
	}

	public List<CardPromoInfo> getCardPromoList() {
		return this.cardPromoList;
	}
	public void setCardPromoList(List<CardPromoInfo> cardPromoList) {
		this.cardPromoList = cardPromoList;
	}

	public String getCardTemplateAppId() {
		return this.cardTemplateAppId;
	}
	public void setCardTemplateAppId(String cardTemplateAppId) {
		this.cardTemplateAppId = cardTemplateAppId;
	}

	public String getCardTemplateId() {
		return this.cardTemplateId;
	}
	public void setCardTemplateId(String cardTemplateId) {
		this.cardTemplateId = cardTemplateId;
	}

	public String getCardTemplateName() {
		return this.cardTemplateName;
	}
	public void setCardTemplateName(String cardTemplateName) {
		this.cardTemplateName = cardTemplateName;
	}

	public String getCardTemplateStatus() {
		return this.cardTemplateStatus;
	}
	public void setCardTemplateStatus(String cardTemplateStatus) {
		this.cardTemplateStatus = cardTemplateStatus;
	}

	public String getCardType() {
		return this.cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public String getCategoryId() {
		return this.categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public List<String> getFundingModel() {
		return this.fundingModel;
	}
	public void setFundingModel(List<String> fundingModel) {
		this.fundingModel = fundingModel;
	}

	public String getHotline() {
		return this.hotline;
	}
	public void setHotline(String hotline) {
		this.hotline = hotline;
	}

	public List<String> getImageDetailIdList() {
		return this.imageDetailIdList;
	}
	public void setImageDetailIdList(List<String> imageDetailIdList) {
		this.imageDetailIdList = imageDetailIdList;
	}

	public List<String> getImageDetailUrlList() {
		return this.imageDetailUrlList;
	}
	public void setImageDetailUrlList(List<String> imageDetailUrlList) {
		this.imageDetailUrlList = imageDetailUrlList;
	}

	public List<String> getImageIdList() {
		return this.imageIdList;
	}
	public void setImageIdList(List<String> imageIdList) {
		this.imageIdList = imageIdList;
	}

	public List<String> getImageUrlList() {
		return this.imageUrlList;
	}
	public void setImageUrlList(List<String> imageUrlList) {
		this.imageUrlList = imageUrlList;
	}

	public MoneyCardInfo getMoneyCardInfo() {
		return this.moneyCardInfo;
	}
	public void setMoneyCardInfo(MoneyCardInfo moneyCardInfo) {
		this.moneyCardInfo = moneyCardInfo;
	}

	public String getMsgAppId() {
		return this.msgAppId;
	}
	public void setMsgAppId(String msgAppId) {
		this.msgAppId = msgAppId;
	}

	public Boolean getNeedOrderAgreement() {
		return this.needOrderAgreement;
	}
	public void setNeedOrderAgreement(Boolean needOrderAgreement) {
		this.needOrderAgreement = needOrderAgreement;
	}

	public String getOnlineSaleSwitch() {
		return this.onlineSaleSwitch;
	}
	public void setOnlineSaleSwitch(String onlineSaleSwitch) {
		this.onlineSaleSwitch = onlineSaleSwitch;
	}

	public String getOnlineShowSwitch() {
		return this.onlineShowSwitch;
	}
	public void setOnlineShowSwitch(String onlineShowSwitch) {
		this.onlineShowSwitch = onlineShowSwitch;
	}

	public String getOutCardId() {
		return this.outCardId;
	}
	public void setOutCardId(String outCardId) {
		this.outCardId = outCardId;
	}

	public List<CardRejectReasonInfo> getRejectReasons() {
		return this.rejectReasons;
	}
	public void setRejectReasons(List<CardRejectReasonInfo> rejectReasons) {
		this.rejectReasons = rejectReasons;
	}

	public CardTemplateSale getSaleInfo() {
		return this.saleInfo;
	}
	public void setSaleInfo(CardTemplateSale saleInfo) {
		this.saleInfo = saleInfo;
	}

	public String getSettleType() {
		return this.settleType;
	}
	public void setSettleType(String settleType) {
		this.settleType = settleType;
	}

	public String getSupportWithdraw() {
		return this.supportWithdraw;
	}
	public void setSupportWithdraw(String supportWithdraw) {
		this.supportWithdraw = supportWithdraw;
	}

	public TimesCardInfo getTimesCardInfo() {
		return this.timesCardInfo;
	}
	public void setTimesCardInfo(TimesCardInfo timesCardInfo) {
		this.timesCardInfo = timesCardInfo;
	}

	public CardTemplateUse getUseInfo() {
		return this.useInfo;
	}
	public void setUseInfo(CardTemplateUse useInfo) {
		this.useInfo = useInfo;
	}

}
