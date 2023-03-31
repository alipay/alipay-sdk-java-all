package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 收款单查询请求
 *
 * @author auto create
 * @since 1.0, 2021-09-24 09:15:26
 */
public class CollectReceiptQueryOpenApiOrder extends AlipayObject {

	private static final long serialVersionUID = 7752512755857936648L;

	/**
	 * 币种
	 */
	@ApiField("ccy")
	private String ccy;

	/**
	 * 付款渠道，01:支付宝资金渠道，02:银行渠道，12:信用证资金渠道渠道
	 */
	@ApiListField("channel_list")
	@ApiField("string")
	private List<String> channelList;

	/**
	 * 原始流水ID
	 */
	@ApiField("channel_log_no")
	private String channelLogNo;

	/**
	 * 收款单收款结束日期 yyyy-MM-dd
	 */
	@ApiField("collect_end_date")
	private String collectEndDate;

	/**
	 * 收款单收款起始日期 yyyy-MM-dd
	 */
	@ApiField("collect_start_date")
	private String collectStartDate;

	/**
	 * 机构ID
	 */
	@ApiListField("inst_id_list")
	@ApiField("string")
	private List<String> instIdList;

	/**
	 * 页数，默认第1页
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 每页显示条数，默认每页显示20条
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 收款方账号
	 */
	@ApiField("payee_account_no")
	private String payeeAccountNo;

	/**
	 * 付款方账号
	 */
	@ApiField("payer_account_no")
	private String payerAccountNo;

	/**
	 * 付款方PID
	 */
	@ApiField("payer_ip_role_id")
	private String payerIpRoleId;

	/**
	 * 收款单号(主键ID)
	 */
	@ApiField("receipt_no")
	private String receiptNo;

	/**
	 * 收款单来源标识
	 */
	@ApiListField("source_list")
	@ApiField("string")
	private List<String> sourceList;

	/**
	 * 收款单使用状态
	 */
	@ApiListField("status_list")
	@ApiField("string")
	private List<String> statusList;

	public String getCcy() {
		return this.ccy;
	}
	public void setCcy(String ccy) {
		this.ccy = ccy;
	}

	public List<String> getChannelList() {
		return this.channelList;
	}
	public void setChannelList(List<String> channelList) {
		this.channelList = channelList;
	}

	public String getChannelLogNo() {
		return this.channelLogNo;
	}
	public void setChannelLogNo(String channelLogNo) {
		this.channelLogNo = channelLogNo;
	}

	public String getCollectEndDate() {
		return this.collectEndDate;
	}
	public void setCollectEndDate(String collectEndDate) {
		this.collectEndDate = collectEndDate;
	}

	public String getCollectStartDate() {
		return this.collectStartDate;
	}
	public void setCollectStartDate(String collectStartDate) {
		this.collectStartDate = collectStartDate;
	}

	public List<String> getInstIdList() {
		return this.instIdList;
	}
	public void setInstIdList(List<String> instIdList) {
		this.instIdList = instIdList;
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

	public String getPayeeAccountNo() {
		return this.payeeAccountNo;
	}
	public void setPayeeAccountNo(String payeeAccountNo) {
		this.payeeAccountNo = payeeAccountNo;
	}

	public String getPayerAccountNo() {
		return this.payerAccountNo;
	}
	public void setPayerAccountNo(String payerAccountNo) {
		this.payerAccountNo = payerAccountNo;
	}

	public String getPayerIpRoleId() {
		return this.payerIpRoleId;
	}
	public void setPayerIpRoleId(String payerIpRoleId) {
		this.payerIpRoleId = payerIpRoleId;
	}

	public String getReceiptNo() {
		return this.receiptNo;
	}
	public void setReceiptNo(String receiptNo) {
		this.receiptNo = receiptNo;
	}

	public List<String> getSourceList() {
		return this.sourceList;
	}
	public void setSourceList(List<String> sourceList) {
		this.sourceList = sourceList;
	}

	public List<String> getStatusList() {
		return this.statusList;
	}
	public void setStatusList(List<String> statusList) {
		this.statusList = statusList;
	}

}
