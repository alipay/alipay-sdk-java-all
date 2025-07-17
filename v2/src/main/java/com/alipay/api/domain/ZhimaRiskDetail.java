package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻信用风险记录详情
 *
 * @author auto create
 * @since 1.0, 2015-08-18 17:43:26
 */
public class ZhimaRiskDetail extends AlipayObject {

	private static final long serialVersionUID = 2174684939377536238L;

	/**
	 * 数据类型：Negative(负面信息)、Risk(风险信息) 。系统会将在APP上对C端披露的信息标记为负面信息，其余的信息标记为风险信息。
	 */
	@ApiField("data_type")
	private String dataType;

	/**
	 * 对于该条风险信息的补充信息。是名称和值得键值对。依据不同的风险类型，存在不同内容。返回信息为JSON字符串。
	 */
	@ApiField("extendinfo")
	private String extendinfo;

	/**
	 * 风险代码
	 */
	@ApiField("risk_code")
	private String riskCode;

	/**
	 * 风险类型
	 */
	@ApiField("risk_type")
	private String riskType;

	/**
	 * 对于逾期类风险信息，此字段表示是否结清。T（结清）/F（未结清）
	 */
	@ApiField("settlement")
	private String settlement;

	/**
	 * 当用户进行异议处理，并核查完毕之后，仍有异议时，给出声明。
	 */
	@ApiField("statement")
	private String statement;

	/**
	 * 当用户本人对该条负面记录有异议时，表示该异议处理流程的状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 行业类型
	 */
	@ApiField("type")
	private String type;

	/**
	 * 数据更新时间
	 */
	@ApiField("update")
	private Date update;

	public String getDataType() {
		return this.dataType;
	}
	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	public String getExtendinfo() {
		return this.extendinfo;
	}
	public void setExtendinfo(String extendinfo) {
		this.extendinfo = extendinfo;
	}

	public String getRiskCode() {
		return this.riskCode;
	}
	public void setRiskCode(String riskCode) {
		this.riskCode = riskCode;
	}

	public String getRiskType() {
		return this.riskType;
	}
	public void setRiskType(String riskType) {
		this.riskType = riskType;
	}

	public String getSettlement() {
		return this.settlement;
	}
	public void setSettlement(String settlement) {
		this.settlement = settlement;
	}

	public String getStatement() {
		return this.statement;
	}
	public void setStatement(String statement) {
		this.statement = statement;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public Date getUpdate() {
		return this.update;
	}
	public void setUpdate(Date update) {
		this.update = update;
	}

}
