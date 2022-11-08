package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 机构人员查询人脸响应列表
 *
 * @author auto create
 * @since 1.0, 2022-01-23 09:13:55
 */
public class IotIdentityOrgUserQueryListApiResponse extends AlipayObject {

	private static final long serialVersionUID = 4383344589526119344L;

	/**
	 * 人脸批量查询条件
	 */
	@ApiListField("face_info")
	@ApiField("iot_identity_org_user_query_api_response")
	private List<IotIdentityOrgUserQueryApiResponse> faceInfo;

	public List<IotIdentityOrgUserQueryApiResponse> getFaceInfo() {
		return this.faceInfo;
	}
	public void setFaceInfo(List<IotIdentityOrgUserQueryApiResponse> faceInfo) {
		this.faceInfo = faceInfo;
	}

}
