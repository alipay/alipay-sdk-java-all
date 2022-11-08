package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 账单查询请求
 *
 * @author auto create
 * @since 1.0, 2022-11-03 16:34:12
 */
public class SummaryBillViewQueryOrder extends AlipayObject {

	private static final long serialVersionUID = 8732875418991268228L;

	/**
	 * 合约号
	 */
	@ApiField("arrangement_no")
	private String arrangementNo;

	/**
	 * 账单结束月份
	 */
	@ApiField("bill_end_month")
	private String billEndMonth;

	/**
	 * 账单号
	 */
	@ApiListField("bill_nos")
	@ApiField("string")
	private List<String> billNos;

	/**
	 * 账单月份
	 */
	@ApiField("bill_start_month")
	private String billStartMonth;

	/**
	 * 账单状态
UNCHECKED("unchecked", "未出账"),

    PARTIAL_CHECK("partial_checked","部分出账"),

    CHECKED("checked", "已出账"),

    CONFIRMED("confirmed", "账单已确认");
	 */
	@ApiField("bill_status_list")
	private String billStatusList;

	/**
	 * 业务产品码列表
	 */
	@ApiListField("biz_pd_code_list")
	@ApiField("string")
	private List<String> bizPdCodeList;

	/**
	 * 资金结算时点
	 */
	@ApiField("fund_settle_time")
	private String fundSettleTime;

	/**
	 * 机构OU
	 */
	@ApiListField("inst_id_list")
	@ApiField("string")
	private List<String> instIdList;

	/**
	 * 页数
	 */
	@ApiField("page_num")
	private String pageNum;

	/**
	 * 每页显示数，分页时必须提供 【必填】
	 */
	@ApiField("page_size")
	private String pageSize;

	/**
	 * 付款方pid
	 */
	@ApiField("payer_ip_role_id")
	private String payerIpRoleId;

	/**
	 * 结算对象pidList
	 */
	@ApiListField("settle_ip_role_id_list")
	@ApiField("string")
	private List<String> settleIpRoleIdList;

	/**
	 * 结算状态
	 */
	@ApiListField("settle_status_list")
	@ApiField("string")
	private List<String> settleStatusList;

	/**
	 * 结算时点类型 real、delayed
	 */
	@ApiListField("settle_time_type_list")
	@ApiField("string")
	private List<String> settleTimeTypeList;

	/**
	 * 来源系统
	 */
	@ApiField("source")
	private String source;

	/**
	 * 扩展汇总维度1 （智科业务是：外部合约号outContractId，前端给到参数“outContractId=XXXX”)
	 */
	@ApiField("summary_dmsn_1")
	private String summaryDmsn1;

	public String getArrangementNo() {
		return this.arrangementNo;
	}
	public void setArrangementNo(String arrangementNo) {
		this.arrangementNo = arrangementNo;
	}

	public String getBillEndMonth() {
		return this.billEndMonth;
	}
	public void setBillEndMonth(String billEndMonth) {
		this.billEndMonth = billEndMonth;
	}

	public List<String> getBillNos() {
		return this.billNos;
	}
	public void setBillNos(List<String> billNos) {
		this.billNos = billNos;
	}

	public String getBillStartMonth() {
		return this.billStartMonth;
	}
	public void setBillStartMonth(String billStartMonth) {
		this.billStartMonth = billStartMonth;
	}

	public String getBillStatusList() {
		return this.billStatusList;
	}
	public void setBillStatusList(String billStatusList) {
		this.billStatusList = billStatusList;
	}

	public List<String> getBizPdCodeList() {
		return this.bizPdCodeList;
	}
	public void setBizPdCodeList(List<String> bizPdCodeList) {
		this.bizPdCodeList = bizPdCodeList;
	}

	public String getFundSettleTime() {
		return this.fundSettleTime;
	}
	public void setFundSettleTime(String fundSettleTime) {
		this.fundSettleTime = fundSettleTime;
	}

	public List<String> getInstIdList() {
		return this.instIdList;
	}
	public void setInstIdList(List<String> instIdList) {
		this.instIdList = instIdList;
	}

	public String getPageNum() {
		return this.pageNum;
	}
	public void setPageNum(String pageNum) {
		this.pageNum = pageNum;
	}

	public String getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

	public String getPayerIpRoleId() {
		return this.payerIpRoleId;
	}
	public void setPayerIpRoleId(String payerIpRoleId) {
		this.payerIpRoleId = payerIpRoleId;
	}

	public List<String> getSettleIpRoleIdList() {
		return this.settleIpRoleIdList;
	}
	public void setSettleIpRoleIdList(List<String> settleIpRoleIdList) {
		this.settleIpRoleIdList = settleIpRoleIdList;
	}

	public List<String> getSettleStatusList() {
		return this.settleStatusList;
	}
	public void setSettleStatusList(List<String> settleStatusList) {
		this.settleStatusList = settleStatusList;
	}

	public List<String> getSettleTimeTypeList() {
		return this.settleTimeTypeList;
	}
	public void setSettleTimeTypeList(List<String> settleTimeTypeList) {
		this.settleTimeTypeList = settleTimeTypeList;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public String getSummaryDmsn1() {
		return this.summaryDmsn1;
	}
	public void setSummaryDmsn1(String summaryDmsn1) {
		this.summaryDmsn1 = summaryDmsn1;
	}

}
