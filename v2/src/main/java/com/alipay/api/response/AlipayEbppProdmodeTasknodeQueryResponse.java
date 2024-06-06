package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.prodmode.tasknode.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 04:20:26
 */
public class AlipayEbppProdmodeTasknodeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6133112117648857146L;

	/** 
	 * 当前任务最新更新时间
	 */
	@ApiField("gmt_modified")
	private Date gmtModified;

	/** 
	 * 是否可以编辑所有
	 */
	@ApiField("is_edit_all")
	private String isEditAll;

	/** 
	 * 编辑结算部分
	 */
	@ApiField("is_edit_fund")
	private String isEditFund;

	/** 
	 * 审批节点编码
	 */
	@ApiField("node_code")
	private String nodeCode;

	/** 
	 * 任务状态描述
	 */
	@ApiField("node_name")
	private String nodeName;

	/** 
	 * 拒绝理由
	 */
	@ApiField("reject")
	private String reject;

	/** 
	 * 拒绝时间
	 */
	@ApiField("reject_time")
	private String rejectTime;

	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}
	public Date getGmtModified( ) {
		return this.gmtModified;
	}

	public void setIsEditAll(String isEditAll) {
		this.isEditAll = isEditAll;
	}
	public String getIsEditAll( ) {
		return this.isEditAll;
	}

	public void setIsEditFund(String isEditFund) {
		this.isEditFund = isEditFund;
	}
	public String getIsEditFund( ) {
		return this.isEditFund;
	}

	public void setNodeCode(String nodeCode) {
		this.nodeCode = nodeCode;
	}
	public String getNodeCode( ) {
		return this.nodeCode;
	}

	public void setNodeName(String nodeName) {
		this.nodeName = nodeName;
	}
	public String getNodeName( ) {
		return this.nodeName;
	}

	public void setReject(String reject) {
		this.reject = reject;
	}
	public String getReject( ) {
		return this.reject;
	}

	public void setRejectTime(String rejectTime) {
		this.rejectTime = rejectTime;
	}
	public String getRejectTime( ) {
		return this.rejectTime;
	}

}
