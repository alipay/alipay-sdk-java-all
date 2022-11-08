package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.FailFaceUserInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.faceuser.modify response.
 * 
 * @author auto create
 * @since 1.0, 2022-08-22 19:37:22
 */
public class AlipayCommerceEducateFaceuserModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6418685368129217547L;

	/** 
	 * 失败人脸信息列表。（1.如果响应code为10000，忽略当前字段；2.服务商可以根据retry来重试部分用户；3.其他失败用户，需要根据具体返回纠正字段，或联系技术同学支持；）
	 */
	@ApiListField("fail_user_list")
	@ApiField("fail_face_user_info")
	private List<FailFaceUserInfo> failUserList;

	public void setFailUserList(List<FailFaceUserInfo> failUserList) {
		this.failUserList = failUserList;
	}
	public List<FailFaceUserInfo> getFailUserList( ) {
		return this.failUserList;
	}

}
