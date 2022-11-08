package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 调用者基本信息
 *
 * @author auto create
 * @since 1.0, 2022-02-23 12:05:03
 */
public class QueryInfo extends AlipayObject {

	private static final long serialVersionUID = 6874567329732854439L;

	/**
	 * 调用系统的appName
	 */
	@ApiField("app_name")
	private String appName;

	/**
	 * 调用者域账号,与使用者工号二选一
	 */
	@ApiField("operator")
	private String operator;

	/**
	 * 调用类型+REAL_TIME(时调用，推荐)/SCHEDULE(定时任务同步)
	 */
	@ApiField("query_type")
	private String queryType;

	/**
	 * 使用者工号,为空可传 -1 或者不传
	 */
	@ApiField("user_no")
	private String userNo;

	public String getAppName() {
		return this.appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getOperator() {
		return this.operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getQueryType() {
		return this.queryType;
	}
	public void setQueryType(String queryType) {
		this.queryType = queryType;
	}

	public String getUserNo() {
		return this.userNo;
	}
	public void setUserNo(String userNo) {
		this.userNo = userNo;
	}

}
