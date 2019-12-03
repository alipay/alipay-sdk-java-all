package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 统一收单交易直接支付接口
 *
 * @author auto create
 * @since 1.0, 2018-07-09 23:01:19
 */
public class AlipayTradeOrderPayModel extends AlipayObject {

	private static final long serialVersionUID = 1333768512872142669L;

	/**
	 * 买家的支付宝用户id

注：
1.用于校验与已存交易中的买家是否相等
	 */
	@ApiField("buyer_id")
	private String buyerId;

	/**
	 * 买家支付明细

目前支持的支付渠道为：
- offline_pos：本次买家使用的是pos刷卡支付

注：
各支付工具金额总和=订单总金额
	 */
	@ApiListField("buyer_pay_detail")
	@ApiField("buyer_pay_detail")
	private List<BuyerPayDetail> buyerPayDetail;

	/**
	 * 销售产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 订单总金额，单位为元，精确到小数点后两位，取值范围[0.01,100000000]

注：
1.用于校验与已存交易中的金额是否相等
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/**
	 * 支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public String getBuyerId() {
		return this.buyerId;
	}
	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}

	public List<BuyerPayDetail> getBuyerPayDetail() {
		return this.buyerPayDetail;
	}
	public void setBuyerPayDetail(List<BuyerPayDetail> buyerPayDetail) {
		this.buyerPayDetail = buyerPayDetail;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getTotalAmount() {
		return this.totalAmount;
	}
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}
