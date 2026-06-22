package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 千问场景话费下单逻辑
 *
 * @author auto create
 * @since 1.0, 2026-03-16 10:27:44
 */
public class AlipayCommerceAcommunicationMcpPhoneCreateModel extends AlipayObject {

	private static final long serialVersionUID = 1711766248241957194L;

	/**
	 * 支付宝userId
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 需要充值的面额，单位是元。
	 */
	@ApiField("face")
	private String face;

	/**
	 * 话费最终价格，单位是元。
	 */
	@ApiField("final_price")
	private String finalPrice;

	/**
	 * 商品ID，从选品接口中拿到的商品ID
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 手机号格式
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 触发姓名验证后用户输入的姓名，可以是姓名尾字，可以是全名
	 */
	@ApiField("mobile_name")
	private String mobileName;

	/**
	 * 支付宝userId
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 商品价格，单位是元。
	 */
	@ApiField("price")
	private String price;

	/**
	 * 场景标识
	 */
	@ApiField("scene")
	private String scene;

	/**
	 * 触发风控校验后用户填入的短信验证码
	 */
	@ApiField("sms_code")
	private String smsCode;

	/**
	 * 商品来源（必须与询价结果中的source一致）
	 */
	@ApiField("source")
	private String source;

	/**
	 * 子来源标识
	 */
	@ApiField("sub_source")
	private String subSource;

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

	public String getFace() {
		return this.face;
	}
	public void setFace(String face) {
		this.face = face;
	}

	public String getFinalPrice() {
		return this.finalPrice;
	}
	public void setFinalPrice(String finalPrice) {
		this.finalPrice = finalPrice;
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

	public String getMobileName() {
		return this.mobileName;
	}
	public void setMobileName(String mobileName) {
		this.mobileName = mobileName;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
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

	public String getSmsCode() {
		return this.smsCode;
	}
	public void setSmsCode(String smsCode) {
		this.smsCode = smsCode;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public String getSubSource() {
		return this.subSource;
	}
	public void setSubSource(String subSource) {
		this.subSource = subSource;
	}

}
