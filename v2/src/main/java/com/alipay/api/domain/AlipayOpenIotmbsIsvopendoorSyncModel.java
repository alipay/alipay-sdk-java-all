package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * isv同步开门请求
 *
 * @author auto create
 * @since 1.0, 2023-04-12 10:36:40
 */
public class AlipayOpenIotmbsIsvopendoorSyncModel extends AlipayObject {

	private static final long serialVersionUID = 6175584242621774669L;

	/**
	 * 外部传入的用户id
	 */
	@ApiField("face_id")
	private String faceId;

	/**
	 * 执行业务操作的项目id
	 */
	@ApiField("project_id")
	private String projectId;

	/**
	 * 房号
	 */
	@ApiField("room_num")
	private String roomNum;

	/**
	 * 房门pad设备sn
	 */
	@ApiField("sn")
	private String sn;

	public String getFaceId() {
		return this.faceId;
	}
	public void setFaceId(String faceId) {
		this.faceId = faceId;
	}

	public String getProjectId() {
		return this.projectId;
	}
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public String getRoomNum() {
		return this.roomNum;
	}
	public void setRoomNum(String roomNum) {
		this.roomNum = roomNum;
	}

	public String getSn() {
		return this.sn;
	}
	public void setSn(String sn) {
		this.sn = sn;
	}

}
