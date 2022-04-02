package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 发票查询
 *
 * @author auto create
 * @since 1.0, 2021-09-28 14:25:16
 */
public class AlipayBossFncGfsettleprodInvoiceBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 6141675649815917144L;

	/**
	 * OU
	 */
	@ApiListField("buyer_inst_id_list")
	@ApiField("string")
	private List<String> buyerInstIdList;

	/**
	 * 发票认证开始日期
	 */
	@ApiField("invoice_auth_date_begin")
	private String invoiceAuthDateBegin;

	/**
	 * 发票认证结束日期
	 */
	@ApiField("invoice_auth_date_end")
	private String invoiceAuthDateEnd;

	/**
	 * 发票代码
	 */
	@ApiField("invoice_code")
	private String invoiceCode;

	/**
	 * 发票开始日期 格式yyyyMMdd
	 */
	@ApiField("invoice_date_begin")
	private String invoiceDateBegin;

	/**
	 * 发票结束日期 格式yyyyMMdd
	 */
	@ApiField("invoice_date_end")
	private String invoiceDateEnd;

	/**
	 * 发票id
	 */
	@ApiListField("invoice_id_list")
	@ApiField("string")
	private List<String> invoiceIdList;

	/**
	 * 发票录入开始日期
	 */
	@ApiField("invoice_input_date_begin")
	private String invoiceInputDateBegin;

	/**
	 * 发票录入结束日期
	 */
	@ApiField("invoice_input_date_end")
	private String invoiceInputDateEnd;

	/**
	 * 发票号码
	 */
	@ApiField("invoice_no")
	private String invoiceNo;

	/**
	 * 收票开始日期
	 */
	@ApiField("invoice_receive_date_begin")
	private String invoiceReceiveDateBegin;

	/**
	 * 收票结束日期
	 */
	@ApiField("invoice_receive_date_end")
	private String invoiceReceiveDateEnd;

	/**
	 * 收票状态,01 发票已提交;02 审核中(已收票);
     * 03 已审核;04 已驳回;05 已认证;06 已撤回
     * 发票类型为 02销项票时 发票状态 01待开票 02开票中 03已开票
     * 04作废中 05已作废 06红冲中 07已红冲 08部分红冲 09无效
	 */
	@ApiField("invoice_status_list")
	private String invoiceStatusList;

	/**
	 * 发票种类 01专票 02普票 03国际形式发票
	 */
	@ApiField("invoice_type_list")
	private String invoiceTypeList;

	/**
	 * 开票号
	 */
	@ApiField("kp_no")
	private String kpNo;

	/**
	 * 起始页
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 每页显示数
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * seller_ip_role_id批量查询
	 */
	@ApiListField("seller_ip_role_ids")
	@ApiField("string")
	private List<String> sellerIpRoleIds;

	public List<String> getBuyerInstIdList() {
		return this.buyerInstIdList;
	}
	public void setBuyerInstIdList(List<String> buyerInstIdList) {
		this.buyerInstIdList = buyerInstIdList;
	}

	public String getInvoiceAuthDateBegin() {
		return this.invoiceAuthDateBegin;
	}
	public void setInvoiceAuthDateBegin(String invoiceAuthDateBegin) {
		this.invoiceAuthDateBegin = invoiceAuthDateBegin;
	}

	public String getInvoiceAuthDateEnd() {
		return this.invoiceAuthDateEnd;
	}
	public void setInvoiceAuthDateEnd(String invoiceAuthDateEnd) {
		this.invoiceAuthDateEnd = invoiceAuthDateEnd;
	}

	public String getInvoiceCode() {
		return this.invoiceCode;
	}
	public void setInvoiceCode(String invoiceCode) {
		this.invoiceCode = invoiceCode;
	}

	public String getInvoiceDateBegin() {
		return this.invoiceDateBegin;
	}
	public void setInvoiceDateBegin(String invoiceDateBegin) {
		this.invoiceDateBegin = invoiceDateBegin;
	}

	public String getInvoiceDateEnd() {
		return this.invoiceDateEnd;
	}
	public void setInvoiceDateEnd(String invoiceDateEnd) {
		this.invoiceDateEnd = invoiceDateEnd;
	}

	public List<String> getInvoiceIdList() {
		return this.invoiceIdList;
	}
	public void setInvoiceIdList(List<String> invoiceIdList) {
		this.invoiceIdList = invoiceIdList;
	}

	public String getInvoiceInputDateBegin() {
		return this.invoiceInputDateBegin;
	}
	public void setInvoiceInputDateBegin(String invoiceInputDateBegin) {
		this.invoiceInputDateBegin = invoiceInputDateBegin;
	}

	public String getInvoiceInputDateEnd() {
		return this.invoiceInputDateEnd;
	}
	public void setInvoiceInputDateEnd(String invoiceInputDateEnd) {
		this.invoiceInputDateEnd = invoiceInputDateEnd;
	}

	public String getInvoiceNo() {
		return this.invoiceNo;
	}
	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}

	public String getInvoiceReceiveDateBegin() {
		return this.invoiceReceiveDateBegin;
	}
	public void setInvoiceReceiveDateBegin(String invoiceReceiveDateBegin) {
		this.invoiceReceiveDateBegin = invoiceReceiveDateBegin;
	}

	public String getInvoiceReceiveDateEnd() {
		return this.invoiceReceiveDateEnd;
	}
	public void setInvoiceReceiveDateEnd(String invoiceReceiveDateEnd) {
		this.invoiceReceiveDateEnd = invoiceReceiveDateEnd;
	}

	public String getInvoiceStatusList() {
		return this.invoiceStatusList;
	}
	public void setInvoiceStatusList(String invoiceStatusList) {
		this.invoiceStatusList = invoiceStatusList;
	}

	public String getInvoiceTypeList() {
		return this.invoiceTypeList;
	}
	public void setInvoiceTypeList(String invoiceTypeList) {
		this.invoiceTypeList = invoiceTypeList;
	}

	public String getKpNo() {
		return this.kpNo;
	}
	public void setKpNo(String kpNo) {
		this.kpNo = kpNo;
	}

	public Long getPageNum() {
		return this.pageNum;
	}
	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public List<String> getSellerIpRoleIds() {
		return this.sellerIpRoleIds;
	}
	public void setSellerIpRoleIds(List<String> sellerIpRoleIds) {
		this.sellerIpRoleIds = sellerIpRoleIds;
	}

}
