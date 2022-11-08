package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * iot核身平台通过uid查询vid接口
 *
 * @author auto create
 * @since 1.0, 2022-08-18 10:14:26
 */
public class AlipayOpenIotvspUservidQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2329811646418449163L;

	/**
	 * isv商户的pid
	 */
	@ApiField("isv_pid")
	private String isvPid;

	/**
	 * 机构编码，一般为税号
	 */
	@ApiField("org_out_id")
	private String orgOutId;

	/**
	 * 支付宝账号唯一id
	 */
	@ApiListField("uid_list")
	@ApiField("string")
	private List<String> uidList;

	public String getIsvPid() {
		return this.isvPid;
	}
	public void setIsvPid(String isvPid) {
		this.isvPid = isvPid;
	}

	public String getOrgOutId() {
		return this.orgOutId;
	}
	public void setOrgOutId(String orgOutId) {
		this.orgOutId = orgOutId;
	}

	public List<String> getUidList() {
		return this.uidList;
	}
	public void setUidList(List<String> uidList) {
		this.uidList = uidList;
	}

}
