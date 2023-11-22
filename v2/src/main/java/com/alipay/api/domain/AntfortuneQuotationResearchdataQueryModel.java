package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 金融信息平台研究数据查询
 *
 * @author auto create
 * @since 1.0, 2020-12-16 00:26:13
 */
public class AntfortuneQuotationResearchdataQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1782746812122898789L;

	/**
	 * 需要获取数据的结束时间
	 */
	@ApiField("end_date")
	private String endDate;

	/**
	 * 预留的扩展字段，json格式。
	 */
	@ApiField("ext")
	private String ext;

	/**
	 * 字段名称，需要访问的表中哪些字段。比如open代表开盘价
	 */
	@ApiListField("fields")
	@ApiField("string")
	private List<String> fields;

	/**
	 * 选择性参数，用于附带一些查询条件。
	 */
	@ApiField("opt")
	private String opt;

	/**
	 * 请求唯一id，用于排查问题
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 需要获取数据的开始时间
	 */
	@ApiField("start_date")
	private String startDate;

	/**
	 * 对象唯一标识代码，比如股票就是600000.SH，基金就是003003
	 */
	@ApiListField("symbols")
	@ApiField("string")
	private List<String> symbols;

	/**
	 * 表明需要访问的金融信息数据哪张表
	 */
	@ApiField("table")
	private String table;

	/**
	 * 目标系统，BK_FINDATA代表数金金融数据库，null代表行情自己
	 */
	@ApiField("target_system")
	private String targetSystem;

	public String getEndDate() {
		return this.endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getExt() {
		return this.ext;
	}
	public void setExt(String ext) {
		this.ext = ext;
	}

	public List<String> getFields() {
		return this.fields;
	}
	public void setFields(List<String> fields) {
		this.fields = fields;
	}

	public String getOpt() {
		return this.opt;
	}
	public void setOpt(String opt) {
		this.opt = opt;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getStartDate() {
		return this.startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public List<String> getSymbols() {
		return this.symbols;
	}
	public void setSymbols(List<String> symbols) {
		this.symbols = symbols;
	}

	public String getTable() {
		return this.table;
	}
	public void setTable(String table) {
		this.table = table;
	}

	public String getTargetSystem() {
		return this.targetSystem;
	}
	public void setTargetSystem(String targetSystem) {
		this.targetSystem = targetSystem;
	}

}
