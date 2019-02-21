package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 校园生活查询学生信息接口
 *
 * @author auto create
 * @since 1.0, 2017-08-14 11:05:10
 */
public class AlipayEcoEduCampusJobstudentApplyModel extends AlipayObject {

	private static final long serialVersionUID = 7728996781325426618L;

	/**
	 * 支付宝客户端用户Id
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 备用字段，JSON格式.（可使用单引号或者双引号）
	 */
	@ApiField("content_var")
	private String contentVar;

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

	public String getContentVar() {
		return this.contentVar;
	}
	public void setContentVar(String contentVar) {
		this.contentVar = contentVar;
	}

}
