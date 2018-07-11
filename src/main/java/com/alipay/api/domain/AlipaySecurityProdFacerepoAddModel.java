package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 人脸1:N服务入库接口
 *
 * @author auto create
 * @since 1.0, 2016-10-26 18:05:13
 */
public class AlipaySecurityProdFacerepoAddModel extends AlipayObject {

	private static final long serialVersionUID = 3331632815348815923L;

	/**
	 * 商户的业务单据号，用于核对与问题排查
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 人脸图片字节数组进行Base64编码后的字符串
	 */
	@ApiField("face_str")
	private String faceStr;

	/**
	 * 人脸库分组。每个商户可以使用多个人脸库分组，人脸搜索时会在指定的人脸库分组中搜索
	 */
	@ApiField("group_id")
	private String groupId;

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getFaceStr() {
		return this.faceStr;
	}
	public void setFaceStr(String faceStr) {
		this.faceStr = faceStr;
	}

	public String getGroupId() {
		return this.groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

}
