package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 画像分析数据
 *
 * @author auto create
 * @since 1.0, 2023-01-30 11:15:28
 */
public class PortraitDataVO extends AlipayObject {

	private static final long serialVersionUID = 5415694635683758217L;

	/**
	 * 覆盖率，画像值中去除未知和其他后的总量占当前画像总量的比例
	 */
	@ApiField("coverage")
	private String coverage;

	/**
	 * 数据列表
	 */
	@ApiListField("data_list")
	@ApiField("portrait_value")
	private List<PortraitValue> dataList;

	/**
	 * 画像描述，如：用户年龄段预测
	 */
	@ApiField("portrait_desc")
	private String portraitDesc;

	/**
	 * 画像key，如：AGE
	 */
	@ApiField("portrait_key")
	private String portraitKey;

	/**
	 * 画像名称，如：用户年龄段
	 */
	@ApiField("portrait_name")
	private String portraitName;

	/**
	 * 数据日期
	 */
	@ApiField("report_date")
	private String reportDate;

	public String getCoverage() {
		return this.coverage;
	}
	public void setCoverage(String coverage) {
		this.coverage = coverage;
	}

	public List<PortraitValue> getDataList() {
		return this.dataList;
	}
	public void setDataList(List<PortraitValue> dataList) {
		this.dataList = dataList;
	}

	public String getPortraitDesc() {
		return this.portraitDesc;
	}
	public void setPortraitDesc(String portraitDesc) {
		this.portraitDesc = portraitDesc;
	}

	public String getPortraitKey() {
		return this.portraitKey;
	}
	public void setPortraitKey(String portraitKey) {
		this.portraitKey = portraitKey;
	}

	public String getPortraitName() {
		return this.portraitName;
	}
	public void setPortraitName(String portraitName) {
		this.portraitName = portraitName;
	}

	public String getReportDate() {
		return this.reportDate;
	}
	public void setReportDate(String reportDate) {
		this.reportDate = reportDate;
	}

}
