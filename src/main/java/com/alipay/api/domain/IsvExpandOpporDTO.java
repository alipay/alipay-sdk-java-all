package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商机作业记录
 *
 * @author auto create
 * @since 1.0, 2022-05-16 15:37:45
 */
public class IsvExpandOpporDTO extends AlipayObject {

	private static final long serialVersionUID = 8118535389654468392L;

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

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getLeadsId() {
		return this.leadsId;
	}
	public void setLeadsId(String leadsId) {
		this.leadsId = leadsId;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getOpporId() {
		return this.opporId;
	}
	public void setOpporId(String opporId) {
		this.opporId = opporId;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getPhone() {
		return this.phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
