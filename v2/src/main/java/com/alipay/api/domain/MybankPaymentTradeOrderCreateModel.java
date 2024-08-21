package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 网商银行全渠道收单业务订单创建
 *
 * @author auto create
 * @since 1.0, 2019-01-10 19:22:21
 */
public class MybankPaymentTradeOrderCreateModel extends AlipayObject {

	private static final long serialVersionUID = 4597389975189468726L;

	/**
	 * 币种值
	 */
	@ApiField("currency_code")
	private String currencyCode;

	/**
	 * 业务事件码
	 */
	@ApiField("ev_code")
	private String evCode;

	/**
	 * 商品信息
	 */
	@ApiListField("goods_info")
	@ApiField("bk_pos_goods_info")
	private List<BkPosGoodsInfo> goodsInfo;

	/**
	 * 外部商户业务订单号
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/**
	 * 网商合作伙伴ID
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 支付时间，格式"yyyy-MM-dd HH:mm:ss"
	 */
	@ApiField("pay_date")
	private String payDate;

	/**
	 * 支付类型。pay:支付；refund:退款
	 */
	@ApiField("pay_type")
	private String payType;

	/**
	 * 业务产品码
	 */
	@ApiField("pd_code")
	private String pdCode;

	/**
	 * 对账关联ID，用以对账时关联网商与对账方订单的唯一ID。(支付单号、支付流水等能够串联两边订单的唯一ID均可作为对账关联ID)
	 */
	@ApiField("recon_related_no")
	private String reconRelatedNo;

	/**
	 * 交易备注
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * 卖家终端ID
	 */
	@ApiField("seller_id")
	private String sellerId;

	/**
	 * 订单总金额，单位为分，取值范围[1,100000000]
	 */
	@ApiField("total_amount")
	private String totalAmount;

	public String getCurrencyCode() {
		return this.currencyCode;
	}
	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	public String getEvCode() {
		return this.evCode;
	}
	public void setEvCode(String evCode) {
		this.evCode = evCode;
	}

	public List<BkPosGoodsInfo> getGoodsInfo() {
		return this.goodsInfo;
	}
	public void setGoodsInfo(List<BkPosGoodsInfo> goodsInfo) {
		this.goodsInfo = goodsInfo;
	}

	public String getOutTradeNo() {
		return this.outTradeNo;
	}
	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}

	public String getPartnerId() {
		return this.partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	public String getPayDate() {
		return this.payDate;
	}
	public void setPayDate(String payDate) {
		this.payDate = payDate;
	}

	public String getPayType() {
		return this.payType;
	}
	public void setPayType(String payType) {
		this.payType = payType;
	}

	public String getPdCode() {
		return this.pdCode;
	}
	public void setPdCode(String pdCode) {
		this.pdCode = pdCode;
	}

	public String getReconRelatedNo() {
		return this.reconRelatedNo;
	}
	public void setReconRelatedNo(String reconRelatedNo) {
		this.reconRelatedNo = reconRelatedNo;
	}

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getSellerId() {
		return this.sellerId;
	}
	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}

	public String getTotalAmount() {
		return this.totalAmount;
	}
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

}
