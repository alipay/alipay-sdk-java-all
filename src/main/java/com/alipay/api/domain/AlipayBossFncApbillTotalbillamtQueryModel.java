package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 账单总金额查询接口
 *
 * @author auto create
 * @since 1.0, 2020-04-07 17:22:09
 */
public class AlipayBossFncApbillTotalbillamtQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4295465367568753523L;

	/**
	 * 合约号
	 */
	@ApiField("ar_no")
	private String arNo;

	/**
	 * 账单关联发票状态列表{"01":"未关联","02":"部分关联","03":"完全关联"}
	 */
	@ApiListField("bill_invoice_link_statuses")
	@ApiField("string")
	private List<String> billInvoiceLinkStatuses;

	/**
	 * 账单号
	 */
	@ApiField("bill_no")
	private String billNo;

	/**
	 * 月账单类型列表{"11":"应收普通日账单","12":"应收调整日账单","13":"应付普通日账单","14":"应付汇总调整日账单","15":"应付明细调整明细调整金额日账单","17":"应付普通日账单","18":"应收延迟日账单","21":"应收月账单","22":"应付月账单","23":"AP预付月账单","24":"通用记账凭证详情单","25":"应收调账月账单","26":"应收延迟月账单","31":"应收普通账单","32":"应收调账账单","33":"应收延迟账单","40":"AP付款单","41":"AP月账单"}
	 */
	@ApiListField("bill_types")
	@ApiField("string")
	private List<String> billTypes;

	/**
	 * 业务类型
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 查询结束月份;格式yyyyMM
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
	 * 结算对象PID列表
	 */
	@ApiListField("ip_role_ids")
	@ApiField("string")
	private List<String> ipRoleIds;

	/**
	 * 结算对象（MID）
	 */
	@ApiField("mid")
	private String mid;

	/**
	 * 结算对象mid列表
	 */
	@ApiListField("mids")
	@ApiField("string")
	private List<String> mids;

	/**
	 * 支付状态列表[01-待结算；02-部分结算；03-结算完成]
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
	 * 查询开始月份;格式yyyyMM
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

	public String getBillNo() {
		return this.billNo;
	}
	public void setBillNo(String billNo) {
		this.billNo = billNo;
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

	public List<String> getIpRoleIds() {
		return this.ipRoleIds;
	}
	public void setIpRoleIds(List<String> ipRoleIds) {
		this.ipRoleIds = ipRoleIds;
	}

	public String getMid() {
		return this.mid;
	}
	public void setMid(String mid) {
		this.mid = mid;
	}

	public List<String> getMids() {
		return this.mids;
	}
	public void setMids(List<String> mids) {
		this.mids = mids;
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

	public String getStartMonth() {
		return this.startMonth;
	}
	public void setStartMonth(String startMonth) {
		this.startMonth = startMonth;
	}

}
