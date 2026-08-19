package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * saas支付创单
 *
 * @author auto create
 * @since 1.0, 2026-08-13 14:47:50
 */
public class AlipayTradeSaasOrderCreateModel extends AlipayObject {

	private static final long serialVersionUID = 3211334699149661494L;

	/**
	 * 商户业务参数。用于透传业务扩展信息。
	 */
	@ApiField("business_params")
	private SaasBusinessParams businessParams;

	/**
	 * 买家信息。pay_channels显式单选BANK_TRANSFER时条件必填。
	 */
	@ApiField("buyer_info")
	private SaasBuyerInfo buyerInfo;

	/**
	 * 收单扩展参数。具体字段按SaasExtendParams结构传入。
	 */
	@ApiField("extend_params")
	private SaasExtendParams extendParams;

	/**
	 * 商品明细列表。用于描述本次收款关联的商品或服务明细。
	 */
	@ApiField("goods_detail")
	private SaasGoodsDetail goodsDetail;

	/**
	 * 商户订单备注，用于账单展示。
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 商户订单号。由商家自定义，64个字符以内，仅支持字母、数字、下划线且需保证在商户端不重复。
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/**
	 * 商户回传参数。后续查询和异步通知会原样返回。
	 */
	@ApiField("passback_params")
	private String passbackParams;

	/**
	 * 商户可接受的支付渠道，多个渠道使用英文逗号分隔。不传表示不限定渠道。当前支持ALIPAY、BANK_TRANSFER。显式单选BANK_TRANSFER时同步创建银行转账订单。
	 */
	@ApiField("pay_channels")
	private String payChannels;

	/**
	 * 优惠参数，必须是仅包含字符串值的JSON对象字符串。
	 */
	@ApiField("promo_params")
	private String promoParams;

	/**
	 * 查询返回字段控制，数组JSON字符串格式。当前支持fund_bill_list。
	 */
	@ApiField("query_options")
	private String queryOptions;

	/**
	 * 商户指定的支付成功后回跳地址。传入时必须是包含主机名的完整HTTP或HTTPS地址。
	 */
	@ApiField("redirect_url")
	private String redirectUrl;

	/**
	 * 安全扩展参数。用于辅助评估交易安全水位，动态调整额度管控策略。
	 */
	@ApiField("security_params")
	private String securityParams;

	/**
	 * 订单标题。用于展示给买家和交易记录识别。
	 */
	@ApiField("subject")
	private String subject;

	/**
	 * 订单绝对超时时间，格式为yyyy-MM-dd HH:mm:ss。与timeout_express都传时优先使用本字段。
	 */
	@ApiField("time_expire")
	private String timeExpire;

	/**
	 * 订单相对超时时间。支持m、h、d单位，例如15m表示15分钟，2h表示2小时，1d表示1天。与time_expire都不传时系统使用默认超时时间。
	 */
	@ApiField("timeout_express")
	private String timeoutExpress;

	/**
	 * 订单总金额，单位为元，精确到小数点后2位，金额必须大于0。
	 */
	@ApiField("total_amount")
	private String totalAmount;

	public SaasBusinessParams getBusinessParams() {
		return this.businessParams;
	}
	public void setBusinessParams(SaasBusinessParams businessParams) {
		this.businessParams = businessParams;
	}

	public SaasBuyerInfo getBuyerInfo() {
		return this.buyerInfo;
	}
	public void setBuyerInfo(SaasBuyerInfo buyerInfo) {
		this.buyerInfo = buyerInfo;
	}

	public SaasExtendParams getExtendParams() {
		return this.extendParams;
	}
	public void setExtendParams(SaasExtendParams extendParams) {
		this.extendParams = extendParams;
	}

	public SaasGoodsDetail getGoodsDetail() {
		return this.goodsDetail;
	}
	public void setGoodsDetail(SaasGoodsDetail goodsDetail) {
		this.goodsDetail = goodsDetail;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getOutTradeNo() {
		return this.outTradeNo;
	}
	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}

	public String getPassbackParams() {
		return this.passbackParams;
	}
	public void setPassbackParams(String passbackParams) {
		this.passbackParams = passbackParams;
	}

	public String getPayChannels() {
		return this.payChannels;
	}
	public void setPayChannels(String payChannels) {
		this.payChannels = payChannels;
	}

	public String getPromoParams() {
		return this.promoParams;
	}
	public void setPromoParams(String promoParams) {
		this.promoParams = promoParams;
	}

	public String getQueryOptions() {
		return this.queryOptions;
	}
	public void setQueryOptions(String queryOptions) {
		this.queryOptions = queryOptions;
	}

	public String getRedirectUrl() {
		return this.redirectUrl;
	}
	public void setRedirectUrl(String redirectUrl) {
		this.redirectUrl = redirectUrl;
	}

	public String getSecurityParams() {
		return this.securityParams;
	}
	public void setSecurityParams(String securityParams) {
		this.securityParams = securityParams;
	}

	public String getSubject() {
		return this.subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getTimeExpire() {
		return this.timeExpire;
	}
	public void setTimeExpire(String timeExpire) {
		this.timeExpire = timeExpire;
	}

	public String getTimeoutExpress() {
		return this.timeoutExpress;
	}
	public void setTimeoutExpress(String timeoutExpress) {
		this.timeoutExpress = timeoutExpress;
	}

	public String getTotalAmount() {
		return this.totalAmount;
	}
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

}
