package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 修改人脸库的人脸扩展信息模型
 *
 * @author auto create
 * @since 1.0, 2022-01-10 16:29:08
 */
public class TinyFaceUserInfo extends AlipayObject {

	private static final long serialVersionUID = 5486491934838942133L;

	/**
	 * 人脸库扩展字段修改后的信息。(如果需要清空扩展字段，需使用空json——“{}”)
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 人脸id。
	 */
	@ApiField("face_id")
	private String faceId;

	/**
	 * 用户在服务商系统内的唯一id。
	 */
	@ApiField("unique_id")
	private String uniqueId;

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getFaceId() {
		return this.faceId;
	}
	public void setFaceId(String faceId) {
		this.faceId = faceId;
	}

	public String getUniqueId() {
		return this.uniqueId;
	}
	public void setUniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
	}

}
