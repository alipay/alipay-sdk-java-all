package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 医疗商业化会员权益冻结解冻接口
 *
 * @author auto create
 * @since 1.0, 2025-06-09 14:43:07
 */
public class AlipayCommerceMedicalCommercialMemberFreezeModel extends AlipayObject {

	private static final long serialVersionUID = 1563663337134972863L;

	/**
	 * 需要操作的权益资产列表
	 */
	@ApiListField("benefit_id_list")
	@ApiField("string")
	private List<String> benefitIdList;

	/**
	 * 权益订单id，支付宝侧用户对商户某一权益的唯一订单子单id。该订单记录了用户的核销次数与总次数，以及订单状态。
	 */
	@ApiField("benefit_order_id")
	private String benefitOrderId;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 外部订单号，用作幂等
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 外部产品id列表
	 */
	@ApiField("out_product_id")
	private String outProductId;

	/**
	 * MEDICAL_DRUG - 医药商品
MEDICAL_EXAMINATION - 体检商品
MEDICAL_COSMETOLOGY - 医美商品
MEDICAL_MOUTH - 口腔商品
	 */
	@ApiField("product_type")
	private String productType;

	/**
	 * ORCAS_SAAS - 虎鲸购药
	 */
	@ApiField("source_channel")
	private String sourceChannel;

	/**
	 * 【会员资格】
F：冻结
P：解冻
S：核销
	 */
	@ApiField("type")
	private String type;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public List<String> getBenefitIdList() {
		return this.benefitIdList;
	}
	public void setBenefitIdList(List<String> benefitIdList) {
		this.benefitIdList = benefitIdList;
	}

	public String getBenefitOrderId() {
		return this.benefitOrderId;
	}
	public void setBenefitOrderId(String benefitOrderId) {
		this.benefitOrderId = benefitOrderId;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getOutProductId() {
		return this.outProductId;
	}
	public void setOutProductId(String outProductId) {
		this.outProductId = outProductId;
	}

	public String getProductType() {
		return this.productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getSourceChannel() {
		return this.sourceChannel;
	}
	public void setSourceChannel(String sourceChannel) {
		this.sourceChannel = sourceChannel;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
