package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 租赁订单操作申请确认
 *
 * @author auto create
 * @since 1.0, 2025-08-22 13:47:48
 */
public class AlipayCommerceRentOrderAftersaleConfirmModel extends AlipayObject {

	private static final long serialVersionUID = 8361582682437457267L;

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
	 * 售后单号
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
	 * 赔付支付参数信息
	 */
	@ApiField("compensation_info")
	private AftersaleCompensationInfoVO compensationInfo;

	/**
	 * 操作类型
	 */
	@ApiField("operation_type")
	private String operationType;

	/**
	 * 商户售后单号，要保证唯一性
	 */
	@ApiField("out_aftersale_id")
	private String outAftersaleId;

	/**
	 * 支付金额，单位：元，精确到小数点后两位。
注意事项
	 */
	@ApiField("pay_amount")
	private String payAmount;

	/**
	 * 订单费用项明细列表
	 */
	@ApiListField("pay_items")
	@ApiField("aftersale_pay_item_v_o")
	private List<AftersalePayItemVO> payItems;

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

	public AftersaleCompensationInfoVO getCompensationInfo() {
		return this.compensationInfo;
	}
	public void setCompensationInfo(AftersaleCompensationInfoVO compensationInfo) {
		this.compensationInfo = compensationInfo;
	}

	public String getOperationType() {
		return this.operationType;
	}
	public void setOperationType(String operationType) {
		this.operationType = operationType;
	}

	public String getOutAftersaleId() {
		return this.outAftersaleId;
	}
	public void setOutAftersaleId(String outAftersaleId) {
		this.outAftersaleId = outAftersaleId;
	}

	public String getPayAmount() {
		return this.payAmount;
	}
	public void setPayAmount(String payAmount) {
		this.payAmount = payAmount;
	}

	public List<AftersalePayItemVO> getPayItems() {
		return this.payItems;
	}
	public void setPayItems(List<AftersalePayItemVO> payItems) {
		this.payItems = payItems;
	}

	public String getReasonCode() {
		return this.reasonCode;
	}
	public void setReasonCode(String reasonCode) {
		this.reasonCode = reasonCode;
	}

}
