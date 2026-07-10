package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企信助手会员包创建
 *
 * @author auto create
 * @since 1.0, 2026-06-23 09:57:56
 */
public class ZhimaCreditEpAssistantMembershippackageCreateModel extends AlipayObject {

	private static final long serialVersionUID = 6338135113467352782L;

	/**
	 * 权益包指定生效时间非必填，默认不要填写，只有需要权益包不立即生效，在后续指定时间点生效的场景下需要传入。如果传入时间早于当前时间，则以当前时间进行生效。且指定的生效时间不得晚于当前时间一个月。
	 */
	@ApiField("begin_effect_time")
	private String beginEffectTime;

	/**
	 * 合作伙伴侧购买使用当前的会员包的企业编号，传递对应的corpid即可，建议传递corpid，但是如果没有有统一社会信用代码，也可以传递统一社会信用代码或者可以唯一标识一家企业的标识.
	 */
	@ApiField("company_id")
	private String companyId;

	/**
	 * 合作伙伴侧购买使用当前的会员包的企业全称
	 */
	@ApiField("company_name")
	private String companyName;

	/**
	 * 订单编号，是客户在合作伙伴侧下单时的ID，在付费、续费、增购等一个客户可以有多个付费ID，一个ID描述一次购买行为。
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 唯一键，幂等控制，同一个id不允许多次购买
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 企信会员产品码，由企信分配
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 企信会员产品包定制化配置.仅对product_sku为QX-ZTB-ASSISTANT-STANDARD和QX-TK-ASSISTANT-STANDARD 是生效
	 */
	@ApiField("product_config")
	private EpAssistantProductConfig productConfig;

	/**
	 * 企信会员产品包，由企信分配
	 */
	@ApiField("product_sku")
	private String productSku;

	public String getBeginEffectTime() {
		return this.beginEffectTime;
	}
	public void setBeginEffectTime(String beginEffectTime) {
		this.beginEffectTime = beginEffectTime;
	}

	public String getCompanyId() {
		return this.companyId;
	}
	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}

	public String getCompanyName() {
		return this.companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
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

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public EpAssistantProductConfig getProductConfig() {
		return this.productConfig;
	}
	public void setProductConfig(EpAssistantProductConfig productConfig) {
		this.productConfig = productConfig;
	}

	public String getProductSku() {
		return this.productSku;
	}
	public void setProductSku(String productSku) {
		this.productSku = productSku;
	}

}
