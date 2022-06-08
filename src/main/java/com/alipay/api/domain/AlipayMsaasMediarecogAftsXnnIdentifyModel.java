package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 多媒体xnn云平台算法调用
 *
 * @author auto create
 * @since 1.0, 2019-07-31 19:43:45
 */
public class AlipayMsaasMediarecogAftsXnnIdentifyModel extends AlipayObject {

	private static final long serialVersionUID = 2626462175282388867L;

	/**
	 * 算法业务标识id，调用对应算法前请联系接口负责人获取
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 入参图片信息，
	 */
	@ApiListField("image_info_list")
	@ApiField("image_info")
	private List<ImageInfo> imageInfoList;

	/**
	 * config
	 */
	@ApiField("params")
	private String params;

	/**
	 * 分类算法传入Common_Classify
检测算法传入Common_Detect
1.1版本后已废除
	 */
	@ApiField("request_type")
	private String requestType;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public List<ImageInfo> getImageInfoList() {
		return this.imageInfoList;
	}
	public void setImageInfoList(List<ImageInfo> imageInfoList) {
		this.imageInfoList = imageInfoList;
	}

	public String getParams() {
		return this.params;
	}
	public void setParams(String params) {
		this.params = params;
	}

	public String getRequestType() {
		return this.requestType;
	}
	public void setRequestType(String requestType) {
		this.requestType = requestType;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
