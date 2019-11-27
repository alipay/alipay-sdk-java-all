package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 人脸原子产品核身接口
 *
 * @author auto create
 * @since 1.0, 2018-10-25 21:47:54
 */
public class ZolozAuthenticationFaceVerifyQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8128498997472294745L;

	/**
	 * 人脸图片采集后的加密字符串
	 */
	@ApiField("blob")
	private String blob;

	/**
	 * zim唯一标识
	 */
	@ApiField("zim_id")
	private String zimId;

	public String getBlob() {
		return this.blob;
	}
	public void setBlob(String blob) {
		this.blob = blob;
	}

	public String getZimId() {
		return this.zimId;
	}
	public void setZimId(String zimId) {
		this.zimId = zimId;
	}

}
