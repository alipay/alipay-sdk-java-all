package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商品列表中有对应的环保类型时，需要返回
 *
 * @author auto create
 * @since 1.0, 2024-08-15 17:06:18
 */
public class EnvironmentInfo extends AlipayObject {

	private static final long serialVersionUID = 3591857651446451781L;

	/**
	 * 对应商品有环保类型时，需要返回;一个商品可能有多个环保类型
	 */
	@ApiListField("environmental_list")
	@ApiField("environmental")
	private List<Environmental> environmentalList;

	/**
	 * 订单回传商品维度失败字典值对应数值：ACTIVITY_NOT_EXISTS、OVER_ACTIVITY_LIMITATION
	 */
	@ApiField("failure_code")
	private String failureCode;

	/**
	 * 订单回传商品维度失败错误原因：活动不存在或已过期、超过活动库存限制
	 */
	@ApiField("failure_reason")
	private String failureReason;

	/**
	 * 商品码，根据入参时的商品码进行返回; (其中临期商品一笔订单只返回一个环保类型对应其中一个商品）
	 */
	@ApiField("goods_id")
	private String goodsId;

	/**
	 * 外部商户订单号，out_biz_no唯一对应一笔订单。
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 订单所对应的支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public List<Environmental> getEnvironmentalList() {
		return this.environmentalList;
	}
	public void setEnvironmentalList(List<Environmental> environmentalList) {
		this.environmentalList = environmentalList;
	}

	public String getFailureCode() {
		return this.failureCode;
	}
	public void setFailureCode(String failureCode) {
		this.failureCode = failureCode;
	}

	public String getFailureReason() {
		return this.failureReason;
	}
	public void setFailureReason(String failureReason) {
		this.failureReason = failureReason;
	}

	public String getGoodsId() {
		return this.goodsId;
	}
	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}
