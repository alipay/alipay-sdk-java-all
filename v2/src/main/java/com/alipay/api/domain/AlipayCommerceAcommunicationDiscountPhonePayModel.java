package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 充值话费下单并支付
 *
 * @author auto create
 * @since 1.0, 2024-06-13 09:55:50
 */
public class AlipayCommerceAcommunicationDiscountPhonePayModel extends AlipayObject {

	private static final long serialVersionUID = 4314298386174284337L;

	/**
	 * 下单用户的Ip
	 */
	@ApiField("client_ip")
	private String clientIp;

	/**
	 * 用户进行充值所选择的面额
	 */
	@ApiField("face")
	private String face;

	/**
	 * 支付宝侧的商品ID
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 手机号
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 商家端自己的订单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 商品的价格(元)
	 */
	@ApiField("price")
	private String price;

	/**
	 * 支付宝侧分配场景码，用于风控限制和商品查询
	 */
	@ApiField("scene")
	private String scene;

	/**
	 * 商家端的下单来源，非必填
	 */
	@ApiField("sub_source")
	private String subSource;

	public String getClientIp() {
		return this.clientIp;
	}
	public void setClientIp(String clientIp) {
		this.clientIp = clientIp;
	}

	public String getFace() {
		return this.face;
	}
	public void setFace(String face) {
		this.face = face;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getMobile() {
		return this.mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
	}

	public String getSubSource() {
		return this.subSource;
	}
	public void setSubSource(String subSource) {
		this.subSource = subSource;
	}

}
