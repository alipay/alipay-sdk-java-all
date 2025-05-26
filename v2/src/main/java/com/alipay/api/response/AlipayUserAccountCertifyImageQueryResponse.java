package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.UserPersonPictureDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.account.certify.image.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-05-12 10:22:26
 */
public class AlipayUserAccountCertifyImageQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7771449579187357256L;

	/** 
	 * 用户证件图片数据
	 */
	@ApiListField("user_person_picture_detail")
	@ApiField("user_person_picture_detail")
	private List<UserPersonPictureDetail> userPersonPictureDetail;

	public void setUserPersonPictureDetail(List<UserPersonPictureDetail> userPersonPictureDetail) {
		this.userPersonPictureDetail = userPersonPictureDetail;
	}
	public List<UserPersonPictureDetail> getUserPersonPictureDetail( ) {
		return this.userPersonPictureDetail;
	}

}
