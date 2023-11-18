package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 棋盘-人群画像-常住城市分布数据结构，针对市级
 *
 * @author auto create
 * @since 1.0, 2023-01-12 20:45:49
 */
public class PortraitCityValue extends AlipayObject {

	private static final long serialVersionUID = 2747149178436471833L;

	/**
	 * 城市地区编码，唯一，遵循国标
	 */
	@ApiField("area_code")
	private String areaCode;

	/**
	 * 资产或者人群画像中当前城市对应的用户数
	 */
	@ApiField("num")
	private Long num;

	/**
	 * 国内城市名称，唯一，如果城市没有数据则不返回
	 */
	@ApiField("portrait_value")
	private String portraitValue;

	public String getAreaCode() {
		return this.areaCode;
	}
	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

	public Long getNum() {
		return this.num;
	}
	public void setNum(Long num) {
		this.num = num;
	}

	public String getPortraitValue() {
		return this.portraitValue;
	}
	public void setPortraitValue(String portraitValue) {
		this.portraitValue = portraitValue;
	}

}
