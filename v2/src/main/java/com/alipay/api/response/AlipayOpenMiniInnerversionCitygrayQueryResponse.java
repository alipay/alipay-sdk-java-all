package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.MiniAppGrayCityDto;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.innerversion.citygray.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-13 05:06:39
 */
public class AlipayOpenMiniInnerversionCitygrayQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4199223785889776566L;

	/** 
	 * 城市编码
	 */
	@ApiField("city_code")
	private String cityCode;

	/** 
	 * 城市编码列表
	 */
	@ApiListField("city_codes")
	@ApiField("string")
	private List<String> cityCodes;

	/** 
	 * 城市名称
	 */
	@ApiField("city_name")
	private String cityName;

	/** 
	 * 城市信息列表
	 */
	@ApiListField("gray_citys")
	@ApiField("mini_app_gray_city_dto")
	private List<MiniAppGrayCityDto> grayCitys;

	/** 
	 * 规则编码
	 */
	@ApiField("rule_code")
	private String ruleCode;

	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}
	public String getCityCode( ) {
		return this.cityCode;
	}

	public void setCityCodes(List<String> cityCodes) {
		this.cityCodes = cityCodes;
	}
	public List<String> getCityCodes( ) {
		return this.cityCodes;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getCityName( ) {
		return this.cityName;
	}

	public void setGrayCitys(List<MiniAppGrayCityDto> grayCitys) {
		this.grayCitys = grayCitys;
	}
	public List<MiniAppGrayCityDto> getGrayCitys( ) {
		return this.grayCitys;
	}

	public void setRuleCode(String ruleCode) {
		this.ruleCode = ruleCode;
	}
	public String getRuleCode( ) {
		return this.ruleCode;
	}

}
