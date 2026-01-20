package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 物流快递查询
 *
 * @author auto create
 * @since 1.0, 2025-12-23 13:47:41
 */
public class AlipayCommerceLogisticsExpressOrderQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4397977619259866314L;

	/**
	 * 该包裹的收件人手机后四位尾号
	 */
	@ApiField("check_phone_no")
	private String checkPhoneNo;

	/**
	 * 时间格式字符串，卡片过期时间,默认为当前时间延后5分钟
	 */
	@ApiField("expire_time")
	private String expireTime;

	/**
	 * 实际的物流公司编号
	 */
	@ApiField("logistics_code")
	private String logisticsCode;

	/**
	 * 用户唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 用户唯一标识
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 实际的物流运单号
	 */
	@ApiField("waybill_no")
	private String waybillNo;

	public String getCheckPhoneNo() {
		return this.checkPhoneNo;
	}
	public void setCheckPhoneNo(String checkPhoneNo) {
		this.checkPhoneNo = checkPhoneNo;
	}

	public String getExpireTime() {
		return this.expireTime;
	}
	public void setExpireTime(String expireTime) {
		this.expireTime = expireTime;
	}

	public String getLogisticsCode() {
		return this.logisticsCode;
	}
	public void setLogisticsCode(String logisticsCode) {
		this.logisticsCode = logisticsCode;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getWaybillNo() {
		return this.waybillNo;
	}
	public void setWaybillNo(String waybillNo) {
		this.waybillNo = waybillNo;
	}

}
