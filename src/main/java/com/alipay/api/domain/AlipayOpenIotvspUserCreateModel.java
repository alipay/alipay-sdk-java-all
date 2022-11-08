package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 录入机构用户信息
 *
 * @author auto create
 * @since 1.0, 2022-04-11 17:17:28
 */
public class AlipayOpenIotvspUserCreateModel extends AlipayObject {

	private static final long serialVersionUID = 1416814335975552798L;

	/**
	 * 组件编码，该参数与userInfoList配对使用。详见接入指南
	 */
	@ApiField("component_out_id")
	private String componentOutId;

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
	 * 机构用户信息
	 */
	@ApiListField("user_info_list")
	@ApiField("iot_vsp_org_user_add_user_info_request")
	private List<IotVspOrgUserAddUserInfoRequest> userInfoList;

	public String getComponentOutId() {
		return this.componentOutId;
	}
	public void setComponentOutId(String componentOutId) {
		this.componentOutId = componentOutId;
	}

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

	public List<IotVspOrgUserAddUserInfoRequest> getUserInfoList() {
		return this.userInfoList;
	}
	public void setUserInfoList(List<IotVspOrgUserAddUserInfoRequest> userInfoList) {
		this.userInfoList = userInfoList;
	}

}
