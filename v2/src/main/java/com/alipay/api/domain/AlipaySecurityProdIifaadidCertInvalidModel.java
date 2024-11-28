package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * IIFAA可信身份凭证证明文件状态失效同步
 *
 * @author auto create
 * @since 1.0, 2024-06-24 14:20:48
 */
public class AlipaySecurityProdIifaadidCertInvalidModel extends AlipayObject {

	private static final long serialVersionUID = 4383392271396785121L;

	/**
	 * 变更通知批次号
	 */
	@ApiField("batch_number")
	private String batchNumber;

	/**
	 * 业务流水号
	 */
	@ApiField("bsn")
	private String bsn;

	/**
	 * 变更通知的用户信息和文件签名
	 */
	@ApiListField("cdid_list")
	@ApiField("iifaa_did_cdid_detail")
	private List<IifaaDidCdidDetail> cdidList;

	/**
	 * 凭证失效原因
	 */
	@ApiField("similar_notice")
	private String similarNotice;

	/**
	 * 时间戳
	 */
	@ApiField("time_stamp")
	private String timeStamp;

	public String getBatchNumber() {
		return this.batchNumber;
	}
	public void setBatchNumber(String batchNumber) {
		this.batchNumber = batchNumber;
	}

	public String getBsn() {
		return this.bsn;
	}
	public void setBsn(String bsn) {
		this.bsn = bsn;
	}

	public List<IifaaDidCdidDetail> getCdidList() {
		return this.cdidList;
	}
	public void setCdidList(List<IifaaDidCdidDetail> cdidList) {
		this.cdidList = cdidList;
	}

	public String getSimilarNotice() {
		return this.similarNotice;
	}
	public void setSimilarNotice(String similarNotice) {
		this.similarNotice = similarNotice;
	}

	public String getTimeStamp() {
		return this.timeStamp;
	}
	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}

}
