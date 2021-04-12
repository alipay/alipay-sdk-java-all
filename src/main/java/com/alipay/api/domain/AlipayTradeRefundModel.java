package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 统一收单交易退款接口
 *
 * @author auto create
 * @since 1.0, 2020-12-14 21:16:48
 */
public class AlipayTradeRefundModel extends AlipayObject {

	private static final long serialVersionUID = 1792553855864641825L;

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
	 * 标识一次退款请求，同一笔交易多次退款需要保证唯一，如需部分退款，则此参数必传。
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 订单支付时传入的商户订单号，商家自定义且保证商家系统中唯一。与支付宝交易号 trade_no 不能同时为空。
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/**
	 * 查询选项，商户通过上送该参数来定制同步需要额外返回的信息字段，数组格式。支持：refund_detail_item_list：退款使用的资金渠道。
	 */
	@ApiListField("query_options")
	@ApiField("string")
	private List<String> queryOptions;

	/**
	 * 需要退款的金额，该金额不能大于订单金额,单位为元，支持两位小数
	 */
	@ApiField("refund_amount")
	private String refundAmount;

	/**
	 * 订单退款币种信息。支持英镑：GBP、港币：HKD、美元：USD、新加坡元：SGD、日元：JPY、加拿大元：CAD、澳元：AUD、欧元：EUR、新西兰元：NZD、韩元：KRW、泰铢：THB、瑞士法郎：CHF、瑞典克朗：SEK、丹麦克朗：DKK、挪威克朗：NOK、马来西亚林吉特：MYR、印尼卢比：IDR、菲律宾比索：PHP、毛里求斯卢比：MUR、以色列新谢克尔：ILS、斯里兰卡卢比：LKR、俄罗斯卢布：RUB、阿联酋迪拉姆：AED、捷克克朗：CZK、南非兰特：ZAR、人民币：CNY
	 */
	@ApiField("refund_currency")
	private String refundCurrency;

	/**
	 * 退款原因说明，商家自定义。
	 */
	@ApiField("refund_reason")
	private String refundReason;

	/**
	 * 退分账明细信息。
注：
1.当面付无需传入退分账明细，系统自动按退款金额与订单金额的比率，从收款方和分账收入方退款，不支持指定退款金额与退款方。
2.电脑网站支付，手机 APP 支付，手机网站支付产品，须在退款请求中明确是否退分账，从哪个分账收入方退，退多少分账金额；如不明确，默认从收款方退款，收款方余额不足退款失败。不支持系统按比率退款。

	 */
	@ApiListField("refund_royalty_parameters")
	@ApiField("open_api_royalty_detail_info_pojo")
	private List<OpenApiRoyaltyDetailInfoPojo> refundRoyaltyParameters;

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
	 * 支付宝交易号，和商户订单号 out_trade_no 不能同时为空。
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
