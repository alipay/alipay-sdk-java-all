package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 抗原检测
 *
 * @author auto create
 * @since 1.0, 2022-11-04 13:59:48
 */
public class AlipayMsaasMediarecogMmtcapiAntigenIdentifyModel extends AlipayObject {

	private static final long serialVersionUID = 6461827248513842387L;

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
	 * 蚂蚁统一开放ID
	 */
	@ApiField("open_id")
	private String openId;

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

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
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
