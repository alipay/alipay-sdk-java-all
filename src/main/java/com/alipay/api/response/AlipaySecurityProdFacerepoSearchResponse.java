package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.facerepo.search response.
 * 
 * @author auto create
 * @since 1.0, 2020-12-18 15:26:57
 */
public class AlipaySecurityProdFacerepoSearchResponse extends AlipayResponse {

	private static final long serialVersionUID = 4644583437864117359L;

	/** 
	 * 扩展参数
	 */
	@ApiField("ext_info")
	private String extInfo;

	/** 
	 * 从入参指定的人脸库分组中搜索出来的相似度最高的人脸id
	 */
	@ApiField("face_id")
	private String faceId;

	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}
	public String getExtInfo( ) {
		return this.extInfo;
	}

	public void setFaceId(String faceId) {
		this.faceId = faceId;
	}
	public String getFaceId( ) {
		return this.faceId;
	}

}
