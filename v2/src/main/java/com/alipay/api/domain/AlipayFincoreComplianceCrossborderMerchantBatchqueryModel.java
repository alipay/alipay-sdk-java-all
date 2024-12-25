package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 跨境商户等级批量查询
 *
 * @author auto create
 * @since 1.0, 2021-08-18 10:31:37
 */
public class AlipayFincoreComplianceCrossborderMerchantBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 8716112451549569624L;

	/**
	 * 业务来源，由合规平台分配，如：CHYISHE
	 */
	@ApiField("biz_source")
	private String bizSource;

	/**
	 * 跨境商户基础信息List
	 */
	@ApiListField("org_list")
	@ApiField("base_crossborder_merchant_info")
	private List<BaseCrossborderMerchantInfo> orgList;

	/**
	 * 外部业务号：20210701WF001
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 批次查询总条数
	 */
	@ApiField("total")
	private Long total;

	public String getBizSource() {
		return this.bizSource;
	}
	public void setBizSource(String bizSource) {
		this.bizSource = bizSource;
	}

	public List<BaseCrossborderMerchantInfo> getOrgList() {
		return this.orgList;
	}
	public void setOrgList(List<BaseCrossborderMerchantInfo> orgList) {
		this.orgList = orgList;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public Long getTotal() {
		return this.total;
	}
	public void setTotal(Long total) {
		this.total = total;
	}

}
