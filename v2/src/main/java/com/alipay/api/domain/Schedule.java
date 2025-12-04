package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 定时触发器
 *
 * @author auto create
 * @since 1.0, 2023-12-21 16:39:31
 */
public class Schedule extends AlipayObject {

	private static final long serialVersionUID = 6679359726282428858L;

	/**
	 * 指定在调度时是否异步执行
	 */
	@ApiField("async")
	private Boolean async;

	/**
	 * 是否开启
	 */
	@ApiField("open")
	private Boolean open;

	/**
	 * 参数id
	 */
	@ApiField("param_id")
	private Long paramId;

	/**
	 * 参数名称
	 */
	@ApiField("param_name")
	private String paramName;

	/**
	 * 配置 ：类型为【固定周期】时，在该字段填写配置数据
	 */
	@ApiField("period")
	private Long period;

	/**
	 * 配置 ：类型为【Crond配置】时，在该字段填写配置数据
	 */
	@ApiField("period_crond_expr")
	private String periodCrondExpr;

	/**
	 * 类型（fixed :固定周期/ period：Crond配置）
	 */
	@ApiField("type")
	private String type;

	public Boolean getAsync() {
		return this.async;
	}
	public void setAsync(Boolean async) {
		this.async = async;
	}

	public Boolean getOpen() {
		return this.open;
	}
	public void setOpen(Boolean open) {
		this.open = open;
	}

	public Long getParamId() {
		return this.paramId;
	}
	public void setParamId(Long paramId) {
		this.paramId = paramId;
	}

	public String getParamName() {
		return this.paramName;
	}
	public void setParamName(String paramName) {
		this.paramName = paramName;
	}

	public Long getPeriod() {
		return this.period;
	}
	public void setPeriod(Long period) {
		this.period = period;
	}

	public String getPeriodCrondExpr() {
		return this.periodCrondExpr;
	}
	public void setPeriodCrondExpr(String periodCrondExpr) {
		this.periodCrondExpr = periodCrondExpr;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
