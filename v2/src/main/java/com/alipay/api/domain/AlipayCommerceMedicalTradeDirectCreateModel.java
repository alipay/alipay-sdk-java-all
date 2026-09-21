package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 医疗移动支付场景创单
 *
 * @author auto create
 * @since 1.0, 2026-09-15 16:38:23
 */
public class AlipayCommerceMedicalTradeDirectCreateModel extends AlipayObject {

	private static final long serialVersionUID = 1199516899837513584L;

	/**
	 * 蚂蚁健康用户的openId
	 */
	@ApiField("aq_open_id")
	private String aqOpenId;

	/**
	 * 支付成功回跳地址
	 */
	@ApiField("call_back_url")
	private String callBackUrl;

	/**
	 * 渠道业务场景
	 */
	@ApiField("ch_info")
	private String chInfo;

	/**
	 * 业务使用的支付产品，需要联系支付宝业务人员获取
	 */
	@ApiField("channel_code")
	private String channelCode;

	/**
	 * 发起创单时间
	 */
	@ApiField("gmt_out_create")
	private Date gmtOutCreate;

	/**
	 * 订单超时时间
	 */
	@ApiField("gmt_time_expire")
	private Date gmtTimeExpire;

	/**
	 * 支付宝用户openId和蚂蚁健康openId不能都为空
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 订单类型
	 */
	@ApiField("order_type")
	private String orderType;

	/**
	 * 外部交易单号
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/**
	 * 场景信息
	 */
	@ApiField("scene_info")
	private String sceneInfo;

	/**
	 * 服务类型
	 */
	@ApiField("service_type")
	private String serviceType;

	/**
	 * 直付通场景传入的二级商户信息
	 */
	@ApiField("sub_merchant")
	private SubMerchantInfo subMerchant;

	/**
	 * 服务类型下的字类型
	 */
	@ApiField("sub_service_type")
	private String subServiceType;

	/**
	 * 订单总标题
	 */
	@ApiField("subject")
	private String subject;

	/**
	 * 订单总金额，单位是元
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/**
	 * 支付宝用户Id
	 */
	@ApiField("user_id")
	private String userId;

	public String getAqOpenId() {
		return this.aqOpenId;
	}
	public void setAqOpenId(String aqOpenId) {
		this.aqOpenId = aqOpenId;
	}

	public String getCallBackUrl() {
		return this.callBackUrl;
	}
	public void setCallBackUrl(String callBackUrl) {
		this.callBackUrl = callBackUrl;
	}

	public String getChInfo() {
		return this.chInfo;
	}
	public void setChInfo(String chInfo) {
		this.chInfo = chInfo;
	}

	public String getChannelCode() {
		return this.channelCode;
	}
	public void setChannelCode(String channelCode) {
		this.channelCode = channelCode;
	}

	public Date getGmtOutCreate() {
		return this.gmtOutCreate;
	}
	public void setGmtOutCreate(Date gmtOutCreate) {
		this.gmtOutCreate = gmtOutCreate;
	}

	public Date getGmtTimeExpire() {
		return this.gmtTimeExpire;
	}
	public void setGmtTimeExpire(Date gmtTimeExpire) {
		this.gmtTimeExpire = gmtTimeExpire;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOrderType() {
		return this.orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public String getOutTradeNo() {
		return this.outTradeNo;
	}
	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}

	public String getSceneInfo() {
		return this.sceneInfo;
	}
	public void setSceneInfo(String sceneInfo) {
		this.sceneInfo = sceneInfo;
	}

	public String getServiceType() {
		return this.serviceType;
	}
	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

	public SubMerchantInfo getSubMerchant() {
		return this.subMerchant;
	}
	public void setSubMerchant(SubMerchantInfo subMerchant) {
		this.subMerchant = subMerchant;
	}

	public String getSubServiceType() {
		return this.subServiceType;
	}
	public void setSubServiceType(String subServiceType) {
		this.subServiceType = subServiceType;
	}

	public String getSubject() {
		return this.subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getTotalAmount() {
		return this.totalAmount;
	}
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
