package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 渠道权益卡服务取消
 *
 * @author auto create
 * @since 1.0, 2026-08-04 11:22:25
 */
public class AlipayCommerceMedicalInsuranceFulfillmenttransitCancelModel extends AlipayObject {

	private static final long serialVersionUID = 8761871958167446142L;

	/**
	 * 渠道
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 卡号
	 */
	@ApiField("out_unique_biz_no")
	private String outUniqueBizNo;

	/**
	 * 产品编号
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 产品名称
	 */
	@ApiField("product_name")
	private String productName;

	/**
	 * 支付宝用户id
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 服务取消时间
	 */
	@ApiField("valid_cancel_time")
	private Date validCancelTime;

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOutUniqueBizNo() {
		return this.outUniqueBizNo;
	}
	public void setOutUniqueBizNo(String outUniqueBizNo) {
		this.outUniqueBizNo = outUniqueBizNo;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProductName() {
		return this.productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Date getValidCancelTime() {
		return this.validCancelTime;
	}
	public void setValidCancelTime(Date validCancelTime) {
		this.validCancelTime = validCancelTime;
	}

}
