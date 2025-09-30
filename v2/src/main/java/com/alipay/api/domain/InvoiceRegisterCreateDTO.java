package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 创建工单请求
 *
 * @author auto create
 * @since 1.0, 2020-06-18 21:08:42
 */
public class InvoiceRegisterCreateDTO extends AlipayObject {

	private static final long serialVersionUID = 3521997623656581671L;

	/**
	 * 企业税务信息
	 */
	@ApiField("invoice_company_dto")
	private InvoiceCompanyDTO invoiceCompanyDto;

	/**
	 * 联系人信息
	 */
	@ApiField("invoice_contact_dto")
	private InvoiceContactDTO invoiceContactDto;

	/**
	 * 服务市场订单信息
	 */
	@ApiListField("invoice_order_dto_list")
	@ApiField("invoice_order_d_t_o")
	private List<InvoiceOrderDTO> invoiceOrderDtoList;

	/**
	 * 外部业务幂等ID，由业务平台自己生成
	 */
	@ApiField("outer_id")
	private String outerId;

	/**
	 * 业务平台code, 由发票中台分配
	 */
	@ApiField("platform_code")
	private String platformCode;

	/**
	 * 业务平台商户ID/用户ID
	 */
	@ApiField("platform_user_id")
	private String platformUserId;

	/**
	 * 税控产品，产品码由中台定义
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 入驻类型，可选值：new：新订购，服务市场订购入驻场景，proxy：代理入驻模式，适用于代记账平台场景，online：已有税控初始化/绑定已有税控产品
	 */
	@ApiField("register_type")
	private String registerType;

	public InvoiceCompanyDTO getInvoiceCompanyDto() {
		return this.invoiceCompanyDto;
	}
	public void setInvoiceCompanyDto(InvoiceCompanyDTO invoiceCompanyDto) {
		this.invoiceCompanyDto = invoiceCompanyDto;
	}

	public InvoiceContactDTO getInvoiceContactDto() {
		return this.invoiceContactDto;
	}
	public void setInvoiceContactDto(InvoiceContactDTO invoiceContactDto) {
		this.invoiceContactDto = invoiceContactDto;
	}

	public List<InvoiceOrderDTO> getInvoiceOrderDtoList() {
		return this.invoiceOrderDtoList;
	}
	public void setInvoiceOrderDtoList(List<InvoiceOrderDTO> invoiceOrderDtoList) {
		this.invoiceOrderDtoList = invoiceOrderDtoList;
	}

	public String getOuterId() {
		return this.outerId;
	}
	public void setOuterId(String outerId) {
		this.outerId = outerId;
	}

	public String getPlatformCode() {
		return this.platformCode;
	}
	public void setPlatformCode(String platformCode) {
		this.platformCode = platformCode;
	}

	public String getPlatformUserId() {
		return this.platformUserId;
	}
	public void setPlatformUserId(String platformUserId) {
		this.platformUserId = platformUserId;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getRegisterType() {
		return this.registerType;
	}
	public void setRegisterType(String registerType) {
		this.registerType = registerType;
	}

}
