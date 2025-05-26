package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 券明细
 *
 * @author auto create
 * @since 1.0, 2023-07-25 14:50:33
 */
public class VoucherDetailInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 6226364158744261529L;

	/**
	 * 优惠券金额，单位：元，精确到小数点后两位。
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 券id
	 */
	@ApiField("id")
	private String id;

	/**
	 * 备注信息
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 商户出资，单位为元,精确到小数点后两位
	 */
	@ApiField("merchant_contribute")
	private String merchantContribute;

	/**
	 * 券名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 其他出资，非交易商家，单位为元
	 */
	@ApiField("other_contribute")
	private String otherContribute;

	/**
	 * 其他出资方明细
	 */
	@ApiListField("other_contribute_detail")
	@ApiField("contribute_detail_info")
	private List<ContributeDetailInfo> otherContributeDetail;

	/**
	 * 购买该张券时内部出资的部分（包含支付宝/口碑出资的部分），单位：元，精确到小数点后两位
	 */
	@ApiField("purchase_ant_contribute")
	private String purchaseAntContribute;

	/**
	 * 购买该张券的资金中买家自己出资的部分，单位：元，精确到小数点后两位
	 */
	@ApiField("purchase_buyer_contribute")
	private String purchaseBuyerContribute;

	/**
	 * 购买该张券的资金中商户出资的部分，单位：元，精确到小数点后两位
	 */
	@ApiField("purchase_merchant_contribute")
	private String purchaseMerchantContribute;

	/**
	 * 券模板id
	 */
	@ApiField("template_id")
	private String templateId;

	/**
	 * 券类型
	 */
	@ApiField("type")
	private String type;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getMerchantContribute() {
		return this.merchantContribute;
	}
	public void setMerchantContribute(String merchantContribute) {
		this.merchantContribute = merchantContribute;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getOtherContribute() {
		return this.otherContribute;
	}
	public void setOtherContribute(String otherContribute) {
		this.otherContribute = otherContribute;
	}

	public List<ContributeDetailInfo> getOtherContributeDetail() {
		return this.otherContributeDetail;
	}
	public void setOtherContributeDetail(List<ContributeDetailInfo> otherContributeDetail) {
		this.otherContributeDetail = otherContributeDetail;
	}

	public String getPurchaseAntContribute() {
		return this.purchaseAntContribute;
	}
	public void setPurchaseAntContribute(String purchaseAntContribute) {
		this.purchaseAntContribute = purchaseAntContribute;
	}

	public String getPurchaseBuyerContribute() {
		return this.purchaseBuyerContribute;
	}
	public void setPurchaseBuyerContribute(String purchaseBuyerContribute) {
		this.purchaseBuyerContribute = purchaseBuyerContribute;
	}

	public String getPurchaseMerchantContribute() {
		return this.purchaseMerchantContribute;
	}
	public void setPurchaseMerchantContribute(String purchaseMerchantContribute) {
		this.purchaseMerchantContribute = purchaseMerchantContribute;
	}

	public String getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
