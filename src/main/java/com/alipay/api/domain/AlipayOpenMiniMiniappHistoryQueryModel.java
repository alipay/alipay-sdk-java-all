package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 最近使用的小程序列表查询
 *
 * @author auto create
 * @since 1.0, 2019-10-23 17:19:52
 */
public class AlipayOpenMiniMiniappHistoryQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8418918834496722434L;

	/**
	 * 管控的令牌
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 请求的列表长度
	 */
	@ApiField("size")
	private String size;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getSize() {
		return this.size;
	}
	public void setSize(String size) {
		this.size = size;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
