package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝会员阿里云权益物流同步
 *
 * @author auto create
 * @since 1.0, 2022-12-13 09:44:21
 */
public class AlipayUserAliyunbenefitLogisticsCreateModel extends AlipayObject {

	private static final long serialVersionUID = 6682515927935259597L;

	/**
	 * 物流公司编码
	 */
	@ApiField("company_code")
	private String companyCode;

	/**
	 * linkedmall 订单号
	 */
	@ApiField("lm_order_id")
	private Long lmOrderId;

	/**
	 * 物流状态，2 = 已发货 -> 等待买家确认收货 3 = 已收货 -> 交易成功
	 */
	@ApiField("logistics_status")
	private Long logisticsStatus;

	/**
	 * 物流单号
	 */
	@ApiField("mail_no")
	private String mailNo;

	/**
	 * 发货时间
	 */
	@ApiField("modified_time")
	private String modifiedTime;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 订单状态枚举
	 */
	@ApiField("order_status")
	private Long orderStatus;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getCompanyCode() {
		return this.companyCode;
	}
	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}

	public Long getLmOrderId() {
		return this.lmOrderId;
	}
	public void setLmOrderId(Long lmOrderId) {
		this.lmOrderId = lmOrderId;
	}

	public Long getLogisticsStatus() {
		return this.logisticsStatus;
	}
	public void setLogisticsStatus(Long logisticsStatus) {
		this.logisticsStatus = logisticsStatus;
	}

	public String getMailNo() {
		return this.mailNo;
	}
	public void setMailNo(String mailNo) {
		this.mailNo = mailNo;
	}

	public String getModifiedTime() {
		return this.modifiedTime;
	}
	public void setModifiedTime(String modifiedTime) {
		this.modifiedTime = modifiedTime;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public Long getOrderStatus() {
		return this.orderStatus;
	}
	public void setOrderStatus(Long orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
