package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 问诊订单状态回流接口
 *
 * @author auto create
 * @since 1.0, 2025-07-16 16:28:43
 */
public class AlipayCommerceMedicalIndustrydataInquiryorderstatusSyncModel extends AlipayObject {

	private static final long serialVersionUID = 5542846595693596847L;

	/**
	 * 支付宝用户openId
	 */
	@ApiField("alipay_open_id")
	private String alipayOpenId;

	/**
	 * 问诊订单回流接口出参的order_id
	 */
	@ApiField("alipay_order_id")
	private String alipayOrderId;

	/**
	 * 支付宝用户uid
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 扩展信息
	 */
	@ApiField("ext_info")
	private PlatformInquiryOrderStatusExtInfo extInfo;

	/**
	 * 订单状态：
待支付：WAIT_PAY
已取消：CANCELED
待接诊：WAIT_INQUIRY
退款中：REFUNDING
已退款：REFUNDED
问诊中：IN_INQUIRY
退款申请中：REFUND_APPLYING
退款中：REFUNDING
已完成：FINISHED
用户申诉退款：USER_APPEAL_CANCELED
	 */
	@ApiField("merchant_order_status")
	private String merchantOrderStatus;

	/**
	 * 平台用户id
	 */
	@ApiField("merchant_user_id")
	private String merchantUserId;

	/**
	 * 外部问诊订单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 平台编码号
	 */
	@ApiField("platform_code")
	private String platformCode;

	public String getAlipayOpenId() {
		return this.alipayOpenId;
	}
	public void setAlipayOpenId(String alipayOpenId) {
		this.alipayOpenId = alipayOpenId;
	}

	public String getAlipayOrderId() {
		return this.alipayOrderId;
	}
	public void setAlipayOrderId(String alipayOrderId) {
		this.alipayOrderId = alipayOrderId;
	}

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

	public PlatformInquiryOrderStatusExtInfo getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(PlatformInquiryOrderStatusExtInfo extInfo) {
		this.extInfo = extInfo;
	}

	public String getMerchantOrderStatus() {
		return this.merchantOrderStatus;
	}
	public void setMerchantOrderStatus(String merchantOrderStatus) {
		this.merchantOrderStatus = merchantOrderStatus;
	}

	public String getMerchantUserId() {
		return this.merchantUserId;
	}
	public void setMerchantUserId(String merchantUserId) {
		this.merchantUserId = merchantUserId;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getPlatformCode() {
		return this.platformCode;
	}
	public void setPlatformCode(String platformCode) {
		this.platformCode = platformCode;
	}

}
