package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 统一收单交易退款接口
 *
 * @author auto create
 * @since 1.0, 2025-02-13 16:01:39
 */
public class AlipayTradeRefundModel extends AlipayObject {

	private static final long serialVersionUID = 8689114655324729958L;

	/**
	 * 退款包含的商品列表信息，Json格式。
	 */
	@ApiListField("goods_detail")
	@ApiField("goods_detail")
	private List<GoodsDetail> goodsDetail;

	/**
	 * 商户的操作员编号
	 */
	@ApiField("operator_id")
	private String operatorId;

	/**
	 * 银行间联模式下有用，其它场景请不要使用；
双联通过该参数指定需要退款的交易所属收单机构的pid;
	 */
	@ApiField("org_pid")
	private String orgPid;

	/**
	 * 退款请求号。
标识一次退款请求，需要保证在交易号下唯一，如需部分退款，则此参数必传。
注：针对同一次退款请求，如果调用接口失败或异常了，重试时需要保证退款请求号不能变更，防止该笔交易重复退款。支付宝会保证同样的退款请求号多次请求只会退一次。
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 商户订单号。
订单支付时传入的商户订单号，商家自定义且保证商家系统中唯一。与支付宝交易号 trade_no 不能同时为空。
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/**
	 * 查询选项。
商户通过上送该参数来定制同步需要额外返回的信息字段，数组格式。
	 */
	@ApiListField("query_options")
	@ApiField("string")
	private List<String> queryOptions;

	/**
	 * 指定垫资退款账号主体，可能是用户id或登录名
	 */
	@ApiField("refund_advance_account")
	private String refundAdvanceAccount;

	/**
	 * 指定垫资退款账号的类型，取值范围：default，userId，loginName
	 */
	@ApiField("refund_advance_account_type")
	private String refundAdvanceAccountType;

	/**
	 * 退款金额。
需要退款的金额，该金额不能大于订单金额，单位为元，支持两位小数。
注：如果正向交易使用了营销，该退款金额包含营销金额，支付宝会按业务规则分配营销和买家自有资金分别退多少，默认优先退买家的自有资金。如交易总金额100元，用户支付时使用了80元自有资金和20元无资金流的营销券，商家实际收款80元。如果首次请求退款60元，则60元全部从商家收款资金扣除退回给用户自有资产；如果再请求退款40元，则从商家收款资金扣除20元退回用户资产以及把20元的营销券退回给用户（券是否可再使用取决于券的规则配置）。
	 */
	@ApiField("refund_amount")
	private String refundAmount;

	/**
	 * 订单退款币种信息。支持英镑：GBP、港币：HKD、美元：USD、新加坡元：SGD、日元：JPY、加拿大元：CAD、澳元：AUD、欧元：EUR、新西兰元：NZD、韩元：KRW、泰铢：THB、瑞士法郎：CHF、瑞典克朗：SEK、丹麦克朗：DKK、挪威克朗：NOK、马来西亚林吉特：MYR、印尼卢比：IDR、菲律宾比索：PHP、毛里求斯卢比：MUR、以色列新谢克尔：ILS、斯里兰卡卢比：LKR、俄罗斯卢布：RUB、阿联酋迪拉姆：AED、捷克克朗：CZK、南非兰特：ZAR、人民币：CNY
	 */
	@ApiField("refund_currency")
	private String refundCurrency;

	/**
	 * 退款包含的商品列表信息
	 */
	@ApiListField("refund_goods_detail")
	@ApiField("refund_goods_detail")
	private List<RefundGoodsDetail> refundGoodsDetail;

	/**
	 * 退款原因说明。
商家自定义，将在会在商户和用户的pc退款账单详情中展示
	 */
	@ApiField("refund_reason")
	private String refundReason;

	/**
	 * 退分账明细信息。
 注： 1.当面付且非直付通模式无需传入退分账明细，系统自动按退款金额与订单金额的比率，从收款方和分账收入方退款，不支持指定退款金额与退款方。 
2.直付通模式，电脑网站支付，手机 APP 支付，手机网站支付产品，须在退款请求中明确是否退分账，从哪个分账收入方退，退多少分账金额；如不明确，默认从收款方退款，收款方余额不足退款失败。不支持系统按比率退款。
	 */
	@ApiListField("refund_royalty_parameters")
	@ApiField("open_api_royalty_detail_info_pojo")
	private List<OpenApiRoyaltyDetailInfoPojo> refundRoyaltyParameters;

	/**
	 * 指定退款账号，对应指定账号退款合约中的约定账号

与refund_trans_out_type绑定使用
1、refund_trans_out_type=userId时，传入对应的支付宝2088账号
2、refund_trans_out_type=loginName时，传入对应的支付宝账号登录名
	 */
	@ApiField("refund_trans_out")
	private String refundTransOut;

	/**
	 * 指定退款账号类型
userId：支付宝账号id
loginName：支付宝账号登录名
	 */
	@ApiField("refund_trans_out_type")
	private String refundTransOutType;

	/**
	 * 针对账期交易，在确认结算后退款的话，需要指定确认结算时的结算单号。
	 */
	@ApiField("related_settle_confirm_no")
	private String relatedSettleConfirmNo;

	/**
	 * 商户门店编号，由商家自定义。需保证当前商户下唯一。
	 */
	@ApiField("store_id")
	private String storeId;

	/**
	 * 商户的终端编号
	 */
	@ApiField("terminal_id")
	private String terminalId;

	/**
	 * 支付宝交易号。
和商户订单号 out_trade_no 不能同时为空，两者同时存在时，优先取值trade_no
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public List<GoodsDetail> getGoodsDetail() {
		return this.goodsDetail;
	}
	public void setGoodsDetail(List<GoodsDetail> goodsDetail) {
		this.goodsDetail = goodsDetail;
	}

	public String getOperatorId() {
		return this.operatorId;
	}
	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}

	public String getOrgPid() {
		return this.orgPid;
	}
	public void setOrgPid(String orgPid) {
		this.orgPid = orgPid;
	}

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
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

	public String getRefundAdvanceAccount() {
		return this.refundAdvanceAccount;
	}
	public void setRefundAdvanceAccount(String refundAdvanceAccount) {
		this.refundAdvanceAccount = refundAdvanceAccount;
	}

	public String getRefundAdvanceAccountType() {
		return this.refundAdvanceAccountType;
	}
	public void setRefundAdvanceAccountType(String refundAdvanceAccountType) {
		this.refundAdvanceAccountType = refundAdvanceAccountType;
	}

	public String getRefundAmount() {
		return this.refundAmount;
	}
	public void setRefundAmount(String refundAmount) {
		this.refundAmount = refundAmount;
	}

	public String getRefundCurrency() {
		return this.refundCurrency;
	}
	public void setRefundCurrency(String refundCurrency) {
		this.refundCurrency = refundCurrency;
	}

	public List<RefundGoodsDetail> getRefundGoodsDetail() {
		return this.refundGoodsDetail;
	}
	public void setRefundGoodsDetail(List<RefundGoodsDetail> refundGoodsDetail) {
		this.refundGoodsDetail = refundGoodsDetail;
	}

	public String getRefundReason() {
		return this.refundReason;
	}
	public void setRefundReason(String refundReason) {
		this.refundReason = refundReason;
	}

	public List<OpenApiRoyaltyDetailInfoPojo> getRefundRoyaltyParameters() {
		return this.refundRoyaltyParameters;
	}
	public void setRefundRoyaltyParameters(List<OpenApiRoyaltyDetailInfoPojo> refundRoyaltyParameters) {
		this.refundRoyaltyParameters = refundRoyaltyParameters;
	}

	public String getRefundTransOut() {
		return this.refundTransOut;
	}
	public void setRefundTransOut(String refundTransOut) {
		this.refundTransOut = refundTransOut;
	}

	public String getRefundTransOutType() {
		return this.refundTransOutType;
	}
	public void setRefundTransOutType(String refundTransOutType) {
		this.refundTransOutType = refundTransOutType;
	}

	public String getRelatedSettleConfirmNo() {
		return this.relatedSettleConfirmNo;
	}
	public void setRelatedSettleConfirmNo(String relatedSettleConfirmNo) {
		this.relatedSettleConfirmNo = relatedSettleConfirmNo;
	}

	public String getStoreId() {
		return this.storeId;
	}
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

	public String getTerminalId() {
		return this.terminalId;
	}
	public void setTerminalId(String terminalId) {
		this.terminalId = terminalId;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}
