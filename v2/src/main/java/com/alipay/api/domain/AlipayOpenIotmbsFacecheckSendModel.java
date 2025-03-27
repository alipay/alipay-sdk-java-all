package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * iot触发人脸采集动作
 *
 * @author auto create
 * @since 1.0, 2022-10-14 13:45:41
 */
public class AlipayOpenIotmbsFacecheckSendModel extends AlipayObject {

	private static final long serialVersionUID = 3816588484311593411L;

	/**
	 * 设备激活序号
	 */
	@ApiField("dev_id")
	private String devId;

	/**
	 * 人脸ID
	 */
	@ApiField("face_id")
	private String faceId;

	/**
	 * floor_num（用户入住楼层），非必填，用于梯控场景，酒店用户入住后，刷脸乘电梯，仅拥有入住楼层按钮权限。
	 */
	@ApiField("floor_num")
	private String floorNum;

	/**
	 * 外部传入的请求序号
	 */
	@ApiField("out_request_id")
	private String outRequestId;

	/**
	 * 手机号
	 */
	@ApiField("phone_no")
	private String phoneNo;

	/**
	 * 项目ID
	 */
	@ApiField("project_id")
	private String projectId;

	/**
	 * 刷脸开门设备，sn列表
	 */
	@ApiListField("sn_list")
	@ApiField("string")
	private List<String> snList;

	public String getDevId() {
		return this.devId;
	}
	public void setDevId(String devId) {
		this.devId = devId;
	}

	public String getFaceId() {
		return this.faceId;
	}
	public void setFaceId(String faceId) {
		this.faceId = faceId;
	}

	public String getFloorNum() {
		return this.floorNum;
	}
	public void setFloorNum(String floorNum) {
		this.floorNum = floorNum;
	}

	public String getOutRequestId() {
		return this.outRequestId;
	}
	public void setOutRequestId(String outRequestId) {
		this.outRequestId = outRequestId;
	}

	public String getPhoneNo() {
		return this.phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getProjectId() {
		return this.projectId;
	}
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public List<String> getSnList() {
		return this.snList;
	}
	public void setSnList(List<String> snList) {
		this.snList = snList;
	}

}
