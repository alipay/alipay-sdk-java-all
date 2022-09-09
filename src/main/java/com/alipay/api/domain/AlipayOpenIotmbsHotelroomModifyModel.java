package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * iot酒店用户换房
 *
 * @author auto create
 * @since 1.0, 2022-06-15 15:46:11
 */
public class AlipayOpenIotmbsHotelroomModifyModel extends AlipayObject {

	private static final long serialVersionUID = 3332228392946231199L;

	/**
	 * 涂鸦生成传入的人脸ID
	 */
	@ApiField("face_id")
	private String faceId;

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
