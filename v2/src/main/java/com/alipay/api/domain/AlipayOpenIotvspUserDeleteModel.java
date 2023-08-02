package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 机构用户出库
 *
 * @author auto create
 * @since 1.0, 2023-06-08 15:42:33
 */
public class AlipayOpenIotvspUserDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 2691186397116475223L;

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
	 * 机构内人员所属的场所，部门场景为必传，比如酒店门禁，需传房间
	 */
	@ApiListField("place_name_list")
	@ApiField("string")
	private List<String> placeNameList;

	/**
	 * 用户VID列表，目前仅支持一次出库一人
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

	public List<String> getPlaceNameList() {
		return this.placeNameList;
	}
	public void setPlaceNameList(List<String> placeNameList) {
		this.placeNameList = placeNameList;
	}

	public List<String> getVidList() {
		return this.vidList;
	}
	public void setVidList(List<String> vidList) {
		this.vidList = vidList;
	}

}
