package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 上数外部数据资产查询服务
 *
 * @author auto create
 * @since 1.0, 2021-04-12 20:00:21
 */
public class SsdataDataserviceDatapropertyBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 7697957994417963693L;

	/**
	 * 描述针对datachannel需要执行的操作
	 */
	@ApiField("action")
	private String action;

	/**
	 * 业务请求入参，云上系统直接转发给域内用来拼接参数
	 */
	@ApiField("action_param")
	private String actionParam;

	/**
	 * 描述业务调用方名字基础信息
	 */
	@ApiField("base")
	private String base;

	/**
	 * 描述调用的具体数据渠道名
	 */
	@ApiField("data_channel")
	private String dataChannel;

	/**
	 * 业务访问的tag名
	 */
	@ApiField("visit_ac")
	private String visitAc;

	/**
	 * 业务线
	 */
	@ApiField("visit_biz_line")
	private String visitBizLine;

	/**
	 * bu名称
	 */
	@ApiField("visit_bu")
	private String visitBu;

	public String getAction() {
		return this.action;
	}
	public void setAction(String action) {
		this.action = action;
	}

	public String getActionParam() {
		return this.actionParam;
	}
	public void setActionParam(String actionParam) {
		this.actionParam = actionParam;
	}

	public String getBase() {
		return this.base;
	}
	public void setBase(String base) {
		this.base = base;
	}

	public String getDataChannel() {
		return this.dataChannel;
	}
	public void setDataChannel(String dataChannel) {
		this.dataChannel = dataChannel;
	}

	public String getVisitAc() {
		return this.visitAc;
	}
	public void setVisitAc(String visitAc) {
		this.visitAc = visitAc;
	}

	public String getVisitBizLine() {
		return this.visitBizLine;
	}
	public void setVisitBizLine(String visitBizLine) {
		this.visitBizLine = visitBizLine;
	}

	public String getVisitBu() {
		return this.visitBu;
	}
	public void setVisitBu(String visitBu) {
		this.visitBu = visitBu;
	}

}
