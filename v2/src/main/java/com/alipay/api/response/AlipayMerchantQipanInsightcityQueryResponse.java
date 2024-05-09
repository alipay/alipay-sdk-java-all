package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.PortraitProvinceValue;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.qipan.insightcity.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-01-19 15:39:25
 */
public class AlipayMerchantQipanInsightcityQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1269628241798615918L;

	/** 
	 * 画像值中去除未知和其他后的总量占当前画像总量的比例
	 */
	@ApiField("coverage")
	private String coverage;

	/** 
	 * 省级数据列表
	 */
	@ApiListField("data_list")
	@ApiField("portrait_province_value")
	private List<PortraitProvinceValue> dataList;

	/** 
	 * 常住省市画像描述，固定返回“用户省市分布预测”
	 */
	@ApiField("portrait_desc")
	private String portraitDesc;

	/** 
	 * 常住城市画像类型，固定值PROVINCE_CITY_DITU
	 */
	@ApiField("portrait_key")
	private String portraitKey;

	/** 
	 * 常住城市的画像名称，固定返回“预测常住城市”，和B站画像名称相同
	 */
	@ApiField("portrait_name")
	private String portraitName;

	/** 
	 * 数据产出的日期
	 */
	@ApiField("report_date")
	private String reportDate;

	public void setCoverage(String coverage) {
		this.coverage = coverage;
	}
	public String getCoverage( ) {
		return this.coverage;
	}

	public void setDataList(List<PortraitProvinceValue> dataList) {
		this.dataList = dataList;
	}
	public List<PortraitProvinceValue> getDataList( ) {
		return this.dataList;
	}

	public void setPortraitDesc(String portraitDesc) {
		this.portraitDesc = portraitDesc;
	}
	public String getPortraitDesc( ) {
		return this.portraitDesc;
	}

	public void setPortraitKey(String portraitKey) {
		this.portraitKey = portraitKey;
	}
	public String getPortraitKey( ) {
		return this.portraitKey;
	}

	public void setPortraitName(String portraitName) {
		this.portraitName = portraitName;
	}
	public String getPortraitName( ) {
		return this.portraitName;
	}

	public void setReportDate(String reportDate) {
		this.reportDate = reportDate;
	}
	public String getReportDate( ) {
		return this.reportDate;
	}

}
