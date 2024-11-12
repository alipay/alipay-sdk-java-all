package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 生活记录退出
 *
 * @author auto create
 * @since 1.0, 2024-04-29 11:37:29
 */
public class ZhimaCustomerLiferecordQuitModel extends AlipayObject {

	private static final long serialVersionUID = 4375815319849396531L;

	/**
	 * 操作枚举
	 */
	@ApiField("action")
	private String action;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 外部业务号列表
	 */
	@ApiListField("out_biz_nos")
	@ApiField("string")
	private List<String> outBizNos;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getAction() {
		return this.action;
	}
	public void setAction(String action) {
		this.action = action;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public List<String> getOutBizNos() {
		return this.outBizNos;
	}
	public void setOutBizNos(List<String> outBizNos) {
		this.outBizNos = outBizNos;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
