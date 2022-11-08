package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 医疗机构医院订单上传接口
 *
 * @author auto create
 * @since 1.0, 2022-03-23 15:31:16
 */
public class AlipayCommerceMedicalHospitalorderUploadModel extends AlipayObject {

	private static final long serialVersionUID = 2862348272125348667L;

	/**
	 * 订单金额
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 订单扩展参数
	 */
	@ApiField("ext_info")
	private MedicalHospitalOrderUploadExtInfo extInfo;

	/**
	 * 状态
	 */
	@ApiField("merchant_order_status")
	private String merchantOrderStatus;

	/**
	 * 订单创建时间
	 */
	@ApiField("order_create_time")
	private String orderCreateTime;

	/**
	 * 订单修改时间
	 */
	@ApiField("order_modified_time")
	private String orderModifiedTime;

	/**
	 * 订单类型
	 */
	@ApiField("order_type")
	private String orderType;

	/**
	 * 商户订单id
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 外部订单类型
HOSPITAL_APPOINTMENT - 挂号单
HOSPITAL_CHECK - 检查单
HOSPITAL_MEDICINE - 医药单
HOSPITAL_PAYMENT - 支付单
	 */
	@ApiField("out_biz_type")
	private String outBizType;

	/**
	 * 平台商ID
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 支付金额
	 */
	@ApiField("pay_amount")
	private String payAmount;

	/**
	 * 小程序id
	 */
	@ApiField("tiny_app_id")
	private String tinyAppId;

	/**
	 * 支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public MedicalHospitalOrderUploadExtInfo getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(MedicalHospitalOrderUploadExtInfo extInfo) {
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

	public String getOrderType() {
		return this.orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
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

	public String getPartnerId() {
		return this.partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	public String getPayAmount() {
		return this.payAmount;
	}
	public void setPayAmount(String payAmount) {
		this.payAmount = payAmount;
	}

	public String getTinyAppId() {
		return this.tinyAppId;
	}
	public void setTinyAppId(String tinyAppId) {
		this.tinyAppId = tinyAppId;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}
