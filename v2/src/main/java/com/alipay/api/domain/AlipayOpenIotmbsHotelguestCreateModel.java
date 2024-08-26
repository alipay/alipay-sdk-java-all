package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 酒店用户办理入住接口
 *
 * @author auto create
 * @since 1.0, 2023-03-30 14:46:51
 */
public class AlipayOpenIotmbsHotelguestCreateModel extends AlipayObject {

	private static final long serialVersionUID = 8786683324993155477L;

	/**
	 * face_id+用于酒店关联用户和房间等信息
	 */
	@ApiField("face_id")
	private String faceId;

	/**
	 * floor_num+人脸入住的楼层
	 */
	@ApiField("floor_num")
	private String floorNum;

	/**
	 * project_id，项目唯一id
	 */
	@ApiField("project_id")
	private String projectId;

	/**
	 * sn，关联的房间的sn
	 */
	@ApiField("sn")
	private String sn;

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

	public String getProjectId() {
		return this.projectId;
	}
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public String getSn() {
		return this.sn;
	}
	public void setSn(String sn) {
		this.sn = sn;
	}

}
