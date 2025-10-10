package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 抵押状态通知来报
 *
 * @author auto create
 * @since 1.0, 2025-09-18 11:30:24
 */
public class XingheLendassistCarfinMortgageapplystatusNotifyModel extends AlipayObject {

	private static final long serialVersionUID = 8233385579578826739L;

	/**
	 * 星河侧唯一抵押订单号
	 */
	@ApiField("mortgage_no")
	private String mortgageNo;

	/**
	 * 机构侧唯一抵押订单号
	 */
	@ApiField("out_mortgage_no")
	private String outMortgageNo;

	/**
	 * 代理人不合法的文件列表
	 */
	@ApiListField("proxy_invalid_file_list")
	@ApiField("string")
	private List<String> proxyInvalidFileList;

	/**
	 * 拒绝原因
	 */
	@ApiField("refuse_msg")
	private String refuseMsg;

	/**
	 * 客户抵押状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 需要补充的协议文件
	 */
	@ApiListField("supple_agreement_list")
	@ApiField("string")
	private List<String> suppleAgreementList;

	/**
	 * 需要补充的文件列表
	 */
	@ApiListField("supple_file_list")
	@ApiField("string")
	private List<String> suppleFileList;

	public String getMortgageNo() {
		return this.mortgageNo;
	}
	public void setMortgageNo(String mortgageNo) {
		this.mortgageNo = mortgageNo;
	}

	public String getOutMortgageNo() {
		return this.outMortgageNo;
	}
	public void setOutMortgageNo(String outMortgageNo) {
		this.outMortgageNo = outMortgageNo;
	}

	public List<String> getProxyInvalidFileList() {
		return this.proxyInvalidFileList;
	}
	public void setProxyInvalidFileList(List<String> proxyInvalidFileList) {
		this.proxyInvalidFileList = proxyInvalidFileList;
	}

	public String getRefuseMsg() {
		return this.refuseMsg;
	}
	public void setRefuseMsg(String refuseMsg) {
		this.refuseMsg = refuseMsg;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public List<String> getSuppleAgreementList() {
		return this.suppleAgreementList;
	}
	public void setSuppleAgreementList(List<String> suppleAgreementList) {
		this.suppleAgreementList = suppleAgreementList;
	}

	public List<String> getSuppleFileList() {
		return this.suppleFileList;
	}
	public void setSuppleFileList(List<String> suppleFileList) {
		this.suppleFileList = suppleFileList;
	}

}
