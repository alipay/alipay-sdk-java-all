package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 查询应付月账单客户视图
 *
 * @author auto create
 * @since 1.0, 2020-04-07 17:01:01
 */
public class AlipayBossFncApbillCustviewBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 3316126614129661895L;

	/**
	 * 合约号
	 */
	@ApiField("ar_no")
	private String arNo;

	/**
	 * 账单关联发票状态列表
[01-未关联；02-部分关联；03-完全关联]
	 */
	@ApiListField("bill_invoice_link_statuses")
	@ApiField("string")
	private List<String> billInvoiceLinkStatuses;

	/**
	 * 默人["22"]
账单类型列表{"11":"应收普通日账单","12":"应收调整日账单","13":"应付普通日账单","14":"应付汇总调整日账单","15":"应付明细调整明细调整金额日账单","17":"应付普通日账单","18":"应收延迟日账单","21":"应收月账单","22":"应付月账单","23":"AP预付月账单","24":"通用记账凭证详情单","25":"应收调账月账单","26":"应收延迟月账单","31":"应收普通账单","32":"应收调账账单","33":"应收延迟账单","40":"AP付款单","41":"AP月账单"}
	 */
	@ApiListField("bill_types")
	@ApiField("string")
	private List<String> billTypes;

	/**
	 * 业务类型，默认COMMISSION
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 币种编码 如CNY ,156
接口内部会进行币种转换[ 156 -->156;  CNY--> 156]，参考枚举com.alipay.fc.common.lang.money.CurrencyEnum
	 */
	@ApiField("ccy")
	private String ccy;

	/**
	 * 查询结束月份，格式yyyyMM
	 */
	@ApiField("end_month")
	private String endMonth;

	/**
	 * 分支机构ID（OU标识）
	 */
	@ApiField("inst_id")
	private String instId;

	/**
	 * 发票种类{"01":"增值税专用发票","02":"增值税普通发票","05":"其它发票","07":"虚拟发票"}
	 */
	@ApiField("invoice_type")
	private String invoiceType;

	/**
	 * 参与者角色ID
	 */
	@ApiField("ip_role_id")
	private String ipRoleId;

	/**
	 * 起始页；默认1
	 */
	@ApiField("page_no")
	private Long pageNo;

	/**
	 * 每页显示数；默认20，最大建议不超过1000
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 支付状态列表 [01-待结算；02-部分结算；03-结算完成]
	 */
	@ApiListField("pay_statuses")
	@ApiField("string")
	private List<String> payStatuses;

	/**
	 * 产品码列表
	 */
	@ApiListField("pd_codes")
	@ApiField("string")
	private List<String> pdCodes;

	/**
	 * 价格标识
	 */
	@ApiField("price_id")
	private String priceId;

	/**
	 * 价格政策ID
	 */
	@ApiField("price_policy_id")
	private String pricePolicyId;

	/**
	 * 结算类型 [01-实时结算类型；02-后付类型]
	 */
	@ApiListField("settle_type")
	@ApiField("string")
	private List<String> settleType;

	/**
	 * 查询开始月份，格式yyyyMM
	 */
	@ApiField("start_month")
	private String startMonth;

	public String getArNo() {
		return this.arNo;
	}
	public void setArNo(String arNo) {
		this.arNo = arNo;
	}

	public List<String> getBillInvoiceLinkStatuses() {
		return this.billInvoiceLinkStatuses;
	}
	public void setBillInvoiceLinkStatuses(List<String> billInvoiceLinkStatuses) {
		this.billInvoiceLinkStatuses = billInvoiceLinkStatuses;
	}

	public List<String> getBillTypes() {
		return this.billTypes;
	}
	public void setBillTypes(List<String> billTypes) {
		this.billTypes = billTypes;
	}

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getCcy() {
		return this.ccy;
	}
	public void setCcy(String ccy) {
		this.ccy = ccy;
	}

	public String getEndMonth() {
		return this.endMonth;
	}
	public void setEndMonth(String endMonth) {
		this.endMonth = endMonth;
	}

	public String getInstId() {
		return this.instId;
	}
	public void setInstId(String instId) {
		this.instId = instId;
	}

	public String getInvoiceType() {
		return this.invoiceType;
	}
	public void setInvoiceType(String invoiceType) {
		this.invoiceType = invoiceType;
	}

	public String getIpRoleId() {
		return this.ipRoleId;
	}
	public void setIpRoleId(String ipRoleId) {
		this.ipRoleId = ipRoleId;
	}

	public Long getPageNo() {
		return this.pageNo;
	}
	public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public List<String> getPayStatuses() {
		return this.payStatuses;
	}
	public void setPayStatuses(List<String> payStatuses) {
		this.payStatuses = payStatuses;
	}

	public List<String> getPdCodes() {
		return this.pdCodes;
	}
	public void setPdCodes(List<String> pdCodes) {
		this.pdCodes = pdCodes;
	}

	public String getPriceId() {
		return this.priceId;
	}
	public void setPriceId(String priceId) {
		this.priceId = priceId;
	}

	public String getPricePolicyId() {
		return this.pricePolicyId;
	}
	public void setPricePolicyId(String pricePolicyId) {
		this.pricePolicyId = pricePolicyId;
	}

	public List<String> getSettleType() {
		return this.settleType;
	}
	public void setSettleType(List<String> settleType) {
		this.settleType = settleType;
	}

	public String getStartMonth() {
		return this.startMonth;
	}
	public void setStartMonth(String startMonth) {
		this.startMonth = startMonth;
	}

}
