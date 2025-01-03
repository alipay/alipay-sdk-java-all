package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 泛娱乐行业会员卡删除
 *
 * @author auto create
 * @since 1.0, 2024-06-14 10:42:57
 */
public class AlipayCommerceEntertainmentCardDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 2682887594332544769L;

	/**
	 * 业务变更时间。毫秒级时间戳，serial_number+biz_date为请求幂等键，biz_date小于等于serial_number对应会员卡在数据库的最新变更时间则请求幂等。
	 */
	@ApiField("biz_date")
	private String bizDate;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 会员卡编号，用户维度下该值唯一。
	 */
	@ApiField("serial_number")
	private String serialNumber;

	/**
	 * 定向开放业务，请联系支付宝业务BD获取对接业务的卡模板编号。
	 */
	@ApiField("template_code")
	private String templateCode;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getBizDate() {
		return this.bizDate;
	}
	public void setBizDate(String bizDate) {
		this.bizDate = bizDate;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getSerialNumber() {
		return this.serialNumber;
	}
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getTemplateCode() {
		return this.templateCode;
	}
	public void setTemplateCode(String templateCode) {
		this.templateCode = templateCode;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
