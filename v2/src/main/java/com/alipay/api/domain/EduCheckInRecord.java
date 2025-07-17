package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 签到记录
 *
 * @author auto create
 * @since 1.0, 2025-07-09 14:35:02
 */
public class EduCheckInRecord extends AlipayObject {

	private static final long serialVersionUID = 3146344312275194143L;

	/**
	 * 签到图片链接
	 */
	@ApiField("check_in_picture")
	private String checkInPicture;

	/**
	 * 签到结果
	 */
	@ApiField("check_in_result")
	private String checkInResult;

	/**
	 * 签到时间
	 */
	@ApiField("check_in_time")
	private Date checkInTime;

	/**
	 * 签到类型
	 */
	@ApiField("check_in_type")
	private String checkInType;

	/**
	 * 学号或工号
	 */
	@ApiField("employee_no")
	private String employeeNo;

	/**
	 * 机构内标
	 */
	@ApiField("inst_id")
	private String instId;

	/**
	 * 姓名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 部门节点id
	 */
	@ApiField("node_id")
	private String nodeId;

	/**
	 * 部门节点名称
	 */
	@ApiField("node_name")
	private String nodeName;

	/**
	 * 位置id
	 */
	@ApiField("place_id")
	private String placeId;

	/**
	 * 位置名称
	 */
	@ApiField("place_name")
	private String placeName;

	/**
	 * 用户花名册id
	 */
	@ApiField("roster_id")
	private String rosterId;

	/**
	 * 签到记录id
	 */
	@ApiField("user_check_in_id")
	private String userCheckInId;

	public String getCheckInPicture() {
		return this.checkInPicture;
	}
	public void setCheckInPicture(String checkInPicture) {
		this.checkInPicture = checkInPicture;
	}

	public String getCheckInResult() {
		return this.checkInResult;
	}
	public void setCheckInResult(String checkInResult) {
		this.checkInResult = checkInResult;
	}

	public Date getCheckInTime() {
		return this.checkInTime;
	}
	public void setCheckInTime(Date checkInTime) {
		this.checkInTime = checkInTime;
	}

	public String getCheckInType() {
		return this.checkInType;
	}
	public void setCheckInType(String checkInType) {
		this.checkInType = checkInType;
	}

	public String getEmployeeNo() {
		return this.employeeNo;
	}
	public void setEmployeeNo(String employeeNo) {
		this.employeeNo = employeeNo;
	}

	public String getInstId() {
		return this.instId;
	}
	public void setInstId(String instId) {
		this.instId = instId;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getNodeId() {
		return this.nodeId;
	}
	public void setNodeId(String nodeId) {
		this.nodeId = nodeId;
	}

	public String getNodeName() {
		return this.nodeName;
	}
	public void setNodeName(String nodeName) {
		this.nodeName = nodeName;
	}

	public String getPlaceId() {
		return this.placeId;
	}
	public void setPlaceId(String placeId) {
		this.placeId = placeId;
	}

	public String getPlaceName() {
		return this.placeName;
	}
	public void setPlaceName(String placeName) {
		this.placeName = placeName;
	}

	public String getRosterId() {
		return this.rosterId;
	}
	public void setRosterId(String rosterId) {
		this.rosterId = rosterId;
	}

	public String getUserCheckInId() {
		return this.userCheckInId;
	}
	public void setUserCheckInId(String userCheckInId) {
		this.userCheckInId = userCheckInId;
	}

}
