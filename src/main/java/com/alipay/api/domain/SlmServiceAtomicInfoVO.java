package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 百格用例步骤详细信息
 *
 * @author auto create
 * @since 1.0, 2022-10-27 09:16:54
 */
public class SlmServiceAtomicInfoVO extends AlipayObject {

	private static final long serialVersionUID = 6824857252485665481L;

	/**
	 * 操作动作或业务分类，例如：查找、搜索、我的小程序等
	 */
	@ApiField("operate")
	private String operate;

	/**
	 * 动作描述
	 */
	@ApiField("operate_desc")
	private String operateDesc;

	/**
	 * 用户信息
	 */
	@ApiField("operator")
	private Operator operator;

	/**
	 * 前端框架service和atomic接口信息
	 */
	@ApiField("slm_service_atomic_info_list")
	private SlmMethodInfo slmServiceAtomicInfoList;

	/**
	 * 操作功能类型
	 */
	@ApiField("type")
	private String type;

	public String getOperate() {
		return this.operate;
	}
	public void setOperate(String operate) {
		this.operate = operate;
	}

	public String getOperateDesc() {
		return this.operateDesc;
	}
	public void setOperateDesc(String operateDesc) {
		this.operateDesc = operateDesc;
	}

	public Operator getOperator() {
		return this.operator;
	}
	public void setOperator(Operator operator) {
		this.operator = operator;
	}

	public SlmMethodInfo getSlmServiceAtomicInfoList() {
		return this.slmServiceAtomicInfoList;
	}
	public void setSlmServiceAtomicInfoList(SlmMethodInfo slmServiceAtomicInfoList) {
		this.slmServiceAtomicInfoList = slmServiceAtomicInfoList;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
