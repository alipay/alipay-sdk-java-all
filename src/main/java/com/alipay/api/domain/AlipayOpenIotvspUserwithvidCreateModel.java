package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 录入机构用户信息（自定义vid）
 *
 * @author auto create
 * @since 1.0, 2022-04-27 19:52:17
 */
public class AlipayOpenIotvspUserwithvidCreateModel extends AlipayObject {

	private static final long serialVersionUID = 3194756291816577649L;

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
	 * 机构用户信息,isv需传vid
	 */
	@ApiListField("user_info_list")
	@ApiField("iot_vsp_org_user_with_vid_add_user_info_request")
	private List<IotVspOrgUserWithVidAddUserInfoRequest> userInfoList;

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

	public List<IotVspOrgUserWithVidAddUserInfoRequest> getUserInfoList() {
		return this.userInfoList;
	}
	public void setUserInfoList(List<IotVspOrgUserWithVidAddUserInfoRequest> userInfoList) {
		this.userInfoList = userInfoList;
	}

}
