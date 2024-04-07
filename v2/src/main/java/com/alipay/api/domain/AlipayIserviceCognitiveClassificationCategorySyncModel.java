package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 垃圾分类类目同步
 *
 * @author auto create
 * @since 1.0, 2019-07-22 12:37:51
 */
public class AlipayIserviceCognitiveClassificationCategorySyncModel extends AlipayObject {

	private static final long serialVersionUID = 5751852988228764679L;

	/**
	 * 业务编码
	 */
	@ApiField("biz_code")
	private String bizCode;

	/**
	 * 市
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 垃圾数据
	 */
	@ApiListField("rubbish_list")
	@ApiField("rubbish_d_t_o")
	private List<RubbishDTO> rubbishList;

	public String getBizCode() {
		return this.bizCode;
	}
	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public List<RubbishDTO> getRubbishList() {
		return this.rubbishList;
	}
	public void setRubbishList(List<RubbishDTO> rubbishList) {
		this.rubbishList = rubbishList;
	}

}
