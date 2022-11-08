package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 蚂蚁保电商物流模型
 *
 * @author auto create
 * @since 1.0, 2022-10-27 10:56:15
 */
public class EcomLogisticsOrderDTO extends AlipayObject {

	private static final long serialVersionUID = 6647659242651486457L;

	/**
	 * 物流公司编码
	 */
	@ApiField("company_code")
	private String companyCode;

	/**
	 * 物流公司名称
	 */
	@ApiField("company_name")
	private String companyName;

	/**
	 * 发货时间
	 */
	@ApiField("consign_time")
	private Date consignTime;

	/**
	 * 结束时间
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 真实物流单号
	 */
	@ApiField("logistics_no")
	private String logisticsNo;

	/**
	 * 物流订单id
	 */
	@ApiField("logistics_order_id")
	private String logisticsOrderId;

	/**
	 * 物流状态
	 */
	@ApiField("logistics_status")
	private String logisticsStatus;

	/**
	 * 物流费用
	 */
	@ApiField("post_fee")
	private Long postFee;

	/**
	 * 收货地址
	 */
	@ApiField("recipient_address")
	private String recipientAddress;

	/**
	 * 收货地区
	 */
	@ApiField("recipient_area")
	private String recipientArea;

	/**
	 * 收货地区编码（国标）
	 */
	@ApiField("recipient_area_code")
	private String recipientAreaCode;

	/**
	 * 收货城市
	 */
	@ApiField("recipient_city")
	private String recipientCity;

	/**
	 * 收货人全名
	 */
	@ApiField("recipient_full_name")
	private String recipientFullName;

	/**
	 * 收货人移动电话
	 */
	@ApiField("recipient_mobile_phone")
	private String recipientMobilePhone;

	/**
	 * 收货人固定电话
	 */
	@ApiField("recipient_phone")
	private String recipientPhone;

	/**
	 * 收货省份
	 */
	@ApiField("recipient_prov")
	private String recipientProv;

	/**
	 * 收货镇、街道
	 */
	@ApiField("recipient_town")
	private String recipientTown;

	/**
	 * 是否拒签
	 */
	@ApiField("refusal")
	private Boolean refusal;

	/**
	 * 发货地址
	 */
	@ApiField("sender_address")
	private String senderAddress;

	/**
	 * 发货地区
	 */
	@ApiField("sender_area")
	private String senderArea;

	/**
	 * 发货地区编码（国标）
	 */
	@ApiField("sender_area_code")
	private String senderAreaCode;

	/**
	 * 发货城市
	 */
	@ApiField("sender_city")
	private String senderCity;

	/**
	 * 发货人全名
	 */
	@ApiField("sender_full_name")
	private String senderFullName;

	/**
	 * 发货人移动电话
	 */
	@ApiField("sender_mobile_phone")
	private String senderMobilePhone;

	/**
	 * 发货人固定电话
	 */
	@ApiField("sender_phone")
	private String senderPhone;

	/**
	 * 发货省份
	 */
	@ApiField("sender_prov")
	private String senderProv;

	/**
	 * 发货镇、街道
	 */
	@ApiField("sender_town")
	private String senderTown;

	public String getCompanyCode() {
		return this.companyCode;
	}
	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}

	public String getCompanyName() {
		return this.companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public Date getConsignTime() {
		return this.consignTime;
	}
	public void setConsignTime(Date consignTime) {
		this.consignTime = consignTime;
	}

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getLogisticsNo() {
		return this.logisticsNo;
	}
	public void setLogisticsNo(String logisticsNo) {
		this.logisticsNo = logisticsNo;
	}

	public String getLogisticsOrderId() {
		return this.logisticsOrderId;
	}
	public void setLogisticsOrderId(String logisticsOrderId) {
		this.logisticsOrderId = logisticsOrderId;
	}

	public String getLogisticsStatus() {
		return this.logisticsStatus;
	}
	public void setLogisticsStatus(String logisticsStatus) {
		this.logisticsStatus = logisticsStatus;
	}

	public Long getPostFee() {
		return this.postFee;
	}
	public void setPostFee(Long postFee) {
		this.postFee = postFee;
	}

	public String getRecipientAddress() {
		return this.recipientAddress;
	}
	public void setRecipientAddress(String recipientAddress) {
		this.recipientAddress = recipientAddress;
	}

	public String getRecipientArea() {
		return this.recipientArea;
	}
	public void setRecipientArea(String recipientArea) {
		this.recipientArea = recipientArea;
	}

	public String getRecipientAreaCode() {
		return this.recipientAreaCode;
	}
	public void setRecipientAreaCode(String recipientAreaCode) {
		this.recipientAreaCode = recipientAreaCode;
	}

	public String getRecipientCity() {
		return this.recipientCity;
	}
	public void setRecipientCity(String recipientCity) {
		this.recipientCity = recipientCity;
	}

	public String getRecipientFullName() {
		return this.recipientFullName;
	}
	public void setRecipientFullName(String recipientFullName) {
		this.recipientFullName = recipientFullName;
	}

	public String getRecipientMobilePhone() {
		return this.recipientMobilePhone;
	}
	public void setRecipientMobilePhone(String recipientMobilePhone) {
		this.recipientMobilePhone = recipientMobilePhone;
	}

	public String getRecipientPhone() {
		return this.recipientPhone;
	}
	public void setRecipientPhone(String recipientPhone) {
		this.recipientPhone = recipientPhone;
	}

	public String getRecipientProv() {
		return this.recipientProv;
	}
	public void setRecipientProv(String recipientProv) {
		this.recipientProv = recipientProv;
	}

	public String getRecipientTown() {
		return this.recipientTown;
	}
	public void setRecipientTown(String recipientTown) {
		this.recipientTown = recipientTown;
	}

	public Boolean getRefusal() {
		return this.refusal;
	}
	public void setRefusal(Boolean refusal) {
		this.refusal = refusal;
	}

	public String getSenderAddress() {
		return this.senderAddress;
	}
	public void setSenderAddress(String senderAddress) {
		this.senderAddress = senderAddress;
	}

	public String getSenderArea() {
		return this.senderArea;
	}
	public void setSenderArea(String senderArea) {
		this.senderArea = senderArea;
	}

	public String getSenderAreaCode() {
		return this.senderAreaCode;
	}
	public void setSenderAreaCode(String senderAreaCode) {
		this.senderAreaCode = senderAreaCode;
	}

	public String getSenderCity() {
		return this.senderCity;
	}
	public void setSenderCity(String senderCity) {
		this.senderCity = senderCity;
	}

	public String getSenderFullName() {
		return this.senderFullName;
	}
	public void setSenderFullName(String senderFullName) {
		this.senderFullName = senderFullName;
	}

	public String getSenderMobilePhone() {
		return this.senderMobilePhone;
	}
	public void setSenderMobilePhone(String senderMobilePhone) {
		this.senderMobilePhone = senderMobilePhone;
	}

	public String getSenderPhone() {
		return this.senderPhone;
	}
	public void setSenderPhone(String senderPhone) {
		this.senderPhone = senderPhone;
	}

	public String getSenderProv() {
		return this.senderProv;
	}
	public void setSenderProv(String senderProv) {
		this.senderProv = senderProv;
	}

	public String getSenderTown() {
		return this.senderTown;
	}
	public void setSenderTown(String senderTown) {
		this.senderTown = senderTown;
	}

}
