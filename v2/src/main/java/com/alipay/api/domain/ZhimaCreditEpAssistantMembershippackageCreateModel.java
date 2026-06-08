package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企信助手会员包创建
 *
 * @author auto create
 * @since 1.0, 2026-04-13 22:17:45
 */
public class ZhimaCreditEpAssistantMembershippackageCreateModel extends AlipayObject {

	private static final long serialVersionUID = 4574127227791274939L;

	/**
	 * 统一社会信用代码。如果无法获取统一社会信用代码，也可以传递伙伴侧的企业标识，需要可以唯一标识一家企业
	 */
	@ApiField("company_id")
	private String companyId;

	/**
	 * 购买当前会员包的公司名称
	 */
	@ApiField("company_name")
	private String companyName;

	/**
	 * 订单编号，是指伙伴的正式向企信提交订单后，拿到的一个唯一的不重复订单号，届时伙伴的财务打款时需要附上该订单号，方便做资金流和订单的匹配
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
