package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 机构人员查询人脸响应
 *
 * @author auto create
 * @since 1.0, 2022-01-22 14:15:21
 */
public class IotIdentityOrgUserQueryApiResponse extends AlipayObject {

	private static final long serialVersionUID = 4415548343896419918L;

	/**
	 * 人脸id，可与userId只传一个
	 */
	@ApiField("face_id")
	private String faceId;

	/**
	 * 状态，1存在2不存在
	 */
	@ApiField("state")
	private Long state;

	/**
	 * 用户场景下唯一标示码
	 */
	@ApiField("user_id")
	private String userId;

	public String getFaceId() {
		return this.faceId;
	}
	public void setFaceId(String faceId) {
		this.faceId = faceId;
	}

	public Long getState() {
		return this.state;
	}
	public void setState(Long state) {
		this.state = state;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
