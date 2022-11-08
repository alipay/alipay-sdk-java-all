package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝虎年福气商店回退接口
 *
 * @author auto create
 * @since 1.0, 2021-12-10 15:55:33
 */
public class AlipayUserWufufukaAliyunRefundModel extends AlipayObject {

	private static final long serialVersionUID = 6326843159338266227L;

	/**
	 * 支付宝订单id+支付宝唯一+识别支付宝订单+否+支付宝url传递
	 */
	@ApiField("alipay_order_id")
	private String alipayOrderId;

	/**
	 * 扩展信息+不唯一+扩展性，传递额外信息+如有则传递
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 阿里云请求id+唯一+支付宝需感知并持久化+无+阿里云生成
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 请求时间+不唯一+无枚举+阿里云系统时间
	 */
	@ApiField("request_time")
	private String requestTime;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getAlipayOrderId() {
		return this.alipayOrderId;
	}
	public void setAlipayOrderId(String alipayOrderId) {
		this.alipayOrderId = alipayOrderId;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getRequestTime() {
		return this.requestTime;
	}
	public void setRequestTime(String requestTime) {
		this.requestTime = requestTime;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
