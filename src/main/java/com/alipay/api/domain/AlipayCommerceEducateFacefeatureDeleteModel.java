package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 人脸出库接口
 *
 * @author auto create
 * @since 1.0, 2019-11-26 20:41:56
 */
public class AlipayCommerceEducateFacefeatureDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 5655434914272568617L;

	/**
	 * 场景码
	 */
	@ApiField("biz_code")
	private String bizCode;

	/**
	 * 业务流水id,用于排查
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 扩展信息，json串
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 人脸库id
	 */
	@ApiField("group_id")
	private String groupId;

	/**
	 * 机构编号
	 */
	@ApiField("inst_id")
	private String instId;

	/**
	 * isv英文简称
	 */
	@ApiField("isv_name")
	private String isvName;

	/**
	 * 人脸出库信息
	 */
	@ApiListField("scenic_face_info")
	@ApiField("scenic_face_info")
	private List<ScenicFaceInfo> scenicFaceInfo;

	public String getBizCode() {
		return this.bizCode;
	}
	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getGroupId() {
		return this.groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public String getInstId() {
		return this.instId;
	}
	public void setInstId(String instId) {
		this.instId = instId;
	}

	public String getIsvName() {
		return this.isvName;
	}
	public void setIsvName(String isvName) {
		this.isvName = isvName;
	}

	public List<ScenicFaceInfo> getScenicFaceInfo() {
		return this.scenicFaceInfo;
	}
	public void setScenicFaceInfo(List<ScenicFaceInfo> scenicFaceInfo) {
		this.scenicFaceInfo = scenicFaceInfo;
	}

}
