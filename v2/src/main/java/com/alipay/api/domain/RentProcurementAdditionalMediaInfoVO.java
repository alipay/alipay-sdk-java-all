package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 附加文件信息
 *
 * @author auto create
 * @since 1.0, 2026-05-18 10:15:56
 */
public class RentProcurementAdditionalMediaInfoVO extends AlipayObject {

	private static final long serialVersionUID = 2443355956741239526L;

	/**
	 * null
	 */
	@ApiListField("face_active_url_list")
	@ApiField("string")
	private List<String> faceActiveUrlList;

	/**
	 * 签收回执单PDF地址
	 */
	@ApiField("face_sign_url")
	private String faceSignUrl;

	public List<String> getFaceActiveUrlList() {
		return this.faceActiveUrlList;
	}
	public void setFaceActiveUrlList(List<String> faceActiveUrlList) {
		this.faceActiveUrlList = faceActiveUrlList;
	}

	public String getFaceSignUrl() {
		return this.faceSignUrl;
	}
	public void setFaceSignUrl(String faceSignUrl) {
		this.faceSignUrl = faceSignUrl;
	}

}
