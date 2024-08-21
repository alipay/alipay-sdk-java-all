package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 医疗免订阅订单消息发送接口
 *
 * @author auto create
 * @since 1.0, 2024-05-20 11:49:08
 */
public class AlipayCommerceMedicalNosubscribeOrdermsgSendModel extends AlipayObject {

	private static final long serialVersionUID = 8516659649443684787L;

	/**
	 * 支付宝openid
	 */
	@ApiField("alipay_open_id")
	private String alipayOpenId;

	/**
	 * 支付宝uid 2088开头的16位纯数字，小程序场景下获取用户ID请参考：用户授权; 其它场景下获取用户ID请参考：网页授权获取用户信息;
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 订单拓展信息
	 */
	@ApiField("ext_info")
	private MedicalNoSubscribeOrderMsgInfo extInfo;

	/**
	 * 订单状态
	 */
	@ApiField("merchant_order_status")
	private String merchantOrderStatus;

	/**
	 * 订单创建时间，时间格式为：yyyy-mm-dd hh:mm:ss
	 */
	@ApiField("order_create_time")
	private String orderCreateTime;

	/**
	 * 订单修改时间，时间格式为：yyyy-mm-dd hh:mm:ss
	 */
	@ApiField("order_modified_time")
	private String orderModifiedTime;

	/**
	 * 商户订单id，请保持唯一
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 外部订单类型
	 */
	@ApiField("out_biz_type")
	private String outBizType;

	/**
	 * 模板码，支付宝侧定义
	 */
	@ApiField("template_code")
	private String templateCode;

	/**
	 * 用户证件号
	 */
	@ApiField("user_card_no")
	private String userCardNo;

	/**
	 * 用户证件类型 目前仅支持身份证
	 */
	@ApiField("user_card_type")
	private String userCardType;

	public String getAlipayOpenId() {
		return this.alipayOpenId;
	}
	public void setAlipayOpenId(String alipayOpenId) {
		this.alipayOpenId = alipayOpenId;
	}

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

	public MedicalNoSubscribeOrderMsgInfo getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(MedicalNoSubscribeOrderMsgInfo extInfo) {
		this.extInfo = extInfo;
	}

	public String getMerchantOrderStatus() {
		return this.merchantOrderStatus;
	}
	public void setMerchantOrderStatus(String merchantOrderStatus) {
		this.merchantOrderStatus = merchantOrderStatus;
	}

	public String getOrderCreateTime() {
		return this.orderCreateTime;
	}
	public void setOrderCreateTime(String orderCreateTime) {
		this.orderCreateTime = orderCreateTime;
	}

	public String getOrderModifiedTime() {
		return this.orderModifiedTime;
	}
	public void setOrderModifiedTime(String orderModifiedTime) {
		this.orderModifiedTime = orderModifiedTime;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getOutBizType() {
		return this.outBizType;
	}
	public void setOutBizType(String outBizType) {
		this.outBizType = outBizType;
	}

	public String getTemplateCode() {
		return this.templateCode;
	}
	public void setTemplateCode(String templateCode) {
		this.templateCode = templateCode;
	}

	public String getUserCardNo() {
		return this.userCardNo;
	}
	public void setUserCardNo(String userCardNo) {
		this.userCardNo = userCardNo;
	}

	public String getUserCardType() {
		return this.userCardType;
	}
	public void setUserCardType(String userCardType) {
		this.userCardType = userCardType;
	}

}
