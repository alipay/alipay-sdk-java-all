package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 撤销凭证核销状态
 *
 * @author auto create
 * @since 1.0, 2023-05-10 17:12:06
 */
public class AlipayMarketingCertificateCertificationRefundModel extends AlipayObject {

	private static final long serialVersionUID = 1115222889631716874L;

	/**
	 * 撤销核销时间。格式为：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("biz_dt")
	private Date bizDt;

	/**
	 * 已核销待冲正的三方码。取值为支付宝调用三方凭证发放spi时商户返回的三方码
	 */
	@ApiField("code")
	private String code;

	/**
	 * 凭证归属支付宝用户openId
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 购买商品的订单id。通过下单接口获取订单id
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 外部业务单号，用作幂等控制。 幂等作用： 参数不变的情况下，再次请求返回与上一次相同的结果。 外部接入方需保证业务单号唯一
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 凭证归属支付宝用户id
	 */
	@ApiField("user_id")
	private String userId;

	public Date getBizDt() {
		return this.bizDt;
	}
	public void setBizDt(Date bizDt) {
		this.bizDt = bizDt;
	}

	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
