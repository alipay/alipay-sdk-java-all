package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * AICO数字人捐瓦服务创建接口
 *
 * @author auto create
 * @since 1.0, 2024-12-25 22:02:53
 */
public class AnttechAiDonationServiceCreateModel extends AlipayObject {

	private static final long serialVersionUID = 8287458385193329972L;

	/**
	 * 业务回执字段，服务不做处理，透传回给调用方做相关业务逻辑处理。
	 */
	@ApiField("biz_receipt")
	private String bizReceipt;

	/**
	 * 用户输入：的祝福内容，最大不超过128位，需要做内容安全检测
	 */
	@ApiField("bless_content")
	private String blessContent;

	/**
	 * 一体机设备的ID，全局唯一
	 */
	@ApiField("device_id")
	private String deviceId;

	/**
	 * 捐献金额，单位是元，保留两位小数
	 */
	@ApiField("donation_amount")
	private String donationAmount;

	/**
	 * 捐献成功的支付日期
	 */
	@ApiField("donation_date")
	private Date donationDate;

	/**
	 * 捐献数量，用来显示在首页轮播列表的角标值
	 */
	@ApiField("donation_number")
	private Long donationNumber;

	/**
	 * 捐献类型 DONATION 捐献;TILE_DONATION 捐瓦
	 */
	@ApiField("donation_type")
	private String donationType;

	/**
	 * 用户输入：捐赠者的姓名，最大不超过128位，需要做内容安全检测
	 */
	@ApiField("donor_name")
	private String donorName;

	/**
	 * 外部客户ID，客户的唯一标识
	 */
	@ApiField("external_client_id")
	private String externalClientId;

	/**
	 * 调用方传入数据的唯一请求Id,用来幂等处理
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 终端一体机显示标识：true 表示会在终端一体机上显示礼成和首页轮播效果，false则表示不会在终端一体机上显示任何效果
	 */
	@ApiField("terminal_display")
	private Boolean terminalDisplay;

	public String getBizReceipt() {
		return this.bizReceipt;
	}
	public void setBizReceipt(String bizReceipt) {
		this.bizReceipt = bizReceipt;
	}

	public String getBlessContent() {
		return this.blessContent;
	}
	public void setBlessContent(String blessContent) {
		this.blessContent = blessContent;
	}

	public String getDeviceId() {
		return this.deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getDonationAmount() {
		return this.donationAmount;
	}
	public void setDonationAmount(String donationAmount) {
		this.donationAmount = donationAmount;
	}

	public Date getDonationDate() {
		return this.donationDate;
	}
	public void setDonationDate(Date donationDate) {
		this.donationDate = donationDate;
	}

	public Long getDonationNumber() {
		return this.donationNumber;
	}
	public void setDonationNumber(Long donationNumber) {
		this.donationNumber = donationNumber;
	}

	public String getDonationType() {
		return this.donationType;
	}
	public void setDonationType(String donationType) {
		this.donationType = donationType;
	}

	public String getDonorName() {
		return this.donorName;
	}
	public void setDonorName(String donorName) {
		this.donorName = donorName;
	}

	public String getExternalClientId() {
		return this.externalClientId;
	}
	public void setExternalClientId(String externalClientId) {
		this.externalClientId = externalClientId;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getTerminalDisplay() {
		return this.terminalDisplay;
	}
	public void setTerminalDisplay(Boolean terminalDisplay) {
		this.terminalDisplay = terminalDisplay;
	}

}
