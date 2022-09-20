package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 行业关注名单详情
 *
 * @author auto create
 * @since 1.0, 2017-08-11 14:25:03
 */
public class ZmWatchListDetail extends AlipayObject {

	private static final long serialVersionUID = 1376623953992222953L;

	/**
	 * 风险信息行业编码
	 */
	@ApiField("biz_code")
	private String bizCode;

	/**
	 * 风险编码
	 */
	@ApiField("code")
	private String code;

	/**
	 * 扩展信息
	 */
	@ApiListField("extend_info")
	@ApiField("zm_watch_list_extend_info")
	private List<ZmWatchListExtendInfo> extendInfo;

	/**
	 * 风险等级
	 */
	@ApiField("level")
	private Long level;

	/**
	 * 数据刷新时间
	 */
	@ApiField("refresh_time")
	private Date refreshTime;

	/**
	 * 结清状态
	 */
	@ApiField("settlement")
	private Boolean settlement;

	/**
	 * 当用户进行异议处理，并核查完毕之后，仍有异议时，给出的声明
	 */
	@ApiField("statement")
	private String statement;

	/**
	 * 用户本人对该条负面记录有异议时，表示该异议处理流程的状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 行业名单风险类型
	 */
	@ApiField("type")
	private String type;

	public String getBizCode() {
		return this.bizCode;
	}
	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}

	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public List<ZmWatchListExtendInfo> getExtendInfo() {
		return this.extendInfo;
	}
	public void setExtendInfo(List<ZmWatchListExtendInfo> extendInfo) {
		this.extendInfo = extendInfo;
	}

	public Long getLevel() {
		return this.level;
	}
	public void setLevel(Long level) {
		this.level = level;
	}

	public Date getRefreshTime() {
		return this.refreshTime;
	}
	public void setRefreshTime(Date refreshTime) {
		this.refreshTime = refreshTime;
	}

	public Boolean getSettlement() {
		return this.settlement;
	}
	public void setSettlement(Boolean settlement) {
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

}
