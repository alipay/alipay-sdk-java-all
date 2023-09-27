package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 分期码扩展字段
 *
 * @author auto create
 * @since 1.0, 2023-09-08 10:32:51
 */
public class FqQrCodeExtendParams extends AlipayObject {

	private static final long serialVersionUID = 5252687219376961496L;

	/**
	 * 当码类型是clerkQrcode(店员码)的时候需要传递此字段
	 */
	@ApiField("bind_type")
	private String bindType;

	/**
	 * 分期数
	 */
	@ApiField("fq_num")
	private String fqNum;

	/**
	 * 当码类型为clerkQrcode(店员码)时需要传递此值
	 */
	@ApiField("scene_tag")
	private String sceneTag;

	public String getBindType() {
		return this.bindType;
	}
	public void setBindType(String bindType) {
		this.bindType = bindType;
	}

	public String getFqNum() {
		return this.fqNum;
	}
	public void setFqNum(String fqNum) {
		this.fqNum = fqNum;
	}

	public String getSceneTag() {
		return this.sceneTag;
	}
	public void setSceneTag(String sceneTag) {
		this.sceneTag = sceneTag;
	}

}
