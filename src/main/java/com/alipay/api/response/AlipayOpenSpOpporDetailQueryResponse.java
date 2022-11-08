package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.sp.oppor.detail.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-05-16 14:26:44
 */
public class AlipayOpenSpOpporDetailQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8286277656437414197L;

	/** 
	 * 商机地址
	 */
	@ApiField("address")
	private String address;

	/** 
	 * 商机Id
	 */
	@ApiField("leads_id")
	private String leadsId;

	/** 
	 * 商机名称
	 */
	@ApiField("name")
	private String name;

	/** 
	 * 商机作业Id
	 */
	@ApiField("oppor_id")
	private String opporId;

	/** 
	 * 外部幂等唯一键
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/** 
	 * 商机联系电话
	 */
	@ApiField("phone")
	private String phone;

	/** 
	 * 商机作业状态
	 */
	@ApiField("status")
	private String status;

	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddress( ) {
		return this.address;
	}

	public void setLeadsId(String leadsId) {
		this.leadsId = leadsId;
	}
	public String getLeadsId( ) {
		return this.leadsId;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getName( ) {
		return this.name;
	}

	public void setOpporId(String opporId) {
		this.opporId = opporId;
	}
	public String getOpporId( ) {
		return this.opporId;
	}

	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	public String getOutBizNo( ) {
		return this.outBizNo;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPhone( ) {
		return this.phone;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
