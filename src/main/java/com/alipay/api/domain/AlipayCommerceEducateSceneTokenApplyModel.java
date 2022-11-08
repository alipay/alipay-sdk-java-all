package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 教育场景采脸组件token生成处理器
 *
 * @author auto create
 * @since 1.0, 2022-02-28 10:24:12
 */
public class AlipayCommerceEducateSceneTokenApplyModel extends AlipayObject {

	private static final long serialVersionUID = 3581125486354915787L;

	/**
	 * 业务场景
	 */
	@ApiField("biz_code")
	private String bizCode;

	/**
	 * 用户详细信息
	 */
	@ApiField("user_detail_info")
	private UserDetailDto userDetailInfo;

	public String getBizCode() {
		return this.bizCode;
	}
	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}

	public UserDetailDto getUserDetailInfo() {
		return this.userDetailInfo;
	}
	public void setUserDetailInfo(UserDetailDto userDetailInfo) {
		this.userDetailInfo = userDetailInfo;
	}

}
