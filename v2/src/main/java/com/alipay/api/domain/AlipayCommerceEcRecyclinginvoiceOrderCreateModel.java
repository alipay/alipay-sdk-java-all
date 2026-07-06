package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 反向订单创建
 *
 * @author auto create
 * @since 1.0, 2026-05-29 17:09:35
 */
public class AlipayCommerceEcRecyclinginvoiceOrderCreateModel extends AlipayObject {

	private static final long serialVersionUID = 5368396636217414963L;

	/**
	 * 企业（商户）营业员ID，传值为已维护的企业（商户）营业员编号，可调用反向企业营业员查询接口查询
	 */
	@ApiField("company_clerk_id")
	private String companyClerkId;

	/**
	 * 企业（商户）供应商ID，传值为已维护的企业（商户）供应商编号，可调用反向企业（商户）供应商查询接口查询
	 */
	@ApiField("company_supplier_id")
	private String companySupplierId;

	/**
	 * 订单的备注字段,用于发票的备注显示
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 订单商品明细
	 */
	@ApiListField("order_item_list")
	@ApiField("recyclinginvoice_order_create_item")
	private List<RecyclinginvoiceOrderCreateItem> orderItemList;

	/**
	 * 外部订单号，外部系统订单的唯一值，会依据此值做幂等
	 */
	@ApiField("outer_order_id")
	private String outerOrderId;

	/**
	 * 个人所得税类型
	 */
	@ApiField("personal_tax_project")
	private String personalTaxProject;

	/**
	 * 发票产品ID，传值为当前订单对应的发票产品编号，必须为已开通产品，可调用反向企业（商户）信息查询接口查询
	 */
	@ApiField("product_id")
	private String productId;

	/**
	 * 商品经营地行政区划代码
	 */
	@ApiField("product_origin_code")
	private String productOriginCode;

	/**
	 * 代卖人证件号码（身份证号码）
	 */
	@ApiField("proxy_seller_cert_no")
	private String proxySellerCertNo;

	/**
	 * 企业（商户）税号
	 */
	@ApiField("tax_no")
	private String taxNo;

	public String getCompanyClerkId() {
		return this.companyClerkId;
	}
	public void setCompanyClerkId(String companyClerkId) {
		this.companyClerkId = companyClerkId;
	}

	public String getCompanySupplierId() {
		return this.companySupplierId;
	}
	public void setCompanySupplierId(String companySupplierId) {
		this.companySupplierId = companySupplierId;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public List<RecyclinginvoiceOrderCreateItem> getOrderItemList() {
		return this.orderItemList;
	}
	public void setOrderItemList(List<RecyclinginvoiceOrderCreateItem> orderItemList) {
		this.orderItemList = orderItemList;
	}

	public String getOuterOrderId() {
		return this.outerOrderId;
	}
	public void setOuterOrderId(String outerOrderId) {
		this.outerOrderId = outerOrderId;
	}

	public String getPersonalTaxProject() {
		return this.personalTaxProject;
	}
	public void setPersonalTaxProject(String personalTaxProject) {
		this.personalTaxProject = personalTaxProject;
	}

	public String getProductId() {
		return this.productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductOriginCode() {
		return this.productOriginCode;
	}
	public void setProductOriginCode(String productOriginCode) {
		this.productOriginCode = productOriginCode;
	}

	public String getProxySellerCertNo() {
		return this.proxySellerCertNo;
	}
	public void setProxySellerCertNo(String proxySellerCertNo) {
		this.proxySellerCertNo = proxySellerCertNo;
	}

	public String getTaxNo() {
		return this.taxNo;
	}
	public void setTaxNo(String taxNo) {
		this.taxNo = taxNo;
	}

}
