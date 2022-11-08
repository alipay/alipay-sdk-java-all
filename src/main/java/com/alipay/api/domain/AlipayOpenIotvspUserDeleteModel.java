package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 机构用户出库
 *
 * @author auto create
 * @since 1.0, 2022-04-11 17:17:09
 */
public class AlipayOpenIotvspUserDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 2684836418167137916L;

	/**
	 * ISV的PID
	 */
	@ApiField("isv_pid")
	private String isvPid;

	/**
	 * 机构编码
	 */
	@ApiField("org_out_id")
	private String orgOutId;

	/**
	 * 用户ID列表，单次操作最多100个
	 */
	@ApiListField("vid_list")
	@ApiField("string")
	private List<String> vidList;

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

	public List<String> getVidList() {
		return this.vidList;
	}
	public void setVidList(List<String> vidList) {
		this.vidList = vidList;
	}

}
