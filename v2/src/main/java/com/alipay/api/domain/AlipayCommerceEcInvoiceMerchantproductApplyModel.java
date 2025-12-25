package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 发票产品开通申请
 *
 * @author auto create
 * @since 1.0, 2025-04-22 15:37:34
 */
public class AlipayCommerceEcInvoiceMerchantproductApplyModel extends AlipayObject {

	private static final long serialVersionUID = 8844863544234391244L;

	/**
	 * 由外部系统（如合作伙伴平台或第三方服务）生成的唯一业务标识，用于关联外部系统的申请请求。
	 */
	@ApiField("out_apply_id")
	private String outApplyId;

	/**
	 * 发票产品编号，传值为当前订单对应的发票产品编号，必须为已开通产品，可调用反向企业信息查询接口查询
	 */
	@ApiField("product_id")
	private String productId;

	/**
	 * 企业（商户）税号
	 */
	@ApiField("tax_no")
	private String taxNo;

	public String getOutApplyId() {
		return this.outApplyId;
	}
	public void setOutApplyId(String outApplyId) {
		this.outApplyId = outApplyId;
	}

	public String getProductId() {
		return this.productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getTaxNo() {
		return this.taxNo;
	}
	public void setTaxNo(String taxNo) {
		this.taxNo = taxNo;
	}

}
