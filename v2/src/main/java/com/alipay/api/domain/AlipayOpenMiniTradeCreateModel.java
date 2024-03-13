package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 交易组件交易订单预创建
 *
 * @author auto create
 * @since 1.0, 2023-03-13 20:09:16
 */
public class AlipayOpenMiniTradeCreateModel extends AlipayObject {

	private static final long serialVersionUID = 2391438336931646696L;

	/**
	 * 间联交易下，由收单机构上送的信息
	 */
	@ApiField("bkagent_req_info")
	private BkAgentReqInfoDTO bkagentReqInfo;

	/**
	 * 如果请求时传递了该参数，将在异步通知、对账单中原样返回，同时会在商户和用户的pc账单详情中作为交易描述展示
	 */
	@ApiField("body")
	private String body;

	/**
	 * 商户传入业务信息，具体值要和支付宝约定，应用于安全，营销等参数直传场景，格式为json格式
	 */
	@ApiField("business_params")
	private BusinessParamsDTO businessParams;

	/**
	 * 088开头的16位纯数字，小程序场景下获取用户ID请参考：用户授权;
其它场景下获取用户ID请参考：网页授权获取用户信息;
注：交易的买家与卖家不能相同。
	 */
	@ApiField("buyer_id")
	private String buyerId;

	/**
	 * 买家支付宝登录账号。 buyer_logon_id和buyer_id两者传其一，和buyer_id不能同时为空，建议通过buyer_id来传递买家信息。
	 */
	@ApiField("buyer_logon_id")
	private String buyerLogonId;

	/**
	 * 买家支付宝用户唯一标识
	 */
	@ApiField("buyer_open_id")
	private String buyerOpenId;

	/**
	 * 参与优惠计算的金额，单位为元，精确到小数点后两位，取值范围[0.01,100000000]。
如果同时传入了【可打折金额】、【不可打折金额】和【订单总金额】，则必须满足如下条件：【订单总金额】=【可打折金额】+【不可打折金额】。
如果订单金额全部参与优惠计算，则【可打折金额】和【不可打折金额】都无需传入
	 */
	@ApiField("discountable_amount")
	private String discountableAmount;

	/**
	 * 订单扩展字段
	 */
	@ApiField("ext_info")
	private OrderExtInfoDTO extInfo;

	/**
	 * 外部指定买家
	 */
	@ApiField("ext_user_info")
	private ExtUserInfoDTO extUserInfo;

	/**
	 * 业务扩展参数
	 */
	@ApiField("extend_params")
	private ExtendParamsDTO extendParams;

	/**
	 * 商品信息列表
	 */
	@ApiListField("item_order_list")
	@ApiField("goods_detail_info_d_t_o")
	private List<GoodsDetailInfoDTO> itemOrderList;

	/**
	 * 物流信息
	 */
	@ApiField("logistics_info")
	private LogisticsDetailDTO logisticsInfo;

	/**
	 * 订单类型,参照订单中心模板列表
	 */
	@ApiField("merchant_biz_type")
	private String merchantBizType;

	/**
	 * 商家小程序对应的订单详情页路径地址 value。仅需传入小程序页面路径即可。同一笔订单的链接必须与第一次传入的地址相同，且需是小程序内部页面路径，例如：/pages/index/index?orderId=10190608609185
	 */
	@ApiField("merchant_order_link_page")
	private String merchantOrderLinkPage;

	/**
	 * 商户操作员编号
	 */
	@ApiField("operator_id")
	private String operatorId;

	/**
	 * 由商家自定义，64个字符以内，仅支持字母、数字、下划线且需保证在商户端不重复。
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/**
	 * 商户通过传递该参数来定制需要额外返回的信息字段，数组格式。包括但不限于：["enterprise_pay_info","hyb_amount"]
	 */
	@ApiListField("query_options")
	@ApiField("string")
	private List<String> queryOptions;

	/**
	 * 收货人及地址信息
	 */
	@ApiField("receiver_address_info")
	private ReceiverAddressInfoDTO receiverAddressInfo;

	/**
	 * 描述分账信息，json格式
	 */
	@ApiField("royalty_info")
	private RoyaltyInfoDTO royaltyInfo;

	/**
	 * 当需要指定收款账号时，通过该参数传入，如果该值为空，则默认为商户签约账号对应的支付宝用户ID。
收款账号优先级规则：门店绑定的收款账户>请求传入的seller_id>商户签约账号对应的支付宝用户ID；
注：直付通和机构间联场景下seller_id无需传入或者保持跟pid一致；
如果传入的seller_id与pid不一致，需要联系支付宝小二配置收款关系；
	 */
	@ApiField("seller_id")
	private String sellerId;

	/**
	 * 卖家支付宝用户唯一标识，与seller_id选其一
	 */
	@ApiField("seller_open_id")
	private String sellerOpenId;

	/**
	 * 结算信息
	 */
	@ApiField("settle_info")
	private SettleInfoDTO settleInfo;

	/**
	 * 指商户创建门店时输入的门店编号
	 */
	@ApiField("store_id")
	private String storeId;

	/**
	 * 二级商户信息。 直付通模式和机构间连模式下必传，其它场景下不需要传入
	 */
	@ApiField("sub_merchant")
	private SubMerchantDTO subMerchant;

	/**
	 * 注意：不可使用特殊字符，如 /，=，& 等。
	 */
	@ApiField("subject")
	private String subject;

	/**
	 * 商户机具终端编号
	 */
	@ApiField("terminal_id")
	private String terminalId;

	/**
	 * 格式为yyyy-MM-dd HH:mm:ss。
注：time_expire和timeout_express两者只需传入一个或者都不传，如果两者都传，优先使用time_expire
	 */
	@ApiField("time_expire")
	private String timeExpire;

	/**
	 * 从交易创建时间开始计算。
该笔订单允许的最晚付款时间，逾期将关闭交易。取值范围：1m～15d。m-分钟，h-小时，d-天，1c-当天（1c-当天的情况下，无论交易何时创建，都在0点关闭）。 该参数数值不接受小数点， 如 1.5h，可转换为 90m。
当面付场景默认值为3h。
注：time_expire和timeout_express两者只需传入一个或者都不传，如果两者都传，优先使用time_expire
	 */
	@ApiField("timeout_express")
	private String timeoutExpress;

	/**
	 * 单位为元，精确到小数点后两位，取值范围：[0.01,100000000] 。
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/**
	 * 不参与优惠计算的金额，单位为元，精确到小数点后两位，取值范围[0.01,100000000]。
如果同时传入了【可打折金额】、【不可打折金额】和【订单总金额】，则必须满足如下条件：【订单总金额】=【可打折金额】+【不可打折金额】。
如果订单金额全部参与优惠计算，则【可打折金额】和【不可打折金额】都无需传入
	 */
	@ApiField("undiscountable_amount")
	private String undiscountableAmount;

	public BkAgentReqInfoDTO getBkagentReqInfo() {
		return this.bkagentReqInfo;
	}
	public void setBkagentReqInfo(BkAgentReqInfoDTO bkagentReqInfo) {
		this.bkagentReqInfo = bkagentReqInfo;
	}

	public String getBody() {
		return this.body;
	}
	public void setBody(String body) {
		this.body = body;
	}

	public BusinessParamsDTO getBusinessParams() {
		return this.businessParams;
	}
	public void setBusinessParams(BusinessParamsDTO businessParams) {
		this.businessParams = businessParams;
	}

	public String getBuyerId() {
		return this.buyerId;
	}
	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}

	public String getBuyerLogonId() {
		return this.buyerLogonId;
	}
	public void setBuyerLogonId(String buyerLogonId) {
		this.buyerLogonId = buyerLogonId;
	}

	public String getBuyerOpenId() {
		return this.buyerOpenId;
	}
	public void setBuyerOpenId(String buyerOpenId) {
		this.buyerOpenId = buyerOpenId;
	}

	public String getDiscountableAmount() {
		return this.discountableAmount;
	}
	public void setDiscountableAmount(String discountableAmount) {
		this.discountableAmount = discountableAmount;
	}

	public OrderExtInfoDTO getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(OrderExtInfoDTO extInfo) {
		this.extInfo = extInfo;
	}

	public ExtUserInfoDTO getExtUserInfo() {
		return this.extUserInfo;
	}
	public void setExtUserInfo(ExtUserInfoDTO extUserInfo) {
		this.extUserInfo = extUserInfo;
	}

	public ExtendParamsDTO getExtendParams() {
		return this.extendParams;
	}
	public void setExtendParams(ExtendParamsDTO extendParams) {
		this.extendParams = extendParams;
	}

	public List<GoodsDetailInfoDTO> getItemOrderList() {
		return this.itemOrderList;
	}
	public void setItemOrderList(List<GoodsDetailInfoDTO> itemOrderList) {
		this.itemOrderList = itemOrderList;
	}

	public LogisticsDetailDTO getLogisticsInfo() {
		return this.logisticsInfo;
	}
	public void setLogisticsInfo(LogisticsDetailDTO logisticsInfo) {
		this.logisticsInfo = logisticsInfo;
	}

	public String getMerchantBizType() {
		return this.merchantBizType;
	}
	public void setMerchantBizType(String merchantBizType) {
		this.merchantBizType = merchantBizType;
	}

	public String getMerchantOrderLinkPage() {
		return this.merchantOrderLinkPage;
	}
	public void setMerchantOrderLinkPage(String merchantOrderLinkPage) {
		this.merchantOrderLinkPage = merchantOrderLinkPage;
	}

	public String getOperatorId() {
		return this.operatorId;
	}
	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}

	public String getOutTradeNo() {
		return this.outTradeNo;
	}
	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}

	public List<String> getQueryOptions() {
		return this.queryOptions;
	}
	public void setQueryOptions(List<String> queryOptions) {
		this.queryOptions = queryOptions;
	}

	public ReceiverAddressInfoDTO getReceiverAddressInfo() {
		return this.receiverAddressInfo;
	}
	public void setReceiverAddressInfo(ReceiverAddressInfoDTO receiverAddressInfo) {
		this.receiverAddressInfo = receiverAddressInfo;
	}

	public RoyaltyInfoDTO getRoyaltyInfo() {
		return this.royaltyInfo;
	}
	public void setRoyaltyInfo(RoyaltyInfoDTO royaltyInfo) {
		this.royaltyInfo = royaltyInfo;
	}

	public String getSellerId() {
		return this.sellerId;
	}
	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}

	public String getSellerOpenId() {
		return this.sellerOpenId;
	}
	public void setSellerOpenId(String sellerOpenId) {
		this.sellerOpenId = sellerOpenId;
	}

	public SettleInfoDTO getSettleInfo() {
		return this.settleInfo;
	}
	public void setSettleInfo(SettleInfoDTO settleInfo) {
		this.settleInfo = settleInfo;
	}

	public String getStoreId() {
		return this.storeId;
	}
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

	public SubMerchantDTO getSubMerchant() {
		return this.subMerchant;
	}
	public void setSubMerchant(SubMerchantDTO subMerchant) {
		this.subMerchant = subMerchant;
	}

	public String getSubject() {
		return this.subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getTerminalId() {
		return this.terminalId;
	}
	public void setTerminalId(String terminalId) {
		this.terminalId = terminalId;
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

	public String getUndiscountableAmount() {
		return this.undiscountableAmount;
	}
	public void setUndiscountableAmount(String undiscountableAmount) {
		this.undiscountableAmount = undiscountableAmount;
	}

}
