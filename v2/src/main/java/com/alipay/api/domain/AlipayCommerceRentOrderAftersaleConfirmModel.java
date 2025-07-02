package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 租赁订单操作申请确认
 *
 * @author auto create
 * @since 1.0, 2025-06-09 16:51:38
 */
public class AlipayCommerceRentOrderAftersaleConfirmModel extends AlipayObject {

	private static final long serialVersionUID = 2311358958489436145L;

	/**
	 * 补充描述
	 */
	@ApiField("additional_description")
	private String additionalDescription;

	/**
	 * 补充材料
	 */
	@ApiListField("additional_media_list")
	@ApiField("aftersale_media_info_v_o")
	private List<AftersaleMediaInfoVO> additionalMediaList;

	/**
	 * 售后单号，可从售后通知消息（alipay.commerce.rent.order.aftersale.notify）中获取
	 */
	@ApiField("aftersale_id")
	private String aftersaleId;

	/**
	 * 买家支付宝用户id
	 */
	@ApiField("buyer_id")
	private String buyerId;

	/**
	 * 买家支付宝openid
	 */
	@ApiField("buyer_open_id")
	private String buyerOpenId;

	/**
	 * 操作类型
	 */
	@ApiField("operation_type")
	private String operationType;

	/**
	 * 操作原因类型
	 */
	@ApiField("reason_code")
	private String reasonCode;

	public String getAdditionalDescription() {
		return this.additionalDescription;
	}
	public void setAdditionalDescription(String additionalDescription) {
		this.additionalDescription = additionalDescription;
	}

	public List<AftersaleMediaInfoVO> getAdditionalMediaList() {
		return this.additionalMediaList;
	}
	public void setAdditionalMediaList(List<AftersaleMediaInfoVO> additionalMediaList) {
		this.additionalMediaList = additionalMediaList;
	}

	public String getAftersaleId() {
		return this.aftersaleId;
	}
	public void setAftersaleId(String aftersaleId) {
		this.aftersaleId = aftersaleId;
	}

	public String getBuyerId() {
		return this.buyerId;
	}
	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}

	public String getBuyerOpenId() {
		return this.buyerOpenId;
	}
	public void setBuyerOpenId(String buyerOpenId) {
		this.buyerOpenId = buyerOpenId;
	}

	public String getOperationType() {
		return this.operationType;
	}
	public void setOperationType(String operationType) {
		this.operationType = operationType;
	}

	public String getReasonCode() {
		return this.reasonCode;
	}
	public void setReasonCode(String reasonCode) {
		this.reasonCode = reasonCode;
	}

}
