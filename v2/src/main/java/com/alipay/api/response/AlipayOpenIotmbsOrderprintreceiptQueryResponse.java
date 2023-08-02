package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.LightPosOrderSku;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.iotmbs.orderprintreceipt.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 09:56:51
 */
public class AlipayOpenIotmbsOrderprintreceiptQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2165149987518566138L;

	/** 
	 * 支付渠道
	 */
	@ApiField("pay_channel")
	private String payChannel;

	/** 
	 * 账单支付时间
	 */
	@ApiField("pay_time")
	private String payTime;

	/** 
	 * 这笔订单的收款金额
	 */
	@ApiField("price")
	private String price;

	/** 
	 * 真实付款金额，金额单位：元
	 */
	@ApiField("real_price")
	private String realPrice;

	/** 
	 * 订单的商品列表
	 */
	@ApiListField("sku_list")
	@ApiField("light_pos_order_sku")
	private List<LightPosOrderSku> skuList;

	/** 
	 * 订单的状态，标识是否支付成功
	 */
	@ApiField("status")
	private String status;

	public void setPayChannel(String payChannel) {
		this.payChannel = payChannel;
	}
	public String getPayChannel( ) {
		return this.payChannel;
	}

	public void setPayTime(String payTime) {
		this.payTime = payTime;
	}
	public String getPayTime( ) {
		return this.payTime;
	}

	public void setPrice(String price) {
		this.price = price;
	}
	public String getPrice( ) {
		return this.price;
	}

	public void setRealPrice(String realPrice) {
		this.realPrice = realPrice;
	}
	public String getRealPrice( ) {
		return this.realPrice;
	}

	public void setSkuList(List<LightPosOrderSku> skuList) {
		this.skuList = skuList;
	}
	public List<LightPosOrderSku> getSkuList( ) {
		return this.skuList;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
