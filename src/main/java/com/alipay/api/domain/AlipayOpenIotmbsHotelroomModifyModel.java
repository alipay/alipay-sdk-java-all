package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * iot酒店用户换房
 *
 * @author auto create
 * @since 1.0, 2022-10-14 13:45:38
 */
public class AlipayOpenIotmbsHotelroomModifyModel extends AlipayObject {

	private static final long serialVersionUID = 7883174564721547969L;

	/**
	 * 涂鸦生成传入的人脸ID
	 */
	@ApiField("face_id")
	private String faceId;

	/**
	 * floor_num（用户入住楼层），非必填，用于梯控场景，酒店用户入住后，刷脸乘电梯，仅拥有入住楼层按钮权限。
	 */
	@ApiField("floor_num")
	private String floorNum;

	/**
	 * 解除绑定的关系的设备列表
	 */
	@ApiListField("source_sn_list")
	@ApiField("string")
	private List<String> sourceSnList;

	/**
	 * 需要绑定的设备sn列表
	 */
	@ApiListField("target_sn_list")
	@ApiField("string")
	private List<String> targetSnList;

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

	public List<String> getSourceSnList() {
		return this.sourceSnList;
	}
	public void setSourceSnList(List<String> sourceSnList) {
		this.sourceSnList = sourceSnList;
	}

	public List<String> getTargetSnList() {
		return this.targetSnList;
	}
	public void setTargetSnList(List<String> targetSnList) {
		this.targetSnList = targetSnList;
	}

}
