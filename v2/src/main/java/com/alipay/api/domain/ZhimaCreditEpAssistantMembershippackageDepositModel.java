package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企信助手会员充值权益
 *
 * @author auto create
 * @since 1.0, 2026-04-02 11:52:45
 */
public class ZhimaCreditEpAssistantMembershippackageDepositModel extends AlipayObject {

	private static final long serialVersionUID = 5243685433542733235L;

	/**
	 * 充值的权益sku编码，一个sku可以包含不同权益项和权益数，假设本次权益包含3000次拓客解锁数，购买一个sku相当于购买了3000次拓客解锁数
	 */
	@ApiField("benefit_sku_code")
	private String benefitSkuCode;

	/**
	 * 购买的打包后的权益包的数量值
	 */
	@ApiField("benefit_sku_quantity")
	private Long benefitSkuQuantity;

	/**
	 * 订单编号，是指伙伴的正式向企信提交订单后，拿到的一个唯一的不重复订单号，届时伙伴的财务同学打款时需要附上该订单号，方便做资金流和订单的匹配
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 外部业务ID,在调用本接口中需要保证唯一
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 创建会员包返回的会员包编码
	 */
	@ApiField("package_id")
	private String packageId;

	public String getBenefitSkuCode() {
		return this.benefitSkuCode;
	}
	public void setBenefitSkuCode(String benefitSkuCode) {
		this.benefitSkuCode = benefitSkuCode;
	}

	public Long getBenefitSkuQuantity() {
		return this.benefitSkuQuantity;
	}
	public void setBenefitSkuQuantity(Long benefitSkuQuantity) {
		this.benefitSkuQuantity = benefitSkuQuantity;
	}

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getPackageId() {
		return this.packageId;
	}
	public void setPackageId(String packageId) {
		this.packageId = packageId;
	}

}
