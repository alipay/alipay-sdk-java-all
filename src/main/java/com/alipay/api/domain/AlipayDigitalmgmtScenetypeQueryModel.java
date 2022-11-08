package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询满足条件的场景类型列表
 *
 * @author auto create
 * @since 1.0, 2022-03-30 14:39:18
 */
public class AlipayDigitalmgmtScenetypeQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5369351136372314768L;

	/**
	 * 是否仅查询生效状态，默认true
	 */
	@ApiField("only_pass")
	private Boolean onlyPass;

	/**
	 * 创建人域名，可为空。仅需要查询全部状态类目时指定，若queryAll参数为true则忽略该参数；否则查询结果为：所有生效状态 + 非生效状态且creator = operator 的类目
	 */
	@ApiField("operator")
	private String operator;

	/**
	 * 是否查询所有节点(含非生效)，仅需要查询全部状态类目时指定，若该参数为true则忽略operator参数
	 */
	@ApiField("query_all")
	private String queryAll;

	/**
	 * 租户id，必填
	 */
	@ApiField("tnt_inst_id")
	private String tntInstId;

	public Boolean getOnlyPass() {
		return this.onlyPass;
	}
	public void setOnlyPass(Boolean onlyPass) {
		this.onlyPass = onlyPass;
	}

	public String getOperator() {
		return this.operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getQueryAll() {
		return this.queryAll;
	}
	public void setQueryAll(String queryAll) {
		this.queryAll = queryAll;
	}

	public String getTntInstId() {
		return this.tntInstId;
	}
	public void setTntInstId(String tntInstId) {
		this.tntInstId = tntInstId;
	}

}
