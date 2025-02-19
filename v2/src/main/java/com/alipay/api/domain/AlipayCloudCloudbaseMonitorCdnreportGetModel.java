package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 查询报表数据
 *
 * @author auto create
 * @since 1.0, 2024-05-20 14:19:15
 */
public class AlipayCloudCloudbaseMonitorCdnreportGetModel extends AlipayObject {

	private static final long serialVersionUID = 3567229418825727257L;

	/**
	 * 小程序云AppID
	 */
	@ApiField("biz_app_id")
	private String bizAppId;

	/**
	 * 小程序云环境ID
	 */
	@ApiField("biz_env_id")
	private String bizEnvId;

	/**
	 * 域名列表
	 */
	@ApiListField("domain_names")
	@ApiField("string")
	private List<String> domainNames;

	/**
	 * 结束时间
	 */
	@ApiField("end_time")
	private String endTime;

	/**
	 * 报表类型
 - TopUrlByAcc(热门 URL（按请求数排序）)
 - TopUrlByTraf(热门 URL（按流量排序）)
 - TopReferByAcc(热门 Referer（按请求数排序）)
 - TopReferByTraf(热门 Referer（按流量排序）)
 - OriginTopUrlByAcc(回源热门 URL（按请求数排序）)
 - OriginTopUrlByTraf(回源热门 URL（按流量排序）)
 - TopIpByAcc(Top 客户端 IP（按请求数排序）)
 - TopIpByTraf(Top 客户端 IP（按流量排序）)
 - DomainByTraf(域名排行（按流量排序）)
 - DomainPvUv(PV 和 UV)
 - AreaTrafStat(访问区域分布)
 - IspTrafStat(运营商分布)
	 */
	@ApiField("report_type")
	private String reportType;

	/**
	 * 开始时间
	 */
	@ApiField("start_time")
	private String startTime;

	public String getBizAppId() {
		return this.bizAppId;
	}
	public void setBizAppId(String bizAppId) {
		this.bizAppId = bizAppId;
	}

	public String getBizEnvId() {
		return this.bizEnvId;
	}
	public void setBizEnvId(String bizEnvId) {
		this.bizEnvId = bizEnvId;
	}

	public List<String> getDomainNames() {
		return this.domainNames;
	}
	public void setDomainNames(List<String> domainNames) {
		this.domainNames = domainNames;
	}

	public String getEndTime() {
		return this.endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getReportType() {
		return this.reportType;
	}
	public void setReportType(String reportType) {
		this.reportType = reportType;
	}

	public String getStartTime() {
		return this.startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

}
