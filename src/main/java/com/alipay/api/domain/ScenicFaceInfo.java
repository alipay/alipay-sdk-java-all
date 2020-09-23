package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户出库数据模型
 *
 * @author auto create
 * @since 1.0, 2019-11-26 20:40:17
 */
public class ScenicFaceInfo extends AlipayObject {

	private static final long serialVersionUID = 3432534313235599964L;

	/**
	 * 用户场景下唯一标示码
	 */
	@ApiField("face_id")
	private String faceId;

	/**
	 * 人脸系统唯一身份标识
	 */
	@ApiField("zid")
	private String zid;

	public String getFaceId() {
		return this.faceId;
	}
	public void setFaceId(String faceId) {
		this.faceId = faceId;
	}

	public String getZid() {
		return this.zid;
	}
	public void setZid(String zid) {
		this.zid = zid;
	}

}
