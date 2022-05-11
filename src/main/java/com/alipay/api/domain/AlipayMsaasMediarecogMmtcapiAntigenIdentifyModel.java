package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 抗原检测
 *
 * @author auto create
 * @since 1.0, 2022-04-27 20:54:31
 */
public class AlipayMsaasMediarecogMmtcapiAntigenIdentifyModel extends AlipayObject {

	private static final long serialVersionUID = 2181833755394582377L;

	/**
	 * 算法业务标识id，调用对应算法前请联系接口负责人获取
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 入参图片信息
	 */
	@ApiListField("image_info_list")
	@ApiField("image_infos")
	private List<ImageInfos> imageInfoList;

	/**
	 * 自定义参数，json格式
	 */
	@ApiField("params")
	private String params;

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

	public List<ImageInfos> getImageInfoList() {
		return this.imageInfoList;
	}
	public void setImageInfoList(List<ImageInfos> imageInfoList) {
		this.imageInfoList = imageInfoList;
	}

	public String getParams() {
		return this.params;
	}
	public void setParams(String params) {
		this.params = params;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
