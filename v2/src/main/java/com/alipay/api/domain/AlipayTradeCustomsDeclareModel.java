package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 统一收单报关接口
 *
 * @author auto create
 * @since 1.0, 2023-07-06 11:21:18
 */
public class AlipayTradeCustomsDeclareModel extends AlipayObject {

	private static final long serialVersionUID = 2381266722962662623L;

	/**
	 * 报关金额，单位为人民币“元”，精确到小数点后2位。
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 订购人身份信息
	 */
	@ApiField("buyer_info")
	private CustomsDeclareBuyerInfo buyerInfo;

	/**
	 * 海关编号（大小写皆可）。参见“ <a href="https://opendocs.alipay.com/pre-open/01x3kh#%E6%B5%B7%E5%85%B3%E7%BC%96%E5%8F%B7">海关编号</a>”。
	 */
	@ApiField("customs_place")
	private String customsPlace;

	/**
	 * 报关模式，默认可空，1表示需要强校验买家和支付人的身份信息。
	 */
	@ApiField("declare_mode")
	private Long declareMode;

	/**
	 * 定金在支付宝系统中的交易流水号，最长64位。当该参数不为空时，代表为”定金+尾款“报关场景。
	 */
	@ApiField("deposit_trade_no")
	private String depositTradeNo;

	/**
	 * 商户控制本单是否拆单的报关参数。
仅当该参数传值为T或者t时，才会触发拆单。
	 */
	@ApiField("is_split")
	private String isSplit;

	/**
	 * 商户在海关备案的编号。
	 */
	@ApiField("merchant_customs_code")
	private String merchantCustomsCode;

	/**
	 * 商户海关备案名称。
	 */
	@ApiField("merchant_customs_name")
	private String merchantCustomsName;

	/**
	 * 国际站商户标识
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/**
	 * 报关流水号。商户生成的用于唯一标识一次报关操作的业务编号。
建议生成规则：yyyymmdd型8位日期拼接4位序列号。每个报关请求号仅允许传入：数字、英文字母、下划线”_”、短横线”－” 。长度6-64位前后不能有空格
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 国际站外部订单号
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/**
	 * 拆单报关的商户子订单号。 用于区别拆单时不同子单。拆单时必须传入，否则会报INVALID_PARAMETER错误码。
	 */
	@ApiField("sub_out_biz_no")
	private String subOutBizNo;

	/**
	 * 支付宝交易号。该交易在支付宝系统中的交易流水号，最长64位。
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public CustomsDeclareBuyerInfo getBuyerInfo() {
		return this.buyerInfo;
	}
	public void setBuyerInfo(CustomsDeclareBuyerInfo buyerInfo) {
		this.buyerInfo = buyerInfo;
	}

	public String getCustomsPlace() {
		return this.customsPlace;
	}
	public void setCustomsPlace(String customsPlace) {
		this.customsPlace = customsPlace;
	}

	public Long getDeclareMode() {
		return this.declareMode;
	}
	public void setDeclareMode(Long declareMode) {
		this.declareMode = declareMode;
	}

	public String getDepositTradeNo() {
		return this.depositTradeNo;
	}
	public void setDepositTradeNo(String depositTradeNo) {
		this.depositTradeNo = depositTradeNo;
	}

	public String getIsSplit() {
		return this.isSplit;
	}
	public void setIsSplit(String isSplit) {
		this.isSplit = isSplit;
	}

	public String getMerchantCustomsCode() {
		return this.merchantCustomsCode;
	}
	public void setMerchantCustomsCode(String merchantCustomsCode) {
		this.merchantCustomsCode = merchantCustomsCode;
	}

	public String getMerchantCustomsName() {
		return this.merchantCustomsName;
	}
	public void setMerchantCustomsName(String merchantCustomsName) {
		this.merchantCustomsName = merchantCustomsName;
	}

	public String getMerchantId() {
		return this.merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
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

	public String getSubOutBizNo() {
		return this.subOutBizNo;
	}
	public void setSubOutBizNo(String subOutBizNo) {
		this.subOutBizNo = subOutBizNo;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}
