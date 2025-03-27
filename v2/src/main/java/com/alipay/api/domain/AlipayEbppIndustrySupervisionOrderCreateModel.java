package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 资金监管订单下单接口
 *
 * @author auto create
 * @since 1.0, 2024-12-23 19:36:58
 */
public class AlipayEbppIndustrySupervisionOrderCreateModel extends AlipayObject {

	private static final long serialVersionUID = 4566435925667324893L;

	/**
	 * 支付宝2088
	 */
	@ApiField("alipay_uid")
	private String alipayUid;

	/**
	 * 订单金额整数，单位分。
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 冻资订单所需用户签署协议列表
	 */
	@ApiListField("authorization_list")
	@ApiField("string")
	private List<String> authorizationList;

	/**
	 * 业务场景
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 币种
	 */
	@ApiField("currency")
	private String currency;

	/**
	 * 支付宝openId
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 小程序或者h5地址，用于从支付宝冻资单跳转三方订单页面
	 */
	@ApiField("order_detail_url")
	private String orderDetailUrl;

	/**
	 * xxx-xxx冻资单
	 */
	@ApiField("order_title")
	private String orderTitle;

	/**
	 * 外部商户订单
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	public String getAlipayUid() {
		return this.alipayUid;
	}
	public void setAlipayUid(String alipayUid) {
		this.alipayUid = alipayUid;
	}

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public List<String> getAuthorizationList() {
		return this.authorizationList;
	}
	public void setAuthorizationList(List<String> authorizationList) {
		this.authorizationList = authorizationList;
	}

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getCurrency() {
		return this.currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOrderDetailUrl() {
		return this.orderDetailUrl;
	}
	public void setOrderDetailUrl(String orderDetailUrl) {
		this.orderDetailUrl = orderDetailUrl;
	}

	public String getOrderTitle() {
		return this.orderTitle;
	}
	public void setOrderTitle(String orderTitle) {
		this.orderTitle = orderTitle;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

}
