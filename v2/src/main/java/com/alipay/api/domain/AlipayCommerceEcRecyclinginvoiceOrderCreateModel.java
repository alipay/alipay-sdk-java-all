package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 反向订单创建
 *
 * @author auto create
 * @since 1.0, 2025-05-15 17:38:21
 */
public class AlipayCommerceEcRecyclinginvoiceOrderCreateModel extends AlipayObject {

	private static final long serialVersionUID = 6225497945569541833L;

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

	public String getTaxNo() {
		return this.taxNo;
	}
	public void setTaxNo(String taxNo) {
		this.taxNo = taxNo;
	}

}
