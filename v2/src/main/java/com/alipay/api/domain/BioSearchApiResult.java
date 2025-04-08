package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 生物搜索结果
 *
 * @author auto create
 * @since 1.0, 2023-12-22 16:01:52
 */
public class BioSearchApiResult extends AlipayObject {

	private static final long serialVersionUID = 5711283761529161516L;

	/**
	 * 生物库入库对生物身份定义的ID，在搜索时返回此ID
	 */
	@ApiField("face_id")
	private String faceId;

	public String getFaceId() {
		return this.faceId;
	}
	public void setFaceId(String faceId) {
		this.faceId = faceId;
	}

}
